/**
 * This class is generated by jOOQ
 */
package com.mycompany.app.jooq.tables.daos;


import com.mycompany.app.jooq.tables.Absent;
import com.mycompany.app.jooq.tables.records.AbsentRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class AbsentDao extends DAOImpl<AbsentRecord, com.mycompany.app.jooq.tables.pojos.Absent, String> {

	/**
	 * Create a new AbsentDao without any configuration
	 */
	public AbsentDao() {
		super(Absent.ABSENT, com.mycompany.app.jooq.tables.pojos.Absent.class);
	}

	/**
	 * Create a new AbsentDao with an attached configuration
	 */
	@Autowired
	public AbsentDao(Configuration configuration) {
		super(Absent.ABSENT, com.mycompany.app.jooq.tables.pojos.Absent.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getId(com.mycompany.app.jooq.tables.pojos.Absent object) {
		return object.getAbsid();
	}

	/**
	 * Fetch records that have <code>empid IN (values)</code>
	 */
	public List<com.mycompany.app.jooq.tables.pojos.Absent> fetchByEmpid(String... values) {
		return fetch(Absent.ABSENT.EMPID, values);
	}

	/**
	 * Fetch records that have <code>absid IN (values)</code>
	 */
	public List<com.mycompany.app.jooq.tables.pojos.Absent> fetchByAbsid(String... values) {
		return fetch(Absent.ABSENT.ABSID, values);
	}

	/**
	 * Fetch a unique record that has <code>absid = value</code>
	 */
	public com.mycompany.app.jooq.tables.pojos.Absent fetchOneByAbsid(String value) {
		return fetchOne(Absent.ABSENT.ABSID, value);
	}

	/**
	 * Fetch records that have <code>absdate IN (values)</code>
	 */
	public List<com.mycompany.app.jooq.tables.pojos.Absent> fetchByAbsdate(Timestamp... values) {
		return fetch(Absent.ABSENT.ABSDATE, values);
	}

	/**
	 * Fetch records that have <code>absdescription IN (values)</code>
	 */
	public List<com.mycompany.app.jooq.tables.pojos.Absent> fetchByAbsdescription(String... values) {
		return fetch(Absent.ABSENT.ABSDESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>absnotes IN (values)</code>
	 */
	public List<com.mycompany.app.jooq.tables.pojos.Absent> fetchByAbsnotes(String... values) {
		return fetch(Absent.ABSENT.ABSNOTES, values);
	}

	/**
	 * Fetch records that have <code>absdeleted IN (values)</code>
	 */
	public List<com.mycompany.app.jooq.tables.pojos.Absent> fetchByAbsdeleted(Boolean... values) {
		return fetch(Absent.ABSENT.ABSDELETED, values);
	}
}
