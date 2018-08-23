package com.sda.factory.buttons;

import com.sda.factory.interfaces.Button;

public class DrawButton implements Button {
    public void render() {
        System.out.println("PUSH OK");
        onClick();
    }

    public void onClick() {
        System.out.println("THE BUTTON HAS BEEN PUSHED");
    }
}
