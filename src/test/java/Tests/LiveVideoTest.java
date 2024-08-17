package Tests;

import Pages.LiveVidoPage;
import org.testng.annotations.Test;

public class LiveVideoTest extends TestBase {
    LiveVidoPage livevideo;


    @Test
    public void OpenLive() {
        livevideo = new LiveVidoPage(driver);
        livevideo.commentProcess();



    }
}