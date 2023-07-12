package com.project.controller;

import com.project.model.Detail;
import com.project.model.Order;
import com.project.service.productServiceImp.O_d_svImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.List;

@Controller
@RequestMapping(path = "/product",method = RequestMethod.POST)
public class O_D_controller {
    O_d_svImp od = new O_d_svImp();


    @GetMapping("/list")
    public String viewOd(Model mo) throws IOException {
        mo.addAttribute("order", od.showOd());
        return "/product/list";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Order o) throws IOException {
        od.saveOd(o);
        return "redirect:/product/list";
    }

    @GetMapping("/creat/{id}")
    public String edit(Model mo, @PathVariable int id) throws IOException {
        Order o= od.find(id);
        mo.addAttribute("or", o);
        return "/product/create";
    }

}
