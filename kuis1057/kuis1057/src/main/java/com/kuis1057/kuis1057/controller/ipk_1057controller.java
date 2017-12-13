/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1057.kuis1057.controller;

import com.kuis1057.kuis1057.entity.ipk_1057;
import com.kuis1057.kuis1057.service.ipk_1057service;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC06
 */
@RestController
@RequestMapping("/ipk_1057")
public class ipk_1057controller {

    @Autowired
    private ipk_1057service ipk_1057service;

    @RequestMapping(method = RequestMethod.POST)
    public ipk_1057 insert(@RequestBody ipk_1057 ipk_1057) {
        return ipk_1057service.insert(ipk_1057);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ipk_1057 update(@RequestBody ipk_1057 ipk_1057) {
        return ipk_1057service.update(ipk_1057);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipk_1057service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ipk_1057 getById(@PathVariable("id") Long id){
        return ipk_1057service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ipk_1057> getAll(){
        return ipk_1057service.getAll();
    }
}
