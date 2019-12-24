package kg.megacom.courses.services.impl;

import kg.megacom.courses.dao.CoursesRepositories;
import kg.megacom.courses.entities.Courses;
import kg.megacom.courses.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CoursesRepositories coursesRepositories;


    @Override
    public Courses saveCourses(Courses courses) {
        return coursesRepositories.save(courses) ;
    }

    @Override
    public List<Courses> getCourses() {

        return coursesRepositories.findAll();
    }
}
