	/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import jdbc.ConnectionFactory;

/**
 *
 * @author Medina
 */
public abstract class DAOFactory implements AutoCloseable {

    protected Connection connection;
     
    public static DAOFactory getInstance() throws ClassNotFoundException, IOException, SQLException {
        Connection connection = ConnectionFactory.getInstance().getConnection();
        DAOFactory factory = null;
        
        switch (ConnectionFactory.getDbServer()) {
            case "mysql":
                factory = new MyDAOFactory(connection);
                break;
            default:
                throw new RuntimeException("Servidor de banco de dados não suportado.");
        }
        
        return factory;
    }    
    
    public void beginTransaction() throws SQLException {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

            throw new SQLException("Erro ao abrir transação.");
        }
    }

    public Savepoint createSavepoint(String name) throws SQLException {
        try {
            return connection.setSavepoint(name);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

            throw new SQLException("Erro ao executar transação.");
        }
    }

    public void commitTransaction() throws SQLException {
        try {
            connection.commit();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

            throw new SQLException("Erro ao finalizar transação.");
        }
    }

    public void rollbackTransaction() throws SQLException {
        try {
            connection.rollback();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

            throw new SQLException("Erro ao executar transação.");
        }
    }

    public void rollbackTransactionTo(Savepoint savepoint) throws SQLException {
        try {
            connection.rollback(savepoint);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

            throw new SQLException("Erro ao executar transação.");
        }
    }

    public void endTransaction() throws SQLException {
        try {
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

            throw new SQLException("Erro ao finalizar transação.");
        }
    }

    public void closeConnection() throws SQLException {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

            throw new SQLException("Erro ao fechar conexão ao banco de dados.");
        }
    }

    public abstract UsuarioDAO getUsuarioDAO();
    public abstract EscolaDAO getEscolaDAO();
    public abstract FuncionarioDAO getFuncionarioDAO();
	
    @Override
    public void close() throws SQLException {
        closeConnection();
    }

}

