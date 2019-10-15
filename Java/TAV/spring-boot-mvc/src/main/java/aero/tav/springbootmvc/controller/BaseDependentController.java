package aero.tav.springbootmvc.controller;

import aero.tav.springbootmvc.service.BaseDependentService;
import aero.tav.springbootmvc.service.BaseService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class BaseDependentController<
        Entity,
        DependentEntity,
        Service extends BaseDependentService<Entity,DependentEntity>>
        extends BaseController<Entity,Service> {
    @Override
    @RequestMapping(value = {"/upsert", "/upsert/{id}"}, method = RequestMethod.GET)
    public String saveView(@PathVariable(required = false) Integer id, Model model) throws IllegalAccessException, InstantiationException {
        model.addAttribute(viewBase, id == null ?
                type.newInstance() :
                service.findById(id));
        model.addAttribute("entity",viewBase);
        if(this.hasDependentData){
            model.addAttribute("dependentData",service.getDependentData());
        }
        return viewBase + "/upsert";
    }

}
