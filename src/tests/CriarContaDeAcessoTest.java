package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CriarContaDeAcessoTest {

	WebDriver driver;	
	
	@Dado("^Acessar a página de cadastro de conta de usuário$")
	public void acessar_a_página_de_cadastro_de_conta_de_usuário() {
		
		//Configurando o driver para abrir o google chrome
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		//Acessando a página do exercício
		driver = new ChromeDriver ();
		driver.get("http://exercqa-001-site1.btempurl.com/Jmeter/Exercicio01");
		
		//maximizando o navegador
		driver.manage().window().maximize();
	}

	@Dado("^Preencher o nome \"([^\"]*)\"$")
	public void preencher_o_nome(String arg1) {
		
		//preenchendo o campo nome do formulário
		driver.findElement(By.cssSelector("#Nome")).sendKeys(arg1);
		
	}

	@Dado("^Preencher o email \"([^\"]*)\"$")
	public void preencher_o_email(String arg1) {
		
		//preenchendo o campo email do formulário
	    driver.findElement(By.cssSelector("#Email")).sendKeys(arg1);	
		
	}

	@Dado("^Preencher a senha \"([^\"]*)\"$")
	public void preencher_a_senha(String arg1) {
		
		//preenchendo o campo senha do formulário
		 driver.findElement(By.cssSelector("#Senha")).sendKeys(arg1);		
		
	}

	@Dado("^Confirmar a senha \"([^\"]*)\"$")
	public void confirmar_a_senha(String arg1) {
		
		//preenchendo o campo de confirmação de senha do formulário
		 driver.findElement(By.cssSelector("#SenhaConfirmacao")).sendKeys(arg1);	
	
	}

	@Quando("^Confirmar a realização do cadastro$")
	public void confirmar_a_realização_do_cadastro() {
		
		//clicar no botão confirmação de cadastro
		driver.findElement(By.cssSelector("#btn_acesso")).click();
	}

	@Então("^Sistema informa que o cadastro foi realizado com sucesso$")
	public void sistema_informa_que_o_cadastro_foi_realizado_com_sucesso() {
		
		//ler a mensagem exibida pelo sistema
		String mensagem = driver.findElement (By.cssSelector("#mensagem")).getText();
		
		//comparar o resultado obtido x o resultado esperado
		assertEquals(mensagem,"Parabéns, sua conta de usuário foi criada com sucesso!" );
		
		//fechar o navegador
		driver.close();
		driver.quit();		
	}

	@Então("^Sistema informa que todos os campos são de preenchimento obrigatório$")
	public void sistema_informa_que_todos_os_campos_são_de_preenchimento_obrigatório() {
		
		//criando uma variável para cada mensagem de erro que será lida
		String nome = driver.findElement(By.cssSelector("#page-content-wrapper > div > div > div > div > div > form > div:nth-child(3) > span")).getText();
		String email = driver.findElement(By.cssSelector("#page-content-wrapper > div > div > div > div > div > form > div:nth-child(7) > span")).getText();
		String senha = driver.findElement(By.cssSelector("#page-content-wrapper > div > div > div > div > div > form > div:nth-child(11) > span")).getText();
		String senhaConfirmacao = driver.findElement(By.cssSelector("#page-content-wrapper > div > div > div > div > div > form > div:nth-child(15) > span")).getText();
		
		//comparar o resultado obtido x o resultado esperado
		assertEquals (nome,"Por favor, informe o nome.");
		assertEquals (email,"Por favor, informe o email.");
		assertEquals (senha,"Por favor, informe a senha.");
		assertEquals (senhaConfirmacao,"Por favor, confirme a senha.");
		
		//fechando o navegador
		driver.close();
		driver.quit();			
	}

}
