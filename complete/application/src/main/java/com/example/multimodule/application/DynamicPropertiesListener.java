package com.example.multimodule.application;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;

public class DynamicPropertiesListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        ConfigurableEnvironment environment = event.getEnvironment();
        // modify the properties here, see the ConfigurableEnvironment javadoc
        System.out.println("================loaded env==========================");
        System.out.println(environment.getProperty("service.message"));
        System.out.println(environment.getPropertySources());
        System.out.println(environment.getSystemProperties());

    }
}
