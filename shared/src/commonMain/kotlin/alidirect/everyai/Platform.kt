package alidirect.everyai

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform