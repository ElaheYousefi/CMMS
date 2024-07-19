package ir.ac.cmms.unit;

import ir.ac.cmms.equipGroup.EquipGroupModel;
import ir.ac.cmms.powerPlant.PowerPlantModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="unit")
public class UnitModel {

    @Id
    @Column(precision=2)
    private int unitId;

    @Column(length = 2, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="powerPlant_id")
    private PowerPlantModel powerPlantModel;

    @ManyToMany
    @JoinTable(name="equipGroup_unit", joinColumns= @JoinColumn(name="unitId"), inverseJoinColumns = @JoinColumn(name="equipGroupId"))
    private List<EquipGroupModel> equipGroups;

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PowerPlantModel getPowerPlantModel() {
        return powerPlantModel;
    }

    public void setPowerPlantModel(PowerPlantModel powerPlantModel) {
        this.powerPlantModel = powerPlantModel;
    }

    public List<EquipGroupModel> getEquipGroups() {
        return equipGroups;
    }

    public void setEquipGroups(List<EquipGroupModel> equipGroups) {
        this.equipGroups = equipGroups;
    }
}
