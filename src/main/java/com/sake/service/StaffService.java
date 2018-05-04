package com.sake.service;

import com.sake.entity.Staff;

public interface StaffService {

    Staff findStaffById(long id);

    Staff findStaffByEmail(String email);

    Staff findStaffByPhone(String phone);

    Staff addStaff(Staff staff);

    void deleteStaffById(long id);

}
