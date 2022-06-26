package guru.springframework.springpetclinic.services.map;

import guru.springframework.springpetclinic.model.Pet;

import java.util.Set;

public class PetServiceMap extends AbstractServiceMap<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Long id, Pet object) {
        return super.save(id, object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
