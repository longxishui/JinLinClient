/**
 * @(#) PointsFragment.java Created on 2014-11-11
 *
 * Copyright (c) 2014 Aspire. All Rights Reserved
 */
package com.zilee.jinlinclient.common.widget;

import com.zilee.jinlinclient.R;
import com.zilee.jinlinclient.common.utils.ImageUtil;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * The class <code>PointsFragment</code>
 *
 * @version 1.0
 */
public class PointsFragment extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("[debug]", "[PointsFragment][onCreate] started !");
        View view = inflater.inflate(R.layout.integralsys_content, null);
       
        initialView(view);
        
        return view;
    }
    
    private void initialView(View v){
        
        ImageView mImgHead = (ImageView) v.findViewById(R.id.img_head);
        //处理头像圆角化
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test);
        bitmap = ImageUtil.toRoundCorner(bitmap, 125.0F);
        mImgHead.setImageBitmap(bitmap);
        
        //TODO 从服务器端获取数据
        String serverResult = "70";
        
        String title = getResources().getString(R.string.points_balance_title);
        title = title.replace("{?}", "<font size='200' color='red'>"+serverResult+"</font>");
        
        TextView _balance = (TextView) v.findViewById(R.id.txt_balance);
        Log.d("[debug]", "替换后的字符："+title);
        _balance.setText(Html.fromHtml(title));
        
        
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    
}
