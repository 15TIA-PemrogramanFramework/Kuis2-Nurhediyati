/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1057.kuis1057.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC06
 */
@Entity
@Table(name = "ipk_1057")
public class ipk_1057 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String ipk;
    @Column(length = 255, nullable = true)
    private String predicat;
    private String nim;
    private String tahun;

       @ManyToOne
    private identitas_1057 identitas_1057;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getIpk() {
        return ipk;
    }

    /**
     * @param name the name to set
     */
    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    /**
     * @return the description
     */
    public String getPredicat() {
        return predicat;
    }

    /**
     * @param description the description to set
     */
    public void setPredicat(String predicat) {
        this.predicat = predicat;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim= nim;
        
    }
    
     public String getTahun(){
        return tahun;
    }
    
    public void setTahun(String tahun){
        this.tahun= tahun;
        
    }

    /**
     * @return the name
     */
    
}


