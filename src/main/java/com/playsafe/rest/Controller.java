package com.playsafe.rest;

import com.playsafe.domain.DataValueDTO;
import com.playsafe.service.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/conversions")
public class Controller {

    @Autowired
    private ConversionService conversionService;

    private final Logger log = LoggerFactory.getLogger(Controller.class);

    @PostMapping("/ktoc")
    public Double convertFromKelvinToCelsius(@RequestBody DataValueDTO value) {
        Double dataValue = value.getValue();
        log.info("Passed value: " + dataValue);
        Double celsius = conversionService.convertFromKelvinToCelsius(dataValue);
        log.info("Result: " + celsius);
        return celsius;
    }

    @PostMapping("/ctok")
    public Double convertFromCelsiusToKelvin(@RequestBody DataValueDTO value) {
        Double dataValue = value.getValue();
        log.info("Passed value: " + dataValue);
        Double celsius = conversionService.convertFromCelsiusToKelvin(dataValue);
        log.info("Result: " + celsius);
        return celsius;
    }


    @PostMapping("/mtok")
    public Double convertFromMilesToKilometers(@RequestBody DataValueDTO value) {
        Double dataValue = value.getValue();
        log.info("Passed value: " + dataValue);
        Double kilometers = conversionService.convertFromMilesToKilometers(dataValue);
        log.info("Result: " + kilometers);
        return kilometers;
    }

    @PostMapping("/ktom")
    public Double convertFromKilometersToMiles(@RequestBody DataValueDTO value) {
        Double dataValue = value.getValue();
        log.info("Passed value: " + dataValue);
        Double miles = conversionService.convertFromKilometersToMiles(dataValue);
        log.info("Result: " + miles);
        return miles;
    }

}

