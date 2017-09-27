package com.megll.mateusguedes.megll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.megll.mateusguedes.megll.Cadastro.CadastroActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnAdicionarUsuario;
    private FirebaseAuth firebaseAuth;
    public FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInWithEmailAndPassword("teuguedes@outlook.com", "iamdude18");

        if(user != null){
            String email = user.getEmail();
            Log.i(TAG, "onCreate: email do usuario logado " + email);
        }else {
            Log.i(TAG, "onCreate: Não logou");
        }

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
