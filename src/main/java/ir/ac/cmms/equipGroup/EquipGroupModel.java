package ir.ac.cmms.equipGroup;

import ir.ac.cmms.powerPlant.PowerPlantModel;
import ir.ac.cmms.unit.UnitModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="equipmentGroup")
public class EquipGroupModel {
    @Id
    @Column(length = 2)
    private String equipGroupId;

    @Column(length = 80, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "equipGroups")
    private List<UnitModel> unitModels;

    public String getEquipGroupId() {
        return equipGroupId;
    }

    public void setEquipGroupId(String equipGroupId) {
        this.equipGroupId = equipGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UnitModel> getUnitModels() {
        return unitModels;
    }

    public void setUnitModels(List<UnitModel> unitModels) {
        this.unitModels = unitModels;
    }
}
