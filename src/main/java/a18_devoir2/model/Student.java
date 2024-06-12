package a18_devoir2.model;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Column(name = "first_name", nullable = false, length = 255)

    private String firstName;
    @Column(name = "last_name", nullable = false, length = 255)

    private String lastName;
    @Column(name = "specialty", nullable = false, length = 255)

    private String specialty;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
