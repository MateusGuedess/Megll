package com.megll.mateusguedes.megll.Cadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.megll.mateusguedes.megll.R;

import org.w3c.dom.Text;

public class CadastroActivity extends AppCompatActivity {

    private EditText nomeCliente, telefone, celular, documento, email, endereco;
    private Button btnEnviar, btnCancelar;
    private CadastroPresenter cadastroPresenter;
    private static final String TAG = "CadastroActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    
        
        nomeCliente = (EditText) findViewById(R.id.nomeCliente);
        telefone = (EditText) findViewById(R.id.telefone);
        celular = (EditText) findViewById(R.id.celular);
        documento = (EditText) findViewById(R.id.email);
        email = (EditText) findViewById(R.id.endereco);
        endereco = (EditText) findViewById(R.id.endereco);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastroPresenter = new CadastroPresenter();
                    cadastroPresenter.enviaDadosModel(nomeCliente.getText().toString(), telefone.getText().toString(), celular.getText().toString(),documento.getText().toString(), email.getText().toString(),  endereco.getText().toString());
            }
        });

    }
}
