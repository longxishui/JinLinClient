/**
 * @(#) LeftFragment.java Created on 2014-11-5
 *
 * Copyright (c) 2014 Aspire. All Rights Reserved
 */
package com.zilee.jinlinclient.ui.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zilee.jinlinclient.R;
import com.zilee.jinlinclient.utils.ImageUtil;

/**
 * The class <code>LeftFragment</code>
 *
 * @version 1.0
 */
public class CenterFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        Log.d("[debug]", "[CenterFragment][onCreateView] started !");
        
        View view = inflater.inflate(R.layout.frame_content, null);
        
        ImageView mImgHead = (ImageView) view.findViewById(R.id.img_head);
        //处理头像圆角化
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test);
        bitmap = ImageUtil.toRoundCorner(bitmap, 125.0F);
        mImgHead.setImageBitmap(bitmap);
        
        return view;
    }
    
    
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    
}
