// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_master.proto

package com.tencent.client.master.protos;

/**
 * Protobuf type {@code ClientMaster.RegisterTaskResp}
 */
public  final class RegisterTaskResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ClientMaster.RegisterTaskResp)
    RegisterTaskRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterTaskResp.newBuilder() to construct.
  private RegisterTaskResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterTaskResp() {
    taskId_ = 0L;
    numTask_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegisterTaskResp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 16: {

            taskId_ = input.readInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              clock_ = com.google.protobuf.MapField.newMapField(
                  ClockDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<java.lang.Long, java.lang.Integer>
            clock__ = input.readMessage(
                ClockDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            clock_.getMutableMap().put(
                clock__.getKey(), clock__.getValue());
            break;
          }
          case 32: {

            numTask_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_RegisterTaskResp_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetClock();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_RegisterTaskResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tencent.client.master.protos.RegisterTaskResp.class, com.tencent.client.master.protos.RegisterTaskResp.Builder.class);
  }

  private int bitField0_;
  public static final int TASKID_FIELD_NUMBER = 2;
  private long taskId_;
  /**
   * <code>int64 taskId = 2;</code>
   */
  public long getTaskId() {
    return taskId_;
  }

  public static final int NUMTASK_FIELD_NUMBER = 4;
  private int numTask_;
  /**
   * <code>int32 numTask = 4;</code>
   */
  public int getNumTask() {
    return numTask_;
  }

  public static final int CLOCK_FIELD_NUMBER = 3;
  private static final class ClockDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Long, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Long, java.lang.Integer>newDefaultInstance(
                com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_RegisterTaskResp_ClockEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L,
                com.google.protobuf.WireFormat.FieldType.INT32,
                0);
  }
  private com.google.protobuf.MapField<
      java.lang.Long, java.lang.Integer> clock_;
  private com.google.protobuf.MapField<java.lang.Long, java.lang.Integer>
  internalGetClock() {
    if (clock_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ClockDefaultEntryHolder.defaultEntry);
    }
    return clock_;
  }

  public int getClockCount() {
    return internalGetClock().getMap().size();
  }
  /**
   * <code>map&lt;int64, int32&gt; clock = 3;</code>
   */

  public boolean containsClock(
      long key) {
    
    return internalGetClock().getMap().containsKey(key);
  }
  /**
   * Use {@link #getClockMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Long, java.lang.Integer> getClock() {
    return getClockMap();
  }
  /**
   * <code>map&lt;int64, int32&gt; clock = 3;</code>
   */

  public java.util.Map<java.lang.Long, java.lang.Integer> getClockMap() {
    return internalGetClock().getMap();
  }
  /**
   * <code>map&lt;int64, int32&gt; clock = 3;</code>
   */

  public int getClockOrDefault(
      long key,
      int defaultValue) {
    
    java.util.Map<java.lang.Long, java.lang.Integer> map =
        internalGetClock().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int64, int32&gt; clock = 3;</code>
   */

  public int getClockOrThrow(
      long key) {
    
    java.util.Map<java.lang.Long, java.lang.Integer> map =
        internalGetClock().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (taskId_ != 0L) {
      output.writeInt64(2, taskId_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeLongMapTo(
        output,
        internalGetClock(),
        ClockDefaultEntryHolder.defaultEntry,
        3);
    if (numTask_ != 0) {
      output.writeInt32(4, numTask_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (taskId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, taskId_);
    }
    for (java.util.Map.Entry<java.lang.Long, java.lang.Integer> entry
         : internalGetClock().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Long, java.lang.Integer>
      clock__ = ClockDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, clock__);
    }
    if (numTask_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, numTask_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tencent.client.master.protos.RegisterTaskResp)) {
      return super.equals(obj);
    }
    com.tencent.client.master.protos.RegisterTaskResp other = (com.tencent.client.master.protos.RegisterTaskResp) obj;

    boolean result = true;
    result = result && (getTaskId()
        == other.getTaskId());
    result = result && (getNumTask()
        == other.getNumTask());
    result = result && internalGetClock().equals(
        other.internalGetClock());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TASKID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTaskId());
    hash = (37 * hash) + NUMTASK_FIELD_NUMBER;
    hash = (53 * hash) + getNumTask();
    if (!internalGetClock().getMap().isEmpty()) {
      hash = (37 * hash) + CLOCK_FIELD_NUMBER;
      hash = (53 * hash) + internalGetClock().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.client.master.protos.RegisterTaskResp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tencent.client.master.protos.RegisterTaskResp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ClientMaster.RegisterTaskResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientMaster.RegisterTaskResp)
      com.tencent.client.master.protos.RegisterTaskRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_RegisterTaskResp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetClock();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableClock();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_RegisterTaskResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.client.master.protos.RegisterTaskResp.class, com.tencent.client.master.protos.RegisterTaskResp.Builder.class);
    }

    // Construct using com.tencent.client.master.protos.RegisterTaskResp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      taskId_ = 0L;

      numTask_ = 0;

      internalGetMutableClock().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_RegisterTaskResp_descriptor;
    }

    public com.tencent.client.master.protos.RegisterTaskResp getDefaultInstanceForType() {
      return com.tencent.client.master.protos.RegisterTaskResp.getDefaultInstance();
    }

    public com.tencent.client.master.protos.RegisterTaskResp build() {
      com.tencent.client.master.protos.RegisterTaskResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.tencent.client.master.protos.RegisterTaskResp buildPartial() {
      com.tencent.client.master.protos.RegisterTaskResp result = new com.tencent.client.master.protos.RegisterTaskResp(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.taskId_ = taskId_;
      result.numTask_ = numTask_;
      result.clock_ = internalGetClock();
      result.clock_.makeImmutable();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tencent.client.master.protos.RegisterTaskResp) {
        return mergeFrom((com.tencent.client.master.protos.RegisterTaskResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tencent.client.master.protos.RegisterTaskResp other) {
      if (other == com.tencent.client.master.protos.RegisterTaskResp.getDefaultInstance()) return this;
      if (other.getTaskId() != 0L) {
        setTaskId(other.getTaskId());
      }
      if (other.getNumTask() != 0) {
        setNumTask(other.getNumTask());
      }
      internalGetMutableClock().mergeFrom(
          other.internalGetClock());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.tencent.client.master.protos.RegisterTaskResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tencent.client.master.protos.RegisterTaskResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long taskId_ ;
    /**
     * <code>int64 taskId = 2;</code>
     */
    public long getTaskId() {
      return taskId_;
    }
    /**
     * <code>int64 taskId = 2;</code>
     */
    public Builder setTaskId(long value) {
      
      taskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 taskId = 2;</code>
     */
    public Builder clearTaskId() {
      
      taskId_ = 0L;
      onChanged();
      return this;
    }

    private int numTask_ ;
    /**
     * <code>int32 numTask = 4;</code>
     */
    public int getNumTask() {
      return numTask_;
    }
    /**
     * <code>int32 numTask = 4;</code>
     */
    public Builder setNumTask(int value) {
      
      numTask_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numTask = 4;</code>
     */
    public Builder clearNumTask() {
      
      numTask_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Long, java.lang.Integer> clock_;
    private com.google.protobuf.MapField<java.lang.Long, java.lang.Integer>
    internalGetClock() {
      if (clock_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ClockDefaultEntryHolder.defaultEntry);
      }
      return clock_;
    }
    private com.google.protobuf.MapField<java.lang.Long, java.lang.Integer>
    internalGetMutableClock() {
      onChanged();;
      if (clock_ == null) {
        clock_ = com.google.protobuf.MapField.newMapField(
            ClockDefaultEntryHolder.defaultEntry);
      }
      if (!clock_.isMutable()) {
        clock_ = clock_.copy();
      }
      return clock_;
    }

    public int getClockCount() {
      return internalGetClock().getMap().size();
    }
    /**
     * <code>map&lt;int64, int32&gt; clock = 3;</code>
     */

    public boolean containsClock(
        long key) {
      
      return internalGetClock().getMap().containsKey(key);
    }
    /**
     * Use {@link #getClockMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.Integer> getClock() {
      return getClockMap();
    }
    /**
     * <code>map&lt;int64, int32&gt; clock = 3;</code>
     */

    public java.util.Map<java.lang.Long, java.lang.Integer> getClockMap() {
      return internalGetClock().getMap();
    }
    /**
     * <code>map&lt;int64, int32&gt; clock = 3;</code>
     */

    public int getClockOrDefault(
        long key,
        int defaultValue) {
      
      java.util.Map<java.lang.Long, java.lang.Integer> map =
          internalGetClock().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int64, int32&gt; clock = 3;</code>
     */

    public int getClockOrThrow(
        long key) {
      
      java.util.Map<java.lang.Long, java.lang.Integer> map =
          internalGetClock().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearClock() {
      internalGetMutableClock().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int64, int32&gt; clock = 3;</code>
     */

    public Builder removeClock(
        long key) {
      
      internalGetMutableClock().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.Integer>
    getMutableClock() {
      return internalGetMutableClock().getMutableMap();
    }
    /**
     * <code>map&lt;int64, int32&gt; clock = 3;</code>
     */
    public Builder putClock(
        long key,
        int value) {
      
      
      internalGetMutableClock().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;int64, int32&gt; clock = 3;</code>
     */

    public Builder putAllClock(
        java.util.Map<java.lang.Long, java.lang.Integer> values) {
      internalGetMutableClock().getMutableMap()
          .putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ClientMaster.RegisterTaskResp)
  }

  // @@protoc_insertion_point(class_scope:ClientMaster.RegisterTaskResp)
  private static final com.tencent.client.master.protos.RegisterTaskResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tencent.client.master.protos.RegisterTaskResp();
  }

  public static com.tencent.client.master.protos.RegisterTaskResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterTaskResp>
      PARSER = new com.google.protobuf.AbstractParser<RegisterTaskResp>() {
    public RegisterTaskResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegisterTaskResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterTaskResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterTaskResp> getParserForType() {
    return PARSER;
  }

  public com.tencent.client.master.protos.RegisterTaskResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

