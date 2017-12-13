/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1057.kuis1057.service;

import com.kuis1057.kuis1057.entity.identitas_1057;
import com.kuis1057.kuis1057.repo.identitas_1057repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC06
 */
@Service("identitas_1057service")
@Transactional
public class identitas_1057service {
    
    @Autowired
    private identitas_1057repo repo;

    public identitas_1057 insert(identitas_1057 identitas_1057) {
        return repo.save(identitas_1057);
    }
    
    public identitas_1057 update(identitas_1057 identitas_1057) {
        return repo.save(identitas_1057);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public identitas_1057 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<identitas_1057> getAll(){
        return repo.findAllidentitas_1057();
    }
}


