package com.app.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	
	//private final TopicRepository topicRepository;

//	public TopicService(TopicRepository topicRepository) {
	public TopicService() {
		//this.topicRepository = topicRepository;

//		this.topicRepository.save(new Topic(1, "java", "java desc"));
//		this.topicRepository.save(new Topic(2, "spring", "spring desc"));
//		this.topicRepository.save(new Topic(3, "javascript", "javascript desc"));
		
//		topicRepository.save(new Topic(1, "java", "java desc"));
//		topicRepository.save(new Topic(2, "spring", "spring desc"));
//		topicRepository.save(new Topic(3, "javascript", "javascript desc"));

	}

	public List<Topic> getTopics() {
//		return topics;
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}

	public Topic getTopic(int id) {
//		return topics.stream().filter(tp -> tp.getId() == id).findFirst().get();
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, int id) {
//		topics = topics.stream().filter(tp -> tp.getId() != id).collect(Collectors.toList());
//		topics.add(topic);
		topicRepository.save(topic);
	}

	public void deleteTopic(int id) {
//		topics = topics.stream().filter(tp -> tp.getId() != id).collect(Collectors.toList());
		topicRepository.deleteById(id);
	}

}
