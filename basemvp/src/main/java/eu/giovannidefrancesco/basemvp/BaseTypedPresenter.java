package eu.giovannidefrancesco.basemvp;

/**
 * This interface defines a BasePresenter, which knows the types of data it needs to produce for
 * an ITypedView.
 * Normally, for every view exists one presenter attached.
 * @see BasePresenter
 * @see ITypedView
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
