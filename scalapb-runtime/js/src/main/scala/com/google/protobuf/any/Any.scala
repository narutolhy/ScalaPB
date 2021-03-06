// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.any



@SerialVersionUID(0L)
final case class Any(
    typeUrl: String = "",
    value: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Any] with com.trueaccord.lenses.Updatable[Any] with com.trueaccord.scalapb.AnyMethods {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (typeUrl != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, typeUrl) }
      if (value != com.google.protobuf.ByteString.EMPTY) { __size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, value) }
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
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = typeUrl
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = value
        if (__v != com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.any.Any = {
      var __typeUrl = this.typeUrl
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __typeUrl = _input__.readString()
          case 18 =>
            __value = _input__.readBytes()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.any.Any(
          typeUrl = __typeUrl,
          value = __value
      )
    }
    def withTypeUrl(__v: String): Any = copy(typeUrl = __v)
    def withValue(__v: com.google.protobuf.ByteString): Any = copy(value = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = typeUrl
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = value
          if (__t != com.google.protobuf.ByteString.EMPTY) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.any.Any
}

object Any extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.any.Any] with com.trueaccord.scalapb.AnyCompanionMethods {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.any.Any] with com.trueaccord.scalapb.AnyCompanionMethods = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.any.Any = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.any.Any(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), com.google.protobuf.ByteString.EMPTY).asInstanceOf[com.google.protobuf.ByteString]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = AnyProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.any.Any(
  )
  implicit class AnyLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.any.Any]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.any.Any](_l) {
    def typeUrl: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.typeUrl)((c_, f_) => c_.copy(typeUrl = f_))
    def value: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.ByteString] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val TYPE_URL_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
}
