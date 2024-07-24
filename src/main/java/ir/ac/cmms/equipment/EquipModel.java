package ir.ac.cmms.equipment;

import ir.ac.cmms.equipGroup.EquipGroupModel;
import ir.ac.cmms.unit.UnitModel;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Table(name="equipment")
public class EquipModel {

    @Id
    @Column(length = 10)
    private int equipId;

    @Column(length = 20)
    @Nationalized
    private String code;

    @Column(length = 80, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="equipmentGroup_id")
    private EquipGroupModel equipmentGroupModel;

    @ManyToOne
    @JoinColumn(name="unitId")
    private UnitModel unitModel;

    public int getEquipId() {
        return equipId;
    }

    public void setEquipId(int equipId) {
        this.equipId = equipId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
