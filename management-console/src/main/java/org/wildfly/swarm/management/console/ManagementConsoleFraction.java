package org.wildfly.swarm.management.console;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.wildfly.swarm.spi.api.Fraction;

/**
 * Created by ggastald on 02/06/16.
 */
public class ManagementConsoleFraction implements Fraction {

    public ManagementConsoleFraction() {
    }

    public ManagementConsoleFraction contextRoot(String context) {
        this.context = context;
        return this;
    }

    public String getContextRoot() {
        return context;
    }

    private final String DEFAULT_CONTEXT = "/console";

    private String context = DEFAULT_CONTEXT;
}
