package com.example.loginmvp;

import android.text.TextUtils;

public class LoginModelPlm implements LoginModel {
    LoginPresenter loginPresenter;
    public LoginModelPlm(LoginPresenter loginPresenter){
        this.loginPresenter=loginPresenter;

    }
    @Override
    public void validateUser(String username, String password) {
        if (TextUtils.isEmpty(username)){
            loginPresenter.onError("Please Enter Username");
        }
       else if (TextUtils.isEmpty(password)){
            loginPresenter.onError("enter password");
        }else {
           loginPresenter.onSuccess();
        }

    }
}
