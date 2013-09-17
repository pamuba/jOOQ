package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2718Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record> implements org.jooq.Record1<java.lang.Integer>, org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2718 {

	private static final long serialVersionUID = 1555315480;

	/**
	 * Setter for <code>PUBLIC.T_2718.XX</code>. 
	 */
	@Override
	public void setXx(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_2718.XX</code>. 
	 */
	@Override
	public java.lang.Integer getXx() {
		return (java.lang.Integer) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.T_2718.XX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getXx();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2718 from) {
		setXx(from.getXx());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2718> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2718Record
	 */
	public T_2718Record() {
		super(org.jooq.test.h2.generatedclasses.tables.T_2718.T_2718);
	}

	/**
	 * Create a detached, initialised T_2718Record
	 */
	public T_2718Record(java.lang.Integer xx) {
		super(org.jooq.test.h2.generatedclasses.tables.T_2718.T_2718);

		setValue(0, xx);
	}
}