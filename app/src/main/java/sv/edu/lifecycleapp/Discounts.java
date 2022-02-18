package sv.edu.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import sv.edu.lifecycleapp.databinding.ActivityDiscountsBinding;

public class Discounts extends AppCompatActivity {
    private ActivityDiscountsBinding binding;
    private TextView ISSS;
    private TextView AFP;
    private TextView RENTA;
    private TextView NETO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityDiscountsBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        ISSS=binding.isss;
        AFP=binding.afp;
        RENTA=binding.renta;
        NETO=binding.neto;

        double time= 8.50;
        String data=getIntent().getStringExtra("PassAct");
        int hours=Integer.parseInt(data);
        double total=hours * time ;

        double isss= total * 0.02;
            ISSS.setText("ISSS" + isss);
        double afp= total * 0.03;
            AFP.setText("AFP" + afp);
        double renta = total * 0.04;
            RENTA.setText("Renta" + renta);
        double Sneto= total - isss - afp - renta;
            NETO.setText("Salario Total" + Sneto);
    }

}