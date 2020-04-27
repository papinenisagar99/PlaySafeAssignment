package com.playsafe.service.impl;

import com.playsafe.service.ConversionService;
import com.playsafe.domain.Constants;
import org.springframework.stereotype.Service;

@Service
public class ConversionServiceImpl implements ConversionService {

    @Override
    public Double convertFromCelsiusToKelvin(Double value) {
        Double kelvin = value + Constants.TEMPERATURE.TEMPERATURE_CONSTANT;
        return kelvin;
    }

    @Override
    public Double convertFromKelvinToCelsius(Double value) {
        Double celsius = value - Constants.TEMPERATURE.TEMPERATURE_CONSTANT;
        return celsius;
    }

    @Override
    public Double convertFromMilesToKilometers(Double value) {
        Double kilometer = value * Constants.DISTANCE.KILOMETER_CONSTANT;
        return kilometer;
    }

    @Override
    public Double convertFromKilometersToMiles(Double value) {
        Double mile = value * Constants.DISTANCE.MILE_CONSTANT;
        return mile;

    }
}
