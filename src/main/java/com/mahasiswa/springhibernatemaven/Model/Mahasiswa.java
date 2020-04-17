package com.crud.mahasiswa.MavenProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ASUS Arika Widayanti
 */
@Entity
@Table(name = "MAHASISWA")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String NIM;
    private String Nama;
    private String Alamat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
}
