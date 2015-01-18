package com.voilaweb.mobile.rootshellexttest.plugins;

import com.stericson.RootShell.extension.IRSPlugin;

/**
 * Created by Chris on 1/17/15.
 */
public class DemoOtherPlugin implements IRSPlugin {
    @Override
    public String[] register() {
        return new String[] { };
    }

    @Override
    public void preprocess(String token) {

    }

    @Override
    public Object process(String token, Object... arg) {
        return null;
    }

    @Override
    public void postprocess(String token) {

    }

    @Override
    public void bringup() {

    }

    @Override
    public void bringdown() {

    }

    @Override
    public boolean isSandboxed() {
        return false;
    }
}
