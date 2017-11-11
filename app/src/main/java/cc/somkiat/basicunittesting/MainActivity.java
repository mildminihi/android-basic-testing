package cc.somkiat.basicunittesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = (EditText)findViewById(R.id.userNameInput);
    }

    public void onSaveClick(View view) {
        //TODO
        NameValidation nameValidation =new NameValidation();
        Toast.makeText(MainActivity.this, nameValidation.validationNameResult(name.getText().toString()), Toast.LENGTH_LONG).show();

    }

    public void onRevertClick(View view) {
        //TODO
    }
}
