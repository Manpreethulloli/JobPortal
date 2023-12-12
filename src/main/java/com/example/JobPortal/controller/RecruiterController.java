package com.example.JobPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.JobPortal.DTO.RecruiterDto;
import com.example.JobPortal.entity.Recruiter;
import com.example.JobPortal.services.RecruiterServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
	
	@Autowired
	private RecruiterServices recruiterservice;
	
	@PostMapping("/getrecruiter")
	public ResponseEntity<RecruiterDto> createRecruiter(@RequestBody @Valid RecruiterDto recruiterDto)
	{
		RecruiterDto createdRec = recruiterservice.createRecruiter(recruiterDto);
		return new ResponseEntity<>(createdRec, HttpStatus.CREATED);
	}

//	@GetMapping(path="/getAll")
//	public ResponseEntity<List<RecruiterDto>>getAllRecruiters() {
//	List<RecruiterDto> l2 = recruiterservice.getAllRecruiters();
//	return new ResponseEntity<>(l2, HttpStatus.OK);
//	}
//		
//	
//	    @DeleteMapping("/delete/{id}")
//	    public String deleteRecruiter(@PathVariable("id") int id)
//	    {
//	        recruiterservice.deleteRecruiter(id);
//	        return "Deleted Successfully";
//	    }
//
//	    @DeleteMapping("/deleteAll")
//	    public void deleteAllRecruiter() {
//	        recruiterservice.deleteAllRecruiter();
//	    }
	
}









