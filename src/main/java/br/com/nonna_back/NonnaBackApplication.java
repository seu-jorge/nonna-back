package br.com.nonna_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController new*

		public class HealthCheckController {
			@GetMapping("health-check/Liveness")
			public String Liviness
					return "ok";


}
