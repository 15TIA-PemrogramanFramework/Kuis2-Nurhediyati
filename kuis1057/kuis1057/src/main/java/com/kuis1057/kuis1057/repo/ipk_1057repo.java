/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1057.kuis1057.repo;

import com.kuis1057.kuis1057.entity.ipk_1057;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC06
 */
public interface ipk_1057repo extends CrudRepository<ipk_1057, Long> {
    
    @Query("select c from ipk_1057 c")
    public List<ipk_1057> findAllipk_1057();
}
