/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = -1013713164;

	/**
	 * The singleton instance of t_identity
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.ingres.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord> __RECORD_TYPE = org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		super("t_identity", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.ingres.generatedclasses.Keys.IDENTITY_t_identity;
	}
}
