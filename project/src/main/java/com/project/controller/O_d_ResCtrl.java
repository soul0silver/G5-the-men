package com.project.controller;

import com.project.model.Order;
import com.project.service.productServiceImp.O_d_svImp;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@CrossOrigin("*")
@RestController
public class O_d_ResCtrl {
    O_d_svImp oDSvImp = new O_d_svImp();

    @PostMapping(path = "/saveorder", consumes = "application/json")
    public void add(@RequestBody List<Order> order) throws IOException {
        oDSvImp.add(order.get(0));
    }

    @GetMapping("/showorder")
    public List<Order> show() throws IOException {
        return oDSvImp.showOd();
    }
}
