/**
 * @(#) LoginActivity.java Created on 2014-11-2
 *
 * Copyright (c) 2014 Aspire. All Rights Reserved
 */
package com.zilee.jinlinclient.usercenter.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.zilee.jinlinclient.R;

/**
 * The class <code>LoginActivity</code>
 *
 * @version 1.0
 */
public class LoginActivity extends Activity implements OnClickListener{
    
    private Button mBtnLogin;
    private EditText mEtUsername;
    private EditText mEtPasswd;
    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        initialViews();
    }
    
    /**
     * 初始化界面
     */
    private void initialViews(){
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mEtUsername = (EditText) findViewById(R.id.et_login_user);
        mEtPasswd = (EditText) findViewById(R.id.et_login_passwd);
        mBtnLogin.setOnClickListener(this);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
        case R.id.btn_login:
            intent.setClass(this, RegistActivity.class);
            break;
        default:
            break;
        }
        
        login(intent);
    }
    
    private void login(Intent intent){
        startActivity(intent);
    }

}
