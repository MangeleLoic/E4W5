package epicode.E4W5.services;


import epicode.E4W5.entities.Topping;
import epicode.E4W5.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToppinService  {
    @Autowired
    private ToppingRepository toppingRepository;

    public Topping saveTopping(Topping topping) {
        return toppingRepository.save(topping);
    }

    public List<Topping> filterByName(String name) {
        return toppingRepository.findByNome(name);
    }
}