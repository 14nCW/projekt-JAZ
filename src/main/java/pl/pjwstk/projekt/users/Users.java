package pl.pjwstk.projekt.users;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Users {
    @Id
    @SequenceGenerator(
            name = "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private LocalDate dateOfBirth;

    public Users() {
    }

    public Users(Long id,
                String name,
                String surname,
                String email,
                String password,
                LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    public Users(String name,
                String surname,
                String email,
                String password,
                LocalDate dateOfBirth,
                boolean isAdmin) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\n' +
                ", surname='" + surname + '\n' +
                ", email='" + email + '\n' +
                ", password='" + password + '\n' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
