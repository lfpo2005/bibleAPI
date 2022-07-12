package lfcode.api.bible.controlles;

import lfcode.api.bible.bibleclient.BooksClient;
import lfcode.api.bible.model.BibleModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/books")
public class BooksController{

	@Autowired
	private BooksClient booksClient;


	@GetMapping
	public ResponseEntity<List<BibleModel>> findBooks() {
		var books = booksClient.getBooks();
		return ResponseEntity.status(HttpStatus.OK).body(books);
	}

	  @GetMapping(value = "{abbrev}")
	  public ResponseEntity<BibleModel> findBooksAbbrev(@PathVariable(value = "abbrev") String abbrev) {
		  return ResponseEntity.ok(booksClient.getAbbrev(abbrev));
	}
}
