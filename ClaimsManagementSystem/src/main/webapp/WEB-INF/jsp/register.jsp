<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Claim Registration</title>
</head>
<body>
<h4 style="border-bottom:2px solid black;text-align:center;padding:10px;font-size:24px;color:#ffffff;">Claim Registration</h4>
<div class="main">
	<form method="post" class="form" action="register" onsubmit="return validate(this)">
		<tr>
			<td>Name :</td>
			<td><form:input path="name"/></td>
		</tr>
		
		<td> Gender :</td>
		<select class="control" name="gender">
			<option>Male</option>
			<option>Female</option>
			<option>Others</option>
		</select><br>
		
		<td style="color:#ffffff;">Policyname</td>
		<div class="control" style="width:250px;display:inline-block;text-align:left;">
			<td><form:radiobutton path="policyname"  value="Long-term" label="Long-term"/>
			<form:radiobutton path="policyname"  value="short-term" label="Short-term"/></td>
		</div>
		<br>
		
		<td>ClaimAmount :</td>
		<td><form:input path="claimamount"/></td>
		
		<tr>
		<td>Claimdate :</td>
        <input type="date" name="claimdate">
		</tr>
		
		<tr>
		<td>Claim Photo :</td>
		<td><input type="file" name="claimPic"></td>
		</tr>

		
		<input type="submit" value="Save Claim" class="btn">
	</form>
</div>
