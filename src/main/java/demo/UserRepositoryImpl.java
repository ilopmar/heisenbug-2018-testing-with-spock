package demo;

import java.util.List;
import java.util.stream.Collectors;

public class UserRepositoryImpl implements UserRepository {

    private static final List<User> dataStore = DataHelper.makeUserList();

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAllByLastName(String lastName) {
        return dataStore
            .stream()
            .filter(user -> user.getLastName().equals(lastName))
            .collect(Collectors.toList());
    }
}
