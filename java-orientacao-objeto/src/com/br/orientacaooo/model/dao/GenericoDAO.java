package com.br.orientacaooo.model.dao;

import com.br.orientacaooo.infra.ConexaoMysql;

import java.sql.SQLException;
import java.util.List;

public interface GenericoDAO<T> {

    void save(T t) throws SQLException;
    List<T> fidAll() throws SQLException;
    void delete(int id) throws SQLException;
    void merge(T t, int id) throws SQLException;
    T findById(int id) throws SQLException;
}
