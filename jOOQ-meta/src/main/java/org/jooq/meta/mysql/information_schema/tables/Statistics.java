/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.mysql.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.mysql.information_schema.InformationSchema;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Statistics extends TableImpl<Record> {

    private static final long serialVersionUID = 711396970;

    /**
     * The reference instance of <code>information_schema.STATISTICS</code>
     */
    public static final Statistics STATISTICS = new Statistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
     */
    public static final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
     */
    public static final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.TABLE_NAME</code>.
     */
    public static final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.NON_UNIQUE</code>.
     */
    public static final TableField<Record, Integer> NON_UNIQUE = createField(DSL.name("NON_UNIQUE"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
     */
    public static final TableField<Record, String> INDEX_SCHEMA = createField(DSL.name("INDEX_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_NAME</code>.
     */
    public static final TableField<Record, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
     */
    public static final TableField<Record, UInteger> SEQ_IN_INDEX = createField(DSL.name("SEQ_IN_INDEX"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.COLUMN_NAME</code>.
     */
    public static final TableField<Record, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.COLLATION</code>.
     */
    public static final TableField<Record, String> COLLATION = createField(DSL.name("COLLATION"), org.jooq.impl.SQLDataType.VARCHAR(1), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.CARDINALITY</code>.
     */
    public static final TableField<Record, Long> CARDINALITY = createField(DSL.name("CARDINALITY"), org.jooq.impl.SQLDataType.BIGINT, STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.SUB_PART</code>.
     */
    public static final TableField<Record, Long> SUB_PART = createField(DSL.name("SUB_PART"), org.jooq.impl.SQLDataType.BIGINT, STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.PACKED</code>.
     */
    public static final TableField<Record, byte[]> PACKED = createField(DSL.name("PACKED"), org.jooq.impl.SQLDataType.BINARY, STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.NULLABLE</code>.
     */
    public static final TableField<Record, String> NULLABLE = createField(DSL.name("NULLABLE"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_TYPE</code>.
     */
    public static final TableField<Record, String> INDEX_TYPE = createField(DSL.name("INDEX_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(11).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.COMMENT</code>.
     */
    public static final TableField<Record, String> COMMENT = createField(DSL.name("COMMENT"), org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
     */
    public static final TableField<Record, String> INDEX_COMMENT = createField(DSL.name("INDEX_COMMENT"), org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.IS_VISIBLE</code>.
     */
    public static final TableField<Record, String> IS_VISIBLE = createField(DSL.name("IS_VISIBLE"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.EXPRESSION</code>.
     */
    public static final TableField<Record, String> EXPRESSION = createField(DSL.name("EXPRESSION"), org.jooq.impl.SQLDataType.CLOB, STATISTICS, "");

    /**
     * No further instances allowed
     */
    private Statistics() {
        this(DSL.name("STATISTICS"), null);
    }

    private Statistics(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Statistics(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Statistics(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, STATISTICS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
