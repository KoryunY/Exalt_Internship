package com.gmail.yeritsyankoryun.weather.service;

import com.gmail.yeritsyankoryun.weather.dao.WeatherDataAccessService;
import com.gmail.yeritsyankoryun.weather.model.WeatherInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherService {
    private final WeatherDataAccessService weatherDataAccessService;

    @Autowired
    public WeatherService(WeatherDataAccessService weatherDataAccessService) {
        this.weatherDataAccessService = weatherDataAccessService;
    }

    public List<WeatherInfoModel> getAllWeather() {
        return weatherDataAccessService.selectAllWeather();
    }

    public Optional<WeatherInfoModel> getByCC(String country, String city) {
        return weatherDataAccessService.selectByCC(country, city);
    }

    public void addWeather(WeatherInfoModel weather) {
         weatherDataAccessService.insertWeather(weather);
    }
    public void deleteByCC(String country, String city){
        weatherDataAccessService.deleteByCC(country,city);
    }
    public void deleteAll() {
        weatherDataAccessService.deleteAll();
    }
}
