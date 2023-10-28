package com.example.demo.service;

import java.util.List;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepo;

@Service
public class CollegeServiceImp implements CollegeService {
	
	@Autowired
	private CollegeRepo collegeRepo;

	@Override
	public College saveCollege(College college) {
		// TODO Auto-generated method stub
		return collegeRepo.save(college);
	}


	
	
	@Override
    public List<College> fetchCollegeList() {
        return collegeRepo.findAll();
    }

   @Override
   public College fetchCollegeById(Long CollegeId) {
	  
	return collegeRepo.findById(CollegeId).get();
   }
	
   @Override
   public void deleteCollegeById(Long collegeId) {
       collegeRepo.deleteById(collegeId);
   }


   @Override
   public College updateCollege(Long collegeId, College college) {
       College colleges = collegeRepo.findById(collegeId).get();

       if(Objects.nonNull(college.getCollegeAdmin()) &&
       !"".equalsIgnoreCase(college.getCollegeAdmin())) {
           colleges.setCollegeAdmin(college.getCollegeAdmin());
       }

       if(Objects.nonNull(college.getCollegeName()) &&
               !"".equalsIgnoreCase(college.getCollegeName())) {
           colleges.setCollegeName(college.getCollegeName());
       }

       if(Objects.nonNull(college.getLocation()) &&
               !"".equalsIgnoreCase(college.getLocation())) {
           colleges.setLocation(college.getLocation());
       }

       return collegeRepo.save(college);
   }





}