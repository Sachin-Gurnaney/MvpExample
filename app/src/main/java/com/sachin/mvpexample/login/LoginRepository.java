package com.sachin.mvpexample.login;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
