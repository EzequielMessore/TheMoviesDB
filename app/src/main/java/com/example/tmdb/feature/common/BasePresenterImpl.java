package com.example.tmdb.feature.common;

/**
 * Created by ezequiel.messore on 03/06/2018.
 * ezequielmessore.developer@gmail.com
 */
public abstract class BasePresenterImpl<View> implements BasePresenter<View> {
    private View view;

    public BasePresenterImpl(View view) {
        this.view = view;
    }

    @Override
    public void detach() {
        view = null;
    }
}
