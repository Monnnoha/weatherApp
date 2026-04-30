package com.weatherApp.service;

import com.weatherApp.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class WeatherService {

    private final String API_KEY = "#";

    public WeatherResponse getWeather(String cityName) {

        try {
            String url = "https://api.openweathermap.org/data/2.5/weather?q="
                    + cityName + "&appid=" + API_KEY + "&units=metric";

            RestTemplate restTemplate = new RestTemplate();

            Map<String, Object> response =
                    restTemplate.getForObject(url, Map.class);

            String city = (String) response.get("name");

            Map<String, Object> main =
                    (Map<String, Object>) response.get("main");

            double temp =
                    ((Number) main.get("temp")).doubleValue();

            List<Map<String, Object>> weatherList =
                    (List<Map<String, Object>>) response.get("weather");

            String condition =
                    (String) weatherList.get(0).get("main");

            return new WeatherResponse(city, temp, condition);

        } catch (Exception e) {
            return null;
        }
    }
}