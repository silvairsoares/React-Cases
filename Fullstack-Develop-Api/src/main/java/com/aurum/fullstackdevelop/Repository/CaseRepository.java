package com.aurum.fullstackdevelop.Repository;

import com.aurum.fullstackdevelop.model.Case;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;

public interface CaseRepository extends FirestoreReactiveRepository<Case>{
}
