package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAverageTemperatureWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        double totalTemperatureResult = weatherForecast.calculateAverageTemperature();
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(25.56,totalTemperatureResult/quantityOfSensors);
    }
    @Test
    void testCalculateMedianStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();


        //Then
        Assertions.assertEquals(25.5,7);
    }
}
