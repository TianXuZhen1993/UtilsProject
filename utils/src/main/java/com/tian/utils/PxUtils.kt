package com.tian.utils

import android.content.Context

object PxUtils {
    fun dpToPx(context: Context, dp: Int): Int {
        return (context.resources.displayMetrics.density * dp + 0.5f).toInt()
    }

    fun spToPx(context: Context, sp: Int): Int {
        return (context.resources.displayMetrics.scaledDensity * sp + 0.5f).toInt()
    }
}