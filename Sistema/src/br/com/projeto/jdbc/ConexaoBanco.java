/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.jdbc;

import java.sql.*;

/**
 *
 * @author agata
 */
public class ConexaoBanco {
  public Connection conector(){
	java.sql.Connection conexao = null;
	//declaração do driver, url contendo nome do driver, tipo de banco de
        //dados, link do banco com a porta do mySQL e nome do banco de dados,
        //usuário e senha padrão do mySQL
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/bdsistema";
	String user = "root";
	String password = "";

	try{
                //realizando conexão do banco através do driver
		Class.forName(driver);
	   	conexao = DriverManager.getConnection(url, user, password);
		return conexao;
	} catch (Exception e){
                //caso não haja a conexão, mostra-se o erro e retorna como "null"
		System.out.println(e);
		return null;
	}
}
}
