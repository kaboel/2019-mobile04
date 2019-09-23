package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText text;
    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        this.text = findViewById(R.id.input_name);
        this.view = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        this.view.setText(this.text.getText().toString());
    }
}
