package eu.giovannidefrancesco.basemvp;

import android.util.Log;

/**
 * Created by jibbo on 9/21/17.
 */


@SuppressWarnings("WeakerAccess")
public abstract class BasePresenter implements IPresenter {

    private static final String TAG = "BasePresenter";

    private IView mView;

    private BasePresenter(){}

    public BasePresenter(IView view){
        mView = view;
    }

    public IView getView() {
        return mView;
    }

    @Override
    public void onViewCreated() {
        Log.w(TAG, "onViewCreated() called, but not overriden.");
    }

    @Override
    public void onViewStarted() {
        Log.w(TAG, "onViewStarted() called, but not overriden");
    }

    @Override
    public void onViewResumed() {
        Log.w(TAG, "onViewResumed() called, but not overriden");
    }

    @Override
    public void onViewPaused() {
        Log.w(TAG, "onViewPaused() called, but not overriden");
    }

    @Override
    public void onViewStop() {
        Log.w(TAG, "onViewStop() called, but not overriden");
    }

    @Override
    public void onViewAttached() {
        Log.w(TAG, "onViewAttached() called, but not overriden");
    }

    @Override
    public void onViewDetached() {
        Log.w(TAG, "onViewDetached() called, but not overriden");
    }
}
