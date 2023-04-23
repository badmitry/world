package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object ColorsList {
    val entities = listOf(
        Entity(
            nameResId = R.string.colors_blue,
            imageResId = R.drawable.colors_blue,
            nameSoundResId = R.raw.colors_blue,
        ),
        Entity(
            nameResId = R.string.colors_brown,
            imageResId = R.drawable.colors_brown,
            nameSoundResId = R.raw.colors_brown,
        ),
        Entity(
            nameResId = R.string.colors_green,
            imageResId = R.drawable.colors_green,
            nameSoundResId = R.raw.colors_green,
        ),
        Entity(
            nameResId = R.string.colors_orange,
            imageResId = R.drawable.colors_orange,
            nameSoundResId = R.raw.colors_orange,
        ),
        Entity(
            nameResId = R.string.colors_purple,
            imageResId = R.drawable.colors_purple,
            nameSoundResId = R.raw.colors_purple,
        ),
        Entity(
            nameResId = R.string.colors_red,
            imageResId = R.drawable.colors_red,
            nameSoundResId = R.raw.colors_red,
        ),
        Entity(
            nameResId = R.string.colors_yellow,
            imageResId = R.drawable.colors_yellow,
            nameSoundResId = R.raw.colors_yellow,
        ),
    )
}
