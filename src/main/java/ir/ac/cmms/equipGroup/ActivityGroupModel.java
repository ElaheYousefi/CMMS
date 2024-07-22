package ir.ac.cmms.equipGroup;

import org.hibernate.annotations.Nationalized;
import javax.persistence.*;

@Entity
@Table(name="activityGroup")
public class ActivityGroupModel {

    @Id()
    private int activId;

    @Nationalized
    @Column(length = 100)
    private String description;

    @ManyToOne
    @JoinColumn(name="period")
    private ActivGroupPeriod period;

    @ManyToOne
    @JoinColumn(name="title")
    private ActivGroupTitle title;

    @ManyToOne
    @JoinColumn(name="name")
    private ActivGroupName name;

    @ManyToOne
    @JoinColumn(name="equipGroupId")
    private EquipGroupModel groupModel;

    public int getActivId() {
        return activId;
    }

    public void setActivId(int activId) {
        this.activId = activId;
    }

    public ActivGroupPeriod getPeriod() {
        return period;
    }

    public void setPeriod(ActivGroupPeriod period) {
        this.period = period;
    }

    public ActivGroupTitle getTitle() {
        return title;
    }

    public void setTitle(ActivGroupTitle title) {
        this.title = title;
    }

    public ActivGroupName getName() {
        return name;
    }

    public void setName(ActivGroupName name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EquipGroupModel getGroupModel() {
        return groupModel;
    }

    public void setGroupModel(EquipGroupModel groupModel) {
        this.groupModel = groupModel;
    }
}
