package com.example.designpatterns.observerPattern.version_1;


/**
 * 此布告板实现了 Observer 接口，所以可以接到 WeatherData 的通知。
 * 也实现了 DisplayElement接口，因为我们规定所有布告板都必须实现这个接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;              // 温度
    private float humidity;                 // 湿度
    private WeatherData weatherData;

    // 构造器需要 weatherData 对象，作为注册之用。
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }


    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
