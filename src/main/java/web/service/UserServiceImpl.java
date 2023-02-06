package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User showUser(int id) {
        return userDao.showUser(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(int id, User updateUser) {
        User findUserById = userDao.showUser(id);
        findUserById.setName(updateUser.getName());
        findUserById.setLastName(updateUser.getLastName());
        userDao.update(findUserById);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
