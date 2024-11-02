package ucu.edu.ua.flower.store.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@NoArgsConstructor @Getter @Setter
public class Student {
    @Id
    private Long id;
    private String name;
    private String surname;
    @Transient
    private int age;
    LocalDate birth;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birth = LocalDate.now().minusYears(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return Period.between(birth, LocalDate.now()).getYears();
    }
}
