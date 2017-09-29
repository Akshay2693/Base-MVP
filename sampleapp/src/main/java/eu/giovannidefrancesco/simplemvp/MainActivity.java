package eu.giovannidefrancesco.simplemvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import eu.giovannidefrancesco.basemvp.IPresenter;
import eu.giovannidefrancesco.basemvp.ITypedView;

public class MainActivity extends AppCompatActivity implements ITypedView<String, Throwable> {

    private static final String TAG = "MainActivity";

    private IPresenter mPresenter;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.thetextview);
        mPresenter = new MainPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.onViewResumed();
    }

    @Override
    public void showData(String data) {
        mTextView.setText(data);
    }

    @Override
    public void showError(Throwable error) {
        Log.e(TAG, "showError: ", error);
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}
