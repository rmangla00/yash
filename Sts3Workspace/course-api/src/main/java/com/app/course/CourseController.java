package com.app.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{topicid}/courses")
	public List<Course> getCourses(@PathVariable int topicid) {
		return courseService.getCourses(topicid);
	}

	@RequestMapping("/topics/{topicid}/courses/{id}")
	public Course getCourse(@PathVariable int id) {
		return courseService.getCourse(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicid}/courses")
	public void addCourse(@PathVariable int topicid, @RequestBody Course course) {
		course.setTopic(new Topic(topicid, "", ""));
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicid}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable int id, @PathVariable int topicid) {
		course.setTopic(new Topic(topicid, "", ""));
		courseService.updateCourse(course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicid}/courses/{id}")
	public void deleteCourse(@PathVariable int id) {
		courseService.deleteCourse(id);
	}

}
