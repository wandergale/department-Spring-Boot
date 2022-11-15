package com.wanderdepartment.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderdepartment.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
