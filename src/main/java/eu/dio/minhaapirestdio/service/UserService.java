package eu.dio.minhaapirestdio.service;

import eu.dio.minhaapirestdio.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
