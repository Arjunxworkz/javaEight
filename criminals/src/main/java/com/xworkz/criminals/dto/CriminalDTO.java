package com.xworkz.criminals.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//import org.hibernate.annotations.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity



@Table(name="criminals_info")

@NamedQueries({@NamedQuery(name ="findAll", query = "select info from criminals_info" )})
public class CriminalDTO implements Serializable{
	
	@Id
	@GenericGenerator(name = "boss",strategy = "increment")
	@GeneratedValue(generator = "boss")
	private Integer id;
	private String name;
	private Integer age;
	private String country;
	private String criminalType;
	private Integer noOfCases;
	private String alive;
	private String gender;
	private String international;
	private String married;
	private Double jailTerm;
	private String wifeName;
	private String rightHandName;
	private String leftHandName;
	private String prisonName;
	private Double netWorth;
	
	public CriminalDTO() {
		System.out.println("Dto class is running");
	}
	
	
	
	public CriminalDTO(Integer id, String name, Integer age, String country, String criminalType, Integer noOfCases,
			String alive, String gender, String international, String married, Double jailTerm, String wifeName,
			String rightHandName, String leftHandName, String prisonName, Double netWorth) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
		this.criminalType = criminalType;
		this.noOfCases = noOfCases;
		this.alive = alive;
		this.gender = gender;
		this.international = international;
		this.married = married;
		this.jailTerm = jailTerm;
		this.wifeName = wifeName;
		this.rightHandName = rightHandName;
		this.leftHandName = leftHandName;
		this.prisonName = prisonName;
		this.netWorth = netWorth;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCriminalType() {
		return criminalType;
	}
	public void setCriminalType(String criminalType) {
		this.criminalType = criminalType;
	}
	public Integer getNoOfCases() {
		return noOfCases;
	}
	public void setNoOfCases(Integer noOfCases) {
		this.noOfCases = noOfCases;
	}
	public String getAlive() {
		return alive;
	}
	public void setAlive(String alive) {
		this.alive = alive;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInternational() {
		return international;
	}
	public void setInternational(String international) {
		this.international = international;
	}
	public String getMarried() {
		return married;
	}
	public void setMarried(String married) {
		this.married = married;
	}
	public Double getJailTerm() {
		return jailTerm;
	}
	public void setJailTerm(Double jailTerm) {
		this.jailTerm = jailTerm;
	}
	public String getWifeName() {
		return wifeName;
	}
	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}
	public String getRightHandName() {
		return rightHandName;
	}
	public void setRightHandName(String rightHandName) {
		this.rightHandName = rightHandName;
	}
	public String getLeftHandName() {
		return leftHandName;
	}
	public void setLeftHandName(String leftHandName) {
		this.leftHandName = leftHandName;
	}
	public String getPrisonName() {
		return prisonName;
	}
	public void setPrisonName(String prisonName) {
		this.prisonName = prisonName;
	}
	public Double getNetWorth() {
		return netWorth;
	}
	public void setNetWorth(Double netWorth) {
		this.netWorth = netWorth;
	}



	@Override
	public String toString() {
		return "CriminalDTO [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", criminalType="
				+ criminalType + ", noOfCases=" + noOfCases + ", alive=" + alive + ", gender=" + gender
				+ ", international=" + international + ", married=" + married + ", jailTerm=" + jailTerm + ", wifeName="
				+ wifeName + ", rightHandName=" + rightHandName + ", leftHandName=" + leftHandName + ", prisonName="
				+ prisonName + ", netWorth=" + netWorth + "]";
	}
	
	
	
}



