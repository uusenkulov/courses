package kg.megacom.courses.dao;

import kg.megacom.courses.entities.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepositories extends JpaRepository<Teachers, Long> {
}
