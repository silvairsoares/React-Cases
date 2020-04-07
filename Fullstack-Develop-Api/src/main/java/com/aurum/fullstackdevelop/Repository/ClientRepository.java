package com.aurum.fullstackdevelop.Repository;

import com.aurum.fullstackdevelop.model.Client;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;
import reactor.core.publisher.Flux;

public interface ClientRepository extends FirestoreReactiveRepository<Client>{
    Flux<Client> findByName(String name);
}
