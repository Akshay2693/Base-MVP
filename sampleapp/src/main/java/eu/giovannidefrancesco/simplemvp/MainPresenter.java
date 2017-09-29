package eu.giovannidefrancesco.simplemvp;

import eu.giovannidefrancesco.basemvp.BaseTypedPresenter;
import eu.giovannidefrancesco.basemvp.ITypedView;

/**
 * Created by jibbo on 9/21/17.
 */

class MainPresenter extends BaseTypedPresenter<String, Throwable> {
    MainPresenter(ITypedView<String, Throwable> view) {
        super(view);
    }

    @Override
    public void onViewResumed() {
        getView().showData("This is some awesome data");
        getView().showError(new RuntimeException("Exceptional Error"));
    }
}
