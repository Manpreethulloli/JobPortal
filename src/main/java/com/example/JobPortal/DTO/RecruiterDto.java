package com.example.JobPortal.DTO;

import jakarta.validation.constraints.NotBlank;

public class RecruiterDto {
	
	private int id;
	
	@NotBlank(message = "First name is required")
	private String firstname;
	
	@NotBlank(message = "Last name is required")
	private String lastname;
	
	@NotBlank(message = "Company name is required")
	private String company;
	
	@NotBlank(message = "postedjobs is required")
	private int postedjobs;
	
	@NotBlank(message = "feedbacks are required")
	private String feedbacks;
	
	@NotBlank(message = "candidates are required")
	private int candidates;

	public RecruiterDto()
	{
		
	}
	public RecruiterDto(int id, String firstname,String lastname,String company, int postedjobs, String feedbacks, int candidates)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.company=company;
		this.postedjobs=postedjobs;
		this.feedbacks=feedbacks;
		this.candidates=candidates;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public void setCompany(String company)
	{
		this.company=company;
	}


	public int getPostedjobs() {
		return postedjobs;
	}


	public void setPostedjobs(int postedjobs) {
		this.postedjobs = postedjobs;
	}


	public String getFeedbacks() {
		return feedbacks;
	}


	public void setFeedbacks(String feedbacks) {
		this.feedbacks = feedbacks;
	}


	public int getCandidates() {
		return candidates;
	}


	public void setCandidates(int candidates) {
		this.candidates = candidates;
	}

}
