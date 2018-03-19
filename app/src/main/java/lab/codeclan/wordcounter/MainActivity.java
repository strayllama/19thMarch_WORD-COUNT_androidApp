package lab.codeclan.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText wordsEntryBox;
    private Button countButton;
    private TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Created");
        wordsEntryBox = findViewById(R.id.text_entry_box);
        countButton = findViewById(R.id.count_button);
        countTextView = findViewById(R.id.count_output_textview);
    }

    public void setCountButtonClicked(View clickedView) {
        Log.d("MainActivity", "Count button CLICKED!!");
        String textEntered = wordsEntryBox.getText().toString();
        Log.d("MainActivity", textEntered);

        Counter counter = new Counter();
        String result = counter.countWords(textEntered);

        countTextView.setText(result);
    }



}
