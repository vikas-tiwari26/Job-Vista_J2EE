package com.jobvista.responseDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecruiterResponseDTO {
	private String firstName;
	private String username;
	private String email;
	private String companyName;
	private String companyUrl;
	private String companyDescription;
	private String companyAddress;
	private String companyContact;
	private List<JobResponseDTO> jobs;
	private int totalApplicants;
	private int activeJobs;
	private String companyLogoBase64;
	private int totalHired;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyUrl() {
		return companyUrl;
	}
	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}
	public String getCompanyDescription() {
		return companyDescription;
	}
	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyContact() {
		return companyContact;
	}
	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}
	public List<JobResponseDTO> getJobs() {
		return jobs;
	}
	public void setJobs(List<JobResponseDTO> jobs) {
		this.jobs = jobs;
	}
	public int getTotalApplicants() {
		return totalApplicants;
	}
	public void setTotalApplicants(int totalApplicants) {
		this.totalApplicants = totalApplicants;
	}
	public int getActiveJobs() {
		return activeJobs;
	}
	public void setActiveJobs(int activeJobs) {
		this.activeJobs = activeJobs;
	}
	public String getCompanyLogoBase64() {
		return companyLogoBase64;
	}
	public void setCompanyLogoBase64(String companyLogoBase64) {
		this.companyLogoBase64 = companyLogoBase64;
	}
	public int getTotalHired() {
		return totalHired;
	}
	public void setTotalHired(int totalHired) {
		this.totalHired = totalHired;
	}
	
	
}
