//package <set your test package>;
import com.experitest.client.*;
import org.junit.*;
/**
 *
*/
public class Main {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "/Users/mcc1/workspace/project3iphonenew";
    protected Client client = null;

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "reports", "Untitled");
    }

    @Test
    public void testUntitled(){
        client.setDevice("ios_app:iPhone");
        client.click("default", "CONTINUE", 0, 1);
    }

    @After
    public void tearDown(){
        // Generates a report of the test case.
        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
        client.generateReport(true);
        // Releases the client so that other clients can approach the agent in the near future. 
        client.releaseClient();
    }
}
