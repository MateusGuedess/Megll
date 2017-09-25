package com.megll.mateusguedes.megll.Cadastro;

/**
 * Created by Mateus Guedes on 25/09/2017.
 */

public class CadastroPresenter {

    private CadastroModel cadastroModel = new CadastroModel();

    //confereCamposVazios(){} recebe os dados e verifica se eles não estão vazios.
    public boolean confereCamposVazios(String nomeCliente, String telefone, String celular, String documento,String email, String endereco){
        boolean confereCampos;

        if(nomeCliente.length() == 0 || telefone.length() == 0 || celular.length() == 0 || documento.length() == 0 || email.length() == 0 || endereco.length() == 0) {
            confereCampos = false;
        } else {
            confereCampos = true;
        }

        return confereCampos;
    }

}
