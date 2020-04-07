package com.aurum.fullstackdevelop.Repository;

import com.aurum.fullstackdevelop.model.User;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;

public interface UserRepository extends FirestoreReactiveRepository<User>{
}
