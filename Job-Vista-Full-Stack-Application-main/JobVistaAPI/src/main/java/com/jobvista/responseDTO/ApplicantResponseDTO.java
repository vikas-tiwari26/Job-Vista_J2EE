package com.jobvista.responseDTO;

import java.util.List;

import com.jobvista.requestDTO.jobSeekerDTO.ExperienceDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantResponseDTO {
	private int jobId;
	private String name;
	private String email;
	private String contactNumber;
	private String profilePhoto;
	private String gender;
	private String githubRepositoryLink;
	private String skills;
	private String city;
	private String status;
	List<ExperienceDTO> experiences;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
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
	public String getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGithubRepositoryLink() {
		return githubRepositoryLink;
	}
	public void setGithubRepositoryLink(String githubRepositoryLink) {
		this.githubRepositoryLink = githubRepositoryLink;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<ExperienceDTO> getExperiences() {
		return experiences;
	}
	public void setExperiences(List<ExperienceDTO> experiences) {
		this.experiences = experiences;
	}
	
	

}
