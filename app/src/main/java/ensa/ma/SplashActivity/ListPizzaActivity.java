package ensa.ma.SplashActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import ensa.ma.SplashActivity.adapter.ProduitAdapter;
import ensa.ma.SplashActivity.classes.Produit;
import ensa.ma.SplashActivity.services.ProduitServices;

public class ListPizzaActivity extends AppCompatActivity {

    private ProduitServices productSv = null;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        productSv = new ProduitServices();
        productSv.create(new Produit(5, 20, R.drawable.pizza3,"Pizza Margherita","Sauce tomate, mozzarella, \nbasilic frais, huile d'olive, sel","Simple et classique, avec une base tomate et fromage","preparation complete"));
        productSv.create(new Produit(4, 19, R.drawable.pizza1,"Pizza Quatre Fromages","Mozzarella, gorgonzola, \nparmesan, emmental, crème fraîche."," Un plaisir crémeux avec un mélange de fromages.","preparation incomplete"));
        productSv.create(new Produit(2, 10, R.drawable.pizza2,"Pizza Reine"," Sauce tomate, mozzarella, jambon,\n champignons, olives noires.","Populaire et savoureuse, garnie de champignons et jambon.","preparation presque complete"));
        productSv.create(new Produit(3, 15, R.drawable.pizza5,"Pizza Pepperoni","Sauce tomate, mozzarella, \n pepperoni, origan.","Épicée et généreuse en viande avec des rondelles de pepperoni.","preparation complete"));
        productSv.create(new Produit(8, 23, R.drawable.pizza6,"Pizza Hawaïenne","Sauce tomate, mozzarella, \n jambon, ananas, origan.","Un mélange sucré-salé avec de l'ananas et du jambon.","preparation complete"));
        productSv.create(new Produit(9, 33, R.drawable.pizza7,"Pizza Végétarienne","Sauce tomate, mozzarella,\n poivrons, oignons, courgettes, champignons, olives.","Fraîche et colorée avec une variété de légumes.","preparation incomplete"));
        productSv.create(new Produit(7, 35, R.drawable.pizza4,"Pizza Calzone"," Mozzarella, jambon, ricotta, \n champignons, sauce tomate.","Une pizza repliée et farcie, souvent avec des ingrédients copieux.","preparation complete"));
        productSv.create(new Produit(3, 40, R.drawable.pizza8,"Pizza Bolognese"," Sauce bolognaise (viande hachée, tomate),\n mozzarella, oignons, origan.","Riche et savoureuse avec une sauce à la viande hachée.","preparation incomplete"));
        productSv.create(new Produit(3, 27, R.drawable.pizza9,"Pizza Diavola","Sauce tomate, mozzarella, salami piquant, \n piments, origan.","Pour les amateurs de piquant avec du salami épicé.","preparation presque complete"));
        productSv.create(new Produit(8, 30, R.drawable.pizza10,"Pizza Fruits de Mer","Sauce tomate, mozzarella, crevettes,\n calamars, moules, ail, persil.","Délicieuse et garnie de fruits de mer frais.","preparation complete"));


        list = findViewById(R.id.liste);
        list.setAdapter(new ProduitAdapter(productSv.findAll(), this));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                // Créer un Intent pour passer à l'activité DescreptionPizzaActivity
                Intent intent = new Intent(ListPizzaActivity.this, DescreptionPizzaActivity.class);

                // Passer les détails de la pizza via l'intent
                intent.putExtra("pizzaName", productSv.findAll().get(position).getNom());
                intent.putExtra("pizzaDescreption", productSv.findAll().get(position).getDescription());
                intent.putExtra("pizzaIngredients", productSv.findAll().get(position).getDetaisIngredients());
                intent.putExtra("pizzaImage", productSv.findAll().get(position).getPhoto());

                // Démarrer l'activité DescreptionPizzaActivity
                startActivity(intent);
            }
        });


    }
}
