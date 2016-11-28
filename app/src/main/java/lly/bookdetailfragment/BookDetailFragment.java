package lly.bookdetailfragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by addy on 2016/11/28.
 */

public class BookDetailFragment extends Fragment {
    private String ITEM_ID = "item_id";
    BookContent.Book book;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Intent intent = this.getIntent();
        if(getArguments().containsKey(ITEM_ID)){
           book =  BookContent.ITEM_MAP.get(getArguments().getInt(ITEM_ID));

        };
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.book_layout, container, false);
        if(book != null){
            ((TextView) rootView.findViewById(R.id.book_title)).setText(book.title);
            ((TextView) rootView.findViewById(R.id.book_desc)).setText(book.desc);


        }

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
