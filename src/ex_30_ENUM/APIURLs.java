package ex_30_ENUM;

public enum APIURLs {
    vwo("https://vwo.com"),
    google("https://google.com"),
    katalon("https://katalon.com");

    private String url;
    APIURLs(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
