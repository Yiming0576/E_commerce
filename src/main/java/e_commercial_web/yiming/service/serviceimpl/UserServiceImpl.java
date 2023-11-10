package e_commercial_web.yiming.service.serviceimpl;

import e_commercial_web.yiming.entity.User;
import e_commercial_web.yiming.repository.UserRepository;
import e_commercial_web.yiming.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author yiming
 */
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /**
     * @param username
     * @return  Optional<User>
     */
    @Override
    public Optional<User> findByUsername(String username) {

        if (username == null) {

        }

        return Optional.empty();
    }

    /**
     * @param email
     * @return  Optional<User>
     */
    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    /**
     * @param username
     * @return  Boolean
     */
    @Override
    public Boolean existsByUsername(String username) {
        return null;
    }

    /**
     * @param email
     * @return  Boolean
     */
    @Override
    public Boolean existsByEmail(String email) {
        return null;
    }
}
