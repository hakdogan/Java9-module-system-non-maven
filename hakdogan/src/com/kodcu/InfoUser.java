package com.kodcu;

import com.kodcu.db.ConnDB;
import com.kodcu.user.User;

import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Created by hakdogan on 18/07/2017.
 */
public class InfoUser {

    private static final Logger logger = Logger.getLogger("InfoUser");
    public static void main(String args[]){

        User user = new User("Huseyin", "Akdogan", "Expert Software Consultant", 41);
        logger.info(user.toString());
        try {
            ConnDB.instance().insertWithStatement(user);
        } catch (SQLException e) {
            logger.info(e.getMessage());
        }

    }
}
