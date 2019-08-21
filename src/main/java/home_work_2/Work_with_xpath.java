package home_work_2;

public class Work_with_xpath {
    public static void main(String[] args) {
        String nameXpath = ".//input [@name='title']";
        String loginXpath = ".//input [@name='login']";
        String passwordXpath = ".//input [@name='password']";
        String registrationXpath = ".//div[@class='signup-submit']//button[@type='submit']";
        String faceBookRegistrationXpath = ".//*[@id='social_href_facebook']";
        String googleRegistrationXpath = ".//*[@id='social_href_google']";
    }
}
