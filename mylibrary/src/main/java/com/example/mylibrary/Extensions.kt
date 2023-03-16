package com.example.assignment14

import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

fun Long.tbxfromUnixToFormatted(): String{
    val sdf = SimpleDateFormat("dd/MM/yy HH:mm", Locale.getDefault())
    sdf.timeZone = TimeZone.getTimeZone("Asia/Vietnam")
    val netDate = Date(this*1000)
    return sdf.format(netDate)
}

fun Double.tbxtoOneDecimal(): String{
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.DOWN
    return df.format(this)
}

fun Double.tbxtoTwoDecimal(): String{
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    return df.format(this)
}