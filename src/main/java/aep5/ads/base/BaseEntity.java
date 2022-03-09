package aep5.ads.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BaseEntity() {
        this.id = id;

    }

    public Long getId() {
        return id;
    }


//    @Id
//    private String id;
//
//    public BaseEntity() {
//        id = UUID.randomUUID().toString();
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        BaseEntity other = (BaseEntity) obj;
//        return Objects.equals(id, other.id);
//    }
}
