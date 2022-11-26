package net.luferat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UserParts {

	String name, birth, newDate;

	public UserParts(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}

	public String fullName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	// Converte a data de y-m-d para d/m/y.
	public String getBirth(boolean format) {
		return birth.replaceAll("(\\d+)-(\\d+)-(\\d+)", "$3/$2/$1");
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	// Oter o primeiro nome.
	public String getFirstName() {
		String[] parts = this.name.split(" ");
		return parts[0];
	}

	// Obter último nome.
	public String getLastName() {
		String[] parts = this.name.split(" ");
		return parts[parts.length - 1];
	}

	// Obter idade à partir da data de nascimento.
	public Integer getAge() throws ParseException {
		String dataNasc = birth;
		String pattern = "yyyy-MM-dd";
		DateFormat sdf = new SimpleDateFormat(pattern);
		Date dataNascInput = null;
		dataNascInput = sdf.parse(dataNasc);
		Calendar dateOfBirth = new GregorianCalendar();
		dateOfBirth.setTime(dataNascInput);
		Calendar today = Calendar.getInstance();
		int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
		dateOfBirth.add(Calendar.YEAR, age);
		if (today.before(dateOfBirth)) {
			age--;
		}
		return age;
	}

	// Se é menor de idade.
	public boolean isMinor() throws ParseException {
		if (this.getAge() < 18) {
			return true;
		} else {
			return false;
		}
	}

}
