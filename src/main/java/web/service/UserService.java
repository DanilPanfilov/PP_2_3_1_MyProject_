package web.service;

import web.model.User;

import java.util.List;

public interface UserService {//передается в контроллер
    public List<User> getAllUsers();

    public User showUser(int id);

    public void save(User user);

    public void update(User updateUser);

    public void delete(int id);
}
