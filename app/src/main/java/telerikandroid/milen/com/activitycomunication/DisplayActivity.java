package telerikandroid.milen.com.activitycomunication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayActivity extends AppCompatActivity {

    TextView twDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        twDisplayText = (TextView)findViewById(R.id.twDisplayText);

        Bundle mainActivityText = getIntent().getExtras();
        String inputText = mainActivityText.getString("inputText");

        twDisplayText.setText(inputText);
    }
}
