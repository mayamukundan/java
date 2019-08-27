package jrout.tutorial.springjpahibernate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empNo;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate hireDate;

}
