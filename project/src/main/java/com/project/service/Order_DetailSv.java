package com.project.service;

import com.project.model.Detail;
import com.project.model.Order;

import java.io.IOException;
import java.util.List;
import java.util.List;

public interface Order_DetailSv {
    public List<Order> saveOd(Order o) throws IOException;
    public List<Order> showOd() throws IOException;
    public void saveDe(List<Detail> d);
    public List<Detail> showODe();
    public Order find(int id) throws IOException;
    public void add(Order o) throws IOException;
}
