package cucumberWebTest.stepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java8.En;

import cucumberWebTest.backend.bindings.User;
import cucumberWebTest.backend.service.RestServices;
import cucumberWebTest.config.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


@SpringBootTest(classes = SpringBootTest.class)
@ContextConfiguration(classes = SpringConfig.class)
public class APIUserSteps implements En {
    @Autowired
    private RestServices restServices = new RestServices();

    private ResponseEntity<User[]> usersResponseEntity;
    private ResponseEntity<User> userResponseEntity;
    private User[] users;
    private User user;
    private User userPost = new User();
    private Integer responseStatus;
    private String jsonResponse;
    private Integer success = 200;
    private Integer accepted = 201;



    public APIUserSteps() {
        Given("^I request users information$", () -> {
            usersResponseEntity = restServices.getUsersInfo();
            users = usersResponseEntity.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            jsonResponse = objectMapper.writeValueAsString(users);
            responseStatus = usersResponseEntity.getStatusCodeValue();
            if (usersResponseEntity.getStatusCode().equals(HttpStatus.OK)) {
                System.out.println("Get Response" + jsonResponse);
            }
        });

        Given("^I request user information for userId (.*?)$", (String userid) -> {
            userResponseEntity = restServices.getUserInfo(userid);
            user = userResponseEntity.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            jsonResponse = objectMapper.writeValueAsString(user);
            responseStatus = userResponseEntity.getStatusCodeValue();
            if (userResponseEntity.getStatusCode().equals(HttpStatus.OK)) {
                System.out.println(" Get response" + jsonResponse);
            }
        });

        And("^I get users information$", () -> {
            assertTrue(jsonResponse != null);
        });

        And("^Title contains (.*?)$", (String title) -> {
            assertTrue(user.getTitle().contains(title));
        });

        Given("^I post user information for userId (.*?)$", (String userid) -> {
            userResponseEntity = restServices.postNewUser(userPost);
            user = userResponseEntity.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            jsonResponse = objectMapper.writeValueAsString(user);
            responseStatus = userResponseEntity.getStatusCodeValue();
            if (userResponseEntity.getStatusCode().equals(HttpStatus.ACCEPTED)) {
                System.out.println("Post response" + jsonResponse);
            }
        });

        And("^Response status is (\\d+)$", (Integer response) -> {
            assertEquals(responseStatus, response);
        });

        And("^User title is (.*?)$", (String title) -> {
            assertEquals(user.getTitle(), title);
        });

        And("^User body is (.*?)$", (String body) -> {
            assertEquals(user.getBody(), body);
        });

        And("^User id is (.*?)$", (String id) -> {
            assertEquals(user.getUserId(), id);
        });

        Given("^I have a user with id (.*?) and body (.*?) and title (.*?)$", (String userid, String body, String title) -> {
            userPost.setBody(body);
            userPost.setUserId(userid);
            userPost.setTitle(title);
        });
    }


    private void getAutthIds()throws Exception{
        String file = "/Users/reddy_srini/Documents/authids.txt";
        List<String> authids = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {
                if(line.contains("auth")){
                    authids.add(line);
                }
            }
            for(int i =0;i<authids.size(); i++){
                System.out.println(authids.get(i).replace("\"authId\":\"","").replace("\",",""));
            }
        }

    }
}
