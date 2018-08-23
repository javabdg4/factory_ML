package com.sda.factory;

import com.sda.factory.dialog.DrawDialog;
import com.sda.factory.dialog.HtmlDialog;
import com.sda.factory.dialog.SwingDialog;

public class Main {
    private static Dialog dialog;
    private static String type;

    public static void main(String[] args) {
        type = "console";
        configure();
        dialog.renderWindow();
    }

    public static void configure() {
        if (type.equals("console")) {
            dialog = new DrawDialog();
        } else if (type.equals("graphic")) {
            dialog = new SwingDialog();
        } else if (type.equals("web")) {
            dialog = new HtmlDialog();
        }
    }
}

