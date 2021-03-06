// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.field_mask

import scala.collection.JavaConversions._

@SerialVersionUID(0L)
final case class FieldMask(
    paths: scala.collection.Seq[String] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[FieldMask] with com.trueaccord.lenses.Updatable[FieldMask] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      paths.foreach(paths => __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, paths))
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
      paths.foreach { __v => 
        _output__.writeString(1, __v)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.field_mask.FieldMask = {
      val __paths = (scala.collection.immutable.Vector.newBuilder[String] ++= this.paths)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __paths += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.field_mask.FieldMask(
          paths = __paths.result()
      )
    }
    def clearPaths = copy(paths = scala.collection.Seq.empty)
    def addPaths(__vs: String*): FieldMask = addAllPaths(__vs)
    def addAllPaths(__vs: TraversableOnce[String]): FieldMask = copy(paths = paths ++ __vs)
    def withPaths(__v: scala.collection.Seq[String]): FieldMask = copy(paths = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => paths
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.field_mask.FieldMask
}

object FieldMask extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.field_mask.FieldMask] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.field_mask.FieldMask, com.google.protobuf.FieldMask] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.field_mask.FieldMask] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.field_mask.FieldMask, com.google.protobuf.FieldMask] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.field_mask.FieldMask): com.google.protobuf.FieldMask = {
    val javaPbOut = com.google.protobuf.FieldMask.newBuilder
    javaPbOut.addAllPaths(scalaPbSource.paths)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.FieldMask): com.google.protobuf.field_mask.FieldMask = com.google.protobuf.field_mask.FieldMask(
    paths = javaPbSource.getPathsList
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.field_mask.FieldMask = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.field_mask.FieldMask(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[scala.collection.Seq[String]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = FieldMaskProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.field_mask.FieldMask(
  )
  implicit class FieldMaskLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.field_mask.FieldMask]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.field_mask.FieldMask](_l) {
    def paths: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[String]] = field(_.paths)((c_, f_) => c_.copy(paths = f_))
  }
  final val PATHS_FIELD_NUMBER = 1
}
