package pl.sda.tweeter.service;

import pl.sda.tweeter.exception.IncorrectLoginOrPassword;
import pl.sda.tweeter.persistance.dao.UserDao;
import pl.sda.tweeter.persistance.entities.TbUser;

public class UserService {
    private UserDao userDao = new UserDao();

    public TbUser getTbUser(String login, String password) throws IncorrectLoginOrPassword {
        TbUser userByLogin = userDao.getUserByLogin(login);
        if (userByLogin == null || !userByLogin.getPassword().equals(password)) {
            throw new IncorrectLoginOrPassword("incorrect login or password");
        }
        return userByLogin;
    }
}
