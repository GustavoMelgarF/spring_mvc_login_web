package gustavo.spring.practica3.login.service;

import gustavo.spring.practica3.login.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}