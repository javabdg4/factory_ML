package com.sda.factory.buttons;

import com.sda.factory.interfaces.Button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>THIS IS THE BUTTON</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("THE BUTTON HAS BEEN PUSHED");
    }
}
