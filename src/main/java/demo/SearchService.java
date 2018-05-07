package demo;

import java.util.List;
import java.util.stream.Collectors;

public class SearchService {

    private UserRepository userRepository;

    public SearchService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    List<String> getUsersNameByLastName(String lastName) {
        List<User> users = userRepository.findAllByLastName(lastName);

        return users
            .stream()
            .map(u -> u.getName().toUpperCase())
            .collect(Collectors.toList());
    }
}
