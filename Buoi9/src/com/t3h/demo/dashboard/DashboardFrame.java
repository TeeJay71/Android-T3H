package com.t3h.demo.dashboard;

import com.t3h.demo.BaseFrame;
import com.t3h.demo.BasePanel;
import com.t3h.demo.login.LoginPanel;

public class DashboardFrame extends BaseFrame {
    private DashboardPanel panel;
    @Override
    protected BasePanel getPanel() {
        panel = new DashboardPanel();
        return panel;
    }

    @Override
    protected String getFrameTitle() {
        return "Hello motherf**ker";
    }

    public void setText(String userName,String password){
        panel.setText(userName,password);
    }
}
