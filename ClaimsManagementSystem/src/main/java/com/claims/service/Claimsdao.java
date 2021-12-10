package com.claims.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.claims.model.Claims;

	
	@Service
	public interface Claimsdao {

		public void addClaim(Claims claims);
		public List<Claims> getAllClaims();
		public Claims getClaimById(int claimid);
		public void updateClaim(Claims claims);
		public void deleteClaim(int claimid);
		
	}
