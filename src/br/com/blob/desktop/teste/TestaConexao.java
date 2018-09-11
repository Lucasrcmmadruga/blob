/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blob.desktop.teste;

import br.com.blob.desktop.jdbc.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author internet
 */
public class TestaConexao {
    public static void main(String[] args) {

        ConnectionFactory.getConnection();
    }
 
}

