package epicode.E4W5.runners;

import epicode.E4W5.entities.Pizza;
import epicode.E4W5.repositories.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class PizzeRunner implements CommandLineRunner {
    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public void run(String... args) throws Exception {

        Pizza margherita = new Pizza("Margherita", 6.50, 1104, List.of("Mozzarella", "Pomodoro"));
        Pizza prosciuttoFunghi = new Pizza("Prosciutto e Funghi", 7.50, 1454, List.of("Mozzarella", "Pomodoro", "Prosciutto cotto", "Funghi"));
        Pizza quattroFormaggi = new Pizza("4 Formaggi", 8.00, 1715, List.of("Mozzarella", "Gorgonzola", "Stracchino", "Fontina"));


        pizzaRepository.save(margherita);
        pizzaRepository.save(prosciuttoFunghi);
        pizzaRepository.save(quattroFormaggi);
    }
}

