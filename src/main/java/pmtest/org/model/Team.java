package pmtest.org.model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table (name = "team")
public class Team implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;
    @Column (name = "nameEvent")
    private String nameEvent;
    @Column (name = "kefEvent")
    private int kefEvent;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.join(",", new String[]{
                "Event #", String.valueOf(id),
                nameEvent,String.valueOf(kefEvent)
        });
    }

    public void setId(long id) {
        this.id = id;
    }

}
