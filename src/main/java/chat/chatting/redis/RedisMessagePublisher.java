//package chat.chatting;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.listener.ChannelTopic;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//public class RedisMessagePublisher {
//
//    private final RedisTemplate<String, Object> redisTemplate;
//    private final ChannelTopic topic;
//
//    public RedisMessagePublisher(RedisTemplate<String, Object> redisTemplate, ChannelTopic topic) {
//        this.redisTemplate = redisTemplate;
//        this.topic = topic;
//    }
//
//    public void publish(String message) {
//        redisTemplate.convertAndSend(topic.getTopic(), message);
//    }
//}
