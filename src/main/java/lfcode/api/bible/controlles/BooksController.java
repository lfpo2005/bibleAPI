package lfcode.api.bible.controlles;

import lfcode.api.bible.model.BibleModel;
import lfcode.api.bible.bibleclient.BooksClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
//@RequestMapping("/books")
public class BooksController{

	@Autowired
	private BooksClient booksClient;

	  @GetMapping(value = "{abbrev}", produces = "application/json")
	  public ResponseEntity<BibleModel> findBooksAbbrev(@PathVariable(value = "abbrev") String abbrev) {
		  return ResponseEntity.ok(booksClient.getAbbrev(abbrev));
	  }

	@GetMapping( produces = "application/json")
	public ResponseEntity<List<BibleModel>> findBooks() {

		var books = booksClient.getBooks();

		return ResponseEntity.status(HttpStatus.OK).body(books);
	}

}
