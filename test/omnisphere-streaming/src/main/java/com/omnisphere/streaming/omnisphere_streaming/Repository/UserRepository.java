package com.omnisphere.streaming.omnisphere_streaming.Repository;

import com.omnisphere.streaming.omnisphere_streaming.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
