package ir.ac.cmms.equipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/equipment")
public class EquipController {

    @Autowired
    EquipService equipService;

    public EquipController(EquipService equipService){

    }

    @RequestMapping(value = "")
    public String equipPage(Model model){
        model.addAttribute("equipments", equipService.getEquipments());
        return "equipment";
    }
}
