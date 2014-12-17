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
import android.widget.ImageView;

import com.zilee.jinlinclient.R;

/**
 * The class <code>LoginActivity</code>
 *
 * @version 1.0
 */
public class RegistActivity extends Activity implements OnClickListener{
    
    private ImageView mImgSms;
    private ImageView mImgMail;
    private ImageView mImgWeChat;
    private ImageView mImgWeibo;
    private ImageView mImgQQ;
    private ImageView mImgTourist;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist_layout);
        initialViews();
    }
    
    /**
     * 初始化界面
     */
    private void initialViews(){
        mImgSms = (ImageView) findViewById(R.id.img_sms);
        mImgMail = (ImageView) findViewById(R.id.img_mail);
        mImgWeChat = (ImageView) findViewById(R.id.img_wechat);
        mImgWeibo = (ImageView) findViewById(R.id.img_weibo);
        mImgQQ = (ImageView) findViewById(R.id.img_qq);
        mImgTourist = (ImageView) findViewById(R.id.img_tourist);
        
        mImgSms.setOnClickListener(this);
        mImgMail.setOnClickListener(this);
        mImgWeChat.setOnClickListener(this);
        mImgWeibo.setOnClickListener(this);
        mImgQQ.setOnClickListener(this);
        mImgTourist.setOnClickListener(this);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
        case R.id.img_sms:
            intent.setClass(this, SMSRegistActivity.class);
            break;
        case R.id.img_mail:
            intent.setClass(this, MailRegistActivity.class);
            break;
        default:
            break;
        }
        
        regist(intent);
    }
    
    private void regist(Intent intent){
        startActivity(intent);
    }

}
