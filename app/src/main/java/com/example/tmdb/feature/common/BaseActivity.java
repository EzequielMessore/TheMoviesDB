package com.example.tmdb.feature.common;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by ezequiel.messore on 03/06/2018.
 * ezequielmessore.developer@gmail.com
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        if (this instanceof BaseView) {
            ((BaseView) this).getPresenter().detach();
        }
        super.onDestroy();
    }

}
