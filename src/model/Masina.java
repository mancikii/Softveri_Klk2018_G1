/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author tesic
 */
public class Masina {
    private int id;
    private String naziv;
    private int godinaProizvodnje;
    private int ocekivaniVek;
    private String proizvodjac;
    private Date datumEkspl = new Date();
    private TipMasine tipMasine;
    private Lokacija lokacija;
    private List<Alat> alati = new ArrayList<>();
    private String imePrezime;
    

    public Masina() {
    }

    public Masina(int id, String naziv,Date datumEkspl, int godinaProizvodnje, TipMasine tipMasine, Lokacija lokacija) {
        this.id = id;
        this.naziv = naziv;
        this.datumEkspl = datumEkspl;
        this.godinaProizvodnje = godinaProizvodnje;
        this.tipMasine = tipMasine;
        this.lokacija = lokacija;
    }

    public Masina(int id, String naziv,Date datumEkspl, int godinaProizvodnje, int ocekivaniVek, String proizvodjac, TipMasine tipMasine, Lokacija lokacija, String imePrezime) {
        this.id = id;
        this.naziv = naziv;
        this.godinaProizvodnje = godinaProizvodnje;
        this.datumEkspl = datumEkspl;
        this.ocekivaniVek = ocekivaniVek;
        this.proizvodjac = proizvodjac;
        this.tipMasine = tipMasine;
        this.lokacija = lokacija;
        this.imePrezime = imePrezime;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }


    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public Date getDatumEkspl() {
        return datumEkspl;
    }

    public void setDatumEkspl(Date datumEkspl) {
        this.datumEkspl = datumEkspl;
    }

    public TipMasine getTipMasine() {
        return tipMasine;
    }

    public void setTipMasine(TipMasine tipMasine) {
        this.tipMasine = tipMasine;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }

    public List<Alat> getAlati() {
        return alati;
    }

    public void setAlati(List<Alat> alati) {
        this.alati = alati;
    }

    public int getOcekivaniVek() {
        return ocekivaniVek;
    }

    public void setOcekivaniVek(int ocekivaniVek) {
        this.ocekivaniVek = ocekivaniVek;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Masina{" + "id=" + id + ", naziv=" + naziv + " godinaProizvodnje=" + godinaProizvodnje + ", datumEkspl=" + datumEkspl + ", tipMasine=" + tipMasine + ", lokacija=" + lokacija + '}';
    }
    
    
    
}
