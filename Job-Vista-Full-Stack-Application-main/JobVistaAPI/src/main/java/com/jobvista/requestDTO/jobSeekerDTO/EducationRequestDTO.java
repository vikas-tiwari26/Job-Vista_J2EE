package com.jobvista.requestDTO.jobSeekerDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EducationRequestDTO {
	private SscEducationRequestDTO ssc;
	private HscEducationRequestDTO hsc;
	private GraduationEducationRequestDTO graduation;
	public SscEducationRequestDTO getSsc() {
		return ssc;
	}
	public void setSsc(SscEducationRequestDTO ssc) {
		this.ssc = ssc;
	}
	public HscEducationRequestDTO getHsc() {
		return hsc;
	}
	public void setHsc(HscEducationRequestDTO hsc) {
		this.hsc = hsc;
	}
	public GraduationEducationRequestDTO getGraduation() {
		return graduation;
	}
	public void setGraduation(GraduationEducationRequestDTO graduation) {
		this.graduation = graduation;
	}
	

	
}
