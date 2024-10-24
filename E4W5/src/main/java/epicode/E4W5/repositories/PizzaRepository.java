package epicode.E4W5.repositories;

import epicode.E4W5.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository <Pizza, Long> {
    List<Pizza> findByNome(String nome);
}
