import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static <WebElement> void main(String[] args) {
        //Establecemos la propiedad web.driver.chrome.drive
        //Con la ubicacion del chromedriver que descargamos
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nakam\\Pictures\\ISI\\Gestion de software 2\\Chromedriver\\chromedriver.exe");
        //Creamos una nueva instancia de chromeDriver
        WebDriver driver = new ChromeDriver();
        //Hacemos una llamada a esta página
        driver.get("http://formy-project.herokuapp.com/keypress");
        //Buscamos por nombre la entrada de texto
        org.openqa.selenium.WebElement element = driver.findElement(By.name("q"));
        // Ingresamos un texto a buscar
        element.sendKeys("Cheese!");
        //Enviamos la forma
        ((org.openqa.selenium.WebElement) element).submit();
        //cerramos el navegador
        driver.quit();
    }
}
