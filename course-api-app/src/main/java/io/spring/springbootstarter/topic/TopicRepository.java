package io.spring.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

	
	//getTopics()
	//getTopic(String id)
	//deleteTopic(String id)
	//updateTopic(Topic t)
	
}
