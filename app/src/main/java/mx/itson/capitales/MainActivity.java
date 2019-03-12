package mx.itson.capitales;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtSonora, txtChihuahua, txtSinaloa;
    Button calificar;
    Estado estado = new Estado();
    Estado sonora = new Estado();
    Estado chihuahua = new Estado();
    Estado sinaloa = new Estado();
    Object [] resultados = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSonora =(EditText)findViewById(R.id.txtSonora);
        txtChihuahua =(EditText)findViewById(R.id.txtChihuahua);
        txtSinaloa =(EditText)findViewById(R.id.txtSinaloa);

        calificar = (Button)findViewById(R.id.calificar);

        calificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonora.setCapital(txtSonora.getText().toString());
                chihuahua.setCapital(txtChihuahua.getText().toString());
                sinaloa.setCapital(txtSinaloa.getText().toString());

                resultados = estado.jugarTrivia(sonora.getCapital(), chihuahua.getCapital(), sinaloa.getCapital());

                //Puntuacion obtenida
                Toast.makeText(MainActivity.this, "La puntuacion fue de: "+resultados[3]+ " puntos\n" +
                        "Capital Sonora: "+resultados[0]+"\n" +
                        "Capital Chihuahua: "+resultados[1]+"\n" +
                        "Capital Sinaloa: "+resultados[2], Toast.LENGTH_LONG).show();

            }
        });

    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            System.exit(0);
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Si sales no podras continuar respondiendo", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}