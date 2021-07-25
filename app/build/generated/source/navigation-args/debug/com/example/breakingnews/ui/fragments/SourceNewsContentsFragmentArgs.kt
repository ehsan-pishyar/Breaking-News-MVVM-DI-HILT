package com.example.breakingnews.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.breakingnews.`data`.model.Sources
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class SourceNewsContentsFragmentArgs(
  public val source: Sources
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Sources::class.java)) {
      result.putParcelable("source", this.source as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Sources::class.java)) {
      result.putSerializable("source", this.source as Serializable)
    } else {
      throw UnsupportedOperationException(Sources::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SourceNewsContentsFragmentArgs {
      bundle.setClassLoader(SourceNewsContentsFragmentArgs::class.java.classLoader)
      val __source : Sources?
      if (bundle.containsKey("source")) {
        if (Parcelable::class.java.isAssignableFrom(Sources::class.java) ||
            Serializable::class.java.isAssignableFrom(Sources::class.java)) {
          __source = bundle.get("source") as Sources?
        } else {
          throw UnsupportedOperationException(Sources::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__source == null) {
          throw IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"source\" is missing and does not have an android:defaultValue")
      }
      return SourceNewsContentsFragmentArgs(__source)
    }
  }
}
