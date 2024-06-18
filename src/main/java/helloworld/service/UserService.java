package helloworld.service;

import helloworld.model.User;
import helloworld.repository.UserRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @KafkaListener (topics = "my-topic", groupId = "my-group")
    public void listen(String messageContent) {
        User user = new User();
        user.setContent(messageContent);
        userRepository.save(user);
    }

    public User findById(long id) {
        return null;
    }

    User findByName(String name) {
        return null;
    }

    public void saveUser(User user) {

    }

    public void updateUser(User user) {

    }

    public void deleteUserById(long id) {

    }

    public List<User> findAllUsers() {
        return null;
    }

    public void deleteAllUsers() {

    }

    public boolean isUserExist(User user) {
        return false;
    }
}
