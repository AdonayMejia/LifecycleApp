package sv.edu.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import sv.edu.lifecycleapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private EditText Hours;
    private EditText Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        Hours=binding.Hours;
        Name=binding.Name;
    }

    public void operation(View view){
        Intent s= new Intent(this,Discounts.class);
        s.putExtra("PassAct",Hours.getText().toString());
        s.putExtra("NameAct",Name.getText().toString());
        startActivity(s);
    }

}