package com.example.JobPortal.repo;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JobPortal.entity.Recruiter;

public interface RecruiterRepo extends JpaRepository<Recruiter, Integer>{
//	Optional<Recruiter> findById(int id);

}
