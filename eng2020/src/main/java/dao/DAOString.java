/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Medina
 * @param <T> the DAOString Type.
 */
public interface DAOString<T> {
    public void create(T t) throws SQLException;
    public T read(String prim_key) throws SQLException;
    public void update(T t) throws SQLException;
    public void delete(String prim_key) throws SQLException;

    public List<T> all() throws SQLException;    
}
