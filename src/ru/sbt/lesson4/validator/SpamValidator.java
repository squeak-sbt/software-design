package ru.sbt.lesson4.validator;

import ru.sbt.lesson4.Comment;

public interface SpamValidator {
    boolean isSpam(Comment comment);
}
