package com.chelfieme.emailsubscribers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailRepository emailRepository;

    @PostMapping
    public void subscribeEmail(@RequestBody Map data) {
        EmailSubscription emailSubscription = new EmailSubscription();
        emailSubscription.setEmail(data.get("email").toString());
        emailRepository.save(emailSubscription);
    }

    @GetMapping("/{asd}")
    @ResponseBody
    public Iterable<EmailSubscription> getSubscribers(@PathVariable String asd) {

        if("brh".equals(asd)) {
            return this.emailRepository.findAll();
        }

        return null;
    }

}
