package ru.sbt.lesson4;

import ru.sbt.lesson4.validator.BlackListValidator;
import ru.sbt.lesson4.validator.CommentValidator;
import ru.sbt.lesson4.validator.IpAddressValidator;
import ru.sbt.lesson4.validator.SpamValidator;

import java.util.ArrayList;
import java.util.Collection;

public class EntryController {
    private final Collection<SpamValidator> validators;

    public EntryController(){
        validators = new ArrayList<>();
        validators.add(new IpAddressValidator());
        validators.add(new CommentValidator());
        validators.add(new BlackListValidator());
    }

    public EntryController(Collection<SpamValidator> validators) {
        this.validators = validators;
    }

    public void addComment(String commentText, String username, String ipAddress) {
        if (validateNotSpam(commentText, username, ipAddress)) {

        }
    }

    private boolean validateNotSpam(String commentText, String username, String ipAddress) {
        Comment comment = new Comment(commentText, username, ipAddress);
        for (SpamValidator sv : validators)
            if (sv.isSpam(comment))
                return false;
        return true;
    }
}
