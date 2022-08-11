package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

}
