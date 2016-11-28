package lly.bookdetailfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    BookDetailFragment bookFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
//        Intent intent = new Intent();
//        intent.setClass(this, BookDetailFragment.class);
//        startActivity(intent);
        getFragmentManager().beginTransaction().add(bookFragment).commit();
    }
}
