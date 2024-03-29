package com.kidd.projectbase.presenter.loader;


import androidx.annotation.NonNull;

import com.kidd.projectbase.presenter.BasePresenter;

/**
 * Factory to implement to create a presenter
 */
public interface PresenterFactory<T extends BasePresenter> {
    @NonNull
    T create();
}
