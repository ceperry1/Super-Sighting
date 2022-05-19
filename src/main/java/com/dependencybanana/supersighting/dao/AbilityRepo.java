/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dependencybanana.supersighting.dao;
import com.dependencybanana.supersighting.models.Ability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author kaung
 */
@Repository
public interface AbilityRepo extends JpaRepository<Ability, Integer>
{
    
}
