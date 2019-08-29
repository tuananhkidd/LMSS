package com.kidd.projectbase.view.impl;

import androidx.annotation.NonNull;

import com.kidd.projectbase.R;
import com.kidd.projectbase.injection.AppComponent;
import com.kidd.projectbase.injection.DaggerHomeViewComponent;
import com.kidd.projectbase.injection.HomeViewModule;
import com.kidd.projectbase.presenter.HomePresenter;
import com.kidd.projectbase.presenter.loader.PresenterFactory;
import com.kidd.projectbase.view.HomeView;

import javax.inject.Inject;

public final class HomeFragment extends BaseFragment<HomePresenter, HomeView> implements HomeView {
    @Inject
    PresenterFactory<HomePresenter> mPresenterFactory;

    // Your presenter is available using the mPresenter variable

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    protected void setupComponent(@NonNull AppComponent parentComponent) {
        DaggerHomeViewComponent.builder()
                .appComponent(parentComponent)
                .homeViewModule(new HomeViewModule())
                .build()
                .inject(this);
    }

    @Override
    public boolean backPressed() {
        return false;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_home;
    }

    @Override
    void onRetry() {

    }

    @Override
    void onRefreshData() {

    }

    @NonNull
    @Override
    protected PresenterFactory<HomePresenter> getPresenterFactory() {
        return mPresenterFactory;
    }
}
