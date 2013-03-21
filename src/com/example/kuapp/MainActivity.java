package com.example.kuapp;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.drm.DrmStore.Action;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	public static Context appContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ActionBar actionbar = getActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        ActionBar.Tab SkemaTab = actionbar.newTab().setText("Skema");
        ActionBar.Tab KursusTab = actionbar.newTab().setText("Kursus");
        ActionBar.Tab OptionsTab = actionbar.newTab().setText("Options");
        
        Fragment SkemaFrag = new SkemaFragment();
        Fragment KursusFrag = new KursusFragment();
        Fragment OptionsFrag = new OptionsFragment();
        
        SkemaTab.setTabListener(new MyTabsListener(SkemaFrag));
        KursusTab.setTabListener(new MyTabsListener(KursusFrag));
        OptionsTab.setTabListener(new MyTabsListener(OptionsFrag));
        
        actionbar.addTab(SkemaTab);
        actionbar.addTab(KursusTab);
        actionbar.addTab(OptionsTab);
    }


    
}
