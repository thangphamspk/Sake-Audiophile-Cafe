package com.sake.service.impl;

import com.sake.entity.Staff;
import com.sake.repository.StaffRepository;
import com.sake.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff findStaffById(long id) {
        return staffRepository.getOne(id);
    }

    @Override
    public Staff findStaffByEmail(String email) {
        return staffRepository.findStaffByEmail(email);
    }

    @Override
    public Staff findStaffByPhone(String phone) {
        return staffRepository.findStaffByPhone(phone);
    }

    @Override
    public Staff addStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public void deleteStaffById(long id) {
        staffRepository.deleteById(id);
    }
}
