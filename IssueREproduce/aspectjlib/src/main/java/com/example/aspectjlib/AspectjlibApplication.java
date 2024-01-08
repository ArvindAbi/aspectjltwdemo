package com.example.aspectjlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;

@SpringBootApplication
@EnableLoadTimeWeaving(aspectjWeaving = AspectJWeaving.ENABLED)
public class AspectjlibApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectjlibApplication.class, args);
	}

}
