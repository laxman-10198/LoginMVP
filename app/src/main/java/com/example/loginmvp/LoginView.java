package com.example.loginmvp;

public interface LoginView {
    void onSuccess();
    void onFailure();
    void onError(String errorMassage);
}
