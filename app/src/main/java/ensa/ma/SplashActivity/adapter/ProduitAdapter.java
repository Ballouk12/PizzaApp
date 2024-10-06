package ensa.ma.SplashActivity.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ensa.ma.SplashActivity.R;
import ensa.ma.SplashActivity.classes.Produit;


public class ProduitAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public ProduitAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item,null);

        TextView id = convertView.findViewById(R.id.id);
        TextView temp = convertView.findViewById(R.id.temp);
        TextView number = convertView.findViewById(R.id.num);
        TextView pizzaName = convertView.findViewById(R.id.pizzaname);
        ImageView pizzaImage = convertView.findViewById(R.id.pizzaimg);
        ImageView horlogeImage = convertView.findViewById(R.id.horloge);
        ImageView redirectImage = convertView.findViewById(R.id.flech);
        ImageView personIcon = convertView.findViewById(R.id.icon);


        id.setText(produits.get(position).getId()+"");
        temp.setText(produits.get(position).getDure()+"");
        pizzaName.setText(produits.get(position).getNom()+"");
        number.setText(produits.get(position).getNbrIngredients()+"");
        pizzaImage.setImageResource(produits.get(position).getPhoto());
        horlogeImage.setImageResource(R.drawable.horloge) ;
        redirectImage.setImageResource(R.drawable.redirect) ;
        personIcon.setImageResource(R.drawable.man) ;
        return convertView;
    }
}
