
package net.codigoalonso.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author codigoalonso.net
 */
public class TutorialWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }    

    @Override
    protected void customizeRegistration(Dynamic registration) {
        String location = System.getProperty("java.io.tmpdir");    
                
        MultipartConfigElement configElement = 
                new MultipartConfigElement(location,2*1024*1024,8*1024*1024,0);        
        
        registration.setMultipartConfig(configElement);
    }   

}
