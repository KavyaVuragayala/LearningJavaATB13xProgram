package ex_30_ENUM;

public class Lab_123_ENUM_Ex {
    public static void main(String[] args) {
        System.out.println(Locators.page_inputEmail.getLocators());
        System.out.println(Locators.page_inputPassword.getLocators());
        System.out.println(Locators.page_button.getLocators());

        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.google.getUrl());
        System.out.println(APIURLs.katalon.getUrl());

    }
}
