/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import org.eclipse.openvsx.jooq.tables.NamespaceMembership;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NamespaceMembershipRecord extends UpdatableRecordImpl<NamespaceMembershipRecord> implements Record4<Long, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.namespace_membership.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.namespace_membership.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.namespace_membership.role</code>.
     */
    public void setRole(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.namespace_membership.role</code>.
     */
    public String getRole() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.namespace_membership.namespace</code>.
     */
    public void setNamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.namespace_membership.namespace</code>.
     */
    public Long getNamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.namespace_membership.user_data</code>.
     */
    public void setUserData(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.namespace_membership.user_data</code>.
     */
    public Long getUserData() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return NamespaceMembership.NAMESPACE_MEMBERSHIP.ID;
    }

    @Override
    public Field<String> field2() {
        return NamespaceMembership.NAMESPACE_MEMBERSHIP.ROLE;
    }

    @Override
    public Field<Long> field3() {
        return NamespaceMembership.NAMESPACE_MEMBERSHIP.NAMESPACE;
    }

    @Override
    public Field<Long> field4() {
        return NamespaceMembership.NAMESPACE_MEMBERSHIP.USER_DATA;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getRole();
    }

    @Override
    public Long component3() {
        return getNamespace();
    }

    @Override
    public Long component4() {
        return getUserData();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getRole();
    }

    @Override
    public Long value3() {
        return getNamespace();
    }

    @Override
    public Long value4() {
        return getUserData();
    }

    @Override
    public NamespaceMembershipRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public NamespaceMembershipRecord value2(String value) {
        setRole(value);
        return this;
    }

    @Override
    public NamespaceMembershipRecord value3(Long value) {
        setNamespace(value);
        return this;
    }

    @Override
    public NamespaceMembershipRecord value4(Long value) {
        setUserData(value);
        return this;
    }

    @Override
    public NamespaceMembershipRecord values(Long value1, String value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NamespaceMembershipRecord
     */
    public NamespaceMembershipRecord() {
        super(NamespaceMembership.NAMESPACE_MEMBERSHIP);
    }

    /**
     * Create a detached, initialised NamespaceMembershipRecord
     */
    public NamespaceMembershipRecord(Long id, String role, Long namespace, Long userData) {
        super(NamespaceMembership.NAMESPACE_MEMBERSHIP);

        setId(id);
        setRole(role);
        setNamespace(namespace);
        setUserData(userData);
    }
}
