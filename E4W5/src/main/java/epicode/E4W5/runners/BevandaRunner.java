package epicode.E4W5.runners;

import epicode.E4W5.entities.Bevanda;
import epicode.E4W5.entities.Pizza;
import epicode.E4W5.repositories.BevandaRepository;
import epicode.E4W5.repositories.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class BevandaRunner implements CommandLineRunner {
    @Autowired
    private BevandaRepository bevandaRepository;

    @Override
    public void run(String... args) throws Exception {
        Bevanda cocacola= new Bevanda("Coca cola", 2.50, 215);
        Bevanda birra= new Bevanda("Birra", 3.50, 415);;
        Bevanda acqua= new Bevanda("Acqua (0.70L)", 1.50, 0);

        bevandaRepository.save(cocacola);
        bevandaRepository.save(birra);
        bevandaRepository.save(acqua);

    }
}
