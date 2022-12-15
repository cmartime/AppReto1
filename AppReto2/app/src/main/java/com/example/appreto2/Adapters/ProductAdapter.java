package com.example.appreto2.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appreto2.Entities.Product;
import com.example.appreto2.Info;
import com.example.appreto2.R;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Product> arrayProducts;

    public ProductAdapter(Context context, ArrayList<Product> arrayProducts) {
        this.context = context;
        this.arrayProducts = arrayProducts;
    }

    @Override
    public int getCount() {
        return arrayProducts.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProducts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.product_template,null);
        Product product = arrayProducts.get(i);

        ImageView imgProduct = (ImageView) view.findViewById(R.id.imgProduct);
        TextView textNameProduct = (TextView) view.findViewById(R.id.textNameProduct);
        TextView texDescriptionProduct = (TextView) view.findViewById(R.id.texDescriptionProduct);
        TextView textPriceProduct =  (TextView) view.findViewById(R.id.textPriceProduct);

        imgProduct.setImageResource(product.getImage());
        textNameProduct.setText(product.getName());
        texDescriptionProduct.setText(product.getDescription());
        textPriceProduct.setText(String.valueOf(product.getPrice()));

         imgProduct.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(context.getApplicationContext(), Info.class);
                 intent.putExtra("name", product.getName());
                 intent.putExtra("description", product.getDescription());
                 intent.putExtra("price", String.valueOf(product.getPrice()));
                 intent.putExtra("image", product.getImage());
                 context.startActivity(intent);

             }
         });

        return view;
    }
}
