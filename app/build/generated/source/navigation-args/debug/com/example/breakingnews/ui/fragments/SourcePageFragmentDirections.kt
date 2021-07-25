package com.example.breakingnews.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.breakingnews.R
import com.example.breakingnews.`data`.model.Sources
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class SourcePageFragmentDirections private constructor() {
  private data class ActionSourcePageFragmentToSourceNewsContentsFragment(
    public val source: Sources
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_sourcePageFragment_to_sourceNewsContentsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionSourcePageFragmentToSourceNewsContentsFragment(source: Sources): NavDirections
        = ActionSourcePageFragmentToSourceNewsContentsFragment(source)
  }
}
