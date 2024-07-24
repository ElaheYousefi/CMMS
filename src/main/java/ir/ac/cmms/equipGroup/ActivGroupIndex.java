package ir.ac.cmms.equipGroup;

import org.hibernate.annotations.Nationalized;
import javax.persistence.*;

@Entity
@Table(name="ActivityGroupIndex")
public class ActivGroupIndex {

    @Id
    private int id;

    @Column(length = 50)
    @Nationalized
    private String title;

    @ManyToOne
    @JoinColumn(name="active_group_id")
    private ActivityGroupModel activGroupModel;

    @Column(precision = 2)
    private int priority;

    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ActivityGroupModel getActivGroupModel() {
        return activGroupModel;
    }

    public void setActivGroupModel(ActivityGroupModel activGroupModel) {
        this.activGroupModel = activGroupModel;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
