// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/perfetto/trace/ftrace/tcp.proto

package perfetto.protos;

public final class Tcp {
  private Tcp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TcpRetransmitSkbFtraceEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.TcpRetransmitSkbFtraceEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 daddr = 1;</code>
     * @return Whether the daddr field is set.
     */
    boolean hasDaddr();
    /**
     * <code>optional uint32 daddr = 1;</code>
     * @return The daddr.
     */
    int getDaddr();

    /**
     * <code>optional uint32 dport = 2;</code>
     * @return Whether the dport field is set.
     */
    boolean hasDport();
    /**
     * <code>optional uint32 dport = 2;</code>
     * @return The dport.
     */
    int getDport();

    /**
     * <code>optional uint32 saddr = 3;</code>
     * @return Whether the saddr field is set.
     */
    boolean hasSaddr();
    /**
     * <code>optional uint32 saddr = 3;</code>
     * @return The saddr.
     */
    int getSaddr();

    /**
     * <code>optional uint64 skaddr = 4;</code>
     * @return Whether the skaddr field is set.
     */
    boolean hasSkaddr();
    /**
     * <code>optional uint64 skaddr = 4;</code>
     * @return The skaddr.
     */
    long getSkaddr();

    /**
     * <code>optional uint64 skbaddr = 5;</code>
     * @return Whether the skbaddr field is set.
     */
    boolean hasSkbaddr();
    /**
     * <code>optional uint64 skbaddr = 5;</code>
     * @return The skbaddr.
     */
    long getSkbaddr();

    /**
     * <code>optional uint32 sport = 6;</code>
     * @return Whether the sport field is set.
     */
    boolean hasSport();
    /**
     * <code>optional uint32 sport = 6;</code>
     * @return The sport.
     */
    int getSport();

    /**
     * <code>optional int32 state = 7;</code>
     * @return Whether the state field is set.
     */
    boolean hasState();
    /**
     * <code>optional int32 state = 7;</code>
     * @return The state.
     */
    int getState();
  }
  /**
   * Protobuf type {@code perfetto.protos.TcpRetransmitSkbFtraceEvent}
   */
  public static final class TcpRetransmitSkbFtraceEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.TcpRetransmitSkbFtraceEvent)
      TcpRetransmitSkbFtraceEventOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TcpRetransmitSkbFtraceEvent.newBuilder() to construct.
    private TcpRetransmitSkbFtraceEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TcpRetransmitSkbFtraceEvent() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TcpRetransmitSkbFtraceEvent();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return perfetto.protos.Tcp.internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return perfetto.protos.Tcp.internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent.class, perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent.Builder.class);
    }

    private int bitField0_;
    public static final int DADDR_FIELD_NUMBER = 1;
    private int daddr_ = 0;
    /**
     * <code>optional uint32 daddr = 1;</code>
     * @return Whether the daddr field is set.
     */
    @java.lang.Override
    public boolean hasDaddr() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint32 daddr = 1;</code>
     * @return The daddr.
     */
    @java.lang.Override
    public int getDaddr() {
      return daddr_;
    }

    public static final int DPORT_FIELD_NUMBER = 2;
    private int dport_ = 0;
    /**
     * <code>optional uint32 dport = 2;</code>
     * @return Whether the dport field is set.
     */
    @java.lang.Override
    public boolean hasDport() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint32 dport = 2;</code>
     * @return The dport.
     */
    @java.lang.Override
    public int getDport() {
      return dport_;
    }

    public static final int SADDR_FIELD_NUMBER = 3;
    private int saddr_ = 0;
    /**
     * <code>optional uint32 saddr = 3;</code>
     * @return Whether the saddr field is set.
     */
    @java.lang.Override
    public boolean hasSaddr() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint32 saddr = 3;</code>
     * @return The saddr.
     */
    @java.lang.Override
    public int getSaddr() {
      return saddr_;
    }

    public static final int SKADDR_FIELD_NUMBER = 4;
    private long skaddr_ = 0L;
    /**
     * <code>optional uint64 skaddr = 4;</code>
     * @return Whether the skaddr field is set.
     */
    @java.lang.Override
    public boolean hasSkaddr() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional uint64 skaddr = 4;</code>
     * @return The skaddr.
     */
    @java.lang.Override
    public long getSkaddr() {
      return skaddr_;
    }

    public static final int SKBADDR_FIELD_NUMBER = 5;
    private long skbaddr_ = 0L;
    /**
     * <code>optional uint64 skbaddr = 5;</code>
     * @return Whether the skbaddr field is set.
     */
    @java.lang.Override
    public boolean hasSkbaddr() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional uint64 skbaddr = 5;</code>
     * @return The skbaddr.
     */
    @java.lang.Override
    public long getSkbaddr() {
      return skbaddr_;
    }

    public static final int SPORT_FIELD_NUMBER = 6;
    private int sport_ = 0;
    /**
     * <code>optional uint32 sport = 6;</code>
     * @return Whether the sport field is set.
     */
    @java.lang.Override
    public boolean hasSport() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional uint32 sport = 6;</code>
     * @return The sport.
     */
    @java.lang.Override
    public int getSport() {
      return sport_;
    }

    public static final int STATE_FIELD_NUMBER = 7;
    private int state_ = 0;
    /**
     * <code>optional int32 state = 7;</code>
     * @return Whether the state field is set.
     */
    @java.lang.Override
    public boolean hasState() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional int32 state = 7;</code>
     * @return The state.
     */
    @java.lang.Override
    public int getState() {
      return state_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, daddr_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, dport_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(3, saddr_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, skaddr_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeUInt64(5, skbaddr_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeUInt32(6, sport_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeInt32(7, state_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, daddr_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, dport_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, saddr_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, skaddr_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, skbaddr_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sport_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, state_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent)) {
        return super.equals(obj);
      }
      perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent other = (perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent) obj;

      if (hasDaddr() != other.hasDaddr()) return false;
      if (hasDaddr()) {
        if (getDaddr()
            != other.getDaddr()) return false;
      }
      if (hasDport() != other.hasDport()) return false;
      if (hasDport()) {
        if (getDport()
            != other.getDport()) return false;
      }
      if (hasSaddr() != other.hasSaddr()) return false;
      if (hasSaddr()) {
        if (getSaddr()
            != other.getSaddr()) return false;
      }
      if (hasSkaddr() != other.hasSkaddr()) return false;
      if (hasSkaddr()) {
        if (getSkaddr()
            != other.getSkaddr()) return false;
      }
      if (hasSkbaddr() != other.hasSkbaddr()) return false;
      if (hasSkbaddr()) {
        if (getSkbaddr()
            != other.getSkbaddr()) return false;
      }
      if (hasSport() != other.hasSport()) return false;
      if (hasSport()) {
        if (getSport()
            != other.getSport()) return false;
      }
      if (hasState() != other.hasState()) return false;
      if (hasState()) {
        if (getState()
            != other.getState()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasDaddr()) {
        hash = (37 * hash) + DADDR_FIELD_NUMBER;
        hash = (53 * hash) + getDaddr();
      }
      if (hasDport()) {
        hash = (37 * hash) + DPORT_FIELD_NUMBER;
        hash = (53 * hash) + getDport();
      }
      if (hasSaddr()) {
        hash = (37 * hash) + SADDR_FIELD_NUMBER;
        hash = (53 * hash) + getSaddr();
      }
      if (hasSkaddr()) {
        hash = (37 * hash) + SKADDR_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSkaddr());
      }
      if (hasSkbaddr()) {
        hash = (37 * hash) + SKBADDR_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSkbaddr());
      }
      if (hasSport()) {
        hash = (37 * hash) + SPORT_FIELD_NUMBER;
        hash = (53 * hash) + getSport();
      }
      if (hasState()) {
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + getState();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code perfetto.protos.TcpRetransmitSkbFtraceEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.TcpRetransmitSkbFtraceEvent)
        perfetto.protos.Tcp.TcpRetransmitSkbFtraceEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return perfetto.protos.Tcp.internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return perfetto.protos.Tcp.internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent.class, perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent.Builder.class);
      }

      // Construct using perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        daddr_ = 0;
        dport_ = 0;
        saddr_ = 0;
        skaddr_ = 0L;
        skbaddr_ = 0L;
        sport_ = 0;
        state_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return perfetto.protos.Tcp.internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_descriptor;
      }

      @java.lang.Override
      public perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent getDefaultInstanceForType() {
        return perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent.getDefaultInstance();
      }

      @java.lang.Override
      public perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent build() {
        perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent buildPartial() {
        perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent result = new perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.daddr_ = daddr_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.dport_ = dport_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.saddr_ = saddr_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.skaddr_ = skaddr_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.skbaddr_ = skbaddr_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.sport_ = sport_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.state_ = state_;
          to_bitField0_ |= 0x00000040;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent) {
          return mergeFrom((perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent other) {
        if (other == perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent.getDefaultInstance()) return this;
        if (other.hasDaddr()) {
          setDaddr(other.getDaddr());
        }
        if (other.hasDport()) {
          setDport(other.getDport());
        }
        if (other.hasSaddr()) {
          setSaddr(other.getSaddr());
        }
        if (other.hasSkaddr()) {
          setSkaddr(other.getSkaddr());
        }
        if (other.hasSkbaddr()) {
          setSkbaddr(other.getSkbaddr());
        }
        if (other.hasSport()) {
          setSport(other.getSport());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                daddr_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                dport_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                saddr_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                skaddr_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                skbaddr_ = input.readUInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                sport_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 56: {
                state_ = input.readInt32();
                bitField0_ |= 0x00000040;
                break;
              } // case 56
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int daddr_ ;
      /**
       * <code>optional uint32 daddr = 1;</code>
       * @return Whether the daddr field is set.
       */
      @java.lang.Override
      public boolean hasDaddr() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional uint32 daddr = 1;</code>
       * @return The daddr.
       */
      @java.lang.Override
      public int getDaddr() {
        return daddr_;
      }
      /**
       * <code>optional uint32 daddr = 1;</code>
       * @param value The daddr to set.
       * @return This builder for chaining.
       */
      public Builder setDaddr(int value) {
        
        daddr_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 daddr = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDaddr() {
        bitField0_ = (bitField0_ & ~0x00000001);
        daddr_ = 0;
        onChanged();
        return this;
      }

      private int dport_ ;
      /**
       * <code>optional uint32 dport = 2;</code>
       * @return Whether the dport field is set.
       */
      @java.lang.Override
      public boolean hasDport() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional uint32 dport = 2;</code>
       * @return The dport.
       */
      @java.lang.Override
      public int getDport() {
        return dport_;
      }
      /**
       * <code>optional uint32 dport = 2;</code>
       * @param value The dport to set.
       * @return This builder for chaining.
       */
      public Builder setDport(int value) {
        
        dport_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 dport = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDport() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dport_ = 0;
        onChanged();
        return this;
      }

      private int saddr_ ;
      /**
       * <code>optional uint32 saddr = 3;</code>
       * @return Whether the saddr field is set.
       */
      @java.lang.Override
      public boolean hasSaddr() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional uint32 saddr = 3;</code>
       * @return The saddr.
       */
      @java.lang.Override
      public int getSaddr() {
        return saddr_;
      }
      /**
       * <code>optional uint32 saddr = 3;</code>
       * @param value The saddr to set.
       * @return This builder for chaining.
       */
      public Builder setSaddr(int value) {
        
        saddr_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 saddr = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSaddr() {
        bitField0_ = (bitField0_ & ~0x00000004);
        saddr_ = 0;
        onChanged();
        return this;
      }

      private long skaddr_ ;
      /**
       * <code>optional uint64 skaddr = 4;</code>
       * @return Whether the skaddr field is set.
       */
      @java.lang.Override
      public boolean hasSkaddr() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional uint64 skaddr = 4;</code>
       * @return The skaddr.
       */
      @java.lang.Override
      public long getSkaddr() {
        return skaddr_;
      }
      /**
       * <code>optional uint64 skaddr = 4;</code>
       * @param value The skaddr to set.
       * @return This builder for chaining.
       */
      public Builder setSkaddr(long value) {
        
        skaddr_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 skaddr = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkaddr() {
        bitField0_ = (bitField0_ & ~0x00000008);
        skaddr_ = 0L;
        onChanged();
        return this;
      }

      private long skbaddr_ ;
      /**
       * <code>optional uint64 skbaddr = 5;</code>
       * @return Whether the skbaddr field is set.
       */
      @java.lang.Override
      public boolean hasSkbaddr() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional uint64 skbaddr = 5;</code>
       * @return The skbaddr.
       */
      @java.lang.Override
      public long getSkbaddr() {
        return skbaddr_;
      }
      /**
       * <code>optional uint64 skbaddr = 5;</code>
       * @param value The skbaddr to set.
       * @return This builder for chaining.
       */
      public Builder setSkbaddr(long value) {
        
        skbaddr_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 skbaddr = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkbaddr() {
        bitField0_ = (bitField0_ & ~0x00000010);
        skbaddr_ = 0L;
        onChanged();
        return this;
      }

      private int sport_ ;
      /**
       * <code>optional uint32 sport = 6;</code>
       * @return Whether the sport field is set.
       */
      @java.lang.Override
      public boolean hasSport() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>optional uint32 sport = 6;</code>
       * @return The sport.
       */
      @java.lang.Override
      public int getSport() {
        return sport_;
      }
      /**
       * <code>optional uint32 sport = 6;</code>
       * @param value The sport to set.
       * @return This builder for chaining.
       */
      public Builder setSport(int value) {
        
        sport_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 sport = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSport() {
        bitField0_ = (bitField0_ & ~0x00000020);
        sport_ = 0;
        onChanged();
        return this;
      }

      private int state_ ;
      /**
       * <code>optional int32 state = 7;</code>
       * @return Whether the state field is set.
       */
      @java.lang.Override
      public boolean hasState() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>optional int32 state = 7;</code>
       * @return The state.
       */
      @java.lang.Override
      public int getState() {
        return state_;
      }
      /**
       * <code>optional int32 state = 7;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(int value) {
        
        state_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 state = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000040);
        state_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:perfetto.protos.TcpRetransmitSkbFtraceEvent)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.TcpRetransmitSkbFtraceEvent)
    private static final perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent();
    }

    public static perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TcpRetransmitSkbFtraceEvent>
        PARSER = new com.google.protobuf.AbstractParser<TcpRetransmitSkbFtraceEvent>() {
      @java.lang.Override
      public TcpRetransmitSkbFtraceEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<TcpRetransmitSkbFtraceEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TcpRetransmitSkbFtraceEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public perfetto.protos.Tcp.TcpRetransmitSkbFtraceEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&protos/perfetto/trace/ftrace/tcp.proto" +
      "\022\017perfetto.protos\"\211\001\n\033TcpRetransmitSkbFt" +
      "raceEvent\022\r\n\005daddr\030\001 \001(\r\022\r\n\005dport\030\002 \001(\r\022" +
      "\r\n\005saddr\030\003 \001(\r\022\016\n\006skaddr\030\004 \001(\004\022\017\n\007skbadd" +
      "r\030\005 \001(\004\022\r\n\005sport\030\006 \001(\r\022\r\n\005state\030\007 \001(\005"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_perfetto_protos_TcpRetransmitSkbFtraceEvent_descriptor,
        new java.lang.String[] { "Daddr", "Dport", "Saddr", "Skaddr", "Skbaddr", "Sport", "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}