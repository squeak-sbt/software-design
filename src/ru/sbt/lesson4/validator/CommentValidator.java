package ru.sbt.lesson4.validator;

import ru.sbt.lesson4.Comment;

public class CommentValidator implements SpamValidator {
    @Override
    public boolean isSpam(Comment comment) {
        return true;
    }
}
