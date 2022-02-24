package eplayers.teste;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteLogin {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver98.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4200/login");
		
	}
	
	@Test	
	public void TestarLogin() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS	);
		WebElement inputEmail = driver.findElement(By.id("email"));
		WebElement inputSenha = driver.findElement(By.id("senha"));
		WebElement botaoLogin = driver.findElement(By.id("botao-enviar"));
		
		String[] listaSenhas = {"qqqq", "kkkkk", "lllll"};
		
		for(int tentativas = 0; tentativas < listaSenhas.length; tentativas++) {
			inputEmail.clear();
			inputSenha.clear();
			
			inputEmail.sendKeys("1234@hotmail.com");
			inputSenha.sendKeys(listaSenhas[tentativas]);
			botaoLogin.click();
		}
			
		}
		


}
