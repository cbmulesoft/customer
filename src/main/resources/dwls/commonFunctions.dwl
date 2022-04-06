%dw 2.0
fun generateDecimalPlaces(amt) =
amt as Number as String {format: "#.00"} as Number

fun setLocale(locale) =
if (isEmpty(locale)) "hi_IN" else locale