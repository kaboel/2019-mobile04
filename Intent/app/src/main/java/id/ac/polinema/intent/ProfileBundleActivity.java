package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private String username;
    private String name;
    private int age;

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.usernameText.setText(this.username);
            this.nameText.setText(this.name);
            this.ageText.setText(this.age);
        }
    }
}
