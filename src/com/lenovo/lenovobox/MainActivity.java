package com.lenovo.lenovobox;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.widget.TabHost;

/**
 * This demonstrates how you can implement switching between the tabs of a
 * TabHost through fragments, using FragmentTabHost.
 */
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        
        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);  
        tabHost.setup();  
        
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Photo").setContent(R.id.tab1));  
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Music").setContent(R.id.tab2));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Video").setContent(R.id.tab3)); 
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}