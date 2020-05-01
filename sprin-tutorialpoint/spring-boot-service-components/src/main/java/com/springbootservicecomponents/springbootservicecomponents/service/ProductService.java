package com.springbootservicecomponents.springbootservicecomponents.service;

import com.springbootservicecomponents.springbootservicecomponents.model.Product;

import java.util.Collection;

/*
 * Date: 01/05/2020 - 12:48 pm
 * User: shivam.si
 */
public interface ProductService {
    public abstract void createProduct(Product product);
    public abstract void updateProduct(String id, Product product);
    public abstract void deleteProduct(String id);
    public abstract Collection<Product> getProducts();
}
