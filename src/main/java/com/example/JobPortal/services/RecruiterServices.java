package com.example.JobPortal.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

import com.example.JobPortal.DTO.RecruiterDto;
import com.example.JobPortal.entity.Recruiter;
import com.example.JobPortal.exception.InvalidRecruiterException;
import com.example.JobPortal.repo.RecruiterRepo;


@Service
public class RecruiterServices {
	
	@Autowired
	private RecruiterRepo repo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public RecruiterDto createRecruiter(RecruiterDto recruiterDto)throws InvalidRecruiterException
	{
		if(repo.findById(recruiterDto.getId()).isPresent())
		{
			System.out.println("hey");
			throw new InvalidRecruiterException("user id already present");
		
		}
		
		System.out.println("hello");
		Recruiter rec1 = dtoToRecruiter(recruiterDto);
		return recruiterToDto(repo.save(rec1));
	}
	
//	public List<RecruiterDto>getAllRecruiters()
//	{
//		List<Recruiter> l1=repo.findAll();
//		return l1.stream().map(this::recruiterToDto).toList();
//	}
//	
//	public RecruiterDto getrecruiterById(int id)
//	{
//		Optional<Recruiter> recOptional =repo.findById(id);
//		return recOptional.map(this::recruiterToDto).orElseThrow(()->new InvalidRecruiterException("Not Found"));
//	}
//	
//	public void deleteRecruiter(int id)throws InvalidRecruiterException
//	{
//		
//		 if (repo.existsById(id))
//		 {
//	         repo.deleteById(id);
//	     }
//		 else 
//		 {
//	        throw new InvalidRecruiterException("Recruiter with ID " + id + " not found");
//	     }
//	}
//	
//	public void deleteAllRecruiter()
//	{
//		repo.deleteAll();
//	}
//	
//  Converting RecruiterDto class to the recruiter class
	public Recruiter dtoToRecruiter(RecruiterDto recruiterDto)
	{
		Recruiter rec =  this.modelMapper.map(recruiterDto, Recruiter.class);
		return rec;
	}
	
	
//  Converting Recruiter class to the recruiterDto class
	public RecruiterDto recruiterToDto(Recruiter recruiter)
	{
		RecruiterDto r1 = this.modelMapper.map(recruiter,RecruiterDto.class);
		return r1;
	}

}


