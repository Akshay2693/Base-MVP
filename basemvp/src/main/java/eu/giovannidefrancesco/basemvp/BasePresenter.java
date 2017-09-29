package eu.giovannidefrancesco.basemvp;

import android.util.Log;

/**
 * The goal of this class is to reduce boilerplate by offering a default implementation
 * for lifecycle events. In this way, the developer do not have to code those methods all the times,
 * if not needed. It also produces a warning message in the logcat whenever a method is
 * called, but not overridden by the real implementation of this class.
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
