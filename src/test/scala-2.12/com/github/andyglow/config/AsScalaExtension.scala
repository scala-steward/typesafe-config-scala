package com.github.andyglow.config

import scala.collection.convert.AsScalaConverters


trait AsScalaExtension extends AsScalaConverters {

  implicit class JavaListOps[T](private val x: java.util.List[T]) {

    def asScala: List[T] = {
      asScalaBuffer(x).toList
    }
  }

  implicit class JavaMapOps[K, V](private val x: java.util.Map[K, V]) {

    def asScala: Map[K, V] = {
      mapAsScalaMap(x).toMap
    }
  }
}
