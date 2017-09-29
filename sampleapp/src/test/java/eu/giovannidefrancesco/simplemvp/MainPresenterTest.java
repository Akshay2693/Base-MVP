package eu.giovannidefrancesco.simplemvp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import eu.giovannidefrancesco.basemvp.IPresenter;
import eu.giovannidefrancesco.basemvp.ITypedView;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

/**
 * Tests that the main presenter shows some data and displays an error
 * (i.e. the intended behavior for this example)
 */
public class MainPresenterTest {


    @Mock
    ITypedView<String, Throwable> mView;

    IPresenter mPresenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mPresenter = new MainPresenter(mView);
    }

    @Test
    public void testShowDataOnResume() {
        mPresenter.onViewResumed();
        verify(mView).showData(anyString());
    }

    @Test
    public void testShowErrorOnResume() {
        mPresenter.onViewResumed();
        verify(mView).showError(any(Throwable.class));
    }

}