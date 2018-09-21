package com.farukecza.eczacrm.controller;

import com.farukecza.eczacrm.entity.Producer;
import com.farukecza.eczacrm.service.ProducerService;

public class ProducerController extends BaseController<ProducerService, Producer> {
    public ProducerController() {
        this.viewBase="producer";
    }
}
