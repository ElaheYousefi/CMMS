package ir.ac.cmms.equipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipService {

    EquipRepository equipRepository;

    @Autowired
    public EquipService(EquipRepository equipRepository) {
        this.equipRepository = equipRepository;
    }

    public List<EquipModel> getEquipments(){
        return equipRepository.findAll();
    }

}
