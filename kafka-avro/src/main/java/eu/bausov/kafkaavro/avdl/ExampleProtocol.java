/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.bausov.kafkaavro.avdl;

@org.apache.avro.specific.AvroGenerated
public interface ExampleProtocol {
  org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"ExampleProtocol\",\"namespace\":\"eu.bausov.kafkaavro.avdl\",\"types\":[{\"type\":\"enum\",\"name\":\"CompanySize\",\"symbols\":[\"SMALL\",\"MEDIUM\",\"BIG\"]},{\"type\":\"record\",\"name\":\"CompanyRecord\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"size\",\"type\":\"CompanySize\"},{\"name\":\"countryCode\",\"type\":\"string\"}]},{\"type\":\"error\",\"name\":\"CustomException\",\"fields\":[{\"name\":\"message\",\"type\":\"string\"}]}],\"messages\":{\"hello\":{\"request\":[{\"name\":\"greeting\",\"type\":\"string\"}],\"response\":\"string\"},\"echo\":{\"request\":[{\"name\":\"record\",\"type\":\"CompanyRecord\"}],\"response\":\"CompanyRecord\"},\"add\":{\"request\":[{\"name\":\"arg1\",\"type\":\"int\"},{\"name\":\"arg2\",\"type\":\"int\"}],\"response\":\"int\"},\"echoBytes\":{\"request\":[{\"name\":\"data\",\"type\":\"bytes\"}],\"response\":\"bytes\"},\"error\":{\"request\":[],\"response\":\"null\",\"errors\":[\"CustomException\"]},\"ping\":{\"request\":[],\"response\":\"null\",\"one-way\":true}}}");

  /**
   *
   */
  java.lang.CharSequence hello(java.lang.CharSequence greeting);

  /**
   *
   */
  eu.bausov.kafkaavro.avdl.CompanyRecord echo(eu.bausov.kafkaavro.avdl.CompanyRecord record);

  /**
   *
   */
  int add(int arg1, int arg2);

  /**
   *
   */
  java.nio.ByteBuffer echoBytes(java.nio.ByteBuffer data);

  /**
   *
   */
  void error() throws eu.bausov.kafkaavro.avdl.CustomException;

  /**
   *
   */
  void ping();

  @SuppressWarnings("all")
  public interface Callback extends ExampleProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = eu.bausov.kafkaavro.avdl.ExampleProtocol.PROTOCOL;

    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void hello(java.lang.CharSequence greeting, org.apache.avro.ipc.Callback<java.lang.CharSequence> callback) throws java.io.IOException;

    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void echo(eu.bausov.kafkaavro.avdl.CompanyRecord record, org.apache.avro.ipc.Callback<eu.bausov.kafkaavro.avdl.CompanyRecord> callback) throws java.io.IOException;

    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void add(int arg1, int arg2, org.apache.avro.ipc.Callback<java.lang.Integer> callback) throws java.io.IOException;

    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void echoBytes(java.nio.ByteBuffer data, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;

    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void error(org.apache.avro.ipc.Callback<java.lang.Void> callback) throws java.io.IOException;
  }
}