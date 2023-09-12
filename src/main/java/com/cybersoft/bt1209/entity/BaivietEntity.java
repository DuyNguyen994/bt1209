package com.cybersoft.bt1209.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity(name = "baiviet")
public class BaivietEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "tieude")
    private String tieude;
    @Column(name = "noidung")
    private String noidung;
    @Column(name = "ngayviet")
    private Date ngayviet;
    @Column(name = "id_tacgia")
    private int idTacgia;


    public BaivietEntity(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public Date getNgayviet() {
        return ngayviet;
    }

    public void setNgayviet(Date ngayviet) {
        this.ngayviet = ngayviet;
    }

    public int getIdTacgia() {
        return idTacgia;
    }

    public void setIdTacgia(int idTacgia) {
        this.idTacgia = idTacgia;
    }
}
