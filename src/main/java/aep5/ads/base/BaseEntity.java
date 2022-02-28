package aep5.ads.base;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }
}
