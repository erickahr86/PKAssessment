package com.erick.herrera.pkassessment.common


import androidx.compose.ui.graphics.Color


// Some Extension Functions

val String.color  get() = Color(android.graphics.Color.parseColor(this))
