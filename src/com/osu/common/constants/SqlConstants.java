package com.osu.common.constants;

public interface SqlConstants {

	String POPULATE_DATABASE = "INSERT INTO course_master (course_code, course_title, course_crn, "+
				"credits, department, course_area, term_offered, weight, course_instructor) " + 
				"VALUES (?,?,?,?,?,?,?,?,?)";
	
	String FETCH_COURSES = "SELECT course_code, course_title, is_grad_course, credits, weight FROM course_master "+
			"WHERE course_area = ?  order by course_code";
/*	String FETCH_COURSES = "SELECT course_code, course_title, credits, weight FROM course_master "+
			"WHERE course_area = ?  order by weight DESC";
*/	
	
	String FETCH_ALL_COURSES = "SELECT course_code, course_title, course_crn, is_grad_course, credits, weight FROM course_master order by course_code";
	
	String FETCH_SLASH_COURSES = "SELECT course_code, course_title, course_crn, is_grad_course, credits, weight FROM course_master WHERE is_grad_course = 0 order by course_code";
	
	String UPDATE_GRAD_STANDING = "UPDATE course_master SET is_grad_course=? WHERE course_crn=?";
}
