/**
 * @(#) LeftFragment.java Created on 2014-11-5
 *
 * Copyright (c) 2014 Aspire. All Rights Reserved
 */
package com.zilee.jinlinclient.common.widget;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.zilee.jinlinclient.JinLinApplication;
import com.zilee.jinlinclient.R;

/**
 * The class <code>LeftFragment</code>
 * 
 * @version 1.0
 */
public class LeftFragment extends Fragment implements OnClickListener {

    private RelativeLayout mRelativePoints;
    private RelativeLayout mRelativeNews;
    private RelativeLayout mRelativeLives;
    private RelativeLayout mRelativeCommnication;
    private RelativeLayout mRelativeForum;
    private RelativeLayout mRelativeSetting;
    private RelativeLayout mRelativeWork;
    
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        debug("[onCreateView] started!");
        View view = inflater.inflate(R.layout.common_main_left_menu_layout, null);

        initialViews(view);

        return view;
    }

    private void initialViews(View view) {
        mRelativeCommnication = (RelativeLayout) view.findViewById(R.id.relative_leftmenu_commnication);
        mRelativeForum = (RelativeLayout) view.findViewById(R.id.relative_leftmenu_forum);
        mRelativeLives = (RelativeLayout) view.findViewById(R.id.relative_leftmenu_lives);
        mRelativeNews = (RelativeLayout) view.findViewById(R.id.relative_leftmenu_news);
        mRelativePoints = (RelativeLayout) view.findViewById(R.id.relative_leftmenu_points);
        mRelativeSetting = (RelativeLayout) view.findViewById(R.id.relative_leftmenu_setting);
        mRelativeWork = (RelativeLayout) view.findViewById(R.id.relative_leftmenu_work);

        initialListeners(new RelativeLayout[] { mRelativeCommnication, mRelativeForum, mRelativeLives, mRelativeNews,
                mRelativePoints, mRelativeSetting, mRelativeWork });

    }

    private void initialListeners(RelativeLayout[] layouts) {
        for (int i = 0; i < layouts.length; i++) {
            layouts[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        
        switch (v.getId()) {
        case R.id.relative_leftmenu_commnication:
            showCommnicationView(v);
            break;
        case R.id.relative_leftmenu_forum:
            showForumView(v);
            break;
        case R.id.relative_leftmenu_lives:
            showLivesView(v);
            break;
        case R.id.relative_leftmenu_news:
            showNewsView(v);
            break;
        case R.id.relative_leftmenu_points:
            showPointsView(v);
            break;
        case R.id.relative_leftmenu_setting:
            showSettingView(v);
            break;
        case R.id.relative_leftmenu_work:
            showWorkView(v);
            break;
        default:
            break;
        }
    }

    private void showNewsView(View v) {
        v.setBackgroundColor(getResources().getColor(R.color.left_menu_item_color));

    }

    private void showLivesView(View v) {
        v.setBackgroundColor(getResources().getColor(R.color.left_menu_item_color));

    }

    private void showForumView(View v) {
        v.setBackgroundColor(getResources().getColor(R.color.left_menu_item_color));

    }

    private void showCommnicationView(View v) {
        v.setBackgroundColor(getResources().getColor(R.color.left_menu_item_color));

    }

    private void showWorkView(View v) {
        v.setBackgroundColor(getResources().getColor(R.color.left_menu_item_color));

    }

    private void showSettingView(View v) {
        v.setBackgroundColor(getResources().getColor(R.color.left_menu_item_color));

    }

    private void showPointsView(View v) {
        v.setBackgroundColor(getResources().getColor(R.color.left_menu_item_color));
        
        FragmentTransaction t = getFragmentManager().beginTransaction();
        t.replace(R.id.center_frame, new PointsFragment());
        t.commit();
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void debug(String msg) {
        Log.d("[debug]", "[LeftFragment]" + msg);
    }

}
