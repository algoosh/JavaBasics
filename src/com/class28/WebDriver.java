package com.class28;
/*Create a WebDriver Interface that will have the following unimplemented behavior: 
 * openBrowser(), closeBrowser(), maximizeWindow(), findElement().
 *  Create 2 classes that implements WebDriver interface: 
 * ChromeDriver and 
.*/
public interface WebDriver {
    
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElements();
    
    }

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Chrome Driver opens browser");
        
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome Driver closes browser");
        
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome Driver maximizes window");
        
    }

    @Override
    public void findElements() {
        System.out.println("Chrome Driver finds elements");
        
    }
}
    
    class FirefoxDriver implements WebDriver {

        @Override
        public void openBrowser() {
            System.out.println("Firefox Driver opens browser");
            
        }

        @Override
        public void closeBrowser() {
            System.out.println("Firefox Driver closes browser");
            
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Firefox Driver maximizes window");
            
        }

        @Override
        public void findElements() {
            System.out.println("Firefox Driver finds elements");
            
        }
    }