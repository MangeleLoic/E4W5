package epicode.E4W5.repositories;

import epicode.E4W5.entities.Bevanda;

import epicode.E4W5.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BevandaRepository extends JpaRepository<Bevanda, Long> {
    List<Bevanda> findByNome(String nome);
}