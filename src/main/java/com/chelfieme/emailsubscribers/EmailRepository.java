package com.chelfieme.emailsubscribers;

import org.springframework.data.repository.CrudRepository;

public interface EmailRepository extends CrudRepository<EmailSubscription, Integer>{
}
