package lfcode.api.bible.controlles;

import lfcode.api.bible.bibleclient.BooksClient;
import lfcode.api.bible.model.BibleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BooksController{

	@Autowired
	private BooksClient booksClient;

	@GetMapping( produces = "application/json")
	public ResponseEntity<List<BibleModel>> findBooks() {
		var books = booksClient.getBooks();
		return ResponseEntity.status(HttpStatus.OK).body(books);
	}

	  @GetMapping(value = "{abbrev}", produces = "application/json")
	  public ResponseEntity<BibleModel> findBooksAbbrev(@PathVariable(value = "abbrev") String abbrev) {
		  return ResponseEntity.ok(booksClient.getAbbrev(abbrev));
	  }



}
