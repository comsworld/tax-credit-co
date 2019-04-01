package cucumberWebTest.backend.service;

import cucumberWebTest.backend.bindings.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RestServices {
    private final Logger logger = LogManager.getLogger();
    private final RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());


    private ClientHttpRequestFactory getClientHttpRequestFactory(){
        int timeout =500000;

        HttpComponentsClientHttpRequestFactory componentsClientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        componentsClientHttpRequestFactory.setReadTimeout(timeout);
        componentsClientHttpRequestFactory.setConnectTimeout(timeout);
        componentsClientHttpRequestFactory.setConnectionRequestTimeout(timeout);
        return componentsClientHttpRequestFactory;
    }

    private String exception;

    private HttpHeaders getHttpHeaderNoAuth(){
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }



    public ResponseEntity<User[]> getUsersInfo(){
        try {
            HttpHeaders httpHeaders = getHttpHeaderNoAuth();
            HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
            String url = "https://jsonplaceholder.typicode.com/posts";
            return restTemplate.exchange(url, HttpMethod.GET, entity, User[].class);
        }catch (Exception e){
            exception = e.toString();
            return null;
        }
    }


    public ResponseEntity<User> getUserInfo(String userid){
        try {
            HttpHeaders httpHeaders = getHttpHeaderNoAuth();
            HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
            String url = "https://jsonplaceholder.typicode.com/posts/"+userid;
            return restTemplate.exchange(url, HttpMethod.GET, entity, User.class);
        }catch (Exception e){
            exception = e.toString();
            return null;
        }
    }



    public ResponseEntity<User> postNewUser(User user){
        try {
            HttpHeaders httpHeaders = getHttpHeaderNoAuth();
            HttpEntity<User> entity = new HttpEntity<>(user, httpHeaders);
            String url = "https://jsonplaceholder.typicode.com/posts/";
            return restTemplate.exchange(url, HttpMethod.POST, entity, User.class);
        }catch (Exception e){
            exception = e.toString();
            return null;
        }
    }






}
