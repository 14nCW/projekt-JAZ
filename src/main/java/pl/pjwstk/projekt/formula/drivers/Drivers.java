package pl.pjwstk.projekt.formula.drivers;

import pl.pjwstk.projekt.formula.information.Information;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Table(name = "drivers")
@Entity
public class Drivers {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long driverId;
    private String name;
    private String surname;

    @OneToOne
    @MapsId
    @JoinColumn(name = "information_id")
    private Information information;

    public Drivers() {
    }

    public Drivers(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "driverId=" + driverId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
