package lfcode.api.bible.bibleclient;

import lfcode.api.bible.integration.BibleFeinClintConfig;
import lfcode.api.bible.model.Version;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Component
@FeignClient(name = "version", url = "${bible.api.apiUrl}", configuration = BibleFeinClintConfig.class )
public interface VersionClient {

	@GetMapping(value =  "/Versions/")
	List<Version> getAllVersion();



}

	

