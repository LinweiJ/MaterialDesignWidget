package com.wega.materialdesignwidget;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TextInputLayoutActivity extends AppCompatActivity {

    private TextInputLayout mTilPhone;
    private TextInputLayout mTilPassword;
    private EditText mEtPhone;
    private TextInputEditText mEtPassword;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        getSupportActionBar().setTitle("TextInputLayout");

        mTilPhone = findViewById(R.id.til_phone);
        mTilPassword = findViewById(R.id.til_password);
        mEtPhone = findViewById(R.id.et_phone);
        mEtPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 11) {
                    mEtPhone.setError("不能超过11位");
                } else {
                    mEtPhone.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        mEtPassword = findViewById(R.id.et_password);
        mEtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 16) {
                    mTilPassword.setError("不能超过16位");
                } else {
                    mTilPassword.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        mEtPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == EditorInfo.IME_ACTION_DONE) {
                    hideKeyboard();
                    startLogin();
                    return true;
                }
                return false;
            }
        });
        mBtnLogin = findViewById(R.id.login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLogin();
            }
        });
    }


    private void hideKeyboard() {
        ResultReceiver resultReceiver = new ResultReceiver(new Handler()) {
            @Override
            protected void onReceiveResult(int resultCode, Bundle resultData) {
                Log.e("ResultReceiver", "" + resultCode);
            }
        };
        View view = getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), 0, resultReceiver);
        }
    }

    private void startLogin() {
        String phone = mTilPhone.getEditText().getText().toString();
        String password = mTilPassword.getEditText().getText().toString();
        String message = phone + password;
        Snackbar.make(mTilPassword, message, Toast.LENGTH_LONG).show();
    }


}

