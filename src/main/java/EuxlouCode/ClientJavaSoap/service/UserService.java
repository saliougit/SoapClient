package EuxlouCode.ClientJavaSoap.service;

import EuxlouCode.ClientJavaSoap.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public UserService() {
        // Exemples de données fictives pour simuler des utilisateurs
        createUser(new User(idCounter.getAndIncrement(), "USER", "Doe", "Mourtada", "john.doe@example.com", null, null, null, null));
        createUser(new User(idCounter.getAndIncrement(), "ADMIN", "Smith", "Cheikh", "jane.smith@example.com", null, null, null, null));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User createUser(User user) {
        long userId = idCounter.getAndIncrement();
        user.setId(userId);
        users.add(user);
        return user;
    }

    public User updateUser(Long id, User user) {
        for (int i = 0; i < users.size(); i++) {
            User existingUser = users.get(i);
            if (existingUser.getId().equals(id)) {
                user.setId(id);
                users.set(i, user);
                return user;
            }
        }
        return null;
    }

    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
