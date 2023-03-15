package com.example.db_security.repository;

import com.example.db_security.model.entity.Classz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasszRepository extends JpaRepository<Classz,Integer> {
}
