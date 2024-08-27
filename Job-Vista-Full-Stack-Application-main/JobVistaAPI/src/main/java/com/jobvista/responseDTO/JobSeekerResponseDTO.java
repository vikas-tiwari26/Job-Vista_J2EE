package com.jobvista.responseDTO;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerResponseDTO {

	private String name;
	private String email;
	private String contactNumber;
	private String gender;
	private String portfolioLink;
	private String skills;
	private String gitRepositoryLink;
	private List<AppliedJobResponseDTO> appliedJobs = new ArrayList<>();
	private String profilePhoto;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPortfolioLink() {
		return portfolioLink;
	}
	public void setPortfolioLink(String portfolioLink) {
		this.portfolioLink = portfolioLink;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getGitRepositoryLink() {
		return gitRepositoryLink;
	}
	public void setGitRepositoryLink(String gitRepositoryLink) {
		this.gitRepositoryLink = gitRepositoryLink;
	}
	public List<AppliedJobResponseDTO> getAppliedJobs() {
		return appliedJobs;
	}
	public void setAppliedJobs(List<AppliedJobResponseDTO> appliedJobs) {
		this.appliedJobs = appliedJobs;
	}
	public String getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	

	
}