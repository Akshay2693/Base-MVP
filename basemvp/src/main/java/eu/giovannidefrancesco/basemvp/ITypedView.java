package eu.giovannidefrancesco.basemvp;

/**
 * Created by jibbo on 9/21/17.
 */

public interface ITypedView<T,E> extends IView {
    void showData(T data);
    void showError(E error);
}
