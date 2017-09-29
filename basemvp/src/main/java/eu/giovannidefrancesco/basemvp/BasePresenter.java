package eu.giovannidefrancesco.basemvp;

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

    private BasePresenter() {
    }

    public BasePresenter(IView view) {
        mView = view;
    }

    public IView getView() {
        return mView;
    }

    @Override
    public void onViewCreated() {
        throw new RuntimeException("onViewCreated() called on BasePresenter");
    }

    @Override
    public void onViewStarted() {
        throw new RuntimeException("onViewStarted() called on BasePresenter");
    }

    @Override
    public void onViewResumed() {
        throw new RuntimeException("onViewResumed() called on BasePresenter");
    }

    @Override
    public void onViewPaused() {
        throw new RuntimeException("onViewPaused() called on BasePresenter");
    }

    @Override
    public void onViewStop() {
        throw new RuntimeException("onViewStop() called on BasePresenter");
    }

    @Override
    public void onViewAttached() {
        throw new RuntimeException("onViewAttached() called on BasePresenter");
    }

    @Override
    public void onViewDetached() {
        throw new RuntimeException("onViewDetached() called on BasePresenter");
    }
}
