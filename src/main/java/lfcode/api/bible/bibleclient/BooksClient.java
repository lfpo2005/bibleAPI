package lfcode.api.bible.bibleclient;

import lfcode.api.bible.model.BibleModel;
import lfcode.api.bible.integration.BibleFeinClintConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "books", url = "${bible.api.apiUrl}", configuration = BibleFeinClintConfig.class )
public interface BooksClient {

	//@Headers("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IldlZCBPY3QgMjcgMjAyMSAxOTo1ODo0NyBHTVQrMDAwMC5sZnBvMjAwNUB5YWhvby5jb20uYnIiLCJpYXQiOjE2MzUzNjQ3Mjd9.ca4ulqkFp3U-g4KRBW2v1wnUjzmPYxay06It2zTZEnc")
	@GetMapping(value = "/books/{abbrev}")
	BibleModel getAbbrev(@PathVariable("abbrev") String abbrev);
	//@Headers("{path.apiConfig}")
	//@Headers("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IldlZCBPY3QgMjcgMjAyMSAxOTo1ODo0NyBHTVQrMDAwMC5sZnBvMjAwNUB5YWhvby5jb20uYnIiLCJpYXQiOjE2MzUzNjQ3Mjd9.ca4ulqkFp3U-g4KRBW2v1wnUjzmPYxay06It2zTZEnc")
	@GetMapping(value = "/books")
	List<BibleModel> getBooks();

}
