package com.ing.training.controller;

import org.springframework.http.MediaType;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ing.training.model.WeatherAccount;
import com.ing.training.service.WeatherReportService;

@RestController
@RequestMapping(value = "/weatherReport")
public class WeatherAccountController {
	
   //@Inject
	@Autowired
	WeatherReportService weatherReportService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public WeatherAccount getAccountDetailsById(@PathVariable("id") String cod) {
		
		WeatherAccount weatherAccount = null;
		try{
	      weatherAccount = weatherReportService.getWeatherbyId(cod);
		  }
         catch(IllegalArgumentException ne){
			
		}
		return weatherAccount;
	}
	
	

}
