/**
 * @(#) MailRegistActivity.java Created on 2014-11-2
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
import android.widget.TextView;

import com.zilee.jinlinclient.R;
import com.zilee.jinlinclient.common.ui.MainActivity;

/**
 * The class <code>MailRegistActivity</code>
 *
 * @version 1.0
 */
public class MailRegistActivity extends Activity {
    
    private Button mBtnRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mail_regist_layout);
        initialViews();
    }
    
    /**
     * 初始化界面
     */
    private void initialViews(){
        TextView topbarTitle = (TextView) findViewById(R.id.top_txt_title);
        topbarTitle.setText(getResources().getString(R.string.regist_sms_topbar_title));
        
        mBtnRegist = (Button) findViewById(R.id.btn_regist);
        mBtnRegist.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //TDDO registion
                regist();
            }
        });
    }
    
    private void regist(){
        startActivity(new Intent(this,MainActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
