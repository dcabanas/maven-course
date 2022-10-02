package guru.springframework.mappers;

import guru.springframework.domain.User;
import guru.springframework.model.UserCommand;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-27T20:26:54+0100",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userCommand.getFirstName() );
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }
}
