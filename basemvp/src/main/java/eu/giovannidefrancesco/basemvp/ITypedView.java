package eu.giovannidefrancesco.basemvp;

/**
 * This class specializes an IView.
 * Usually, A view needs to display something. This class defines this behavior and establishes a
 * contract between what needs to be displayed and what needs to be produced (i.e. a presenter
 * know which types of data must produce for this view).
 * @see IView
 */
public interface ITypedView<T,E> extends IView {
    void showData(T data);
    void showError(E error);
}
