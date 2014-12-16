package com.zilee.jinlinclient.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.widget.ImageView;

import com.zilee.jinlinclient.R;
import com.zilee.jinlinclient.ui.fragment.CenterFragment;
import com.zilee.jinlinclient.ui.fragment.LeftFragment;
import com.zilee.jinlinclient.weiget.SlidingMenu;

public class MainActivity extends FragmentActivity {
    
    private SlidingMenu mSlidingMenu;
    private LeftFragment mLeftFragment;
    private CenterFragment mCenterFragment;
    
    private ImageView mImgHead;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initialViews();
    }
    
    /**
     * 初始化界面
     */
    private void initialViews(){
        
        mSlidingMenu = (SlidingMenu) findViewById(R.id.slidingMenu);
        mSlidingMenu.setLeftView(getLayoutInflater().inflate(
                R.layout.left_frame, null));
        mSlidingMenu.setCenterView(getLayoutInflater().inflate(
                R.layout.center_frame, null));
        
        FragmentTransaction t = this.getSupportFragmentManager()
                .beginTransaction();
        mLeftFragment = new LeftFragment();
        t.replace(R.id.left_frame, mLeftFragment);

        mCenterFragment = new CenterFragment();
        t.replace(R.id.center_frame, mCenterFragment);
        t.commit();
        
        mSlidingMenu.setCanSliding(true,false);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void showLeft() {
        mSlidingMenu.showLeftView();
    }

    public void showRight() {
        mSlidingMenu.showRightView();
    }
}
