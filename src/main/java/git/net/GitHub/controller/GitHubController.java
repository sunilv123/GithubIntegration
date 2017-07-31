package git.net.GitHub.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class GitHubController {

	@PostMapping("/api/github-activity-url")
	public void testGitHubCommit(@RequestBody String jsonData){
		System.out.println("-jsonData--------->"+jsonData.toString());
	}
	
}
