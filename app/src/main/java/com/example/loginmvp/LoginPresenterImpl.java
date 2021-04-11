package com.example.loginmvp;

public class LoginPresenterImpl implements LoginPresenter {
    LoginView loginView;
    LoginModel loginModel;
    public LoginPresenterImpl(LoginView loginView){
        this.loginView=loginView;
        this.loginModel=new LoginModelPlm(this);

    }
    @Override
    public void onHandleLogin(String username, String password) {
        loginModel.validateUser(username,password);
    }

    @Override
    public void onSuccess() {
        loginView.onSuccess();
    }

    @Override
    public void onError(String error) {
        loginView.onError(error);
    }

    @Override
    public void onFailure() {

    }

}
