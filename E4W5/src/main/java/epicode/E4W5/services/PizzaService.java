package epicode.E4W5.services;

import epicode.E4W5.entities.Pizza;
import epicode.E4W5.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class PizzaService  {
        @Autowired
        private PizzaRepository pizzaRepository;

        public Pizza savePizza(Pizza pizza) {
            return pizzaRepository.save(pizza);
        }

        public List<Pizza> filterByName(String name) {
            return pizzaRepository.findByNome(name);
        }
    }



