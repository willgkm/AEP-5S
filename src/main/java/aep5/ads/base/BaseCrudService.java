package aep5.ads.base;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Getter
public class BaseCrudService <ENTITY extends BaseEntity, REPOSITORY extends JpaRepository<ENTITY, Long>>{

    @Autowired
    private REPOSITORY repository;

    public List<ENTITY> getAll() {
        return repository.findAll();
    }

    public ENTITY getById(Long id){
        return repository.findById(id).get();
    }

    public ENTITY create (ENTITY newEntity) {

        return repository.save(newEntity);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void updateEntity(ENTITY updateEntity){
        repository.save(updateEntity);
    }

}
