package com.sake.service;

import com.sake.entity.Table;

import java.util.List;

public interface TableService {

    List<Table> getTablesByAreaId(long id);

    Table findTableById(long id);

    Table addTable(Table table);

    void deleteTableById(long id);
}
