package dao;
public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}