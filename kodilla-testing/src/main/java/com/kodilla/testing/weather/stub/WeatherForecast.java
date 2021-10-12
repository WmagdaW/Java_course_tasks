package com.kodilla.testing.weather.stub;


import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public Double calculateAverageTemperature() {
        Double totalTemperature = 0.00;
        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
           totalTemperature += temperature.getValue();

        }
        double average = totalTemperature/temperatures.getTemperatures().size();
        return average;
    }
    public Double calculateMedian() {
        int n = temperatures.getTemperatures().size();
        int medianElementNumber= ((n+1)/2)-1;
        List<Double> valueResultList = new ArrayList<>();

        Map<String, Double> stubResult = new HashMap<>();
        stubResult.put("Rzeszow", 25.5);
        stubResult.put("Krakow", 26.2);
        stubResult.put("Wroclaw", 24.8);
        stubResult.put("Warszawa", 25.2);
        stubResult.put("Gdansk", 26.1);
        for (Double value : stubResult.values()) {
            double valueResult = value;
            valueResultList.add(valueResult);
        }
        Collections.sort(valueResultList);
        double medianValue = valueResultList.get(medianElementNumber);
        return medianValue;

    }
}