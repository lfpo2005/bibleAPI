package lfcode.api.bible.controlles;

import lfcode.api.bible.bibleclient.VersesClient;
import lfcode.api.bible.model.BibleModel;
import lfcode.api.bible.model.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//@AllArgsConstructor
@RestController
@RequestMapping("/verses")
public class VersesController {
	
	@Autowired
	private VersesClient versesClient;

@GetMapping(value = "/{version}/{abbrev}/{chapter}/{number}", produces = "application/json")
	public ResponseEntity<BibleModel> getAll(@PathVariable("version") String version,
											 @PathVariable("abbrev") String abbrev,
											 @PathVariable("chapter") String chapter,
										     @PathVariable("number") String number){
		return ResponseEntity.ok(versesClient.getAllVerses(version, abbrev, chapter, number));
	}

	@GetMapping( value = "/{version}/{abbrev}", produces = "application/json")
	public ResponseEntity<BibleModel> findRandom(@PathVariable("version") String version,
												 @PathVariable("abbrev") String abbrev) {

		return ResponseEntity.ok(versesClient.getRandom(version, abbrev));
	}

	@PostMapping(produces = "application/json")
	public ResponseEntity<Search> getSearch(@RequestParam("version") String version,
											@RequestParam("search") String search) {

		return ResponseEntity.ok(versesClient.getSearch(version, search));
	}

}

