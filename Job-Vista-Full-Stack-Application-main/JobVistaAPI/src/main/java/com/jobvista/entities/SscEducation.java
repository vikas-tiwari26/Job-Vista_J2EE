package com.jobvista.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ssc_edu_dtls")
public class SscEducation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL,optional = true)
	@JoinColumn(name = "js_id")
	@MapsId
    private JobSeeker jobSeeker;

    @Size(max = 100)
    @Column(name = "ssc_school_name", nullable = false, length = 100)
    private String schoolName;

    @Size(max = 255)
    @Column(name = "ssc_board_name", nullable = false)
    private String boardName;

    
    @Column(name = "ssc_passing_year", nullable = false)
    private Integer passingYear;

    
    @Column(name = "ssc_percentage", nullable = false)
    private Double percentage;

    
    @Column(name = "ssc_creation_date", nullable = false)
    private LocalDateTime creationDate = LocalDateTime.now();


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}


	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getBoardName() {
		return boardName;
	}


	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}


	public Integer getPassingYear() {
		return passingYear;
	}


	public void setPassingYear(Integer passingYear) {
		this.passingYear = passingYear;
	}


	public Double getPercentage() {
		return percentage;
	}


	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}


	public LocalDateTime getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}




}