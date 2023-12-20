import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws LifecycleException, MalformedURLException {
        String webappDirLocation = "src/main/webapp/";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context context = tomcat.addWebapp("", new File(webappDirLocation).getAbsolutePath());
        File configFile = new File(webappDirLocation + "WEB-INF/web.xml");
        context.setConfigFile(configFile.toURI().toURL());

        tomcat.start();
        tomcat.getServer().await();
    }
}