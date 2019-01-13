package com.example.myapp.main;

/**
 * Responsible for handling actions from the View
 * and updating the UI as required.
 */
public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mvpView;

    MainPresenter(MainContract.MvpView view) {
        mvpView = view;
    }

    // Presenter methods
    @Override
    public void handleSignInButtonClick() {
        mvpView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {
        mvpView.showSignUpScreen();
    }
}
