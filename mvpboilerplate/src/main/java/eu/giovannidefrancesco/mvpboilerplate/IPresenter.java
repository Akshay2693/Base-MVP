package eu.giovannidefrancesco.mvpboilerplate;

/**
 * Created by jibbo on 9/21/17.
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
