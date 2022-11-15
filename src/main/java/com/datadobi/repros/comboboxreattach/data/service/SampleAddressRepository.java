package com.datadobi.repros.comboboxreattach.data.service;

import com.datadobi.repros.comboboxreattach.data.entity.SampleAddress;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, UUID> {

}