/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;

/**
 *
 * @author Medina
 */
public class MyDAOFactory extends DAOFactory {
    public MyDAOFactory(Connection connection){
        this.connection = connection;
    }
    
    @Override
    public UsuarioDAO getUsuarioDAO(){
      return new MyUsuarioDAO(this.connection);
    }
    
    @Override
    public EscolaDAO getEscolaDAO(){
      return new MyEscolaDAO(this.connection);
    }
    
    @Override
    public FuncionarioDAO getFuncionarioDAO(){
      return new MyFuncionarioDAO(this.connection);
    }
}
