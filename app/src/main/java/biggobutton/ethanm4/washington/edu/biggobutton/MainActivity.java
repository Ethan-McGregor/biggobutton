package biggobutton.ethanm4.washington.edu.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    Button bigButton;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        count = 0;
        bigButton = (Button)findViewById(R.id.bigButton);
        bigButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bigButton.setText("You have pushed me " + (count + 1) + " times!");
                count++;
            }

        });

    }
}
