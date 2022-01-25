package pl.pjwstk.projekt.formula.information;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Locale;

@Configuration
public class InformationConfig {

    @Bean
    CommandLineRunner teamsImport(InformationJpaRepository informationJpaRepository) {
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
                    85,
                    "Lewis HAMILTON",
                    "George RUSSELL"
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
                    15,
                    "Esteban OCON",
                    "Fernando ALONSO"
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
                    0,
                    "Mick SCHUMACHER",
                    "Nikita MAZEPIN"
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
                    76,
                    "Max VERSTAPPEN",
                    "Sergio PEREZ"
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
                    160,
                    "Lando NORRIS",
                    "Daniel RICCIARDO"
            );

            Information aston = new Information(
                    "aston martin",
                    "Aston Martin Cognizant Formula One Team",
                    "Silverstone, United Kingdom",
                    "Mike Krack",
                    "Mercedes",
                    0,
                    0,
                    1,
                    1,
                    "Lance STROLL",
                    "Sebastian VETTEL"
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
                    253,
                    "Charles LECLERC",
                    "Carlos SAINZ"
            );

            Information alphaTauri = new Information(
                    "alpha tauri",
                    "Scuderia AlphaTauri",
                    "Faenza, Italy",
                    "Franz Tost",
                    "Red Bull Powertrains",
                    0,
                    1,
                    1,
                    2,
                    "Pierre GASLY",
                    "Yuki TSUNODA"
            );

            Information alfaRomeo = new Information(
                    "alfa romeo",
                    "Alfa Romeo F1 Team ORLEN",
                    "Hinwil, Switzerland",
                    "Frédéric Vasseur",
                    "Ferrari",
                    0,
                    1,
                    1,
                    5,
                    "Valtteri BOTTAS",
                    "Guanyu ZHOU"
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
                    133,
                    "Alexander ALBON",
                    "Nicholas LATIFI"
            );

            informationJpaRepository.saveAll(
                    List.of(mercedes, alpine, haas, redbull, mcLaren, aston, ferrari, alphaTauri, alfaRomeo, williams));
        };
    }
}
