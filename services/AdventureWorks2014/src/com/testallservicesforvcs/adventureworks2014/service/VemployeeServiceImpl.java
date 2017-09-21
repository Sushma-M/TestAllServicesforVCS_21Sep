/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testallservicesforvcs.adventureworks2014.Vemployee;
import com.testallservicesforvcs.adventureworks2014.VemployeeId;


/**
 * ServiceImpl object for domain model class Vemployee.
 *
 * @see Vemployee
 */
@Service("AdventureWorks2014.VemployeeService")
public class VemployeeServiceImpl implements VemployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(VemployeeServiceImpl.class);


    @Autowired
    @Qualifier("AdventureWorks2014.VemployeeDao")
    private WMGenericDao<Vemployee, VemployeeId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Vemployee, VemployeeId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
	public Vemployee create(Vemployee vemployee) {
        LOGGER.debug("Creating a new Vemployee with information: {}", vemployee);
        Vemployee vemployeeCreated = this.wmGenericDao.create(vemployee);
        return vemployeeCreated;
    }

	@Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
	public Vemployee getById(VemployeeId vemployeeId) throws EntityNotFoundException {
        LOGGER.debug("Finding Vemployee by id: {}", vemployeeId);
        Vemployee vemployee = this.wmGenericDao.findById(vemployeeId);
        if (vemployee == null){
            LOGGER.debug("No Vemployee found with id: {}", vemployeeId);
            throw new EntityNotFoundException(String.valueOf(vemployeeId));
        }
        return vemployee;
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
	public Vemployee findById(VemployeeId vemployeeId) {
        LOGGER.debug("Finding Vemployee by id: {}", vemployeeId);
        return this.wmGenericDao.findById(vemployeeId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
	@Override
	public Vemployee update(Vemployee vemployee) throws EntityNotFoundException {
        LOGGER.debug("Updating Vemployee with information: {}", vemployee);
        this.wmGenericDao.update(vemployee);

        VemployeeId vemployeeId = new VemployeeId();
        vemployeeId.setBusinessEntityId(vemployee.getBusinessEntityId());
        vemployeeId.setTitle(vemployee.getTitle());
        vemployeeId.setFirstName(vemployee.getFirstName());
        vemployeeId.setMiddleName(vemployee.getMiddleName());
        vemployeeId.setLastName(vemployee.getLastName());
        vemployeeId.setSuffix(vemployee.getSuffix());
        vemployeeId.setJobTitle(vemployee.getJobTitle());
        vemployeeId.setPhoneNumber(vemployee.getPhoneNumber());
        vemployeeId.setPhoneNumberType(vemployee.getPhoneNumberType());
        vemployeeId.setEmailAddress(vemployee.getEmailAddress());
        vemployeeId.setEmailPromotion(vemployee.getEmailPromotion());
        vemployeeId.setAddressLine1(vemployee.getAddressLine1());
        vemployeeId.setAddressLine2(vemployee.getAddressLine2());
        vemployeeId.setCity(vemployee.getCity());
        vemployeeId.setStateProvinceName(vemployee.getStateProvinceName());
        vemployeeId.setPostalCode(vemployee.getPostalCode());
        vemployeeId.setCountryRegionName(vemployee.getCountryRegionName());
        vemployeeId.setAdditionalContactInfo(vemployee.getAdditionalContactInfo());

        return this.wmGenericDao.findById(vemployeeId);
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
	@Override
	public Vemployee delete(VemployeeId vemployeeId) throws EntityNotFoundException {
        LOGGER.debug("Deleting Vemployee with id: {}", vemployeeId);
        Vemployee deleted = this.wmGenericDao.findById(vemployeeId);
        if (deleted == null) {
            LOGGER.debug("No Vemployee found with id: {}", vemployeeId);
            throw new EntityNotFoundException(String.valueOf(vemployeeId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
	public Page<Vemployee> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Vemployees");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<Vemployee> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Vemployees");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service AdventureWorks2014 for table Vemployee to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

