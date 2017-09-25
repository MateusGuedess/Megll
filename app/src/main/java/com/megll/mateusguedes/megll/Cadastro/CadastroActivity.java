package com.megll.mateusguedes.megll.Cadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.megll.mateusguedes.megll.R;

public class CadastroActivity extends AppCompatActivity {

    private EditText nomeCliente, telefone, celular, documento, email, endereco;
    private Button btnEnviar, btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nomeCliente = (EditText) findViewById(R.id.nomeCliente);
        telefone = (EditText) findViewById(R.id.telefone);
        celular = (EditText) findViewById(R.id.celular);
        documento = (EditText) findViewById(R.id.email);
        email = (EditText) findViewById(R.id.endereco);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);
        //TODO proximo passo -> confirir se todos os campos tem valores, e inserir no firebase.

    }
}
