package pl.pjwstk.projekt.formula.information;

import lombok.Getter;
import lombok.Setter;
import pl.pjwstk.projekt.formula.drivers.Drivers;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Table(name = "information")
@Entity
@Getter
@Setter
public class Information {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "id")
    private Long id;

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

    @OneToOne(mappedBy = "information", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Drivers drivers;

    public Information() {}

    public Information(
//            Long infoId,
            String name,
                       String fullName,
                       String base,
                       String chief,
                       String powerUnit,
                       Integer worldChampions,
                       Integer highestRacePlace,
                       Integer polePosition,
                       Integer fastestLaps) {
//        this.infoId = infoId;
        this.shortName = name;
        this.fullName = fullName;
        this.base = base;
        this.chief = chief;
        this.powerUnit = powerUnit;
        this.worldChampions = worldChampions;
        this.highestRacePlace = highestRacePlace;
        this.polePosition = polePosition;
        this.fastestLaps = fastestLaps;
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
                '}';
    }
}
