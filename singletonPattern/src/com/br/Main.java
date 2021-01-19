package com.br;

import com.br.impl.UserManager;

import javax.swing.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserManager sm = UserManager.getUserManager();
        System.out.println(sm.listUsers());

        // Is the same instance of sm
        UserManager sm2 = UserManager.getUserManager();
        sm.deleteAllUsers();
    }
}
