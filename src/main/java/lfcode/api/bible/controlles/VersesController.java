package lfcode.api.bible.controlles;

import lfcode.api.bible.model.BibleModel;
import lfcode.api.bible.bibleclient.VersesClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}

