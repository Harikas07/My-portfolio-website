// package com.harika.portfolio.service;

// import com.harika.portfolio.model.Contact;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import org.springframework.http.*;
// import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;

// @Service
// public class ContactService {

//     private static final String FIREBASE_URL = "https://contactinfo-b5848.firebaseio.com/contacts.json";

//     public void saveContact(Contact contact) {
//         try {
//             RestTemplate restTemplate = new RestTemplate();
//             HttpHeaders headers = new HttpHeaders();
//             headers.setContentType(MediaType.APPLICATION_JSON);

//             ObjectMapper mapper = new ObjectMapper();
//             String json = mapper.writeValueAsString(contact);

//             HttpEntity<String> request = new HttpEntity<>(json, headers);
//             ResponseEntity<String> response = restTemplate.postForEntity(FIREBASE_URL, request, String.class);

//             System.out.println("Firebase Response: " + response.getBody());
//         } catch (Exception e) {
//             System.err.println("Error sending to Firebase: " + e.getMessage());
//         }
//     }
// }
