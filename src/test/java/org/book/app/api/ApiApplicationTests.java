package org.book.app.api;

import java.util.List;

import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hackathon.pojo.Book;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class ApiApplicationTests {

	public String APP_URL = "http://localhost:8080/book";
	
	@Test
	public void TestPostBook() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		Book books = new Book();
		books.setIsbnum(124);
		books.setAuthor("Babu1");
		books.setOrg("C");
		books.setName("C");
		HttpEntity<Book> request = new HttpEntity<>(books, headers);
	
		ResponseEntity<String> resp = restTemplate.exchange(APP_URL, HttpMethod.POST, request, String.class);
		System.out.println("Resp: " + resp);
	}
	
	//@Test
	public void TestAllBooks() {
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<List<Book>> request = new HttpEntity<>(headers);
		
		String all_books_url = "/all";
		
		//List<Book> resp = restTemplate.getForObject(APP_URL+all_books_url, List.class);
		//ResponseEntity<String> resp = restTemplate.exchange(APP_URL+all_books_url, HttpMethod.GET, request, String.class);
		ResponseEntity<List<Book>> resp = restTemplate.exchange(APP_URL+all_books_url, HttpMethod.GET, request, new ParameterizedTypeReference<List<Book>>(){});
		System.out.println(resp);
		
		List<Book> respBooks = resp.getBody();
		System.out.println(respBooks.size());
		
		System.out.println("Test Executed");
	}

}
