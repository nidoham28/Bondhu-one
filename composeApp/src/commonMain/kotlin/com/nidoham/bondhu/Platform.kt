package com.nidoham.bondhu

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform