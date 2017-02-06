package example.google.com.myappportifolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btFilmesPopulares;
    private Button btStockHawk;
    private Button btFacaoMaior;
    private Button btMaterial;
    private Button btSejaOnipresente;
    private Button btCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btFilmesPopulares = (Button) findViewById(R.id.btFilmesPopulares);
        btFilmesPopulares.setOnClickListener(this);
        btStockHawk = (Button) findViewById(R.id.btStockHawk);
        btStockHawk.setOnClickListener(this);
        btFacaoMaior = (Button) findViewById(R.id.btFacaoMaior);
        btFacaoMaior.setOnClickListener(this);
        btMaterial = (Button) findViewById(R.id.btMaterial);
        btMaterial.setOnClickListener(this);
        btSejaOnipresente = (Button) findViewById(R.id.btSejaOnipresente);
        btSejaOnipresente.setOnClickListener(this);
        btCapstone = (Button) findViewById(R.id.btCapstone);
        btCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btFilmesPopulares:
                Toast.makeText(MainActivity.this, "Esse botão vai abrir o app de Filmes Populares", Toast.LENGTH_LONG).show();
                break;
            case R.id.btStockHawk:
                Toast.makeText(MainActivity.this, "Esse botão vai abrir o app de Stock Hawk", Toast.LENGTH_LONG).show();
                break;
            case R.id.btFacaoMaior:
                Toast.makeText(MainActivity.this, "Esse botão vai abrir o app de o maior", Toast.LENGTH_LONG).show();
                break;
            case R.id.btMaterial:
                Toast.makeText(MainActivity.this, "Esse botão vai abrir o app de com Material", Toast.LENGTH_LONG).show();
                break;
            case R.id.btSejaOnipresente:
                Toast.makeText(MainActivity.this, "Esse botão vai abrir o app de Seja onipresente", Toast.LENGTH_LONG).show();
                break;
            case R.id.btCapstone:
                Toast.makeText(MainActivity.this, "Esse botão vai abrir o app de Filmes Capstone", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(MainActivity.this, "Clique não mapeado", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
