package io.spring.springbootstarter.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, String>{

	
	//getTopics()
	//getTopic(String id)
	//deleteTopic(String id)
	//updateTopic(Topic t)
	
	
	public List<Course> findByTopicId(String topicId);
	
}
