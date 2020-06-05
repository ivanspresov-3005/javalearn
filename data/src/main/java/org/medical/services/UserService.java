package org.medical.services;

import org.medical.model.User;
import org.medical.model.UserModel;
import org.medical.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void save(UserModel user) {
        userRepository.save(user.convert());
    }

    public List<UserModel> listAll() {
        return ((List<User>) userRepository.findAll()).stream().map(UserModel::new)
                .sorted().collect(Collectors.toList());
    }

    public Optional<UserModel> get(Long id) {
        Optional<User> result = userRepository.findById(id);
        if (result.isPresent()) {
            return Optional.of(new UserModel(result.get()));
        } else {
            return Optional.empty();
        }
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
