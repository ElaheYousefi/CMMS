package ir.ac.cmms.equipGroup;

import org.hibernate.annotations.Nationalized;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity_group_title")
public class ActivGroupTitle {
    @Id
    private int id;

    @Nationalized
    @Column(length = 100)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
