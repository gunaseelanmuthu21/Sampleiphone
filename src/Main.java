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
    //sample...test

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
