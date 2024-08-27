package com.jobvista.requestDTO.jobSeekerDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerRequestDTO {

	private PersonalDetailsDTO personal;
	private AddressRequestDTO address;
	private EducationRequestDTO education;
	private List<ExperienceDTO> experiences;
	public PersonalDetailsDTO getPersonal() {
		return personal;
	}
	public void setPersonal(PersonalDetailsDTO personal) {
		this.personal = personal;
	}
	public AddressRequestDTO getAddress() {
		return address;
	}
	public void setAddress(AddressRequestDTO address) {
		this.address = address;
	}
	public EducationRequestDTO getEducation() {
		return education;
	}
	public void setEducation(EducationRequestDTO education) {
		this.education = education;
	}
	public List<ExperienceDTO> getExperiences() {
		return experiences;
	}
	public void setExperiences(List<ExperienceDTO> experiences) {
		this.experiences = experiences;
	}
	
	

}
