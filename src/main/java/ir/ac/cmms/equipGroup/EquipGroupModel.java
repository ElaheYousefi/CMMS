package ir.ac.cmms.equipGroup;

import ir.ac.cmms.equipment.EquipModel;
import ir.ac.cmms.powerPlant.PowerPlantModel;
import ir.ac.cmms.unit.UnitModel;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="equipmentGroup")
public class EquipGroupModel {
    @Id
    @Column(precision = 2)
    private int equipGroupId;

    @Column(length = 80, nullable = false, unique = true)
    @Nationalized
    private String name;

    public int getEquipGroupId() {
        return equipGroupId;
    }

    public void setEquipGroupId(int equipGroupId) {
        this.equipGroupId = equipGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
