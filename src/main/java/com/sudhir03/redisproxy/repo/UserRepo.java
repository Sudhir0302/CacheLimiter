package com.sudhir03.redisproxy.repo;

import com.sudhir03.redisproxy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>
{

}
