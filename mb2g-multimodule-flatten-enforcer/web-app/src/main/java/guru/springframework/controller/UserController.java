package guru.springframework.controller;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

public class UserController {

    User save(UserCommand userCommand) {
        return new User();
    }
}
