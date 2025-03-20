package dev.sj74.content_calendar;

import dev.sj74.content_calendar.config.ContentCalendarProperties;
import dev.sj74.content_calendar.model.Content;
import dev.sj74.content_calendar.model.Status;
import dev.sj74.content_calendar.model.Type;
import dev.sj74.content_calendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			// insert some data into the database
			Content content = new Content(
					null,
					"Hello Chat GPT",
					"All about Chat GPT",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					""
			);

			repository.save(content);
		};
	}*/
}