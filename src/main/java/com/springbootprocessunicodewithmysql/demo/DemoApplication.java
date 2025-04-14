package com.springbootprocessunicodewithmysql.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.Charset;

@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("____");
		System.out.println("What configurations are currently set?");
		System.out.println(
				String.format(
						"System.getProperty(\"file.encoding\"): %s",
						System.getProperty("file.encoding")
				)
		);
		System.out.println(
				String.format("defaultCharset: %s",
						Charset.defaultCharset().name())
		);
		System.out.println(
				String.format(
						"Display three unicode characters: %s",
						"ÖÄÜ"
				));

		System.out.println("____");

	}



}
