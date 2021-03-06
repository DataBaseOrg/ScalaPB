// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

import scala.collection.JavaConverters._

/** Describes a service.
  */
@SerialVersionUID(0L)
final case class ServiceDescriptorProto(
    name: scala.Option[String] = None,
    method: _root_.scala.collection.Seq[com.google.protobuf.descriptor.MethodDescriptorProto] = _root_.scala.collection.Seq.empty,
    options: scala.Option[com.google.protobuf.descriptor.ServiceOptions] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[ServiceDescriptorProto] with com.trueaccord.lenses.Updatable[ServiceDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
      method.foreach(method => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(method.serializedSize) + method.serializedSize)
      if (options.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.get.serializedSize) + options.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      name.foreach { __v =>
        _output__.writeString(1, __v)
      };
      method.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      options.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.ServiceDescriptorProto = {
      var __name = this.name
      val __method = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.MethodDescriptorProto] ++= this.method)
      var __options = this.options
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Some(_input__.readString())
          case 18 =>
            __method += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.MethodDescriptorProto.defaultInstance)
          case 26 =>
            __options = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.ServiceOptions.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.ServiceDescriptorProto(
          name = __name,
          method = __method.result(),
          options = __options
      )
    }
    def getName: String = name.getOrElse("")
    def clearName: ServiceDescriptorProto = copy(name = None)
    def withName(__v: String): ServiceDescriptorProto = copy(name = Some(__v))
    def clearMethod = copy(method = _root_.scala.collection.Seq.empty)
    def addMethod(__vs: com.google.protobuf.descriptor.MethodDescriptorProto*): ServiceDescriptorProto = addAllMethod(__vs)
    def addAllMethod(__vs: TraversableOnce[com.google.protobuf.descriptor.MethodDescriptorProto]): ServiceDescriptorProto = copy(method = method ++ __vs)
    def withMethod(__v: _root_.scala.collection.Seq[com.google.protobuf.descriptor.MethodDescriptorProto]): ServiceDescriptorProto = copy(method = __v)
    def getOptions: com.google.protobuf.descriptor.ServiceOptions = options.getOrElse(com.google.protobuf.descriptor.ServiceOptions.defaultInstance)
    def clearOptions: ServiceDescriptorProto = copy(options = None)
    def withOptions(__v: com.google.protobuf.descriptor.ServiceOptions): ServiceDescriptorProto = copy(options = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => method
        case 3 => options.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(method.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 3 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.ServiceDescriptorProto
}

object ServiceDescriptorProto extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.ServiceDescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.ServiceDescriptorProto, com.google.protobuf.DescriptorProtos.ServiceDescriptorProto] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.ServiceDescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.ServiceDescriptorProto, com.google.protobuf.DescriptorProtos.ServiceDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.ServiceDescriptorProto): com.google.protobuf.DescriptorProtos.ServiceDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    javaPbOut.addAllMethod(scalaPbSource.method.map(com.google.protobuf.descriptor.MethodDescriptorProto.toJavaProto(_))(_root_.scala.collection.breakOut).asJava)
    scalaPbSource.options.map(com.google.protobuf.descriptor.ServiceOptions.toJavaProto(_)).foreach(javaPbOut.setOptions)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.ServiceDescriptorProto): com.google.protobuf.descriptor.ServiceDescriptorProto = com.google.protobuf.descriptor.ServiceDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else None,
    method = javaPbSource.getMethodList.asScala.map(com.google.protobuf.descriptor.MethodDescriptorProto.fromJavaProto(_))(_root_.scala.collection.breakOut),
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.ServiceOptions.fromJavaProto(javaPbSource.getOptions)) else None
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.ServiceDescriptorProto = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.ServiceDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.descriptor.MethodDescriptorProto]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[com.google.protobuf.descriptor.ServiceOptions]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.ServiceDescriptorProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.ServiceDescriptorProto(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.descriptor.MethodDescriptorProto]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[com.google.protobuf.descriptor.ServiceOptions]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.descriptor.MethodDescriptorProto
      case 3 => __out = com.google.protobuf.descriptor.ServiceOptions
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.ServiceDescriptorProto(
  )
  implicit class ServiceDescriptorProtoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.ServiceDescriptorProto]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.ServiceDescriptorProto](_l) {
    def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def method: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.descriptor.MethodDescriptorProto]] = field(_.method)((c_, f_) => c_.copy(method = f_))
    def options: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.ServiceOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Some(f_)))
    def optionalOptions: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.ServiceOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val METHOD_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
}
