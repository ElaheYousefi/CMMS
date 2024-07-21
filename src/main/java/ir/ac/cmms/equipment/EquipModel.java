package ir.ac.cmms.equipment;

import ir.ac.cmms.equipGroup.EquipGroupModel;
import ir.ac.cmms.powerPlant.PowerPlantModel;
import ir.ac.cmms.unit.UnitModel;
import javax.persistence.*;

@Entity
@Table(name="equipment")
public class EquipModel {

    @Id
    @Column(length = 20)
    private String equipId;

    @Column(length = 80, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="equipmentGroup_id")
    private EquipGroupModel equipmentGroupModel;

    @ManyToOne
    @JoinColumn(name="unitId")
    private UnitModel unitModel;

    public String getEquipId() {
        return equipId;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipGroupModel getEquipmentGroupModel() {
        return equipmentGroupModel;
    }

    public void setEquipmentGroupModel(EquipGroupModel equipmentGroupModel) {
        this.equipmentGroupModel = equipmentGroupModel;
    }

    public UnitModel getUnitModel() {
        return unitModel;
    }

    public void setUnitModel(UnitModel unitModel) {
        this.unitModel = unitModel;
    }
}
