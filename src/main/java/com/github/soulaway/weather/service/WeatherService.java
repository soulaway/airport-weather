package com.github.soulaway.weather.service;

import java.util.List;
import java.util.Map;

import com.github.soulaway.weather.dto.Airport;
import com.github.soulaway.weather.dto.WeatherPoint;

/**
 * Common application operations
 * 
 * @author soul
 *
 */

public interface WeatherService {

	List<Airport> getAirports();

	Airport findAirport(String iataCode);

	List<WeatherPoint> getWeather(String iata, double radius);

	Map<String, Object> getHelthStatus();

	Airport deleteAirport(String iataCode);

	Airport addAirport(String iataCode, double latitude, double longitude);

	WeatherPoint updateWeatherPoint(String iataCode, String pointType, WeatherPoint dp);
}
