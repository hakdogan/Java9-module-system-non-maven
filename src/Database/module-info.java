module Database {
    requires log4j.core;
    requires log4j.api;
    requires java.sql;
    requires User;
    exports com.kodcu.db;
}