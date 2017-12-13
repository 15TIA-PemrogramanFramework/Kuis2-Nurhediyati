/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1057.kuis1057.controller;

import com.kuis1057.kuis1057.entity.identitas_1057;
import com.kuis1057.kuis1057.service.identitas_1057service;
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
@RequestMapping("/identitas_1057")
public class identitas_1057controller {

    @Autowired
    private identitas_1057service identitas_1057service;

    @RequestMapping(method = RequestMethod.POST)
    public identitas_1057 insert(@RequestBody identitas_1057 identitas_1057) {
        return identitas_1057service.insert(identitas_1057);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas_1057 update(@RequestBody identitas_1057 identitas_1057) {
        return identitas_1057service.update(identitas_1057);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas_1057service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public identitas_1057 getById(@PathVariable("id") Long id){
        return identitas_1057service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas_1057> getAll(){
        return identitas_1057service.getAll();
    }
}
