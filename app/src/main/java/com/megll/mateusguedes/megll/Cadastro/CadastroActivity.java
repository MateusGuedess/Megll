package com.megll.mateusguedes.megll.Cadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
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
                String val1 = nomeCliente.getText().toString();
                String val2 = telefone.getText().toString();
                String val3 = celular.getText().toString();
                String val4 = documento.getText().toString();
                String val5 = email.getText().toString();
                String val6 = endereco.getText().toString();
                if(TextUtils.isEmpty(val1) || TextUtils.isEmpty(val2) || TextUtils.isEmpty(val3) || TextUtils.isEmpty(val4) || TextUtils.isEmpty(val5) || TextUtils.isEmpty(val6)){
                    Toast toast = Toast.makeText(getApplicationContext(), "Todos os campos devem ser preenchidos", Toast.LENGTH_LONG);
                    toast.show();
                    nomeCliente.setError("preencha esse campo");
                } else {
                    //cadastroPresenter.enviaDadosModel(val1, val2, val3,val4, val5, val6);
                }
            }
        });

    }
}
