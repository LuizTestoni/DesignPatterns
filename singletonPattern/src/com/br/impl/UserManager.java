package com.br.impl;

public class UserManager {

    private static UserManager userManager;

    // There is a static method (class method) to get a instance of the class
    // This method assures that the instance is always the private static instance
    public static UserManager getUserManager(){
        if (userManager == null) {
            userManager = new UserManager();
        }
        return userManager;
    }

    // In the singleton pattern the constructor must be private
    private UserManager(){

    }


    // Of course the class will have others implementations...
    public void deleteAllUsers(){
        //
    }

    public void deleteUserById(Long id){
        //
    }

    public String listUsers(){
        return "User 1, User 2, User 3";
    }
}
