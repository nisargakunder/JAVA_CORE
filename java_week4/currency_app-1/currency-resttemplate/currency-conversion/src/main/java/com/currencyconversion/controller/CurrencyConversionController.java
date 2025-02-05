package com.currencyconversion.controller;

import com.currencyconversion.dto.CurrencyConversionBean;
import com.currencyconversion.serviceproxy.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RestTemplate restTemplate;



	//http://localhost:8100/currency-converter/from/USD/to/INR/quantity/10
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from,
													   @PathVariable String to,
													   @PathVariable BigDecimal quantity) {

		CurrencyConversionBean response = restTemplate
				.getForObject("http://localhost:8000/currency-exchange/from/" + from + "/to/" + to, CurrencyConversionBean.class);

		logger.info("{}", response);

		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());

	}
}