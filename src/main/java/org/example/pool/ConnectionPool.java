package org.example.pool;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionPool {
    private static final String DATABASE = "postgres";
    private static final String HOST = "localhost";
    private static final String PORT = "15432";
    private static final String SCHEMA = "public";
    public static final String USER = "postgres";
    public static final String PASSWORD = "postgres";

    public static final String URL_CONN = "jdbc:postgresql://"+HOST+":"+PORT+"/"+ DATABASE +"?currentSchema="+SCHEMA;

    private ConnectionPool(){
        throw new IllegalStateException();
    }

    private static BasicDataSource basicDataSource;
    public static BasicDataSource getDataSource() {
        if(basicDataSource==null){
            basicDataSource = new BasicDataSource();
            basicDataSource.setUrl(URL_CONN);
            basicDataSource.setUsername(USER);
            basicDataSource.setPassword(PASSWORD);
            basicDataSource.setMinIdle(5);
            basicDataSource.setMaxIdle(10);
        }
        return basicDataSource;
    }
}
