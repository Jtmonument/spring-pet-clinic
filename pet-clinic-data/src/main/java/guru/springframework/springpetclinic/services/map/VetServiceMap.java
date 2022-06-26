package guru.springframework.springpetclinic.services.map;

import guru.springframework.springpetclinic.model.Vet;

import java.util.Set;

public class VetServiceMap extends AbstractServiceMap<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Long id, Vet object) {
        return super.save(id, object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
