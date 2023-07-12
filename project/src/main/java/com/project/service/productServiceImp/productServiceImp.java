package com.project.service.productServiceImp;

import com.project.File.myFile;
import com.project.model.Product;
import com.project.service.productService;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class productServiceImp implements productService {
    private List<Product> products;
    myFile myFile;

    public productServiceImp() throws IOException {
        myFile=new myFile();
        products=myFile.readFile();
    }
    @Override
    public List<Product> create(List<Product> p) throws Exception {
        products=p;
        myFile.write(products);
        return products;
    }

    @Override
    public void update(int id) throws Exception {

        myFile.write(products);
    }

    @Override
    public void delete(int id) throws Exception {
        for (int i=0;i<products.size();i++)
            if (products.get(i).getId()==id) {
                products.remove(i);
                break;
            }
        myFile.write(products);
    }

    @Override
    public List<Product> review() {
       return products;
    }


    }



