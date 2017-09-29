package eu.giovannidefrancesco.basemvp;

/**
 * This interface defines a Presenter.
 * When testing the view, this interface can be mocked.
 */
public interface IPresenter {
    void onViewCreated();
    void onViewStarted();
    void onViewResumed();
    void onViewPaused();
    void onViewStop();
    void onViewAttached();
    void onViewDetached();
}
