package com.megll.mateusguedes.megll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.megll.mateusguedes.megll.Cadastro.CadastroActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnAdicionarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdicionarUsuario = (Button) findViewById(R.id.btnAdicionarUsuario);

        btnAdicionarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });

    }
}
