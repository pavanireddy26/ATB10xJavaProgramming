package ex_21_ENUM;

 enum APIURLS {

katalon("https://katalon.com"),
  google("https://google.com");

  private String url;

   APIURLS(String locator) {
       this.url = url;    }

   String getUrl() {
       return this.url;
   }


           }
enum Locators{
    page_button("#btn"),
 page_input("input1");

 private String locator;

    Locators(String locator){
       this.locator =locator;
    }
   String getLocator(){
       return this.locator;
  }
}