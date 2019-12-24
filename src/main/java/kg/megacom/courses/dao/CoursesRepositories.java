package kg.megacom.courses.dao;

import kg.megacom.courses.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepositories extends JpaRepository<Courses, Long> {
}
