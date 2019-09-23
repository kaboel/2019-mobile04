package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        this.usernameInput = findViewById(R.id.input_username);
        this.nameInput = findViewById(R.id.input_name);
        this.ageInput = findViewById(R.id.input_age);
    }

    public void handleSubmit(View view) {
        String username = this.usernameInput.getText().toString();
        String name = this.nameInput.getText().toString();
        int age = Integer.parseInt(this.ageInput.getText().toString());

        Intent intent = new Intent(this, ProfileBundleActivity.class);
        intent.putExtra(USERNAME_KEY, username);
        intent.putExtra(NAME_KEY, name);
        intent.putExtra(AGE_KEY, age);

        startActivity(intent);
    }
}
