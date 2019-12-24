package kg.megacom.courses.entities;


import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@Table(name = "salaries")
public class Salaries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "salary_id")
    private Long id;
    @NonNull
    private double salary;
    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teachers teachers;
}
