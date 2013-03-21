/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.opentripplanner.api.thrift.definition;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraphEdgesResponse implements org.apache.thrift.TBase<GraphEdgesResponse, GraphEdgesResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GraphEdgesResponse");

  private static final org.apache.thrift.protocol.TField EDGES_FIELD_DESC = new org.apache.thrift.protocol.TField("edges", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField COMPUTE_TIME_MILLIS_FIELD_DESC = new org.apache.thrift.protocol.TField("compute_time_millis", org.apache.thrift.protocol.TType.I64, (short)10);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GraphEdgesResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GraphEdgesResponseTupleSchemeFactory());
  }

  private List<org.opentripplanner.api.thrift.definition.GraphEdge> edges; // required
  private long compute_time_millis; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EDGES((short)1, "edges"),
    COMPUTE_TIME_MILLIS((short)10, "compute_time_millis");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EDGES
          return EDGES;
        case 10: // COMPUTE_TIME_MILLIS
          return COMPUTE_TIME_MILLIS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __COMPUTE_TIME_MILLIS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  private _Fields optionals[] = {_Fields.COMPUTE_TIME_MILLIS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EDGES, new org.apache.thrift.meta_data.FieldMetaData("edges", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "GraphEdge"))));
    tmpMap.put(_Fields.COMPUTE_TIME_MILLIS, new org.apache.thrift.meta_data.FieldMetaData("compute_time_millis", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GraphEdgesResponse.class, metaDataMap);
  }

  public GraphEdgesResponse() {
  }

  public GraphEdgesResponse(
    List<org.opentripplanner.api.thrift.definition.GraphEdge> edges)
  {
    this();
    this.edges = edges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GraphEdgesResponse(GraphEdgesResponse other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetEdges()) {
      List<org.opentripplanner.api.thrift.definition.GraphEdge> __this__edges = new ArrayList<org.opentripplanner.api.thrift.definition.GraphEdge>();
      for (org.opentripplanner.api.thrift.definition.GraphEdge other_element : other.edges) {
        __this__edges.add(other_element);
      }
      this.edges = __this__edges;
    }
    this.compute_time_millis = other.compute_time_millis;
  }

  public GraphEdgesResponse deepCopy() {
    return new GraphEdgesResponse(this);
  }

  @Override
  public void clear() {
    this.edges = null;
    setCompute_time_millisIsSet(false);
    this.compute_time_millis = 0;
  }

  public int getEdgesSize() {
    return (this.edges == null) ? 0 : this.edges.size();
  }

  public java.util.Iterator<org.opentripplanner.api.thrift.definition.GraphEdge> getEdgesIterator() {
    return (this.edges == null) ? null : this.edges.iterator();
  }

  public void addToEdges(org.opentripplanner.api.thrift.definition.GraphEdge elem) {
    if (this.edges == null) {
      this.edges = new ArrayList<org.opentripplanner.api.thrift.definition.GraphEdge>();
    }
    this.edges.add(elem);
  }

  public List<org.opentripplanner.api.thrift.definition.GraphEdge> getEdges() {
    return this.edges;
  }

  public void setEdges(List<org.opentripplanner.api.thrift.definition.GraphEdge> edges) {
    this.edges = edges;
  }

  public void unsetEdges() {
    this.edges = null;
  }

  /** Returns true if field edges is set (has been assigned a value) and false otherwise */
  public boolean isSetEdges() {
    return this.edges != null;
  }

  public void setEdgesIsSet(boolean value) {
    if (!value) {
      this.edges = null;
    }
  }

  public long getCompute_time_millis() {
    return this.compute_time_millis;
  }

  public void setCompute_time_millis(long compute_time_millis) {
    this.compute_time_millis = compute_time_millis;
    setCompute_time_millisIsSet(true);
  }

  public void unsetCompute_time_millis() {
    __isset_bit_vector.clear(__COMPUTE_TIME_MILLIS_ISSET_ID);
  }

  /** Returns true if field compute_time_millis is set (has been assigned a value) and false otherwise */
  public boolean isSetCompute_time_millis() {
    return __isset_bit_vector.get(__COMPUTE_TIME_MILLIS_ISSET_ID);
  }

  public void setCompute_time_millisIsSet(boolean value) {
    __isset_bit_vector.set(__COMPUTE_TIME_MILLIS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EDGES:
      if (value == null) {
        unsetEdges();
      } else {
        setEdges((List<org.opentripplanner.api.thrift.definition.GraphEdge>)value);
      }
      break;

    case COMPUTE_TIME_MILLIS:
      if (value == null) {
        unsetCompute_time_millis();
      } else {
        setCompute_time_millis((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EDGES:
      return getEdges();

    case COMPUTE_TIME_MILLIS:
      return Long.valueOf(getCompute_time_millis());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EDGES:
      return isSetEdges();
    case COMPUTE_TIME_MILLIS:
      return isSetCompute_time_millis();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GraphEdgesResponse)
      return this.equals((GraphEdgesResponse)that);
    return false;
  }

  public boolean equals(GraphEdgesResponse that) {
    if (that == null)
      return false;

    boolean this_present_edges = true && this.isSetEdges();
    boolean that_present_edges = true && that.isSetEdges();
    if (this_present_edges || that_present_edges) {
      if (!(this_present_edges && that_present_edges))
        return false;
      if (!this.edges.equals(that.edges))
        return false;
    }

    boolean this_present_compute_time_millis = true && this.isSetCompute_time_millis();
    boolean that_present_compute_time_millis = true && that.isSetCompute_time_millis();
    if (this_present_compute_time_millis || that_present_compute_time_millis) {
      if (!(this_present_compute_time_millis && that_present_compute_time_millis))
        return false;
      if (this.compute_time_millis != that.compute_time_millis)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GraphEdgesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GraphEdgesResponse typedOther = (GraphEdgesResponse)other;

    lastComparison = Boolean.valueOf(isSetEdges()).compareTo(typedOther.isSetEdges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEdges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.edges, typedOther.edges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompute_time_millis()).compareTo(typedOther.isSetCompute_time_millis());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompute_time_millis()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.compute_time_millis, typedOther.compute_time_millis);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GraphEdgesResponse(");
    boolean first = true;

    sb.append("edges:");
    if (this.edges == null) {
      sb.append("null");
    } else {
      sb.append(this.edges);
    }
    first = false;
    if (isSetCompute_time_millis()) {
      if (!first) sb.append(", ");
      sb.append("compute_time_millis:");
      sb.append(this.compute_time_millis);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetEdges()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'edges' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GraphEdgesResponseStandardSchemeFactory implements SchemeFactory {
    public GraphEdgesResponseStandardScheme getScheme() {
      return new GraphEdgesResponseStandardScheme();
    }
  }

  private static class GraphEdgesResponseStandardScheme extends StandardScheme<GraphEdgesResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GraphEdgesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EDGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.edges = new ArrayList<org.opentripplanner.api.thrift.definition.GraphEdge>(_list32.size);
                for (int _i33 = 0; _i33 < _list32.size; ++_i33)
                {
                  org.opentripplanner.api.thrift.definition.GraphEdge _elem34; // required
                  _elem34 = new org.opentripplanner.api.thrift.definition.GraphEdge();
                  _elem34.read(iprot);
                  struct.edges.add(_elem34);
                }
                iprot.readListEnd();
              }
              struct.setEdgesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // COMPUTE_TIME_MILLIS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.compute_time_millis = iprot.readI64();
              struct.setCompute_time_millisIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GraphEdgesResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.edges != null) {
        oprot.writeFieldBegin(EDGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.edges.size()));
          for (org.opentripplanner.api.thrift.definition.GraphEdge _iter35 : struct.edges)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompute_time_millis()) {
        oprot.writeFieldBegin(COMPUTE_TIME_MILLIS_FIELD_DESC);
        oprot.writeI64(struct.compute_time_millis);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GraphEdgesResponseTupleSchemeFactory implements SchemeFactory {
    public GraphEdgesResponseTupleScheme getScheme() {
      return new GraphEdgesResponseTupleScheme();
    }
  }

  private static class GraphEdgesResponseTupleScheme extends TupleScheme<GraphEdgesResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GraphEdgesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.edges.size());
        for (org.opentripplanner.api.thrift.definition.GraphEdge _iter36 : struct.edges)
        {
          _iter36.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetCompute_time_millis()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCompute_time_millis()) {
        oprot.writeI64(struct.compute_time_millis);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GraphEdgesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.edges = new ArrayList<org.opentripplanner.api.thrift.definition.GraphEdge>(_list37.size);
        for (int _i38 = 0; _i38 < _list37.size; ++_i38)
        {
          org.opentripplanner.api.thrift.definition.GraphEdge _elem39; // required
          _elem39 = new org.opentripplanner.api.thrift.definition.GraphEdge();
          _elem39.read(iprot);
          struct.edges.add(_elem39);
        }
      }
      struct.setEdgesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.compute_time_millis = iprot.readI64();
        struct.setCompute_time_millisIsSet(true);
      }
    }
  }

}

