package com.sake.repository;

import com.sake.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    Staff findStaffByEmail(String email);

    Staff findStaffByPhone(String phone);

}
