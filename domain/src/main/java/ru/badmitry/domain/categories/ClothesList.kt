package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object ClothesList {
    val entities = listOf(
        Entity(
            nameResId = R.string.clothes_hat,
            imageResId = R.drawable.clothes_hat,
            nameSoundResId = R.raw.clothes_hat,
        ),
        Entity(
            nameResId = R.string.clothes_sweater,
            imageResId = R.drawable.clothes_sweater,
            nameSoundResId = R.raw.clothes_sweater,
        ),
        Entity(
            nameResId = R.string.clothes_socks,
            imageResId = R.drawable.clothes_socks,
            nameSoundResId = R.raw.clothes_socks,
        ),
        Entity(
            nameResId = R.string.clothes_jacket,
            imageResId = R.drawable.clothes_jacket,
            nameSoundResId = R.raw.clothes_jacket,
        ),
        Entity(
            nameResId = R.string.clothes_pants,
            imageResId = R.drawable.clothes_pants,
            nameSoundResId = R.raw.clothes_pants,
        ),
        Entity(
            nameResId = R.string.clothes_shirt,
            imageResId = R.drawable.clothes_shirt,
            nameSoundResId = R.raw.clothes_shirt,
        ),
    )
}
