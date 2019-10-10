package com.szi.springboot.entity;

public class Weather {
    private Integer weatherId;

    private String site;

    private Integer temperature;

    private String wind;

    private String humidity;

    private Integer kpa;

    private String aircondition;

    private String weathercondition;

    private String sickness;

    private String uktraviolet;

    public Integer getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(Integer weatherId) {
        this.weatherId = weatherId;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind == null ? null : wind.trim();
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity == null ? null : humidity.trim();
    }

    public Integer getKpa() {
        return kpa;
    }

    public void setKpa(Integer kpa) {
        this.kpa = kpa;
    }

    public String getAircondition() {
        return aircondition;
    }

    public void setAircondition(String aircondition) {
        this.aircondition = aircondition == null ? null : aircondition.trim();
    }

    public String getWeathercondition() {
        return weathercondition;
    }

    public void setWeathercondition(String weathercondition) {
        this.weathercondition = weathercondition == null ? null : weathercondition.trim();
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness == null ? null : sickness.trim();
    }

    public String getUktraviolet() {
        return uktraviolet;
    }

    public void setUktraviolet(String uktraviolet) {
        this.uktraviolet = uktraviolet == null ? null : uktraviolet.trim();
    }
}