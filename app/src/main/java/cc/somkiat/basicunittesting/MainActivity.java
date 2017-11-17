package cc.somkiat.basicunittesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText name, email;
    String emailValidationResult, nameValidationResult;
    int validationFlag = 0, nameValidationFlag = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.userNameInput);
        email = findViewById(R.id.emailInput);



    }

    public void onSaveClick(View view) {

        List<MyValidator> validators = new ArrayList<>();
        validators.add(new ValidateEmailNull());
        validators.add(new ValidateEmailEmpty());
        validators.add(new ValidateEmailPattern());
        for (MyValidator varidator: validators) {
            if (varidator.isValid(email.getText().toString())){
                emailValidationResult = varidator.GetErrorMessage();
                validationFlag = 1;
                break;
            }
        }
        if (validationFlag == 0){
            emailValidationResult = "Email validation success";
        }
        List<MyValidator> nameValidators = new ArrayList<>();
        nameValidators.add(new ValidateNameNull());
        nameValidators.add(new ValidateNameEmpty());
        nameValidators.add(new ValidateNameAplabet());
        nameValidators.add(new ValidateNameLength());
        for (MyValidator varidator: nameValidators) {
            if (varidator.isValid(name.getText().toString())){
                nameValidationResult = varidator.GetErrorMessage();
                nameValidationFlag = 1;
                break;
            }
        }
        if (nameValidationFlag == 0){
            nameValidationResult = "Name validation success";
        }
        Toast.makeText(MainActivity.this, "Validation Result: " + nameValidationResult + " And "+
                emailValidationResult, Toast.LENGTH_LONG).show();

    }

    public void onRevertClick(View view) {

        name.setText("");
        email.setText("");
    }
}
