package guru.springframework.springpetclinic.services;

import guru.springframework.springpetclinic.model.Owner;
import java.util.Set;

public interface OwnerService {
    Owner save(Owner owner);

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Set<Owner> findAll();
}
