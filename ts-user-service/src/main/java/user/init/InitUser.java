package user.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import user.entity.User;
import user.repository.UserRepository;
import user.service.UserService;


import java.util.UUID;

/**
 * @author fdse
 */
@Component
public class InitUser implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    protected PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... strings) throws Exception {
        User whetherExistUser = userRepository.findByUserName("fdse_microservice");
        User user = User.builder()
                .userId(UUID.fromString("4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f"))
                .userName("fdse_microservice")
                .password("111111")
                .gender(1)
                .documentType(1)
                .documentNum("2135488099312X")
                .email("trainticket_notify@163.com").build();
        if (whetherExistUser == null) {
            userRepository.save(user);
        }

        // [ANTIPODE] user
        User whetherExistAntipodeUser = userRepository.findByUserName("antipode");
        User antipodeUser = User.builder()
                .userId(UUID.fromString("d05c7ef0-d593-4180-91b4-eb0378192d75"))
                .userName("antipode")
                .password("antipode")
                .gender(1)
                .documentType(1)
                .documentNum("123456789-ANTIPODE")
                .email("antipode@antipode.com").build();
        if (whetherExistAntipodeUser == null) {
            userRepository.save(antipodeUser);
        }
    }
}
