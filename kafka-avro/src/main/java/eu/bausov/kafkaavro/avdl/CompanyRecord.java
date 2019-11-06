/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package eu.bausov.kafkaavro.avdl;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class CompanyRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CompanyRecord\",\"namespace\":\"eu.bausov.kafkaavro.avdl\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"size\",\"type\":{\"type\":\"enum\",\"name\":\"CompanySize\",\"symbols\":[\"SMALL\",\"MEDIUM\",\"BIG\"]}},{\"name\":\"countryCode\",\"type\":\"string\"}]}");
    private static final long serialVersionUID = 6838837652545682458L;
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<CompanyRecord> ENCODER =
            new BinaryMessageEncoder<CompanyRecord>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<CompanyRecord> DECODER =
            new BinaryMessageDecoder<CompanyRecord>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<CompanyRecord>
            WRITER$ = (org.apache.avro.io.DatumWriter<CompanyRecord>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<CompanyRecord>
            READER$ = (org.apache.avro.io.DatumReader<CompanyRecord>) MODEL$.createDatumReader(SCHEMA$);
    @Deprecated
    public java.lang.CharSequence name;
    @Deprecated
    public eu.bausov.kafkaavro.avdl.CompanySize size;
    @Deprecated
    public java.lang.CharSequence countryCode;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public CompanyRecord() {
    }

    /**
     * All-args constructor.
     *
     * @param name        The new value for name
     * @param size        The new value for size
     * @param countryCode The new value for countryCode
     */
    public CompanyRecord(java.lang.CharSequence name, eu.bausov.kafkaavro.avdl.CompanySize size, java.lang.CharSequence countryCode) {
        this.name = name;
        this.size = size;
        this.countryCode = countryCode;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     *
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<CompanyRecord> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     *
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<CompanyRecord> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     *
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<CompanyRecord> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<CompanyRecord>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Deserializes a CompanyRecord from a ByteBuffer.
     *
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a CompanyRecord instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static CompanyRecord fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new CompanyRecord RecordBuilder.
     *
     * @return A new CompanyRecord RecordBuilder
     */
    public static eu.bausov.kafkaavro.avdl.CompanyRecord.Builder newBuilder() {
        return new eu.bausov.kafkaavro.avdl.CompanyRecord.Builder();
    }

    /**
     * Creates a new CompanyRecord RecordBuilder by copying an existing Builder.
     *
     * @param other The existing builder to copy.
     * @return A new CompanyRecord RecordBuilder
     */
    public static eu.bausov.kafkaavro.avdl.CompanyRecord.Builder newBuilder(eu.bausov.kafkaavro.avdl.CompanyRecord.Builder other) {
        if (other == null) {
            return new eu.bausov.kafkaavro.avdl.CompanyRecord.Builder();
        } else {
            return new eu.bausov.kafkaavro.avdl.CompanyRecord.Builder(other);
        }
    }

    /**
     * Creates a new CompanyRecord RecordBuilder by copying an existing CompanyRecord instance.
     *
     * @param other The existing instance to copy.
     * @return A new CompanyRecord RecordBuilder
     */
    public static eu.bausov.kafkaavro.avdl.CompanyRecord.Builder newBuilder(eu.bausov.kafkaavro.avdl.CompanyRecord other) {
        if (other == null) {
            return new eu.bausov.kafkaavro.avdl.CompanyRecord.Builder();
        } else {
            return new eu.bausov.kafkaavro.avdl.CompanyRecord.Builder(other);
        }
    }

    /**
     * Serializes this CompanyRecord to a ByteBuffer.
     *
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return name;
            case 1:
                return size;
            case 2:
                return countryCode;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                name = (java.lang.CharSequence) value$;
                break;
            case 1:
                size = (eu.bausov.kafkaavro.avdl.CompanySize) value$;
                break;
            case 2:
                countryCode = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'name' field.
     *
     * @return The value of the 'name' field.
     */
    public java.lang.CharSequence getName() {
        return name;
    }

    /**
     * Sets the value of the 'name' field.
     *
     * @param value the value to set.
     */
    public void setName(java.lang.CharSequence value) {
        this.name = value;
    }

    /**
     * Gets the value of the 'size' field.
     *
     * @return The value of the 'size' field.
     */
    public eu.bausov.kafkaavro.avdl.CompanySize getSize() {
        return size;
    }

    /**
     * Sets the value of the 'size' field.
     *
     * @param value the value to set.
     */
    public void setSize(eu.bausov.kafkaavro.avdl.CompanySize value) {
        this.size = value;
    }

    /**
     * Gets the value of the 'countryCode' field.
     *
     * @return The value of the 'countryCode' field.
     */
    public java.lang.CharSequence getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the 'countryCode' field.
     *
     * @param value the value to set.
     */
    public void setCountryCode(java.lang.CharSequence value) {
        this.countryCode = value;
    }

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException {
        out.writeString(this.name);

        out.writeEnum(this.size.ordinal());

        out.writeString(this.countryCode);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8) this.name : null);

            this.size = eu.bausov.kafkaavro.avdl.CompanySize.values()[in.readEnum()];

            this.countryCode = in.readString(this.countryCode instanceof Utf8 ? (Utf8) this.countryCode : null);

        } else {
            for (int i = 0; i < 3; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.name = in.readString(this.name instanceof Utf8 ? (Utf8) this.name : null);
                        break;

                    case 1:
                        this.size = eu.bausov.kafkaavro.avdl.CompanySize.values()[in.readEnum()];
                        break;

                    case 2:
                        this.countryCode = in.readString(this.countryCode instanceof Utf8 ? (Utf8) this.countryCode : null);
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }

    /**
     * RecordBuilder for CompanyRecord instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CompanyRecord>
            implements org.apache.avro.data.RecordBuilder<CompanyRecord> {

        private java.lang.CharSequence name;
        private eu.bausov.kafkaavro.avdl.CompanySize size;
        private java.lang.CharSequence countryCode;

        /**
         * Creates a new Builder
         */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         *
         * @param other The existing Builder to copy.
         */
        private Builder(eu.bausov.kafkaavro.avdl.CompanyRecord.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.name)) {
                this.name = data().deepCopy(fields()[0].schema(), other.name);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.size)) {
                this.size = data().deepCopy(fields()[1].schema(), other.size);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.countryCode)) {
                this.countryCode = data().deepCopy(fields()[2].schema(), other.countryCode);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
        }

        /**
         * Creates a Builder by copying an existing CompanyRecord instance
         *
         * @param other The existing instance to copy.
         */
        private Builder(eu.bausov.kafkaavro.avdl.CompanyRecord other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.name)) {
                this.name = data().deepCopy(fields()[0].schema(), other.name);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.size)) {
                this.size = data().deepCopy(fields()[1].schema(), other.size);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.countryCode)) {
                this.countryCode = data().deepCopy(fields()[2].schema(), other.countryCode);
                fieldSetFlags()[2] = true;
            }
        }

        /**
         * Gets the value of the 'name' field.
         *
         * @return The value.
         */
        public java.lang.CharSequence getName() {
            return name;
        }


        /**
         * Sets the value of the 'name' field.
         *
         * @param value The value of 'name'.
         * @return This builder.
         */
        public eu.bausov.kafkaavro.avdl.CompanyRecord.Builder setName(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.name = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'name' field has been set.
         *
         * @return True if the 'name' field has been set, false otherwise.
         */
        public boolean hasName() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'name' field.
         *
         * @return This builder.
         */
        public eu.bausov.kafkaavro.avdl.CompanyRecord.Builder clearName() {
            name = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'size' field.
         *
         * @return The value.
         */
        public eu.bausov.kafkaavro.avdl.CompanySize getSize() {
            return size;
        }


        /**
         * Sets the value of the 'size' field.
         *
         * @param value The value of 'size'.
         * @return This builder.
         */
        public eu.bausov.kafkaavro.avdl.CompanyRecord.Builder setSize(eu.bausov.kafkaavro.avdl.CompanySize value) {
            validate(fields()[1], value);
            this.size = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'size' field has been set.
         *
         * @return True if the 'size' field has been set, false otherwise.
         */
        public boolean hasSize() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'size' field.
         *
         * @return This builder.
         */
        public eu.bausov.kafkaavro.avdl.CompanyRecord.Builder clearSize() {
            size = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'countryCode' field.
         *
         * @return The value.
         */
        public java.lang.CharSequence getCountryCode() {
            return countryCode;
        }


        /**
         * Sets the value of the 'countryCode' field.
         *
         * @param value The value of 'countryCode'.
         * @return This builder.
         */
        public eu.bausov.kafkaavro.avdl.CompanyRecord.Builder setCountryCode(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.countryCode = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'countryCode' field has been set.
         *
         * @return True if the 'countryCode' field has been set, false otherwise.
         */
        public boolean hasCountryCode() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'countryCode' field.
         *
         * @return This builder.
         */
        public eu.bausov.kafkaavro.avdl.CompanyRecord.Builder clearCountryCode() {
            countryCode = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public CompanyRecord build() {
            try {
                CompanyRecord record = new CompanyRecord();
                record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.size = fieldSetFlags()[1] ? this.size : (eu.bausov.kafkaavro.avdl.CompanySize) defaultValue(fields()[1]);
                record.countryCode = fieldSetFlags()[2] ? this.countryCode : (java.lang.CharSequence) defaultValue(fields()[2]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}










