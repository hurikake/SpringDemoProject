package com.sample.config;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;
import org.seasar.doma.jdbc.tx.TransactionManager;

import javax.sql.DataSource;

@SingletonConfig
public class DomaConfig implements Config {

    private static final DomaConfig CONFIG = new DomaConfig();

    private final Dialect dialect;

    private final LocalTransactionDataSource dataSource;

    private final TransactionManager transactionManager;

    private DomaConfig(){
        dialect = new PostgresDialect();
        dataSource = new LocalTransactionDataSource(
                "jdbc:postgresql://localhost:5432/sampleDatabase","postgres","postgres"
        );
        transactionManager = new LocalTransactionManager(
                dataSource.getLocalTransaction(getJdbcLogger())
        );
    }

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    @Override
    public TransactionManager getTransactionManager() {
        return transactionManager;
    }

    public static DomaConfig singleton(){
        return CONFIG;
    }
}
