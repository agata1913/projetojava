/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author agata
 */
public class TestarConexao {
    public static void main(String[] args) {
        try {
            new ConexaoBanco().conector();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+ e);
        }
    }
}
