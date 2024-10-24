package epicode.E4W5.services;

import epicode.E4W5.entities.Bevanda;
import epicode.E4W5.repositories.BevandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class BevandaService  {
        @Autowired
        private BevandaRepository bevandaRepository;

        public Bevanda saveBevanda(Bevanda bevanda) {
            return bevandaRepository.save(bevanda);
        }

        public List<Bevanda> filterByName(String name) {
            return bevandaRepository.findByNome(name);
        }
    }

