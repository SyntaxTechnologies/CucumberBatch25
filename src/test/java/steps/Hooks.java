package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    //this hooks class will be used to open and close the browser before and after each scenario
    //this hooks class must be inside steps package because in runner class we have mentioned the glue as steps, so it will only look for the classes inside steps package


     //pre condition
     @Before
     public void start() {
         openBrowserAndLaunchApplication();
     }

     //post condition
     @After
    public void end(){
         closeBrowser();
     }
}
