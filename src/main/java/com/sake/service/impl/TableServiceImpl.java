package com.sake.service.impl;

import com.sake.entity.Table;
import com.sake.repository.TableRepository;
import com.sake.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private TableRepository tableRepository;

    @Override
    public List<Table> getTablesByAreaId(long id) {
        return tableRepository.getTablesByAreaId(id);
    }

    @Override
    public Table findTableById(long id) {
        return tableRepository.getOne(id);
    }

    @Override
    public Table addTable(Table table) {
        return tableRepository.save(table);
    }

    @Override
    public void deleteTableById(long id) {
        tableRepository.deleteById(id);
    }
}
