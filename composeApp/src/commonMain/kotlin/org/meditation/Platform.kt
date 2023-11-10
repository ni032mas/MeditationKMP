package org.meditation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform