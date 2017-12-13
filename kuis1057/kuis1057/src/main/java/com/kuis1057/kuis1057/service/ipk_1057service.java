/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1057.kuis1057.service;

import com.kuis1057.kuis1057.entity.ipk_1057;
import com.kuis1057.kuis1057.repo.ipk_1057repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC06
 */
@Service("ipk_1057service")
@Transactional
public class ipk_1057service {
    
    @Autowired
    private ipk_1057repo repo;

    public ipk_1057 insert(ipk_1057 ipk_1057) {
        return repo.save(ipk_1057);
    }
    
    public ipk_1057 update(ipk_1057 ipk_1057) {
        return repo.save(ipk_1057);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public ipk_1057 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<ipk_1057> getAll(){
        return repo.findAllipk_1057();
    }
}


