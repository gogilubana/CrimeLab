/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimelab.repository;

import com.crimelab.domain.MedicoLegal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author rowPC
 */
public interface MedicoLegalDAO {
    public List<MedicoLegal> getAllMedicoLegal(@Param("month") String month);
    public void medicoLegalInfo(MedicoLegal medicoLegal);
}
