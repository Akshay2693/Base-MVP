package eu.giovannidefrancesco.mvpboilerplate;

/**
 * Created by jibbo on 9/21/17.
 */

public abstract class BaseTypedPresenter<T, E> extends BasePresenter {

    private ITypedView<T, E> mView;

    public BaseTypedPresenter(ITypedView<T, E> view) {
        super(view);
        mView = view;
    }

    @Override
    public ITypedView<T, E> getView() {
        return mView;
    }
}
