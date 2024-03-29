package com.turkcell.spring.starter.repositories.concretes;

import com.turkcell.spring.starter.entities.Product;
import com.turkcell.spring.starter.repositories.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements ProductRepository
{
    private List<Product> productList = new ArrayList<>();

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(Product product) {
        productList.remove(product);
    }

    @Override
    public void update(Product productOld, Product productNew) {
        productOld=productNew;
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }
}
// 5 adet ana entity
// gerekli crud işlemleri

// bireysel : Spring IoC , Medium

// 9:00