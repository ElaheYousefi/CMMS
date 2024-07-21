package ir.ac.cmms.unit;

import ir.ac.cmms.powerPlant.PowerPlantModel;
import javax.persistence.*;

@Entity
@Table(name="unit")
public class UnitModel {

    @Id
    @Column(precision = 1)
    private int unitId;

    @Column(length = 1, nullable = false)
    private char type;

    @Column(length = 2, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="powerPlant_id")
    private PowerPlantModel powerPlantModel;

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
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

}
