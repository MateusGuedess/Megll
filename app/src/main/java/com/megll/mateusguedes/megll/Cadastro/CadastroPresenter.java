package com.megll.mateusguedes.megll.Cadastro;

import android.text.TextUtils;

import com.megll.mateusguedes.megll.Cliente;

import org.w3c.dom.Text;

import java.util.UUID;

/**
 * Created by Mateus Guedes on 25/09/2017.
 */

public class CadastroPresenter {

    private CadastroModel cadastroModel = new CadastroModel();

    //confereCamposVazios(){} recebe os dados e verifica se eles não estão vazios.
    public boolean confereCamposVazios(String nomeCliente){


        if(TextUtils.isEmpty(nomeCliente)) {
            return false;
        } else {
            return true;
        }

    }

    //enviaDadosModel envia os dados para a model passando o objeto e o id do objeto
    public void enviaDadosModel(String nomeCliente, String telefone, String celular, String documento, String email, String endereco){
        Cliente cliente = new Cliente();
        cliente.setId(UUID.randomUUID().toString());
        cliente.setNomeCliente(nomeCliente);
        cliente.setTelefone(telefone);
        cliente.setCelular(celular);
        cliente.setDocumento(documento);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        cadastroModel.cadastrarUsuario(cliente, cliente.getId());
    }

}
