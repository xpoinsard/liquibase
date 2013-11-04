package liquibase.database.core.config;

import liquibase.sdk.supplier.database.ConnectionConfiguration;

public class MaxDBConfigStandard extends ConnectionConfiguration {
    @Override
    public String getDatabaseShortName() {
        return "maxdb";
    }

    @Override
    public String getConfigurationName() {
        return NAME_STANDARD;
    }

    @Override
    public String getUrl() {
        return "jdbc:sapdb://"+ getHostName() +"/liquibas";
    }
}