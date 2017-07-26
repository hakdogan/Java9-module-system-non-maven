module Database {
    requires h2;
    requires java.sql;
    requires java.logging;
    requires User;
    exports com.kodcu.db;
}