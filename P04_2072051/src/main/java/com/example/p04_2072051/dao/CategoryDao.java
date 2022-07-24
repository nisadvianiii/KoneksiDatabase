package com.example.p04_2072051.dao;

import com.example.p04_2072051.entity.Category;
import com.example.p04_2072051.utility.MyConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryDao implements DaoInterface<Category> {
    @Override
    public ObservableList<Category> getData() {
        ObservableList<Category> clist;
        clist = FXCollections.observableArrayList();

        Connection conn = MyConnection.getConnection();
        String halo = "select * from category";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(halo);
            ResultSet hasil = ps.executeQuery();
            while(hasil.next()){
                int id = hasil.getInt("id");
                String name = hasil.getString("name");
                Category c = new Category(id, name);
                clist.add(c);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clist;
    }

    @Override
    public void seData(Category data) {

    }

    @Override
    public void delData(Category data) {

    }
}
