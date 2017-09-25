package com.megll.mateusguedes.megll.Cadastro;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.megll.mateusguedes.megll.Cliente;

/**
 * Created by Mateus Guedes on 25/09/2017.
 */

public class CadastroModel extends AppCompatActivity{

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();

    //Cadastra usuário
    public void cadastrarUsuario(Cliente cliente, String id){

        inicializarFirebase();
        databaseReference.child("Cliente").child(id).setValue(cliente);

    }

    //Inicializa o Firebase
    public void inicializarFirebase(){
        FirebaseApp.initializeApp(CadastroModel.this);
    }

}
