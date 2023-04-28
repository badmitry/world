package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object ToysList {
    val entities = listOf(
        Entity(
            nameResId = R.string.toys_ball,
            imageResId = R.drawable.toys_ball,
            nameSoundResId = R.raw.toys_ball,
        ),
        Entity(
            nameResId = R.string.toys_home,
            imageResId = R.drawable.toys_home,
            nameSoundResId = R.raw.toys_home,
        ),
        Entity(
            nameResId = R.string.toys_cube,
            imageResId = R.drawable.toys_cube,
            nameSoundResId = R.raw.toys_cube,
        ),
        Entity(
            nameResId = R.string.toys_doll,
            imageResId = R.drawable.toys_doll,
            nameSoundResId = R.raw.toys_doll,
        ),
        Entity(
            nameResId = R.string.toys_shovel,
            imageResId = R.drawable.toys_shovel,
            nameSoundResId = R.raw.toys_shovel,
        ),
        Entity(
            nameResId = R.string.toys_balloon,
            imageResId = R.drawable.toys_balloon,
            nameSoundResId = R.raw.toys_balloon,
        )
    )
}
