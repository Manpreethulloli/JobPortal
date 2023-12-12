package com.example.JobPortal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="recruiters")
public class Recruiter {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String company;
	private int postedjobs;
	private String feedbacks;
	private int candidates;

	public Recruiter()
	{
		
	}
	public Recruiter(int id, String firstname,String lastname,String company, int postedjobs, String feedbacks, int candidates)
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
