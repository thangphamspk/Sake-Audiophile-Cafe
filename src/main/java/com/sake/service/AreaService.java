package com.sake.service;

import com.sake.entity.Area;

public interface AreaService {

    Area findAreaById(long id);

    Area addArea(Area area);

    void deleteAreaById(long id);
}
