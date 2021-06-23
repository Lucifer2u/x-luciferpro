package org.lucifer.vbluciferpro.service;

import org.lucifer.vbluciferpro.mapper.NationMapper;
import org.lucifer.vbluciferpro.model.Nation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationService {
    @Autowired
    NationMapper nationMapper;


    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}

