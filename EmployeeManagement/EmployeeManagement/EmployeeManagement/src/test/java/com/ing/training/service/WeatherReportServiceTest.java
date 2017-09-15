package com.ing.training.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;
import com.ing.training.model.WeatherAccount;


public class WeatherReportServiceTest {

	@Mock
	RestTemplate restTemplate = new RestTemplate();
	@InjectMocks
	WeatherReportService weatherReportService = new WeatherReportService();
	 
	@Test
	 public void test() throws Exception {
		 
		 WeatherAccount weatherAccount = weatherReportService.getWeatherbyId("2");
		 Mockito.when(weatherAccount.getUserId()).thenReturn("1");
		 
		 assertEquals("1",weatherAccount.getUserId());
		 assertEquals("qui est esse",weatherAccount.getTitle());
		}
}
