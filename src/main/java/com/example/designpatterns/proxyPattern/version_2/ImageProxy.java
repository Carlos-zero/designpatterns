package com.example.designpatterns.proxyPattern.version_2;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * ImageProxy 实现 Icon 接口
 */
class ImageProxy implements Icon {
    // 此 ImageIcon 是我们希望在加载后显示出来的真正的图像
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    // 我们将图像的URL传入构造器中， 这是我们希望显示的图像所在的位置。
    public ImageProxy(URL url) {
        imageURL = url;
    }

    // 在图像加载完成前，返回默认的宽和高，图像加载完成后，转给imageIcon处理
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    // 当需要在屏幕上绘制图像时，就调用此方法
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        //  如果已经有 Icon 了。就告诉它画出自己
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            // 否则就优先显示加载中的消息
            g.drawString("Loading album cover, please wait...", x + 300, y + 190);

            // 如果我们还没有试着取出图像
            if (!retrieving) {
                retrieving = true;

                // 这里加载真正的 Icon 图像；
                // 我们不希望挂起整个用户界面，所以用另一个线程取出图像
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            // 在线程中，我们实例化此Icon对象，其构造器会在图像加载完成之后才返回
                            setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                            // 当图像准备好时，我们告诉Swing，需要重绘。
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

                retrievalThread = new Thread(() -> {
                    try {
                        setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();

            }
        }
    }
}
