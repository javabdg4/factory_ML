package com.sda.factory.dialog;

import com.sda.factory.interfaces.Button;
import com.sda.factory.Dialog;
import com.sda.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    public Button createButton() {
        return new HtmlButton();
    }
}
