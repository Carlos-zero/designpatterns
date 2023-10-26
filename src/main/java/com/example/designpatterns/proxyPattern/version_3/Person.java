package com.example.designpatterns.proxyPattern.version_3;

public interface Person {

    /**
     * 这里我们可以取得人的名字、性别、兴趣和HotOrNot评分。
     * @return
     */
    String getName();

    String getGender();

    String getInterests();

    int getGeekRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setGeekRating(int rating);

}