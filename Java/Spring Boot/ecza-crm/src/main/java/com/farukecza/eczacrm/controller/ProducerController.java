package com.farukecza.eczacrm.controller;

import com.farukecza.eczacrm.entity.Producer;
import com.farukecza.eczacrm.service.ProducerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producer")
public class ProducerController extends BaseController<ProducerService, Producer> {
    public ProducerController() {
        this.viewBase="producer";
    }
}
