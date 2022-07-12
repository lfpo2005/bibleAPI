package lfcode.api.bible.controlles;

import lfcode.api.bible.bibleclient.VersesClient;
import lfcode.api.bible.model.BibleModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/verses")
public class VersesController {

	@Autowired
	private VersesClient versesClient;

@GetMapping(value = "/{version}/{abbrev}/{chapter}/{number}")
	public ResponseEntity<BibleModel> getAll(@PathVariable("version") String version,
										   @PathVariable("abbrev") String abbrev,
										   @PathVariable("chapter") String chapter,
										   @PathVariable("number") String number){

		return ResponseEntity.ok(versesClient.getAllVerses(version, abbrev, chapter, number));
	}

	@GetMapping( value = "/{version}/{abbrev}")
	public ResponseEntity<BibleModel> findRandom(@PathVariable("version") String version,
								   @PathVariable("abbrev") String abbrev) {

		return ResponseEntity.ok(versesClient.getRandom(version, abbrev));

	}

/*
	@PostMapping
	public ResponseEntity<Object> registerArticle(@RequestBody Search search) {
		versesClient.getSearch(search);

		return ResponseEntity.status(HttpStatus.CREATED).body(search);
	}
*/

}

