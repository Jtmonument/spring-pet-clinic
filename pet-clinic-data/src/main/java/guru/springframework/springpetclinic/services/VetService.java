package guru.springframework.springpetclinic.services;

import guru.springframework.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet save(Vet pet);

    Vet findById(Long id);

    Set<Vet> findAll();
}
