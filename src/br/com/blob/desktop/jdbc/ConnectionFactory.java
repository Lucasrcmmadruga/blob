/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blob.desktop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author internet
 */
public class ConnectionFactory {

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:mysql://blob_site.mysql.dbaas.com.br", "blob_site", "Batata1995@");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
