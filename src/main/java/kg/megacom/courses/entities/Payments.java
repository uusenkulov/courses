package kg.megacom.courses.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;

public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Courses courses;
    @NonNull
    private double payment;
    @NonNull
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate localDate;


}
