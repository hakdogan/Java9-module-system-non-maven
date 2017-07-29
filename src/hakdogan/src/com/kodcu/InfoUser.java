package com.kodcu;

import com.kodcu.db.ConnDB;
import com.kodcu.user.User;

import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hakdogan on 18/07/2017.
 */
public class InfoUser {

    private static Logger logger = LogManager.getLogger(InfoUser.class);
    public static void main(String args[]){

        User user = new User("Huseyin", "Akdogan", "Expert Software Consultant", 41);
        logger.info(user.toString());
        try {
            ConnDB.instance().insertWithStatement(user);
        } catch (SQLException e) {
            logger.error(e.getMessage());
        }

    }
}
