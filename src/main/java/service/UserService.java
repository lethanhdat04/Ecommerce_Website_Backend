package service;
import exception.UserException;
import model.User;

public interface UserService {

    public User findUserById(Long userId) throws UserException;

    public User findUserByProfileByJwt(String jwt) throws UserException;
}
