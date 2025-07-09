package ex_30_ENUM;

public enum Locators {
    page_inputEmail("#login-username"),
    page_inputPassword("#login-password"),
    page_button("#btn");

    private String locators;

    // Constructor for the enum
    Locators(String locators) {
        this.locators = locators;
    }
    public String getLocators() {
        return locators;
    }

    public void setLocators(String locators) {
        this.locators = locators;
    }


}
