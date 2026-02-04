/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import baza.DBBroker;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Alat;
import model.Inzenjer;
import model.Lokacija;
import model.Masina;

/**
 *
 * @author tesic
 */
public class Controller {
    private static Controller instance;
    List<Inzenjer> listaInzenjera = new ArrayList<>();
    private Inzenjer ulogovani;
    private DBBroker dbb;
    

    private Controller() {
        Inzenjer i1 = new Inzenjer(1, "ana", "ana", "Ana", "Tesic");
        Inzenjer i2 = new Inzenjer(2, "ana1", "ana1", "Ano", "Tesic1");
        Inzenjer i3 = new Inzenjer(3, "ana2", "ana2", "Anci", "Tesic2");
        
        listaInzenjera.add(i1);
        listaInzenjera.add(i2);
        listaInzenjera.add(i3);
        
       dbb = new DBBroker();

    }

    public static Controller getInstance() {
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }

    public boolean login(String username, String password) {
        for(Inzenjer i: listaInzenjera){
            if(i.getUsername().equals(username) && i.getPassword().equals(password)){
                ulogovani = i;
                return true;
            }
        }
        
        
        return false;
    }

    public Inzenjer getUlogovani() {
        return ulogovani;
    }

    public List<Lokacija> vratiSveLokacijeIzBaze() {
        return dbb.vratiSveLokacijeIzBaze();
    }

    public List<Alat> vratiSveAlate() {
        return dbb.vratiSveAlate();
    }

    public boolean postojiMasina(int idLokacija) {
        return dbb.postojiMasina(idLokacija);
    }

    public boolean ubaciMasinuUBazu(Masina m) throws SQLException {
        return dbb.ubaciMasinuUBazu(m);
    }
    
    
    
    
}
