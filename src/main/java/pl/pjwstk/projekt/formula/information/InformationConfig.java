package pl.pjwstk.projekt.formula.information;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.util.List;

@Configuration
public class InformationConfig {

    @Bean
    CommandLineRunner commandLineRunner(InformationJpaRepository informationJpaRepository) {
        return args -> {
            Information mercedes = new Information(
                    "mercedes",
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
                    "alpine",
                    "Alpine F1 Team",
                    "Enstone, United Kingdom",
                    "Davide Brivio",
                    "Renault",
                    2,
                    1,
                    20,
                    15
            );

            Information haas = new Information(
                    "haas",
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
                    "redbull",
                    "Red Bull Racing",
                    "lton Keynes, United Kingdom",
                    "Christian Horner",
                    "Red Bull Powertrains",
                    4,
                    1,
                    73,
                    76
            );

            Information mcLaren = new Information(
                    "mclaren",
                    "McLaren F1 Team",
                    "king, United Kingdom",
                    "Andreas Seidl",
                    "Mercedes",
                    8,
                    1,
                    156,
                    160
            );

            Information aston = new Information(
                    "astonmartin",
                    "Aston Martin Cognizant Formula One Team",
                    "Silverstone, United Kingdom",
                    "Mike Krack",
                    "Mercedes",
                    0,
                    0,
                    1,
                    1
            );

            Information ferrari = new Information(
                    "ferrari",
                    "Scuderia Ferrari",
                    "Maranello, Italy",
                    "Mattia Binotto",
                    "Ferrari",
                    16,
                    1,
                    223,
                    253
            );

            Information alphaTauri = new Information(
                    "alphatauri",
                    "Scuderia AlphaTauri",
                    "Faenza, Italy",
                    "Franz Tost",
                    "Red Bull Powertrains",
                    0,
                    1,
                    1,
                    2
            );

            Information alfaRomeo = new Information(
                    "alfaromeo",
                    "Alfa Romeo F1 Team ORLEN",
                    "Hinwil, Switzerland",
                    "Frédéric Vasseur",
                    "Ferrari",
                    0,
                    1,
                    1,
                    5
            );

            Information williams = new Information(
                    "williams",
                    "Williams Racing",
                    "Grove, United Kingdom",
                    "Jost Capito",
                    "Mercedes",
                    9,
                    1,
                    129,
                    133
            );

            informationJpaRepository.saveAll(
                    List.of(mercedes, alpine, haas, redbull, mcLaren, aston, ferrari, alphaTauri, alfaRomeo, williams));
        };
    }
}
