package pl.pjwstk.projekt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.pjwstk.projekt.formula.drivers.Drivers;
import pl.pjwstk.projekt.formula.drivers.DriversJpaRepository;
import pl.pjwstk.projekt.formula.drivers.DriversService;
import pl.pjwstk.projekt.formula.information.Information;
import pl.pjwstk.projekt.formula.information.InformationJpaRepository;

import java.util.List;

@SpringBootApplication
public class ProjektApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(DriversJpaRepository driversJpaRepository) {
//		return args -> {
//			Drivers test = new Drivers(
//					"Alex",
//					"Albon"
//			);
//			driversJpaRepository.save(test);
//		};
//
//
//	}
}
