package pl.pjwstk.projekt.formula.information;

import lombok.Getter;
import lombok.Setter;
//import pl.pjwstk.projekt.formula.drivers.Drivers;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Table(name = "information")
@Entity
@Getter
@Setter
public class Information {
    @Id
    @SequenceGenerator(
            name = "information_sequence",
            sequenceName = "information_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "information_sequence"
    )
    @Column(name = "id")
    private long id;

    @Column(name = "shortName")
    private String shortName;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "base")
    private String base;

    @Column(name = "chief")
    private String chief;

    @Column(name = "powerUnit")
    private String powerUnit;

    @Column(name = "worldChampions")
    private Integer worldChampions;

    @Column(name = "highestRacePlace")
    private Integer highestRacePlace;

    @Column(name = "polePosition")
    private Integer polePosition;

    @Column(name = "fastestLaps")
    private Integer fastestLaps;

    @Column(name = "driver1")
    private String driver1;

    @Column(name = "driver2")
    private String driver2;

//    @OneToOne(mappedBy = "information", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private Drivers drivers;

    public Information() {
    }

    public Information(
            String name,
            String fullName,
            String base,
            String chief,
            String powerUnit,
            Integer worldChampions,
            Integer highestRacePlace,
            Integer polePosition,
            Integer fastestLaps,
            String driver1,
            String driver2) {
        this.shortName = name;
        this.fullName = fullName;
        this.base = base;
        this.chief = chief;
        this.powerUnit = powerUnit;
        this.worldChampions = worldChampions;
        this.highestRacePlace = highestRacePlace;
        this.polePosition = polePosition;
        this.fastestLaps = fastestLaps;
        this.driver1 = driver1;
        this.driver2 = driver2;
    }

    @Override
    public String toString() {
        return "Information{" +
                "infoId=" + id +
                ", fullName='" + fullName + '\n' +
                ", base='" + base + '\n' +
                ", chief='" + chief + '\n' +
                ", powerUnit='" + powerUnit + '\n' +
                ", worldChampions=" + worldChampions +
                ", highestRacePlace=" + highestRacePlace +
                ", polePosition=" + polePosition +
                ", fastestLaps=" + fastestLaps +
                ", driverOne=" + driver1 +
                ", driverTwo=" + driver2 +
                '}';
    }
}
