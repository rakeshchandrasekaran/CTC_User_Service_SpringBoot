package com.ctc.user.repository;

import com.ctc.user.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository extends JpaRepository<userModel, Integer> {
    //List<userModel> getAllUsers();
    //userModel getById(@Param("Id") Integer Id);
}
