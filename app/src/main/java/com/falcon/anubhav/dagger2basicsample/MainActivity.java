package com.falcon.anubhav.dagger2basicsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private EditText memberId;
    private Button submitButton;

    @Inject
    MemberDataManager memberDataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        memberId = findViewById(R.id.etMemberId);
        submitButton = findViewById(R.id.btnSubmit);

        App.getApp().getMemberDataComponent().inject(this);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((memberId.getText().toString().equals(""))) {
                    Toast.makeText(getApplicationContext(), "Member ID is empty", Toast.LENGTH_SHORT).show();
                } else {
                    String input = memberId.getText().toString();
                    //String result = new MemberDataManager().checkMemberStatus(input);
                    String result = memberDataManager.checkMemberStatus(input);
                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
