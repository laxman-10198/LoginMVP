package com.example.loginmvp;

public interface LoginPresenter {
    void onHandleLogin(String username,String password);
    void onSuccess();
    void onError(String error);
    void onFailure();
}
