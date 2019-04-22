package com.simple.eagleeye.licensingservice.repository;

import com.simple.eagleeye.licensingservice.entity.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author simple
 * @version 1.0
 * @date 2018/10/22 10:43
 */
@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
    /**
     * 根据机构id查询所有许可证
     *
     * @param organizationId String
     * @return List
     */
    List<License> findByOrganizationId(String organizationId);

    /**
     * 根据机构id和许可证id查询许可证
     *
     * @param organizationId String
     * @param licenseId      String
     * @return License
     */
    License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
