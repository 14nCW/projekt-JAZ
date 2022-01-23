package pl.pjwstk.projekt.formula.information;

import pl.pjwstk.projekt.formula.drivers.Drivers;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Table(name = "information")
@Entity
public class Information {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "id")
    private Long id;
    private String name;

    private String fullName;

    private String base;
    private String chief;
    private String powerUnit;
    private Integer worldChampions;
    private Integer highestRacePlace;
    private Integer polePosition;
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
        this.name = name;
        this.fullName = fullName;
        this.base = base;
        this.chief = chief;
        this.powerUnit = powerUnit;
        this.worldChampions = worldChampions;
        this.highestRacePlace = highestRacePlace;
        this.polePosition = polePosition;
        this.fastestLaps = fastestLaps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getInfoId() {
        return id;
    }

    public void setInfoId(Long infoId) {
        this.id = infoId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public String getPowerUnit() {
        return powerUnit;
    }

    public void setPowerUnit(String powerUnit) {
        this.powerUnit = powerUnit;
    }

    public Integer getWorldChampions() {
        return worldChampions;
    }

    public void setWorldChampions(Integer worldChampions) {
        this.worldChampions = worldChampions;
    }

    public Integer getHighestRacePlace() {
        return highestRacePlace;
    }

    public void setHighestRacePlace(Integer highestRacePlace) {
        this.highestRacePlace = highestRacePlace;
    }

    public Integer getPolePosition() {
        return polePosition;
    }

    public void setPolePosition(Integer polePosition) {
        this.polePosition = polePosition;
    }

    public Integer getFastestLaps() {
        return fastestLaps;
    }

    public void setFastestLaps(Integer fastestLaps) {
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
