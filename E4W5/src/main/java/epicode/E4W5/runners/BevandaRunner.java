package epicode.E4W5.runners;

import epicode.E4W5.repositories.BevandaRepository;
import epicode.E4W5.repositories.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BevandaRunner implements CommandLineRunner {
    @Autowired
    private BevandaRepository bevandaRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
