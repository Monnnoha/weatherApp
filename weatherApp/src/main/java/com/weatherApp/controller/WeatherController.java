package com.weatherApp.controller;

import com.weatherApp.model.WeatherResponse;
import com.weatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String home() {
        return "index"; // loads index.html
    }

    @PostMapping("/weather")
    public String getWeather(@RequestParam String city, Model model) {

        WeatherResponse weather = weatherService.getWeather(city);

        if (weather == null) {
            model.addAttribute("error", "City not found 😢");
        } else {
            model.addAttribute("weather", weather);
        }

        return "index";
    }
}