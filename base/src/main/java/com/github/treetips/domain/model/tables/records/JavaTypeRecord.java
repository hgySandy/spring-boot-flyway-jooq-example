/**
 * This class is generated by jOOQ
 */
package com.github.treetips.domain.model.tables.records;


import com.github.treetips.domain.model.enums.JavaTypeEnumType;
import com.github.treetips.domain.model.tables.JavaType;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;


/**
 * java型確認マスタ
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JavaTypeRecord extends TableRecordImpl<JavaTypeRecord> {

	private static final long serialVersionUID = 1491219642;

	/**
	 * Setter for <code>test.java_type.char_type</code>.
	 */
	public void setCharType(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test.java_type.char_type</code>.
	 */
	public String getCharType() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>test.java_type.varchar_type</code>.
	 */
	public void setVarcharType(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test.java_type.varchar_type</code>.
	 */
	public String getVarcharType() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>test.java_type.tinytext_type</code>.
	 */
	public void setTinytextType(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>test.java_type.tinytext_type</code>.
	 */
	public String getTinytextType() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>test.java_type.text_type</code>.
	 */
	public void setTextType(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>test.java_type.text_type</code>.
	 */
	public String getTextType() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>test.java_type.mediumtext_type</code>.
	 */
	public void setMediumtextType(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>test.java_type.mediumtext_type</code>.
	 */
	public String getMediumtextType() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>test.java_type.longtext_type</code>.
	 */
	public void setLongtextType(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>test.java_type.longtext_type</code>.
	 */
	public String getLongtextType() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>test.java_type.tinyint_type</code>.
	 */
	public void setTinyintType(Byte value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>test.java_type.tinyint_type</code>.
	 */
	public Byte getTinyintType() {
		return (Byte) getValue(6);
	}

	/**
	 * Setter for <code>test.java_type.smallint_type</code>.
	 */
	public void setSmallintType(Short value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>test.java_type.smallint_type</code>.
	 */
	public Short getSmallintType() {
		return (Short) getValue(7);
	}

	/**
	 * Setter for <code>test.java_type.mediumint_type</code>.
	 */
	public void setMediumintType(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>test.java_type.mediumint_type</code>.
	 */
	public Integer getMediumintType() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>test.java_type.int_type</code>.
	 */
	public void setIntType(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>test.java_type.int_type</code>.
	 */
	public Integer getIntType() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>test.java_type.bigint_type</code>.
	 */
	public void setBigintType(Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>test.java_type.bigint_type</code>.
	 */
	public Long getBigintType() {
		return (Long) getValue(10);
	}

	/**
	 * Setter for <code>test.java_type.float_type</code>.
	 */
	public void setFloatType(Double value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>test.java_type.float_type</code>.
	 */
	public Double getFloatType() {
		return (Double) getValue(11);
	}

	/**
	 * Setter for <code>test.java_type.double_type</code>.
	 */
	public void setDoubleType(Double value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>test.java_type.double_type</code>.
	 */
	public Double getDoubleType() {
		return (Double) getValue(12);
	}

	/**
	 * Setter for <code>test.java_type.date_type</code>.
	 */
	public void setDateType(Date value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>test.java_type.date_type</code>.
	 */
	public Date getDateType() {
		return (Date) getValue(13);
	}

	/**
	 * Setter for <code>test.java_type.datetime_type</code>.
	 */
	public void setDatetimeType(Timestamp value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>test.java_type.datetime_type</code>.
	 */
	public Timestamp getDatetimeType() {
		return (Timestamp) getValue(14);
	}

	/**
	 * Setter for <code>test.java_type.timestamp_type</code>.
	 */
	public void setTimestampType(Timestamp value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>test.java_type.timestamp_type</code>.
	 */
	public Timestamp getTimestampType() {
		return (Timestamp) getValue(15);
	}

	/**
	 * Setter for <code>test.java_type.time_stype</code>.
	 */
	public void setTimeStype(Time value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>test.java_type.time_stype</code>.
	 */
	public Time getTimeStype() {
		return (Time) getValue(16);
	}

	/**
	 * Setter for <code>test.java_type.year_type</code>.
	 */
	public void setYearType(Date value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>test.java_type.year_type</code>.
	 */
	public Date getYearType() {
		return (Date) getValue(17);
	}

	/**
	 * Setter for <code>test.java_type.binary_type</code>.
	 */
	public void setBinaryType(byte[] value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>test.java_type.binary_type</code>.
	 */
	public byte[] getBinaryType() {
		return (byte[]) getValue(18);
	}

	/**
	 * Setter for <code>test.java_type.varbinary_type</code>.
	 */
	public void setVarbinaryType(byte[] value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>test.java_type.varbinary_type</code>.
	 */
	public byte[] getVarbinaryType() {
		return (byte[]) getValue(19);
	}

	/**
	 * Setter for <code>test.java_type.tinyblob_type</code>.
	 */
	public void setTinyblobType(byte[] value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>test.java_type.tinyblob_type</code>.
	 */
	public byte[] getTinyblobType() {
		return (byte[]) getValue(20);
	}

	/**
	 * Setter for <code>test.java_type.blob_type</code>.
	 */
	public void setBlobType(byte[] value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>test.java_type.blob_type</code>.
	 */
	public byte[] getBlobType() {
		return (byte[]) getValue(21);
	}

	/**
	 * Setter for <code>test.java_type.mediumblob_type</code>.
	 */
	public void setMediumblobType(byte[] value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>test.java_type.mediumblob_type</code>.
	 */
	public byte[] getMediumblobType() {
		return (byte[]) getValue(22);
	}

	/**
	 * Setter for <code>test.java_type.longblog_type</code>.
	 */
	public void setLongblogType(byte[] value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>test.java_type.longblog_type</code>.
	 */
	public byte[] getLongblogType() {
		return (byte[]) getValue(23);
	}

	/**
	 * Setter for <code>test.java_type.enum_type</code>.
	 */
	public void setEnumType(JavaTypeEnumType value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>test.java_type.enum_type</code>.
	 */
	public JavaTypeEnumType getEnumType() {
		return (JavaTypeEnumType) getValue(24);
	}

	/**
	 * Setter for <code>test.java_type.set_type</code>.
	 */
	public void setSetType(String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>test.java_type.set_type</code>.
	 */
	public String getSetType() {
		return (String) getValue(25);
	}

	/**
	 * Setter for <code>test.java_type.geometry_type</code>.
	 */
	public void setGeometryType(Object value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>test.java_type.geometry_type</code>.
	 */
	public Object getGeometryType() {
		return (Object) getValue(26);
	}

	/**
	 * Setter for <code>test.java_type.point_type</code>.
	 */
	public void setPointType(Object value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>test.java_type.point_type</code>.
	 */
	public Object getPointType() {
		return (Object) getValue(27);
	}

	/**
	 * Setter for <code>test.java_type.linestring_type</code>.
	 */
	public void setLinestringType(Object value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>test.java_type.linestring_type</code>.
	 */
	public Object getLinestringType() {
		return (Object) getValue(28);
	}

	/**
	 * Setter for <code>test.java_type.polygon_type</code>.
	 */
	public void setPolygonType(Object value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>test.java_type.polygon_type</code>.
	 */
	public Object getPolygonType() {
		return (Object) getValue(29);
	}

	/**
	 * Setter for <code>test.java_type.multipoint_type</code>.
	 */
	public void setMultipointType(Object value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>test.java_type.multipoint_type</code>.
	 */
	public Object getMultipointType() {
		return (Object) getValue(30);
	}

	/**
	 * Setter for <code>test.java_type.multilinestring_type</code>.
	 */
	public void setMultilinestringType(Object value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>test.java_type.multilinestring_type</code>.
	 */
	public Object getMultilinestringType() {
		return (Object) getValue(31);
	}

	/**
	 * Setter for <code>test.java_type.multipolygon_type</code>.
	 */
	public void setMultipolygonType(Object value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>test.java_type.multipolygon_type</code>.
	 */
	public Object getMultipolygonType() {
		return (Object) getValue(32);
	}

	/**
	 * Setter for <code>test.java_type.geometrycollection_type</code>.
	 */
	public void setGeometrycollectionType(Object value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>test.java_type.geometrycollection_type</code>.
	 */
	public Object getGeometrycollectionType() {
		return (Object) getValue(33);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JavaTypeRecord
	 */
	public JavaTypeRecord() {
		super(JavaType.JAVA_TYPE);
	}

	/**
	 * Create a detached, initialised JavaTypeRecord
	 */
	public JavaTypeRecord(String charType, String varcharType, String tinytextType, String textType, String mediumtextType, String longtextType, Byte tinyintType, Short smallintType, Integer mediumintType, Integer intType, Long bigintType, Double floatType, Double doubleType, Date dateType, Timestamp datetimeType, Timestamp timestampType, Time timeStype, Date yearType, byte[] binaryType, byte[] varbinaryType, byte[] tinyblobType, byte[] blobType, byte[] mediumblobType, byte[] longblogType, JavaTypeEnumType enumType, String setType, Object geometryType, Object pointType, Object linestringType, Object polygonType, Object multipointType, Object multilinestringType, Object multipolygonType, Object geometrycollectionType) {
		super(JavaType.JAVA_TYPE);

		setValue(0, charType);
		setValue(1, varcharType);
		setValue(2, tinytextType);
		setValue(3, textType);
		setValue(4, mediumtextType);
		setValue(5, longtextType);
		setValue(6, tinyintType);
		setValue(7, smallintType);
		setValue(8, mediumintType);
		setValue(9, intType);
		setValue(10, bigintType);
		setValue(11, floatType);
		setValue(12, doubleType);
		setValue(13, dateType);
		setValue(14, datetimeType);
		setValue(15, timestampType);
		setValue(16, timeStype);
		setValue(17, yearType);
		setValue(18, binaryType);
		setValue(19, varbinaryType);
		setValue(20, tinyblobType);
		setValue(21, blobType);
		setValue(22, mediumblobType);
		setValue(23, longblogType);
		setValue(24, enumType);
		setValue(25, setType);
		setValue(26, geometryType);
		setValue(27, pointType);
		setValue(28, linestringType);
		setValue(29, polygonType);
		setValue(30, multipointType);
		setValue(31, multilinestringType);
		setValue(32, multipolygonType);
		setValue(33, geometrycollectionType);
	}
}
