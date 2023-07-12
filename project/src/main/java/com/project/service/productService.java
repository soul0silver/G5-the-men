package com.project.service;
import com.project.model.Product;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface productService {
    public List<Product> create(List<Product> p) throws Exception;
    public void update(int id) throws Exception;
    public void delete(int id) throws Exception;
    public List<Product> review() ;

}
