package drivers;

import org.testng.annotations.Test;

public class TestTinDriver {
    public static void main(String[] args) {
        Driver.getDriver().get("www.google.com");
    }
}
