package kg.megacom.courses.dao;

import kg.megacom.courses.entities.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepositories extends JpaRepository<Payments, Long> {
}
