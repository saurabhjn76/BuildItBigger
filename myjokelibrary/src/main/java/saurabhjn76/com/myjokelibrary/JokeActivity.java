package saurabhjn76.com.myjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public final static String JOKEINTENT="JOKEINTENT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView textView =(TextView) findViewById(R.id.jokeview);
      //  if(getIntent().getStringArrayExtra(JOKEINTENT)!=null)
        textView.setText(getIntent().getStringExtra(JOKEINTENT));
    }
}
