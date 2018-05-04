package com.sake.service.impl;

import com.sake.entity.Area;
import com.sake.repository.AreaRepository;
import com.sake.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public Area findAreaById(long id) {
        return areaRepository.getOne(id);
    }

    @Override
    public Area addArea(Area area) {
        return areaRepository.save(area);
    }

    @Override
    public void deleteAreaById(long id) {
        areaRepository.deleteById(id);
    }
}
