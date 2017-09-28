package eu.giovannidefrancesco.simplemvp;

import eu.giovannidefrancesco.mvpboilerplate.BaseTypedPresenter;
import eu.giovannidefrancesco.mvpboilerplate.ITypedView;

/**
 * Created by jibbo on 9/21/17.
 */

public class MainPresenter extends BaseTypedPresenter<String,Throwable> {
    public MainPresenter(ITypedView<String, Throwable> view) {
        super(view);
    }

    @Override
    public void onViewResumed() {
        super.onViewResumed();
        getView().showData("This is some awesome data");
        getView().showError(new RuntimeException("Exceptional Error"));
    }
}
