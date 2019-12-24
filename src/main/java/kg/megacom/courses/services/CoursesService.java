package kg.megacom.courses.services;

import kg.megacom.courses.entities.Courses;

import java.util.List;

public interface CoursesService {

    Courses saveCourses(Courses courses);
    List<Courses> getCourses();
    Courses
}
