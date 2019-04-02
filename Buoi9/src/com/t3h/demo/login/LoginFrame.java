package com.t3h.demo.login;

import com.t3h.demo.BaseFrame;
import com.t3h.demo.BasePanel;

public class LoginFrame extends BaseFrame {
    @Override
    protected BasePanel getPanel() {
        return new LoginPanel();
    }

    @Override
    protected String getFrameTitle() {
        return "Login";
    }
}
