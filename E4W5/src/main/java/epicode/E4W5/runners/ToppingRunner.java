package epicode.E4W5.runners;

import epicode.E4W5.repositories.PizzaRepository;
import epicode.E4W5.repositories.ToppingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ToppingRunner implements CommandLineRunner {
    @Autowired
    private ToppingRepository toppingRepository;

    @Override
    public void run(String... args) throws Exception {


    }
}

