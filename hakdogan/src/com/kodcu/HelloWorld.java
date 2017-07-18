package com.kodcu;

import com.kodcu.user.User;

import java.util.logging.Logger;

/**
 * Created by hakdogan on 18/07/2017.
 */
public class HelloWorld {

    private static final Logger loger = Logger.getLogger("HelloWorld");
    public static void main(String args[]){

        User user = new User("Huseyin", "Akdogan", "Expert Software Consultant", 41);
        loger.info(user.toString());
    }
}
