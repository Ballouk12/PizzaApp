package ensa.ma.SplashActivity.dao;

import java.util.List;

import ensa.ma.SplashActivity.classes.Produit;

public interface IDao <T> {
    public abstract boolean create (T o);
    boolean update (T o);
    boolean delete (T o);

    boolean update(Produit produit);

    boolean delete(Produit produit);

    T findById (int id);
    List<T> findAll ();
}

