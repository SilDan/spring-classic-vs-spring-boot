package org.sildan.config;

import org.jspecify.annotations.NullMarked;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null; // No additional servlet configuration classes
    }

    @NullMarked
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // Map the DispatcherServlet to the root URL
    }
}
