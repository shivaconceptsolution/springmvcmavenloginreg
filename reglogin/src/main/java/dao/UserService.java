package dao;
public interface UserService {

  void register(User user);

  User validateUser(Login login);
}