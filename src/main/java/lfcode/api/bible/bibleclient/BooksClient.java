package lfcode.api.bible.bibleclient;

import lfcode.api.bible.integration.BibleFeinClintConfig;
import lfcode.api.bible.model.BibleModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "books", url = "${bible.api.apiUrl}", configuration = BibleFeinClintConfig.class )
public interface BooksClient {

	@GetMapping(value = "/books", produces = "application/json")
	List<BibleModel> getBooks();


	@GetMapping(value = "/books/{abbrev}", produces = "application/json")
	BibleModel getAbbrev(@PathVariable("abbrev") String abbrev);



}
