package com.example.breakingnews.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.breakingnews.R
import com.example.breakingnews.`data`.model.Articles
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class SavedNewsFragmentDirections private constructor() {
  private data class ActionSavedNewsFragmentToArticleFragment(
    public val article: Articles
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_savedNewsFragment_to_articleFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Articles::class.java)) {
        result.putParcelable("article", this.article as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Articles::class.java)) {
        result.putSerializable("article", this.article as Serializable)
      } else {
        throw UnsupportedOperationException(Articles::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionSavedNewsFragmentToArticleFragment(article: Articles): NavDirections =
        ActionSavedNewsFragmentToArticleFragment(article)
  }
}
