package br.com.joaomarcos.helloandroid.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()