package com.nttdata.webflux.controller;

import java.math.BigDecimal;

import com.nttdata.webflux.model.api.ResponseGreeting;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import reactor.core.publisher.Mono;

import javax.print.attribute.standard.Media;

@RestController
public class ControllerWebFlux {

	@GetMapping("/listarWebFlux")
	public Flux<BigDecimal> findAll() {
		return Flux.just(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN);
	}

	@PostMapping(value = "/saludarJson",
			consumes = MediaType.TEXT_PLAIN_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<ResponseGreeting> greetingJson(@RequestBody String name) {
		return Mono.just(new ResponseGreeting("Hello " + name));
	}

	@PostMapping(value = "/saludarXml",
			consumes = MediaType.TEXT_PLAIN_VALUE,
			produces = MediaType.APPLICATION_XML_VALUE)
	public Mono<ResponseGreeting> greetingXml(@RequestBody String name) {
		return Mono.just(new ResponseGreeting("Hello " + name));
	}

	@PostMapping(value = "/saludoflux",
			consumes = MediaType.TEXT_PLAIN_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<ResponseGreeting> greetingFlux(@RequestBody String name){
		return Flux.just(new ResponseGreeting("Hola "+name),
				new ResponseGreeting("Hola de nuevo "+name));
	}


}
