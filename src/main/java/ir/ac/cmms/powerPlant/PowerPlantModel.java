package ir.ac.cmms.powerPlant;


import javax.persistence.*;

@Entity
@Table(name="powerplant")
public class PowerPlantModel {

    @Id
    @Column(precision=2)
    private int powerPlantId;

    @Column(length = 12, nullable = false)
    private String name;

    public int getPowerPlantId() {
        return powerPlantId;
    }

    public void setPowerPlantId(int powerPlantId) {
        this.powerPlantId = powerPlantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
