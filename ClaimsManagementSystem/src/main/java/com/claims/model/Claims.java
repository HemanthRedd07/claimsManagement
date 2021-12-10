package com.claims.model;

import java.util.Arrays;

import javax.persistence.*;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Entity
@Table(name="patientdetails")
@Component
public class Claims {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer claimid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="PolicyName")
	private String PolicyName;
	
	@Column(name="ClaimAmount")
	private Integer ClaimAmount;
	
	@Column(name="Claimdate")
	private String Claimdate;
	
	@Column(name="ClaimPic")
	@Lob
	private byte[] ClaimPic;
	
	
	public Claims() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Claims(int claimid, String name, String gender, String PolicyName, int ClaimAmount, String Claimdate,
			byte[] ClaimPic) {
		super();
		this.claimid = claimid;
		this.name = name;
		this.gender = gender;
		this.PolicyName = PolicyName;
		this.ClaimAmount = ClaimAmount;
		this.Claimdate = Claimdate;
		this.ClaimPic = ClaimPic;
	}


	public int getclaimId() {
		return claimid;
	}


	public void setclaimId(int claimid) {
		this.claimid = claimid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPolicyName() {
		return PolicyName;
	}


	public void setPolicyName(String PolicyName) {
		this.PolicyName = PolicyName;
	}


	public int getClaimAmount() {
		return ClaimAmount;
	}


	public void setClaimAmount(int ClaimAmount) {
		this.ClaimAmount = ClaimAmount;
	}


	public String getClaimdate() {
		return Claimdate;
	}


	public void setClaimdate(String Claimdate) {
		this.Claimdate = Claimdate;
	}


	public byte[] getClaimPic() {
		return ClaimPic;
	}


	public void setClaimPic(byte[] ClaimPic) {
		this.ClaimPic = ClaimPic;
	}
	
	
	public String getClaimPicture() {
		return Base64.encodeBase64String(ClaimPic);
	}


	@Override
	public String toString() {
		return "Patient [claimid=" + claimid + ", name=" + name + ", gender=" + gender + ", PolicyName=" + PolicyName
				+ ", ClaimAmount=" + ClaimAmount + ", Claimdate=" + Claimdate + "]";
	}


	
	
	

}
