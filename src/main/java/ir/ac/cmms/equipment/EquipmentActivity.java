package ir.ac.cmms.equipment;

import ir.ac.cmms.equipGroup.ActivityGroupModel;
import org.hibernate.annotations.Nationalized;
import javax.persistence.*;

@Table
@Entity
public class EquipmentActivity {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="equip_Id")
    private EquipModel equipModels;

    @ManyToOne
    @JoinColumn(name="activGroupId")
    private ActivityGroupModel activGroupModels;

    @Nationalized
    @Column(length = 200)
    private String description;

    @Column(precision = 3)
    private int requiredTime;

    @Column(precision = 2)
    private int priority;

    @Column(length = 50)
    @Nationalized
    private String periodTime;

    private String startDate;
    private String endDate;

    @Nationalized
    private String referedReceiver;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EquipModel getEquipModels() {
        return equipModels;
    }

    public void setEquipModels(EquipModel equipModels) {
        this.equipModels = equipModels;
    }

    public ActivityGroupModel getActivGroupModels() {
        return activGroupModels;
    }

    public void setActivGroupModels(ActivityGroupModel activGroupModels) {
        this.activGroupModels = activGroupModels;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequiredTime() {
        return requiredTime;
    }

    public void setRequiredTime(int requiredTime) {
        this.requiredTime = requiredTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(String periodTime) {
        this.periodTime = periodTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getReferedReceiver() {
        return referedReceiver;
    }

    public void setReferedReceiver(String referedReceiver) {
        this.referedReceiver = referedReceiver;
    }
}
