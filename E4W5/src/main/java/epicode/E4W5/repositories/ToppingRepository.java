package epicode.E4W5.repositories;

import epicode.E4W5.entities.Bevanda;
import epicode.E4W5.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping, Long> {
}
