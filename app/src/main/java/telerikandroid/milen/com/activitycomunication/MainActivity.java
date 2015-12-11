package telerikandroid.milen.com.activitycomunication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etInputText;
    private Button btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInputText = (EditText) findViewById(R.id.etInputText);
        btnGo = (Button) findViewById(R.id.btnGo);
        btnGo.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        if (viewId == R.id.btnGo){
            String inputText = String.valueOf(etInputText.getText());
            boolean stringIsNotNullOrEmpty = inputText != null && !inputText.equals("");
            if (stringIsNotNullOrEmpty){
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("inputText", inputText);
                startActivity(intent);
            }else{
                Toast.makeText(MainActivity.this, R.string.enter_text, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
