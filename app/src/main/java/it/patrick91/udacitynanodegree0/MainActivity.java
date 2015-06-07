package it.patrick91.udacitynanodegree0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        String text;

        switch (view.getId()) {
            case R.id.app_bacon_reader:
                text = "This is the bacon reader app";
                break;
            case R.id.app_build_it_bigger:
                text = "This is the build it bigger app";
                break;
            case R.id.app_library:
                text = "This is the library app";
                break;
            case R.id.app_scores:
                text = "This is the scores app";
                break;
            case R.id.app_spotify:
                text = "This is the spotify app";
                break;
            default:
                text = "This is my app";
        }

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
