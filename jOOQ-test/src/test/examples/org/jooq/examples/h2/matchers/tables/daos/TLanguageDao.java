/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLanguageDao extends org.jooq.impl.DAOImpl<org.jooq.examples.h2.matchers.tables.records.TLanguageRecord, org.jooq.examples.h2.matchers.tables.pojos.TLanguage, java.lang.Integer> {

	/**
	 * Create a new TLanguageDao without any configuration
	 */
	public TLanguageDao() {
		super(org.jooq.examples.h2.matchers.tables.TLanguage.T_LANGUAGE, org.jooq.examples.h2.matchers.tables.pojos.TLanguage.class);
	}

	/**
	 * Create a new TLanguageDao with an attached configuration
	 */
	public TLanguageDao(org.jooq.Configuration configuration) {
		super(org.jooq.examples.h2.matchers.tables.TLanguage.T_LANGUAGE, org.jooq.examples.h2.matchers.tables.pojos.TLanguage.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.examples.h2.matchers.tables.pojos.TLanguage object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>CD IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TLanguage> fetchByCd(java.lang.String... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TLanguage.CD, values);
	}

	/**
	 * Fetch records that have <code>DESCRIPTION IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TLanguage> fetchByDescription(java.lang.String... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TLanguage.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>DESCRIPTION_ENGLISH IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TLanguage> fetchByDescriptionEnglish(java.lang.String... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TLanguage.DESCRIPTION_ENGLISH, values);
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TLanguage> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TLanguage.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.examples.h2.matchers.tables.pojos.TLanguage fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.examples.h2.matchers.tables.TLanguage.ID, value);
	}
}