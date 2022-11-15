package com.datadobi.repros.comboboxreattach.data.service;

import com.datadobi.repros.comboboxreattach.data.entity.SamplePerson;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}