package service;

import config.JwtProvider;
import exception.UserException;
import model.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService{

    private UserRepository userRepository;
    private JwtProvider jwtProvider;

    public UserServiceImplementation(UserRepository userRepository, JwtProvider jwtProvider){
        this.userRepository = userRepository;
        this.jwtProvider = jwtProvider;
    }
    @Override
    public User findUserById(Long userId) throws UserException {

        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()){
            return user.get();
        }

        throw new UserException("user not found with id: " + userId);
    }

    @Override
    public User findUserByProfileByJwt(String jwt) throws UserException {
        String email = jwtProvider.getEmailFromToken(jwt);

        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new UserException("user not found with email: " + email);
        }
        return user;
    }
}
