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
public class CurrentQuantityBalanceCompositeKey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3803405881258356384L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CurrentQuantityBalanceCompositeKey\",\"namespace\":\"com.cdr\",\"fields\":[{\"name\":\"MSISDN\",\"type\":\"string\"},{\"name\":\"quantityTypeID\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CurrentQuantityBalanceCompositeKey> ENCODER =
      new BinaryMessageEncoder<CurrentQuantityBalanceCompositeKey>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CurrentQuantityBalanceCompositeKey> DECODER =
      new BinaryMessageDecoder<CurrentQuantityBalanceCompositeKey>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CurrentQuantityBalanceCompositeKey> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CurrentQuantityBalanceCompositeKey> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CurrentQuantityBalanceCompositeKey> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CurrentQuantityBalanceCompositeKey>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CurrentQuantityBalanceCompositeKey to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CurrentQuantityBalanceCompositeKey from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CurrentQuantityBalanceCompositeKey instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CurrentQuantityBalanceCompositeKey fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence MSISDN;
  private int quantityTypeID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CurrentQuantityBalanceCompositeKey() {}

  /**
   * All-args constructor.
   * @param MSISDN The new value for MSISDN
   * @param quantityTypeID The new value for quantityTypeID
   */
  public CurrentQuantityBalanceCompositeKey(java.lang.CharSequence MSISDN, java.lang.Integer quantityTypeID) {
    this.MSISDN = MSISDN;
    this.quantityTypeID = quantityTypeID;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return MSISDN;
    case 1: return quantityTypeID;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: MSISDN = (java.lang.CharSequence)value$; break;
    case 1: quantityTypeID = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'MSISDN' field.
   * @return The value of the 'MSISDN' field.
   */
  public java.lang.CharSequence getMSISDN() {
    return MSISDN;
  }


  /**
   * Sets the value of the 'MSISDN' field.
   * @param value the value to set.
   */
  public void setMSISDN(java.lang.CharSequence value) {
    this.MSISDN = value;
  }

  /**
   * Gets the value of the 'quantityTypeID' field.
   * @return The value of the 'quantityTypeID' field.
   */
  public int getQuantityTypeID() {
    return quantityTypeID;
  }


  /**
   * Sets the value of the 'quantityTypeID' field.
   * @param value the value to set.
   */
  public void setQuantityTypeID(int value) {
    this.quantityTypeID = value;
  }

  /**
   * Creates a new CurrentQuantityBalanceCompositeKey RecordBuilder.
   * @return A new CurrentQuantityBalanceCompositeKey RecordBuilder
   */
  public static com.cdr.CurrentQuantityBalanceCompositeKey.Builder newBuilder() {
    return new com.cdr.CurrentQuantityBalanceCompositeKey.Builder();
  }

  /**
   * Creates a new CurrentQuantityBalanceCompositeKey RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CurrentQuantityBalanceCompositeKey RecordBuilder
   */
  public static com.cdr.CurrentQuantityBalanceCompositeKey.Builder newBuilder(com.cdr.CurrentQuantityBalanceCompositeKey.Builder other) {
    if (other == null) {
      return new com.cdr.CurrentQuantityBalanceCompositeKey.Builder();
    } else {
      return new com.cdr.CurrentQuantityBalanceCompositeKey.Builder(other);
    }
  }

  /**
   * Creates a new CurrentQuantityBalanceCompositeKey RecordBuilder by copying an existing CurrentQuantityBalanceCompositeKey instance.
   * @param other The existing instance to copy.
   * @return A new CurrentQuantityBalanceCompositeKey RecordBuilder
   */
  public static com.cdr.CurrentQuantityBalanceCompositeKey.Builder newBuilder(com.cdr.CurrentQuantityBalanceCompositeKey other) {
    if (other == null) {
      return new com.cdr.CurrentQuantityBalanceCompositeKey.Builder();
    } else {
      return new com.cdr.CurrentQuantityBalanceCompositeKey.Builder(other);
    }
  }

  /**
   * RecordBuilder for CurrentQuantityBalanceCompositeKey instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CurrentQuantityBalanceCompositeKey>
    implements org.apache.avro.data.RecordBuilder<CurrentQuantityBalanceCompositeKey> {

    private java.lang.CharSequence MSISDN;
    private int quantityTypeID;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.cdr.CurrentQuantityBalanceCompositeKey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.MSISDN)) {
        this.MSISDN = data().deepCopy(fields()[0].schema(), other.MSISDN);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.quantityTypeID)) {
        this.quantityTypeID = data().deepCopy(fields()[1].schema(), other.quantityTypeID);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing CurrentQuantityBalanceCompositeKey instance
     * @param other The existing instance to copy.
     */
    private Builder(com.cdr.CurrentQuantityBalanceCompositeKey other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.MSISDN)) {
        this.MSISDN = data().deepCopy(fields()[0].schema(), other.MSISDN);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.quantityTypeID)) {
        this.quantityTypeID = data().deepCopy(fields()[1].schema(), other.quantityTypeID);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'MSISDN' field.
      * @return The value.
      */
    public java.lang.CharSequence getMSISDN() {
      return MSISDN;
    }


    /**
      * Sets the value of the 'MSISDN' field.
      * @param value The value of 'MSISDN'.
      * @return This builder.
      */
    public com.cdr.CurrentQuantityBalanceCompositeKey.Builder setMSISDN(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.MSISDN = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'MSISDN' field has been set.
      * @return True if the 'MSISDN' field has been set, false otherwise.
      */
    public boolean hasMSISDN() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'MSISDN' field.
      * @return This builder.
      */
    public com.cdr.CurrentQuantityBalanceCompositeKey.Builder clearMSISDN() {
      MSISDN = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantityTypeID' field.
      * @return The value.
      */
    public int getQuantityTypeID() {
      return quantityTypeID;
    }


    /**
      * Sets the value of the 'quantityTypeID' field.
      * @param value The value of 'quantityTypeID'.
      * @return This builder.
      */
    public com.cdr.CurrentQuantityBalanceCompositeKey.Builder setQuantityTypeID(int value) {
      validate(fields()[1], value);
      this.quantityTypeID = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'quantityTypeID' field has been set.
      * @return True if the 'quantityTypeID' field has been set, false otherwise.
      */
    public boolean hasQuantityTypeID() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'quantityTypeID' field.
      * @return This builder.
      */
    public com.cdr.CurrentQuantityBalanceCompositeKey.Builder clearQuantityTypeID() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CurrentQuantityBalanceCompositeKey build() {
      try {
        CurrentQuantityBalanceCompositeKey record = new CurrentQuantityBalanceCompositeKey();
        record.MSISDN = fieldSetFlags()[0] ? this.MSISDN : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.quantityTypeID = fieldSetFlags()[1] ? this.quantityTypeID : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CurrentQuantityBalanceCompositeKey>
    WRITER$ = (org.apache.avro.io.DatumWriter<CurrentQuantityBalanceCompositeKey>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CurrentQuantityBalanceCompositeKey>
    READER$ = (org.apache.avro.io.DatumReader<CurrentQuantityBalanceCompositeKey>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.MSISDN);

    out.writeInt(this.quantityTypeID);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.MSISDN = in.readString(this.MSISDN instanceof Utf8 ? (Utf8)this.MSISDN : null);

      this.quantityTypeID = in.readInt();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.MSISDN = in.readString(this.MSISDN instanceof Utf8 ? (Utf8)this.MSISDN : null);
          break;

        case 1:
          this.quantityTypeID = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









