package com.thecat.TestApi;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class TesteApi {

	@Test
	public void cadastro() {
		String url = "https://api.thecatapi.com/v1/user/passwordlesssignup";
		String corpo = "{\"email\": \"victor.sbarbosa@hotmail.com\", \"appDescription\": \"teste the cat api\"}";
		
		//DADO QUE EU TENHO ALGUMA COISA
		given().contentType("application/json").body(corpo).
		//QUANDO EU TIVER ESSA COISA
		when().post(url).
		//ENTÃO TENHO O RESULTADO RESPERADO
		then().statusCode(200);
		
		
		
	}
}
