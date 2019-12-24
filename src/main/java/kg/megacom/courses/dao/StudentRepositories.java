package kg.megacom.courses.dao;

import kg.megacom.courses.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositories extends JpaRepository<Students, Long> {
}
