package lfcode.api.bible.bibleclient;

import lfcode.api.bible.integration.BibleFeinClintConfig;
import lfcode.api.bible.model.BibleModel;
import lfcode.api.bible.model.Search;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Component
@FeignClient(name = "verses", url = "${bible.api.apiUrl}", configuration = BibleFeinClintConfig.class )
public interface VersesClient {

	@GetMapping(value = "/verses/{version}/{abbrev}/{chapter}/{number}", produces = "application/json")
	BibleModel getAllVerses(@PathVariable("version") String version,
							@PathVariable("abbrev") String abbrev,
							@PathVariable("chapter") String chapter,
							@PathVariable("number") String number);


	@GetMapping(value = "/verses/{version}/{abbrev}/random", produces = "application/json")
	BibleModel getRandom(@PathVariable("version") String version,
						 @PathVariable("abbrev") String abbrev);

	@PostMapping(value = "/verses/search")
	Search getSearch(@RequestBody Search search);


}

	

