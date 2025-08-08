package com.harika.portfolio.service;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.harika.portfolio.model.Contact;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FirebaseContactService {

    public void saveContact(Contact contact) {
        DatabaseReference ref = FirebaseDatabase
                .getInstance()
                .getReference("contacts");

        String contactId = UUID.randomUUID().toString();
        ref.child(contactId).setValueAsync(contact);
    }
}
