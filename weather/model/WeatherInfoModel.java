package com.gmail.yeritsyankoryun.weather.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class WeatherInfoModel {
    @NotNull
    @Size(min = 2, max = 3)
    private String country;
    @NotNull
    @Size(min = 2)
    private String city;
    @NotNull
    private double temperature; // in Celsius
    @Enumerated(EnumType.ORDINAL)
    @NotNull
    private WeatherType type;
    @NotNull
    private int windSpeed; // in km/h

    public WeatherInfoModel(String country, String city, double temperature,WeatherType type,int windSpeed) {
        this.country = country;
        this.city = city;
        this.temperature = temperature;
        this.type=type;
        this.windSpeed=windSpeed;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public WeatherType getType() {
        return type;
    }

    public void setType(WeatherType type) {
        this.type = type;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        if(windSpeed>0 && windSpeed<372)
        this.windSpeed = windSpeed;
    }

    public void setTemperature(double temperature) {
        if (temperature > -90 && temperature < 60)
            this.temperature = temperature;
    }
}
