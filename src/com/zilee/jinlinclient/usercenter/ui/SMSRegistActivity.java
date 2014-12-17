/**
 * @(#) SMSRegistActivity.java Created on 2014-11-2
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
import android.widget.ImageView;
import android.widget.TextView;

import com.zilee.jinlinclient.R;
import com.zilee.jinlinclient.common.ui.MainActivity;

/**
 * The class <code>SMSRegistActivity</code>
 *
 * @version 1.0
 */
public class SMSRegistActivity extends Activity {
    
    private Button mBtnRegist;
    private Button mBtnValidate;
    
    private EditText mEtPhone;
    private EditText mEtValidate;
    private EditText mEtUserName;
    private EditText mEtPasswd;
    private EditText mEtPasswdConfirm;
    
    private ImageView mImgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_regist_layout);
        initialViews();
    }
    
    /**
     * 初始化界面
     */
    private void initialViews(){
        
        TextView topbarTitle = (TextView) findViewById(R.id.top_txt_title);
        topbarTitle.setText(getResources().getString(R.string.regist_sms_topbar_title));
        
        mBtnRegist = (Button) findViewById(R.id.btn_regist);
        mBtnValidate = (Button) findViewById(R.id.btn_validate);
        
        mEtPhone = (EditText) findViewById(R.id.et_phonenum);
        mEtValidate = (EditText) findViewById(R.id.et_validate);
        mEtUserName = (EditText) findViewById(R.id.et_username);
        mEtPasswd = (EditText) findViewById(R.id.et_passwd);
        mEtPasswdConfirm = (EditText) findViewById(R.id.et_passwdconfirm);
        
        mImgBack = (ImageView) findViewById(R.id.top_img_back);
        mImgBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        
        mBtnRegist.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO registion
                startActivity(new Intent(SMSRegistActivity.this, MainActivity.class));
            }
        });
        
        mBtnValidate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO validation
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
