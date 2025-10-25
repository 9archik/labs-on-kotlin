// fun main() {
//     println("1")
//     println("2")
//     println("3")
// }

// fun main() {
//     println("I'm")
//     println("learning")
//     println("Kotlin!")
// }

// fun main() {
//     println("Monday")
//     println("Tuesday")
//     println("Wednesday")
//     println("Thursday")
//     println("Friday")
// }

// fun main() {
//     println("Tomorrow is rainy")
// }

// fun main() {
//     println("There is a chance of snow")
// }

// fun main() {
//     println("Cloudy")
//     println("Partly Cloudy")
//     println("Windy")
// }

//fun main() {
//    println("How's the weather today?")
//}

//fun main() {
//    val count: Int = 10
//    println("You have $count unread messages.")
//}

//fun main() {
//    val unreadCount = 5
//    val readCount = 100
//    println("You have ${unreadCount + readCount} total messages in your inbox.")
//}

//fun main() {
//    val numberOfPhotos = 100
//    val photosDeleted = 10
//    println("$numberOfPhotos photos")
//    println("$photosDeleted photos deleted")
//    println("${numberOfPhotos - photosDeleted} photos left")
//}

//fun main() {
//    var cartTotal = 0
//    cartTotal = 20
//    println("Total: $cartTotal")
//}

//fun main() {
//    var count = 10
//    println("You have $count unread messages.")
//    count = count + 1
//    println("You have $count unread messages.")
//}

//fun main() {
//    val trip1: Double = 3.20
//    val trip2: Double = 4.10
//    val trip3: Double = 1.72
//    val totalTripLength: Double = trip1 + trip2 + trip3
//    println("$totalTripLength miles left to destination")
//}

//fun main() {
//    val nextMeeting = "Next meeting: "
//    val date = "January 1"
//    val reminder = nextMeeting + date + " at work"
//    println(reminder)
//}

//fun main() {
//    val notificationsEnabled: Boolean = false
//    println("Are notifications enabled? " + notificationsEnabled)
//}



// unit 2


//fun main() {
//    println(1 == 1)
//    println(1 < 1)
//
//    val trafficLightColor = "Green"
//
//
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    } else if (trafficLightColor == "Yellow") {
//        println("Slow")
//    } else if (trafficLightColor == "Green") {
//        println("Go")
//    } else {
//        println("Invalid traffic-light color")
//    }
//
//
//    when (trafficLightColor) {
//        "Red" -> println("Stop")
//        "Yellow" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")
//    }
//
//
//    val x = 3
//
//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        3 -> println("x is a prime number between 1 and 10.")
//        5 -> println("x is a prime number between 1 and 10.")
//        7 -> println("x is a prime number between 1 and 10.")
//        else -> println("x isn't a prime number between 1 and 10.")
//    }
//
//
//    val x1: Any = 20
//
//    when (x1) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        is Int -> println("x is an integer number, but not between 1 and 10.")
//        else -> println("x isn't an integer number.")
//    }
//
//
//    val trafficLightColor1 = "Amber"
//
//    val message = when(trafficLightColor1) {
//        "Red" -> "Stop"
//        "Yellow", "Amber" -> "Slow"
//        "Green" -> "Go"
//        else -> "Invalid traffic-light color"
//    }
//    println(message)
//
//
//    var number: Int? = 10
//    println(number)
//
//    number = null
//    println(number)
//
//
//    var favoriteActor: String? = "Sandra Oh"
//
//    val lengthOfName = if (favoriteActor != null) {
//        favoriteActor.length
//    } else {
//        0
//    }
//
//    println("The number of characters in your favorite actor's name is $lengthOfName.")
//
//
//    var favoriteActor1: String? = "Sandra Oh"
//
//    val lengthOfName1 = favoriteActor1?.length ?: 0
//
//    println("The number of characters in your favorite actor's name is $lengthOfName1.")
//}


// классы
//import kotlin.properties.ReadWriteProperty
//import kotlin.reflect.KProperty
//
//open class SmartDevice(val name: String, val category: String) {
//
//    var deviceStatus = "online"
//        protected set
//
//    open val deviceType = "unknown"
//
//    open fun turnOn() {
//        deviceStatus = "on"
//    }
//
//    open fun turnOff() {
//        deviceStatus = "off"
//    }
//
//    fun printDeviceInfo() {
//        println("Device name: $name, category: $category, type: $deviceType")
//    }
//}
//
//class SmartTvDevice(deviceName: String, deviceCategory: String) :
//    SmartDevice(name = deviceName, category = deviceCategory) {
//
//    override val deviceType = "Smart TV"
//
//    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
//    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)
//
//    fun increaseSpeakerVolume() {
//        val before = speakerVolume
//        speakerVolume = speakerVolume + 1
//        if (speakerVolume != before) {
//            println("Speaker volume increased to $speakerVolume.")
//        } else {
//            println("Speaker volume is already at max $speakerVolume.")
//        }
//    }
//
//    fun decreaseVolume() {
//        val before = speakerVolume
//        speakerVolume = speakerVolume - 1
//        if (speakerVolume != before) {
//            println("Speaker volume decreased to $speakerVolume.")
//        } else {
//            println("Speaker volume is already at min $speakerVolume.")
//        }
//    }
//
//    fun nextChannel() {
//        val before = channelNumber
//        channelNumber = channelNumber + 1
//        if (channelNumber != before) {
//            println("Channel number increased to $channelNumber.")
//        } else {
//            println("Channel is already at max $channelNumber.")
//        }
//    }
//
//    fun previousChannel() {
//        val before = channelNumber
//        channelNumber = channelNumber - 1
//        if (channelNumber != before) {
//            println("Channel number decreased to $channelNumber.")
//        } else {
//            println("Channel is already at min $channelNumber.")
//        }
//    }
//
//    override fun turnOn() {
//        super.turnOn()
//        println(
//            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
//                    "set to $channelNumber."
//        )
//    }
//
//    override fun turnOff() {
//        super.turnOff()
//        println("$name turned off")
//    }
//}
//
//class SmartLightDevice(deviceName: String, deviceCategory: String) :
//    SmartDevice(name = deviceName, category = deviceCategory) {
//
//    override val deviceType = "Smart Light"
//
//    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)
//
//    fun increaseBrightness() {
//        val before = brightnessLevel
//        brightnessLevel = brightnessLevel + 1
//        if (brightnessLevel != before) {
//            println("Brightness increased to $brightnessLevel.")
//        } else {
//            println("Brightness is already at max $brightnessLevel.")
//        }
//    }
//
//    fun decreaseBrightness() {
//        val before = brightnessLevel
//        brightnessLevel = brightnessLevel - 1
//        if (brightnessLevel != before) {
//            println("Brightness decreased to $brightnessLevel.")
//        } else {
//            println("Brightness is already at min $brightnessLevel.")
//        }
//    }
//
//    override fun turnOn() {
//        super.turnOn()
//        brightnessLevel = 2
//        println("$name turned on. The brightness level is $brightnessLevel.")
//    }
//
//    override fun turnOff() {
//        super.turnOff()
//        brightnessLevel = 0
//        println("Smart Light turned off")
//    }
//}
//
//class SmartHome(
//    val smartTvDevice: SmartTvDevice,
//    val smartLightDevice: SmartLightDevice
//) {
//
//    var deviceTurnOnCount = 0
//        private set
//
//    // управление ТВ
//    fun turnOnTv() {
//        if (smartTvDevice.deviceStatus != "on") {
//            smartTvDevice.turnOn()
//            deviceTurnOnCount++
//        } else {
//            println("${smartTvDevice.name} is already on.")
//        }
//    }
//
//    fun turnOffTv() {
//        if (smartTvDevice.deviceStatus == "on") {
//            smartTvDevice.turnOff()
//            deviceTurnOnCount--
//        } else {
//            println("${smartTvDevice.name} is already off.")
//        }
//    }
//
//    fun increaseTvVolume() {
//        if (smartTvDevice.deviceStatus == "on") {
//            smartTvDevice.increaseSpeakerVolume()
//        } else {
//            println("${smartTvDevice.name} is off. Turn it on first.")
//        }
//    }
//
//    fun decreaseTvVolume() {
//        if (smartTvDevice.deviceStatus == "on") {
//            smartTvDevice.decreaseVolume()
//        } else {
//            println("${smartTvDevice.name} is off. Turn it on first.")
//        }
//    }
//
//    fun changeTvChannelToNext() {
//        if (smartTvDevice.deviceStatus == "on") {
//            smartTvDevice.nextChannel()
//        } else {
//            println("${smartTvDevice.name} is off. Turn it on first.")
//        }
//    }
//
//    fun changeTvChannelToPrevious() {
//        if (smartTvDevice.deviceStatus == "on") {
//            smartTvDevice.previousChannel()
//        } else {
//            println("${smartTvDevice.name} is off. Turn it on first.")
//        }
//    }
//
//    fun printSmartTvInfo() {
//        smartTvDevice.printDeviceInfo()
//    }
//
//    // управление светом
//    fun turnOnLight() {
//        if (smartLightDevice.deviceStatus != "on") {
//            smartLightDevice.turnOn()
//            deviceTurnOnCount++
//        } else {
//            println("${smartLightDevice.name} is already on.")
//        }
//    }
//
//    fun turnOffLight() {
//        if (smartLightDevice.deviceStatus == "on") {
//            smartLightDevice.turnOff()
//            deviceTurnOnCount--
//        } else {
//            println("${smartLightDevice.name} is already off.")
//        }
//    }
//
//    fun increaseLightBrightness() {
//        if (smartLightDevice.deviceStatus == "on") {
//            smartLightDevice.increaseBrightness()
//        } else {
//            println("${smartLightDevice.name} is off. Turn it on first.")
//        }
//    }
//
//    fun decreaseLightBrightness() {
//        if (smartLightDevice.deviceStatus == "on") {
//            smartLightDevice.decreaseBrightness()
//        } else {
//            println("${smartLightDevice.name} is off. Turn it on first.")
//        }
//    }
//
//    fun printSmartLightInfo() {
//        smartLightDevice.printDeviceInfo()
//    }
//
//    fun turnOffAllDevices() {
//        // выключаем только те, что включены, и корректно обновляем счетчик
//        if (smartTvDevice.deviceStatus == "on") {
//            turnOffTv()
//        }
//        if (smartLightDevice.deviceStatus == "on") {
//            turnOffLight()
//        }
//    }
//}
//
//class RangeRegulator(
//    initialValue: Int,
//    private val minValue: Int,
//    private val maxValue: Int
//) : ReadWriteProperty<Any?, Int> {
//
//    private var fieldData = initialValue
//
//    override fun getValue(thisRef: Any?, property: KProperty<*>): Int = fieldData
//
//    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
//        if (value in minValue..maxValue) {
//            fieldData = value
//        }
//    }
//}
//
//fun main() {
//    // создаем устройства и дом
//    val tv = SmartTvDevice("Android TV", "Entertainment")
//    val light = SmartLightDevice("Google Light", "Utility")
//    val home = SmartHome(tv, light)
//
//    // печать информации
//    home.printSmartTvInfo()
//    home.printSmartLightInfo()
//
//    // попытки действий при выключенных устройствах
//    home.increaseTvVolume()
//    home.decreaseLightBrightness()
//
//    // включаем, проверяем счетчик
//    home.turnOnTv()
//    home.turnOnLight()
//    println("Devices ON count: ${home.deviceTurnOnCount}")
//
//    // действия с ТВ
//    home.increaseTvVolume()
//    home.decreaseTvVolume()
//    home.changeTvChannelToNext()
//    home.changeTvChannelToPrevious()
//
//    // действия со светом
//    home.increaseLightBrightness()
//    home.decreaseLightBrightness()
//
//    // выключаем все и проверяем счетчик
//    home.turnOffAllDevices()
//    println("Devices ON count: ${home.deviceTurnOnCount}")
//}

// 1) Функции-значения
//val trick = {
//    println("No treats!")
//}
//
//// Явно указываем тип
//val treat: () -> Unit = {
//    println("Have a treat!")
//}
//
//// 2) Функция, которая возвращает функцию + принимает функцию-параметр, параметр nullable
//fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
//    return if (isTrick) {
//        trick
//    } else {
//        if (extraTreat != null) {
//            // вызываем только если не null
//            println(extraTreat(5))
//        }
//        treat
//    }
//}
//
//fun main() {
//    // Демонстрация функции как значения
//    val trickFunction = trick
//    trick()
//    trickFunction()
//    treat()
//
//    // Функции-лямбды как значения с типами
//    val coins: (Int) -> String = { quantity ->
//        "$quantity quarters"
//    }
//
//    // Возвращаем функции и потом их вызываем
//    val treatFunction = trickOrTreat(false, coins)   // передаем функцию
//    val trickAgain = trickOrTreat(true, null)        // без доп. угощения
//
//    treatFunction()
//    trickAgain()
//}
// Функции-значения
val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

// Возвращаем функцию и принимаем nullable лямбду как последний параметр
fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        treat
    }
}

fun main() {
    // Передаем лямбду напрямую и используем $it - краткий синтаксис
    val treatFunction = trickOrTreat(false) { "$it quarters" }  // trailing lambda
    val trickFunction = trickOrTreat(true, null)

    repeat(4) {                       // it - индекс повтора, тут не используем
        treatFunction()
    }
    treatFunction()
    trickFunction()
}