package com.log.logservice.repo;

import com.log.logservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *让持久层接口 UserDao 继承 Repository 接口。
 * 该接口使用了泛型，需要为其提供两个类型：第一个为该接口处理的域对象类型，第二个为该域对象的主键类型
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
