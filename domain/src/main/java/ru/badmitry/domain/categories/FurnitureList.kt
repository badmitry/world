package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object FurnitureList {
    val entities = listOf(
        Entity(
            nameResId = R.string.furniture_cupboard,
            imageResId = R.drawable.furniture_cupboard,
            nameSoundResId = R.raw.furniture_cupboard,
        ),
        Entity(
            nameResId = R.string.furniture_table,
            imageResId = R.drawable.furniture_table,
            nameSoundResId = R.raw.furniture_table,
        ),
        Entity(
            nameResId = R.string.furniture_chair,
            imageResId = R.drawable.furniture_chair,
            nameSoundResId = R.raw.furniture_chair,
        ),
        Entity(
            nameResId = R.string.furniture_bed,
            imageResId = R.drawable.furniture_bed,
            nameSoundResId = R.raw.furniture_bed,
        ),
        Entity(
            nameResId = R.string.furniture_sofa,
            imageResId = R.drawable.furniture_sofa,
            nameSoundResId = R.raw.furniture_sofa,
        )
    )
}
