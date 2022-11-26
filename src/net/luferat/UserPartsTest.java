/**
 * Exercício:
 * 
 *  Refatore a classe "UserParts" para que todos os testes abaixo passem. 
 *  
 *  ATENÇÃO! Não altere nenhuma linha deste arquivo. Isso pode quebrar a aplicação.
 **/
package net.luferat;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

class UserPartsTest {

	// Instância da classe "UserParts" cria o novo objeto "bro".
	UserParts bro = new UserParts("Joca da Silva de Souza", "1980-11-14");

	// Obtém o nome completo, inserido na instância.
	@Test
	void fullNameTest() {
		assertEquals("Joca da Silva de Souza", bro.fullName());
	}

	// Obtém o primeiro nome do nome completo, inserido na instância.
	@Test
	void getFirstNameTest() {
		assertEquals("Joca", bro.getFirstName());
	}

	// Obtém o último nome do nome completo, inserido na instância.
	@Test
	void getLastNameTest() {
		assertEquals("Souza", bro.getLastName());
	}

	// Obtém a data de nascimento inserida na instância.
	@Test
	void getBirthTest() {
		assertEquals("1980-11-14", bro.getBirth());
	}

	// Obtém a data de nascimento formatada como d/m/Y ao passar o parâmetro como "true".
	@Test
	void getFormatedBirthTest() {
		assertEquals("14/11/1980", bro.getBirth(true));
	}
	
	// Obtém a idade.
	@Test
	void getAgeTest() throws ParseException {
		assertEquals(42, bro.getAge());
	}
	
	// Se é menor de idade.
	@Test
	void isMinorTest() throws ParseException {
		assertFalse(bro.isMinor());
	}

}
