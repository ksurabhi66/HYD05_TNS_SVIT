
	package com.example.demo.controller;

	import java.util.List;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.demo.entity.College;

	import com.example.demo.service.CollegeService;

	@RestController
	public class CollegeController {
		
		@Autowired
		private CollegeService collegeService;
		
		
		@PostMapping("/college")
		public College saveCollege(@RequestBody College college) {
			
			return collegeService.saveCollege(college);
		}
		
		@GetMapping("/college")
	    public List<College> fetchCollegeList() {
	        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
	        return collegeService.fetchCollegeList();
	    }
	    


	    @GetMapping("/college/{id}")
	    public College fetchCollegeById(@PathVariable("id") Long collegeId)
	            {
	        return collegeService.fetchCollegeById(collegeId);
	    }
	    
	    @DeleteMapping("/college/{id}")
	    public String deleteCollegeById(@PathVariable("id") Long collegeId) {
	        collegeService.deleteCollegeById(collegeId);
	        return "college deleted Successfully!!";
	    }
	    
	    @PutMapping("/college/{id}")
	    public College updateCollege(@PathVariable("id") Long collegeId,
	                                       @RequestBody College college) {
	        return collegeService.updateCollege(collegeId,college);
	    }

	}

