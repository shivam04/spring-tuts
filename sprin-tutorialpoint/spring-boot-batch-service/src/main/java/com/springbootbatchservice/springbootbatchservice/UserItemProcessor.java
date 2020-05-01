package com.springbootbatchservice.springbootbatchservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/*
 * Date: 01/05/2020 - 8:27 pm
 * User: shivam.si
 */
public class UserItemProcessor implements ItemProcessor<User, User> {
    private static final Logger log = LoggerFactory.getLogger(UserItemProcessor.class);

    @Override
    public User process(final User user) throws Exception {
        final String firstName = user.getFirstName().toUpperCase();
        final String lastName = user.getLastName().toUpperCase();
        final User transformedPerson = new User(firstName, lastName);

        log.info("Converting (" + user + ") into (" + transformedPerson + ")");
        return transformedPerson;
    }
}
