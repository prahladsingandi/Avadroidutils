package always.keeplearning.avadroidutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import always.keeplearning.androidutils.AvaAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AvaAlertDialog.showOKAlertDialog(this, "Testing...", false, v -> {
            AvaAlertDialog.dismissDialog();
        });
    }
}