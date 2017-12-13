/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1057.kuis1057.repo;

import com.kuis1057.kuis1057.entity.identitas_1057;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC06
 */
public interface identitas_1057repo extends CrudRepository<identitas_1057, Long> {
    
    @Query("select c from identitas_1057 c")
    public List<identitas_1057> findAllidentitas_1057();
}
