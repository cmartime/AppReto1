package com.example.appreto2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appreto2.Adapters.ProductAdapter;
import com.example.appreto2.Entities.Product;

import java.util.ArrayList;

public class Products<ListProducts> extends AppCompatActivity {
    private  ListView ListProducts;
    private ProductAdapter productAdapter;
    private ArrayList<Product> arrayProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        ListProducts = (ListView) findViewById(R.id.ListProducts);
        arrayProducts = new ArrayList<Product>();

        Product product1 = new Product( "Product1",  "Description1",  1000, R.drawable.almohada);
        Product product2 = new Product( "Product2",  "Description2",  2000, R.drawable.cobija);
        Product product3 = new Product("Product3",  "Description3",  5000, R.drawable.colchas);
        Product product4 = new Product( "Product4",  "Description4",  7000, R.drawable.edredon);
        Product product5 = new Product( "Product5",  "Description5",  6000, R.drawable.protector);
        Product product6 = new Product( "Product6",  "Description6",  10000, R.drawable.toallas);

        arrayProducts.add(product1);
        arrayProducts.add(product2);
        arrayProducts.add(product3);
        arrayProducts.add(product4);
        arrayProducts.add(product5);
        arrayProducts.add(product6);

        productAdapter = new ProductAdapter(this,arrayProducts);
        ListProducts.setAdapter(productAdapter);
    }
}