package ensa.ma.SplashActivity.services;

import java.util.ArrayList;
import java.util.List;

import ensa.ma.SplashActivity.classes.Produit;
import ensa.ma.SplashActivity.dao.IDao;

public class ProduitServices implements IDao<Produit> {

    private List<Produit> produits ;

    public ProduitServices () { produits = new ArrayList<>() ; }

    public  boolean create (Produit produit) {
        return produits.add(produit) ;
    }

    @Override
    public boolean update(Produit produit) {
        return false;
    }

    @Override
    public boolean delete(Produit produit) {
        return produits.remove(produit);
    }

    @Override
    public Produit  findById(int id) {
        for( Produit produit : produits)
            if(produit.getId() == id)
                return produit;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

}
