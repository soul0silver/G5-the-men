package com.project.service.productServiceImp;

import com.project.File.FileOrder;
import com.project.model.Detail;
import com.project.model.Order;
import com.project.service.Order_DetailSv;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.List;
@Service
@Component
@NoArgsConstructor
public class O_d_svImp implements Order_DetailSv {
    FileOrder fileOrder=new FileOrder();
    Order order;



    @Override
    public List<Order> saveOd(Order o) throws IOException {
       List<Order> orders=fileOrder.readFile();
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId()==o.getId()){
                orders.get(i).setStatus(o.getStatus());
                break;
            }
        }fileOrder.write(orders);
        return orders;
    }

    @Override
    public List<Order> showOd() throws IOException {
       List<Order> orders=fileOrder.readFile();
        return orders;

    }

    @Override
    public void saveDe(List<Detail> d) {

    }

    @Override
    public List<Detail>  showODe() {
        return null;
    }

    @Override
    public Order find(int id) throws IOException {

        List<Order> orders=fileOrder.readFile();
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId()==id) {order=orders.get(i);break;}
        }
        return order;
    }

    @Override
    public void add(Order o) throws IOException {
        List<Order> orders=fileOrder.readFile();
        o.setId(orders.size()+1);
        orders.add(o);
        fileOrder.write(orders);
    }
}
