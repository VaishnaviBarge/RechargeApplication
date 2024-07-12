package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Recharge;

@Repository
public interface RechargeRepository extends JpaRepository<Recharge, Long>{
	Optional<Recharge> findByEmailAndPassword(String email, String password);
}
