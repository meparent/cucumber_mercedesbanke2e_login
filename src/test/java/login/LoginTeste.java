package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTeste {
	
	WebDriver driver= new ChromeDriver();//abre nova janela do chrome
	
	By login = By.xpath("//button[@class='login-button']");
	By cadastrarCpf = By.xpath("//input[@placeholder='CPF ou E-mail']");
    By cadastrarSenha = By.xpath("//input[@placeholder='Senha']");
    By btnContinuar = By.xpath("//button[@class='form-button']");
    	
		
		@Given("que esteja na home")
	public void que_esteja_na_home() {
	    driver.get("http://52.2.114.98");
	    driver.manage().window().maximize();
	}

	@And("clicar no botao login")
	public void clicar_no_botao_login() {
	   
	}

	@And("inserir o cpf")
	public void inserir_o_cpf() {
	    
	}

	@And("inserir a senha")
	public void inserir_a_senha() {
	    
	}

	@When("clicar no botao continuar")
	public void clicar_no_botao_continuar() {
    
		driver.findElement(login).click();
        driver.findElement(cadastrarCpf).sendKeys("526.176.275-78"); //escrever
        driver.findElement(cadastrarSenha).sendKeys("a098765@E");
        driver.findElement(btnContinuar).click();
		}

	@Then("serei direcionado para tela home logada")
	public void serei_direcionado_para_tela_home_logada() {

}
             
} 
                 
	