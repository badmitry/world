package ru.badmitry.domain

import java.io.Serializable

data class Entity(
    val nameResId: Int,
    val imageResId: Int,
    val nameSoundResId: Int,
    val soundResId: Int? = null
) : Serializable
