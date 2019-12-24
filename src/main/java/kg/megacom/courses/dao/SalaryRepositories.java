package kg.megacom.courses.dao;

import kg.megacom.courses.entities.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepositories extends JpaRepository<Salaries, Long> {
}
