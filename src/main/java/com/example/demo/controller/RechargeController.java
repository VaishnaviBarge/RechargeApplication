package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.model.Recharge;
import com.example.demo.repository.RechargeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class RechargeController {
	
	@Autowired
	private RechargeRepository rechargeRepository;
	
	@PostMapping("/recharge")
	public Recharge addUser(@RequestBody Recharge recharge) {
		return rechargeRepository.save(recharge);
	}
	
	@PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Login login) {
        Optional<Recharge> user = rechargeRepository.findByEmailAndPassword(login.getEmail(), login.getPassword());
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
	 
}
