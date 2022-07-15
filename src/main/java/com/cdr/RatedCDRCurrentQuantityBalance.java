/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.cdr;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RatedCDRCurrentQuantityBalance extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6260820411369141007L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RatedCDRCurrentQuantityBalance\",\"namespace\":\"com.cdr\",\"fields\":[{\"name\":\"cdrID\",\"type\":\"int\"},{\"name\":\"MSISDN_B\",\"type\":\"string\"},{\"name\":\"callTime\",\"type\":\"long\"},{\"name\":\"durationInSeconds\",\"type\":\"int\"},{\"name\":\"serviceName\",\"type\":\"string\",\"default\":\"sameOperatorCall\"},{\"name\":\"rate\",\"type\":{\"type\":\"bytes\",\"scale\":3,\"precision\":10,\"logicalType\":\"decimal\"}},{\"name\":\"isBilled\",\"type\":\"int\"},{\"name\":\"currentBalance\",\"type\":\"string\"},{\"name\":\"expirationDate\",\"type\":\"string\"},{\"name\":\"lastUpdate\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<RatedCDRCurrentQuantityBalance> ENCODER =
      new BinaryMessageEncoder<RatedCDRCurrentQuantityBalance>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RatedCDRCurrentQuantityBalance> DECODER =
      new BinaryMessageDecoder<RatedCDRCurrentQuantityBalance>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RatedCDRCurrentQuantityBalance> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RatedCDRCurrentQuantityBalance> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RatedCDRCurrentQuantityBalance> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RatedCDRCurrentQuantityBalance>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RatedCDRCurrentQuantityBalance to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RatedCDRCurrentQuantityBalance from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RatedCDRCurrentQuantityBalance instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RatedCDRCurrentQuantityBalance fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private int cdrID;
  private java.lang.CharSequence MSISDN_B;
  private long callTime;
  private int durationInSeconds;
  private java.lang.CharSequence serviceName;
  private java.nio.ByteBuffer rate;
  private int isBilled;
  private java.lang.CharSequence currentBalance;
  private java.lang.CharSequence expirationDate;
  private java.time.Instant lastUpdate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RatedCDRCurrentQuantityBalance() {}

  /**
   * All-args constructor.
   * @param cdrID The new value for cdrID
   * @param MSISDN_B The new value for MSISDN_B
   * @param callTime The new value for callTime
   * @param durationInSeconds The new value for durationInSeconds
   * @param serviceName The new value for serviceName
   * @param rate The new value for rate
   * @param isBilled The new value for isBilled
   * @param currentBalance The new value for currentBalance
   * @param expirationDate The new value for expirationDate
   * @param lastUpdate The new value for lastUpdate
   */
  public RatedCDRCurrentQuantityBalance(java.lang.Integer cdrID, java.lang.CharSequence MSISDN_B, java.lang.Long callTime, java.lang.Integer durationInSeconds, java.lang.CharSequence serviceName, java.nio.ByteBuffer rate, java.lang.Integer isBilled, java.lang.CharSequence currentBalance, java.lang.CharSequence expirationDate, java.time.Instant lastUpdate) {
    this.cdrID = cdrID;
    this.MSISDN_B = MSISDN_B;
    this.callTime = callTime;
    this.durationInSeconds = durationInSeconds;
    this.serviceName = serviceName;
    this.rate = rate;
    this.isBilled = isBilled;
    this.currentBalance = currentBalance;
    this.expirationDate = expirationDate;
    this.lastUpdate = lastUpdate.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return cdrID;
    case 1: return MSISDN_B;
    case 2: return callTime;
    case 3: return durationInSeconds;
    case 4: return serviceName;
    case 5: return rate;
    case 6: return isBilled;
    case 7: return currentBalance;
    case 8: return expirationDate;
    case 9: return lastUpdate;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: cdrID = (java.lang.Integer)value$; break;
    case 1: MSISDN_B = (java.lang.CharSequence)value$; break;
    case 2: callTime = (java.lang.Long)value$; break;
    case 3: durationInSeconds = (java.lang.Integer)value$; break;
    case 4: serviceName = (java.lang.CharSequence)value$; break;
    case 5: rate = (java.nio.ByteBuffer)value$; break;
    case 6: isBilled = (java.lang.Integer)value$; break;
    case 7: currentBalance = (java.lang.CharSequence)value$; break;
    case 8: expirationDate = (java.lang.CharSequence)value$; break;
    case 9: lastUpdate = (java.time.Instant)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'cdrID' field.
   * @return The value of the 'cdrID' field.
   */
  public int getCdrID() {
    return cdrID;
  }


  /**
   * Sets the value of the 'cdrID' field.
   * @param value the value to set.
   */
  public void setCdrID(int value) {
    this.cdrID = value;
  }

  /**
   * Gets the value of the 'MSISDN_B' field.
   * @return The value of the 'MSISDN_B' field.
   */
  public java.lang.CharSequence getMSISDNB() {
    return MSISDN_B;
  }


  /**
   * Sets the value of the 'MSISDN_B' field.
   * @param value the value to set.
   */
  public void setMSISDNB(java.lang.CharSequence value) {
    this.MSISDN_B = value;
  }

  /**
   * Gets the value of the 'callTime' field.
   * @return The value of the 'callTime' field.
   */
  public long getCallTime() {
    return callTime;
  }


  /**
   * Sets the value of the 'callTime' field.
   * @param value the value to set.
   */
  public void setCallTime(long value) {
    this.callTime = value;
  }

  /**
   * Gets the value of the 'durationInSeconds' field.
   * @return The value of the 'durationInSeconds' field.
   */
  public int getDurationInSeconds() {
    return durationInSeconds;
  }


  /**
   * Sets the value of the 'durationInSeconds' field.
   * @param value the value to set.
   */
  public void setDurationInSeconds(int value) {
    this.durationInSeconds = value;
  }

  /**
   * Gets the value of the 'serviceName' field.
   * @return The value of the 'serviceName' field.
   */
  public java.lang.CharSequence getServiceName() {
    return serviceName;
  }


  /**
   * Sets the value of the 'serviceName' field.
   * @param value the value to set.
   */
  public void setServiceName(java.lang.CharSequence value) {
    this.serviceName = value;
  }

  /**
   * Gets the value of the 'rate' field.
   * @return The value of the 'rate' field.
   */
  public java.nio.ByteBuffer getRate() {
    return rate;
  }


  /**
   * Sets the value of the 'rate' field.
   * @param value the value to set.
   */
  public void setRate(java.nio.ByteBuffer value) {
    this.rate = value;
  }

  /**
   * Gets the value of the 'isBilled' field.
   * @return The value of the 'isBilled' field.
   */
  public int getIsBilled() {
    return isBilled;
  }


  /**
   * Sets the value of the 'isBilled' field.
   * @param value the value to set.
   */
  public void setIsBilled(int value) {
    this.isBilled = value;
  }

  /**
   * Gets the value of the 'currentBalance' field.
   * @return The value of the 'currentBalance' field.
   */
  public java.lang.CharSequence getCurrentBalance() {
    return currentBalance;
  }


  /**
   * Sets the value of the 'currentBalance' field.
   * @param value the value to set.
   */
  public void setCurrentBalance(java.lang.CharSequence value) {
    this.currentBalance = value;
  }

  /**
   * Gets the value of the 'expirationDate' field.
   * @return The value of the 'expirationDate' field.
   */
  public java.lang.CharSequence getExpirationDate() {
    return expirationDate;
  }


  /**
   * Sets the value of the 'expirationDate' field.
   * @param value the value to set.
   */
  public void setExpirationDate(java.lang.CharSequence value) {
    this.expirationDate = value;
  }

  /**
   * Gets the value of the 'lastUpdate' field.
   * @return The value of the 'lastUpdate' field.
   */
  public java.time.Instant getLastUpdate() {
    return lastUpdate;
  }


  /**
   * Sets the value of the 'lastUpdate' field.
   * @param value the value to set.
   */
  public void setLastUpdate(java.time.Instant value) {
    this.lastUpdate = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Creates a new RatedCDRCurrentQuantityBalance RecordBuilder.
   * @return A new RatedCDRCurrentQuantityBalance RecordBuilder
   */
  public static com.cdr.RatedCDRCurrentQuantityBalance.Builder newBuilder() {
    return new com.cdr.RatedCDRCurrentQuantityBalance.Builder();
  }

  /**
   * Creates a new RatedCDRCurrentQuantityBalance RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RatedCDRCurrentQuantityBalance RecordBuilder
   */
  public static com.cdr.RatedCDRCurrentQuantityBalance.Builder newBuilder(com.cdr.RatedCDRCurrentQuantityBalance.Builder other) {
    if (other == null) {
      return new com.cdr.RatedCDRCurrentQuantityBalance.Builder();
    } else {
      return new com.cdr.RatedCDRCurrentQuantityBalance.Builder(other);
    }
  }

  /**
   * Creates a new RatedCDRCurrentQuantityBalance RecordBuilder by copying an existing RatedCDRCurrentQuantityBalance instance.
   * @param other The existing instance to copy.
   * @return A new RatedCDRCurrentQuantityBalance RecordBuilder
   */
  public static com.cdr.RatedCDRCurrentQuantityBalance.Builder newBuilder(com.cdr.RatedCDRCurrentQuantityBalance other) {
    if (other == null) {
      return new com.cdr.RatedCDRCurrentQuantityBalance.Builder();
    } else {
      return new com.cdr.RatedCDRCurrentQuantityBalance.Builder(other);
    }
  }

  /**
   * RecordBuilder for RatedCDRCurrentQuantityBalance instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RatedCDRCurrentQuantityBalance>
    implements org.apache.avro.data.RecordBuilder<RatedCDRCurrentQuantityBalance> {

    private int cdrID;
    private java.lang.CharSequence MSISDN_B;
    private long callTime;
    private int durationInSeconds;
    private java.lang.CharSequence serviceName;
    private java.nio.ByteBuffer rate;
    private int isBilled;
    private java.lang.CharSequence currentBalance;
    private java.lang.CharSequence expirationDate;
    private java.time.Instant lastUpdate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.cdr.RatedCDRCurrentQuantityBalance.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.cdrID)) {
        this.cdrID = data().deepCopy(fields()[0].schema(), other.cdrID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.MSISDN_B)) {
        this.MSISDN_B = data().deepCopy(fields()[1].schema(), other.MSISDN_B);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.callTime)) {
        this.callTime = data().deepCopy(fields()[2].schema(), other.callTime);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.durationInSeconds)) {
        this.durationInSeconds = data().deepCopy(fields()[3].schema(), other.durationInSeconds);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[4].schema(), other.serviceName);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.rate)) {
        this.rate = data().deepCopy(fields()[5].schema(), other.rate);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.isBilled)) {
        this.isBilled = data().deepCopy(fields()[6].schema(), other.isBilled);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.currentBalance)) {
        this.currentBalance = data().deepCopy(fields()[7].schema(), other.currentBalance);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.expirationDate)) {
        this.expirationDate = data().deepCopy(fields()[8].schema(), other.expirationDate);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.lastUpdate)) {
        this.lastUpdate = data().deepCopy(fields()[9].schema(), other.lastUpdate);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
    }

    /**
     * Creates a Builder by copying an existing RatedCDRCurrentQuantityBalance instance
     * @param other The existing instance to copy.
     */
    private Builder(com.cdr.RatedCDRCurrentQuantityBalance other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.cdrID)) {
        this.cdrID = data().deepCopy(fields()[0].schema(), other.cdrID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.MSISDN_B)) {
        this.MSISDN_B = data().deepCopy(fields()[1].schema(), other.MSISDN_B);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.callTime)) {
        this.callTime = data().deepCopy(fields()[2].schema(), other.callTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.durationInSeconds)) {
        this.durationInSeconds = data().deepCopy(fields()[3].schema(), other.durationInSeconds);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[4].schema(), other.serviceName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.rate)) {
        this.rate = data().deepCopy(fields()[5].schema(), other.rate);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.isBilled)) {
        this.isBilled = data().deepCopy(fields()[6].schema(), other.isBilled);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.currentBalance)) {
        this.currentBalance = data().deepCopy(fields()[7].schema(), other.currentBalance);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.expirationDate)) {
        this.expirationDate = data().deepCopy(fields()[8].schema(), other.expirationDate);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.lastUpdate)) {
        this.lastUpdate = data().deepCopy(fields()[9].schema(), other.lastUpdate);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'cdrID' field.
      * @return The value.
      */
    public int getCdrID() {
      return cdrID;
    }


    /**
      * Sets the value of the 'cdrID' field.
      * @param value The value of 'cdrID'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setCdrID(int value) {
      validate(fields()[0], value);
      this.cdrID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'cdrID' field has been set.
      * @return True if the 'cdrID' field has been set, false otherwise.
      */
    public boolean hasCdrID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'cdrID' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearCdrID() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'MSISDN_B' field.
      * @return The value.
      */
    public java.lang.CharSequence getMSISDNB() {
      return MSISDN_B;
    }


    /**
      * Sets the value of the 'MSISDN_B' field.
      * @param value The value of 'MSISDN_B'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setMSISDNB(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.MSISDN_B = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'MSISDN_B' field has been set.
      * @return True if the 'MSISDN_B' field has been set, false otherwise.
      */
    public boolean hasMSISDNB() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'MSISDN_B' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearMSISDNB() {
      MSISDN_B = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'callTime' field.
      * @return The value.
      */
    public long getCallTime() {
      return callTime;
    }


    /**
      * Sets the value of the 'callTime' field.
      * @param value The value of 'callTime'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setCallTime(long value) {
      validate(fields()[2], value);
      this.callTime = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'callTime' field has been set.
      * @return True if the 'callTime' field has been set, false otherwise.
      */
    public boolean hasCallTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'callTime' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearCallTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'durationInSeconds' field.
      * @return The value.
      */
    public int getDurationInSeconds() {
      return durationInSeconds;
    }


    /**
      * Sets the value of the 'durationInSeconds' field.
      * @param value The value of 'durationInSeconds'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setDurationInSeconds(int value) {
      validate(fields()[3], value);
      this.durationInSeconds = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'durationInSeconds' field has been set.
      * @return True if the 'durationInSeconds' field has been set, false otherwise.
      */
    public boolean hasDurationInSeconds() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'durationInSeconds' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearDurationInSeconds() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'serviceName' field.
      * @return The value.
      */
    public java.lang.CharSequence getServiceName() {
      return serviceName;
    }


    /**
      * Sets the value of the 'serviceName' field.
      * @param value The value of 'serviceName'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setServiceName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.serviceName = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceName' field has been set.
      * @return True if the 'serviceName' field has been set, false otherwise.
      */
    public boolean hasServiceName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'serviceName' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearServiceName() {
      serviceName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'rate' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getRate() {
      return rate;
    }


    /**
      * Sets the value of the 'rate' field.
      * @param value The value of 'rate'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setRate(java.nio.ByteBuffer value) {
      validate(fields()[5], value);
      this.rate = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'rate' field has been set.
      * @return True if the 'rate' field has been set, false otherwise.
      */
    public boolean hasRate() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'rate' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearRate() {
      rate = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'isBilled' field.
      * @return The value.
      */
    public int getIsBilled() {
      return isBilled;
    }


    /**
      * Sets the value of the 'isBilled' field.
      * @param value The value of 'isBilled'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setIsBilled(int value) {
      validate(fields()[6], value);
      this.isBilled = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'isBilled' field has been set.
      * @return True if the 'isBilled' field has been set, false otherwise.
      */
    public boolean hasIsBilled() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'isBilled' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearIsBilled() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'currentBalance' field.
      * @return The value.
      */
    public java.lang.CharSequence getCurrentBalance() {
      return currentBalance;
    }


    /**
      * Sets the value of the 'currentBalance' field.
      * @param value The value of 'currentBalance'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setCurrentBalance(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.currentBalance = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'currentBalance' field has been set.
      * @return True if the 'currentBalance' field has been set, false otherwise.
      */
    public boolean hasCurrentBalance() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'currentBalance' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearCurrentBalance() {
      currentBalance = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'expirationDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getExpirationDate() {
      return expirationDate;
    }


    /**
      * Sets the value of the 'expirationDate' field.
      * @param value The value of 'expirationDate'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setExpirationDate(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.expirationDate = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'expirationDate' field has been set.
      * @return True if the 'expirationDate' field has been set, false otherwise.
      */
    public boolean hasExpirationDate() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'expirationDate' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearExpirationDate() {
      expirationDate = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastUpdate' field.
      * @return The value.
      */
    public java.time.Instant getLastUpdate() {
      return lastUpdate;
    }


    /**
      * Sets the value of the 'lastUpdate' field.
      * @param value The value of 'lastUpdate'.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder setLastUpdate(java.time.Instant value) {
      validate(fields()[9], value);
      this.lastUpdate = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'lastUpdate' field has been set.
      * @return True if the 'lastUpdate' field has been set, false otherwise.
      */
    public boolean hasLastUpdate() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'lastUpdate' field.
      * @return This builder.
      */
    public com.cdr.RatedCDRCurrentQuantityBalance.Builder clearLastUpdate() {
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RatedCDRCurrentQuantityBalance build() {
      try {
        RatedCDRCurrentQuantityBalance record = new RatedCDRCurrentQuantityBalance();
        record.cdrID = fieldSetFlags()[0] ? this.cdrID : (java.lang.Integer) defaultValue(fields()[0]);
        record.MSISDN_B = fieldSetFlags()[1] ? this.MSISDN_B : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.callTime = fieldSetFlags()[2] ? this.callTime : (java.lang.Long) defaultValue(fields()[2]);
        record.durationInSeconds = fieldSetFlags()[3] ? this.durationInSeconds : (java.lang.Integer) defaultValue(fields()[3]);
        record.serviceName = fieldSetFlags()[4] ? this.serviceName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.rate = fieldSetFlags()[5] ? this.rate : (java.nio.ByteBuffer) defaultValue(fields()[5]);
        record.isBilled = fieldSetFlags()[6] ? this.isBilled : (java.lang.Integer) defaultValue(fields()[6]);
        record.currentBalance = fieldSetFlags()[7] ? this.currentBalance : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.expirationDate = fieldSetFlags()[8] ? this.expirationDate : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.lastUpdate = fieldSetFlags()[9] ? this.lastUpdate : (java.time.Instant) defaultValue(fields()[9]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RatedCDRCurrentQuantityBalance>
    WRITER$ = (org.apache.avro.io.DatumWriter<RatedCDRCurrentQuantityBalance>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RatedCDRCurrentQuantityBalance>
    READER$ = (org.apache.avro.io.DatumReader<RatedCDRCurrentQuantityBalance>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










