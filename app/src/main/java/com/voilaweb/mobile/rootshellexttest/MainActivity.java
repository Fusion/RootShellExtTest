package com.voilaweb.mobile.rootshellexttest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.stericson.RootShell.RootShell;
import com.stericson.RootShell.extension.PM;


public class MainActivity extends ActionBarActivity {

    private TextView mLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLog = (TextView)findViewById(R.id.res_out);

        runTests();
    }

    private void tlog(int id) {
        CharSequence curText = mLog.getText();
        mLog.setText(
                curText
                + getResources().getString(id)
                + "\n");
        ;
    }

    private void runTests() {
        PM.init(this);

        if(!RootShell.isRootAvailable()) {
            tlog(R.string.rs_no_root);
        }
        else if(!RootShell.isAccessGiven()) {
            tlog(R.string.rs_not_root);
        }
        else {
            if(!RootShell.isBusyboxAvailable()) {
                tlog(R.string.rs_no_busybox);
            }
            tlog(R.string.rs_ready);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
