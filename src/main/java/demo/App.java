/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        
        // This is to remove unnecessary warnings from your console
        System.setProperty("java.util.logging.config.file", "logging.properties");
        
        TestCases tests = new TestCases(); // Initialize your test class
        Create_Post_on_Linkedin linkedinPost = new Create_Post_on_Linkedin();
        //TODO: call your test case functions one after other here

        tests.testCase01();
        linkedinPost.testCase01();
        //END Tests


        tests.endTest(); // End your test by clearning connections and closing browser
        linkedinPost.endTest();
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
