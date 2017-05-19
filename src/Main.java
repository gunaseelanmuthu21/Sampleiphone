//package <set your test package>;
import com.experitest.client.*;

import java.io.File;

import org.junit.*;
/**
 *
*/
public class Main {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "/Users/mcc1/workspace/project3iphonenew";
    protected Client client = null;
    //sample...1232e13412

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        File reports = new File(System.getProperty("user.dir"), "reports");
        reports.mkdirs();
        client.setReporter("xml", reports.getAbsolutePath(), "Demo5");
    }
    
    @Test
    public void testtestipone(){
        client.setDevice("ios_app:iris’s iPhone");
        client.click("default", "CONTINUE", 0, 1);
        if(client.waitForElement("default", "element 2", 0, 30000)){
            // If statement
        }
        client.click("default", "Managers Assistance Program", 0, 1);
        if(client.waitForElement("default", "element 3", 0, 10000)){
            // If statement
        }
        client.click("default", "backbutton", 0, 1);
        if(client.waitForElement("default", "element 2", 0, 30000)){
            // If statement
        }
        client.click("default", "Employee Assistance Program", 0, 1);
        if(client.waitForElement("default", "element 1", 0, 10000)){
            // If statement
        }
        client.click("default", "backbutton", 0, 1);
        if(client.waitForElement("default", "element 2", 0, 30000)){
            // If statement
        }
        client.click("default", "Critical Incident Support", 0, 1);
        if(client.waitForElement("default", "element 5", 0, 10000)){
            // If statement
        }
        client.click("default", "backbutton", 0, 1);
        if(client.waitForElement("default", "element 2", 0, 30000)){
            // If statement
        }
        client.click("default", "eapdirect", 0, 1);
        if(client.waitForElement("default", "element 6", 0, 10000)){
            // If statement
        }
        client.click("default", "backbutton", 0, 1);
        if(client.waitForElement("default", "element 2", 0, 30000)){
            // If statement
        }
    }

    @After
    public void tearDown(){
        // Generates a report of the test case.
        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
        client.generateReport(false);
        // Releases the client so that other clients can approach the agent in the near future. 
        client.releaseClient();
    }
}
