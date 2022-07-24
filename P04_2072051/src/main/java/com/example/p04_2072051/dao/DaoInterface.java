package com.example.p04_2072051.dao;

import javafx.beans.Observable;
import javafx.collections.ObservableList;

public interface DaoInterface<T> {
    ObservableList<T> getData();
    void seData(T data);
    void delData(T data);
}
