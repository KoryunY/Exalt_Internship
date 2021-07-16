package com.gmail.yeritsyankoryun.weather.dao;

import com.gmail.yeritsyankoryun.weather.model.WeatherInfoModel;
import com.gmail.yeritsyankoryun.weather.model.WeatherType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class WeatherDataAccessService {
    private static List<WeatherInfoModel> weathers = new ArrayList<>();

    static {
        weathers.add(new WeatherInfoModel("Arm", "Yerevan", 37,WeatherType.SUNNY,5));
        weathers.add(new WeatherInfoModel("Arm", "Abovyan", 17,WeatherType.RAIN,17));

    }

    public List<WeatherInfoModel> selectAllWeather() {
        return weathers;
    }

    public Optional<WeatherInfoModel> selectByCC(String country, String city) {
        return weathers.stream().filter(weather -> weather.getCity().equals(city) && weather.getCountry().equals(country)).findFirst();
    }
    public void insertWeather(WeatherInfoModel weather){
        weathers.add(weather);
    }
    public void deleteByCC(String country, String city){
        selectByCC(country,city).ifPresent(model -> weathers.remove(model));
    }
    public void deleteAll(){
        weathers.clear();
    }
}
