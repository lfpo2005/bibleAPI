package lfcode.api.bible.bibleclient;

import lfcode.api.bible.model.BibleModel;
import lfcode.api.bible.integration.BibleFeinClintConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(name = "verses", url = "${bible.api.apiUrl}", configuration = BibleFeinClintConfig.class )
public interface VersesClient {

	String uri = "/verses/{version}/{abbrev}/{chapter}/{number}";


	//@Headers("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IldlZCBPY3QgMjcgMjAyMSAxOTo1ODo0NyBHTVQrMDAwMC5sZnBvMjAwNUB5YWhvby5jb20uYnIiLCJpYXQiOjE2MzUzNjQ3Mjd9.ca4ulqkFp3U-g4KRBW2v1wnUjzmPYxay06It2zTZEnc")
	@GetMapping(value = uri)
	BibleModel getAllVerses(@PathVariable("version") String version,
							@PathVariable("abbrev") String abbrev,
							@PathVariable("chapter") String chapter,
							@PathVariable("number") String number);



}

	

