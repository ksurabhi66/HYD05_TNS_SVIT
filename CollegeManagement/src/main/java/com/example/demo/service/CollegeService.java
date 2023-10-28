package com.example.demo.service;



import java.util.List;


import com.example.demo.entity.College;

public interface CollegeService {

	

	public College saveCollege(College college);

	

	List<College> fetchCollegeList();



	College fetchCollegeById(Long CollegeId);



	



	void deleteCollegeById(Long S);



	College updateCollege(Long collegeId, College college);



	

	

	
	
}