/*
 * This file is generated by jOOQ.
*/
package generated.rx.vertx.vertx.tables;


import generated.rx.vertx.vertx.Indexes;
import generated.rx.vertx.vertx.Keys;
import generated.rx.vertx.vertx.Vertx;
import generated.rx.vertx.vertx.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.JsonObjectConverter;
import io.vertx.core.json.JsonObject;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Somethingcomposite extends TableImpl<SomethingcompositeRecord> {

    private static final long serialVersionUID = -1437450105;

    /**
     * The reference instance of <code>VERTX.SOMETHINGCOMPOSITE</code>
     */
    public static final Somethingcomposite SOMETHINGCOMPOSITE = new Somethingcomposite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SomethingcompositeRecord> getRecordType() {
        return SomethingcompositeRecord.class;
    }

    /**
     * The column <code>VERTX.SOMETHINGCOMPOSITE.SOMEID</code>.
     */
    public final TableField<SomethingcompositeRecord, Integer> SOMEID = createField("SOMEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VERTX.SOMETHINGCOMPOSITE.SOMESECONDID</code>.
     */
    public final TableField<SomethingcompositeRecord, Integer> SOMESECONDID = createField("SOMESECONDID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VERTX.SOMETHINGCOMPOSITE.SOMEJSONOBJECT</code>.
     */
    public final TableField<SomethingcompositeRecord, JsonObject> SOMEJSONOBJECT = createField("SOMEJSONOBJECT", org.jooq.impl.SQLDataType.VARCHAR(45), this, "", new JsonObjectConverter());

    /**
     * Create a <code>VERTX.SOMETHINGCOMPOSITE</code> table reference
     */
    public Somethingcomposite() {
        this(DSL.name("SOMETHINGCOMPOSITE"), null);
    }

    /**
     * Create an aliased <code>VERTX.SOMETHINGCOMPOSITE</code> table reference
     */
    public Somethingcomposite(String alias) {
        this(DSL.name(alias), SOMETHINGCOMPOSITE);
    }

    /**
     * Create an aliased <code>VERTX.SOMETHINGCOMPOSITE</code> table reference
     */
    public Somethingcomposite(Name alias) {
        this(alias, SOMETHINGCOMPOSITE);
    }

    private Somethingcomposite(Name alias, Table<SomethingcompositeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Somethingcomposite(Name alias, Table<SomethingcompositeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Vertx.VERTX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_IDX_SYS_PK_10347_10348);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SomethingcompositeRecord> getPrimaryKey() {
        return Keys.SYS_PK_10347;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SomethingcompositeRecord>> getKeys() {
        return Arrays.<UniqueKey<SomethingcompositeRecord>>asList(Keys.SYS_PK_10347);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Somethingcomposite as(String alias) {
        return new Somethingcomposite(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Somethingcomposite as(Name alias) {
        return new Somethingcomposite(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingcomposite rename(String name) {
        return new Somethingcomposite(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingcomposite rename(Name name) {
        return new Somethingcomposite(name, null);
    }
}
