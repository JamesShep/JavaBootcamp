package com.coderscampus.week13;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@SpringBootApplication
//@ComponentScan("com.coderscampus")
public class Week13Application {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(Week13Application.class, args);

		CSVFormat csvFormat = CSVFormat.DEFAULT.withDelimiter(',')
				.withEscape('\\')
				.withHeader("Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes", "Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan", "Vegetarian")
				.withSkipHeaderRecord()
				.withIgnoreSurroundingSpaces();

		Reader in = new FileReader("recipes.txt");
		Iterable<CSVRecord> records = csvFormat.parse(in);
		for (CSVRecord record : records) {
			Integer cookingMinutes = Integer.parseInt(record.get("Cooking Minutes"));
			Boolean dairyFree = Boolean.parseBoolean(record.get("Dairy Free"));
			Boolean glutenFree = Boolean.parseBoolean(record.get("Gluten Free"));
			String instructions = record.get("Instructions");
			Double prepMin = Double.parseDouble(record.get("Preparation Minutes"));
			Double price = Double.parseDouble(record.get("Price Per Serving"));
			Integer readyInMin = Integer.parseInt(record.get("Ready In Minutes"));
			Integer servings = Integer.parseInt(record.get("Servings"));
			Double score = Double.parseDouble(record.get("Spoonacular Score"));
			String title = record.get("Title");
			Boolean vegan = Boolean.parseBoolean(record.get("Vegan"));
			Boolean vegetarian = Boolean.parseBoolean(record.get("Vegetarian"));


			System.out.println(record);

		}

		// To view JVM profiles settings > edit config
		// -Dspring.profiles.active=dev
	}

}
