/*
 *  Created by Dmitry Garmyshev on 02.08.2020, 10:45
 *  Copyright (c) 2020 . All rights reserved.
 *  Last modified 01.08.2020, 22:42
 */

package com.loakdv.sarafan.repo;

import com.loakdv.sarafan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
