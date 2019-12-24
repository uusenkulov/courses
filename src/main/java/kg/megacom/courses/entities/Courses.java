package kg.megacom.courses.entities;


import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "courses_id")
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private double price;
    @ManyToMany
    private Teachers teachers;
}
