package aep5.ads.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    public BaseEntity() {
        this.id = id;

    }

    public Long getId() {
        return id;
    }

}
