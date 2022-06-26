package lfcode.api.bible.controlles;

import lfcode.api.bible.bibleclient.VersionClient;
import lfcode.api.bible.model.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/version")
public class VersionController {
	
	@Autowired
	private VersionClient versionClient;

	@GetMapping( produces = "application/json")
	public ResponseEntity<List<Version>> getVersion() {
		var version = versionClient.getAllVersion();
		return ResponseEntity.status(HttpStatus.OK).body(version);
	}
}

