package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {// входит только в БД

    public List<User> getAllUsers();

    public User showUser(int id);

    public void save(User user);

    public void update(User updateUser);

    public void delete(int id);

}
