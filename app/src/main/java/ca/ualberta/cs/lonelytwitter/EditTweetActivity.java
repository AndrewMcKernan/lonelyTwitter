package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet2);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("tweet message");
        TextView txtView = (TextView) findViewById(R.id.textViewAwesome);
        txtView.setText(message);
    }
}
