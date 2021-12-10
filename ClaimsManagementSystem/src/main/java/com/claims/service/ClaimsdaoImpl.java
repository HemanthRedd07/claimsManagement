package com.claims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claims.model.Claims;
import com.claims.repository.ClaimsRepository;

@Service
public class ClaimsdaoImpl implements Claimsdao 
{
	@Autowired
	ClaimsRepository claimsRepository;
	
	@Override
	public void addClaim(Claims claims) {
		// TODO Auto-generated method stub
		claimsRepository.save(claims);
	}

	@Override
	public List<Claims> getAllClaims() {
		
		List<Claims> claimsList =  claimsRepository.findAll();
		return claimsList;
	}
    @Override
	public Claims getClaimById(int claimid) {
		// TODO Auto-generated method stub
		Claims claims = claimsRepository.getClaimById(claimid);
		return claims;
	}

	@Override
	public void updateClaim(Claims claims) {
		// TODO Auto-generated method stub
		claimsRepository.save(claims);

	}

	@Override
	public void deleteClaim(int claimid) {
		// TODO Auto-generated method stub
		claimsRepository.deleteById(claimid);
	}

	@Override
	public Claims getClaimById(int claimid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateClaim(Claims claims) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClaim(int claimid) {
		// TODO Auto-generated method stub
		
	}
}

	