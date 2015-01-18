package com.voilaweb.mobile.rootshellexttest.plugins;

import com.stericson.RootShell.extension.AbsRSPlugin;

/**
 * Created by Chris on 1/17/15.
 */
public class DemoFindBusyBoxPlugin extends AbsRSPlugin {
    @Override
    public String[] register() {
        return new String[] { "rs:isbusyboxavailable" };
    }

    @Override
    public Object process(String token, Object... arg) {
        return true;
    }
}
