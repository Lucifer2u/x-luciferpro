package org.lucifer.vbluciferpro.service;

import org.lucifer.vbluciferpro.mapper.PoliticsstatusMapper;
import org.lucifer.vbluciferpro.model.Politicsstatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliticsstatusService {

    @Autowired
    PoliticsstatusMapper politicsstatusMapper;

    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}