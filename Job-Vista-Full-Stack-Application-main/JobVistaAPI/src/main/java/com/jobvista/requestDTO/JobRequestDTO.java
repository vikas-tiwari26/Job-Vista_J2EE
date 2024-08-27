package com.jobvista.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(callSuper = false)
public class JobRequestDTO {
	private String recruiterEmail;
	private String jobCategory;
	private String experience;
	private String minimumEducation;
	private String description;
	private String role;
	private String responsibility;
	private String jobCity;
	private Integer workHours;
	private String expectedSalary;
	private String bond;
	private Integer vacancies;
	private String jobType;
	public void setRecruiterEmail(String name) {
		// TODO Auto-generated method stub
		
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getMinimumEducation() {
		return minimumEducation;
	}
	public void setMinimumEducation(String minimumEducation) {
		this.minimumEducation = minimumEducation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String getJobCity() {
		return jobCity;
	}
	public void setJobCity(String jobCity) {
		this.jobCity = jobCity;
	}
	public Integer getWorkHours() {
		return workHours;
	}
	public void setWorkHours(Integer workHours) {
		this.workHours = workHours;
	}
	public String getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	public String getBond() {
		return bond;
	}
	public void setBond(String bond) {
		this.bond = bond;
	}
	public Integer getVacancies() {
		return vacancies;
	}
	public void setVacancies(Integer vacancies) {
		this.vacancies = vacancies;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getRecruiterEmail() {
		return recruiterEmail;
	}
	
	
}
