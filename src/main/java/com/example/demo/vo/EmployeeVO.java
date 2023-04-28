package com.example.demo.vo;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author Sujith
 * @created Date23-Apr-2023
 *
 */
public class EmployeeVO {

	private long employeeID;
	private String employeeName;
	private String dateOfBirth;

	private static final String ALGORITHM = "AES";
	private static final String KEY = "employeeencrp345";
	
public EmployeeVO() {
	super();// TODO Auto-generated constructor stub
}
	
	
	
	
	
	public EmployeeVO(long employeeID, String employeeName, LocalDate dateOfBirth) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.dateOfBirth = encrypt(dateOfBirth.toString(), KEY);
	}

	private static String encrypt(String text, String key) {
		try {
			SecretKeySpec aesKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), ALGORITHM);
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			byte[] encrypted = cipher.doFinal(text.getBytes(StandardCharsets.UTF_8));
			return Base64.getEncoder().encodeToString(encrypted);
		} catch (Exception e) {
			throw new RuntimeException("Error encrypting text", e);
		}
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public static String getAlgorithm() {
		return ALGORITHM;
	}

	public static String getKey() {
		return KEY;
	}

	@Override
	public String toString() {
		return "EmployeeVO [employeeID=" + employeeID + ", employeeName=" + employeeName + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

	
	
	
	
	
	
}