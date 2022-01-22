package pl.pjwstk.projekt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.pjwstk.projekt.formula.entity.Information;
import pl.pjwstk.projekt.formula.repository.InformationJpaRepository;

import java.util.List;

@SpringBootApplication
public class ProjektApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjektApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(InformationJpaRepository informationJpaRepository) {
        return args -> {
            Information mercedes = new Information(
                    "Mercedes-AMG Petronas Formula One Team",
                    "Brackley, United Kingdom",
                    "Toto Wolff",
                    "Mercedes",
                    8,
                    1,
                    127,
                    85
            );

            Information alpine = new Information(
                    "lpine F1 Team",
					"Enstone, United Kingdom",
					"Davide Brivio",
					"Renault",
					2,
					1,
					20,
					15);
            Information haas = new Information(
                    "Uralkali Haas F1 Team",
					"Kannapolis, United States",
					"Kannapolis, United States",
					"Ferrari",
					0,
					4,
                    0,
                    0
					);
            Information redbull = new Information(
                    "Red Bull Racing",
					"lton Keynes, United Kingdom",
					"Christian Horner",
					"Red Bull Powertrains",
					4,
					1,
					73,
					76);
            Information mcLaren = new Information(
                    "McLaren F1 Team",
					"king, United Kingdom",
					"Andreas Seidl",
					"Mercedes",
					8,
					1,
					156,
					160);
            Information aston = new Information(
                    "Aston Martin Cognizant Formula One Team",
					"Silverstone, United Kingdom",
					"Mike Krack",
					"Mercedes",
					0,
                    0,
					1,
					1);
            Information ferrari = new Information(
					"Scuderia Ferrari",
					"Maranello, Italy",
					"Mattia Binotto",
					"Ferrari",
					16,
					1,
					223,
					253);
            Information alphaTauri = new Information(
					"Scuderia AlphaTauri",
					"Faenza, Italy",
					"Franz Tost",
					"Red Bull Powertrains",
					0,
					1,
					1,
					2);
            Information alphaRomeo = new Information(
					"Alfa Romeo F1 Team ORLEN",
					"Hinwil, Switzerland",
					"Frédéric Vasseur",
					"Ferrari",
					0,
					1,
					1,
					5);
            Information williams = new Information(
					"Williams Racing",
					"Grove, United Kingdom",
					"Jost Capito",
					"Mercedes",
					9,
					1,
					129,
					133);
            informationJpaRepository.saveAll(
                    List.of(mercedes, alpine, haas, redbull, mcLaren, aston, ferrari, alphaTauri, alphaRomeo, williams));
        };
    }
}
