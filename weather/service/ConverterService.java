package com.gmail.yeritsyankoryun.weather.service;

import com.gmail.yeritsyankoryun.weather.dto.WeatherInfoDto;
import com.gmail.yeritsyankoryun.weather.model.WeatherInfoModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConverterService {
    @Autowired
    private ModelMapper modelMapper;

    public WeatherInfoDto convertToDto(WeatherInfoModel model) {
        return modelMapper.map(model, WeatherInfoDto.class);
    }

    public WeatherInfoModel convertToModel(WeatherInfoDto dto) {
        return modelMapper.map(dto, WeatherInfoModel.class);
    }
}
