package com.playsafe.service;

import org.springframework.stereotype.Service;

@Service
public interface ConversionService {

    Double convertFromCelsiusToKelvin(Double value);

    Double convertFromKelvinToCelsius(Double value);

    Double convertFromMilesToKilometers(Double value);

    Double convertFromKilometersToMiles(Double value);
}
