package ensa.ma.SplashActivity;

import android.os.Bundle;
import android.view.Menu;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ImageView;
import android.widget.TextView;


public class DescreptionPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_descreption_pizza);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Récupérer les données de l'intent
        String pizzaName = getIntent().getStringExtra("pizzaName");
        String pizzaDescription = getIntent().getStringExtra("pizzaDescreption");
        String pizzaIngredients = getIntent().getStringExtra("pizzaIngredients");
        int pizzaImage = getIntent().getIntExtra("pizzaImage", 0); // Image envoyée en tant qu'entier (resource ID)

        // Assigner les données aux vues
        TextView nameTextView = findViewById(R.id.pizzaname2);
        TextView descriptionTextView = findViewById(R.id.descriptionText);
        TextView ingredientsTextView = findViewById(R.id.ingredientsText);
        ImageView pizzaImageView = findViewById(R.id.pizzaimg2);

        // Afficher les données dans les vues correspondantes
        nameTextView.setText(pizzaName);
        descriptionTextView.setText(pizzaDescription);
        ingredientsTextView.setText(pizzaIngredients);
        pizzaImageView.setImageResource(pizzaImage);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);  // Charge le menu dans la Toolbar
        return true;
    }


}