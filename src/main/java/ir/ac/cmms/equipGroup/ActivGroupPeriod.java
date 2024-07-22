package ir.ac.cmms.equipGroup;

import org.hibernate.annotations.Nationalized;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity_group_period")
public class ActivGroupPeriod {
    @Id
    private int id;

    @Nationalized
    @Column(length = 50)
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
}
