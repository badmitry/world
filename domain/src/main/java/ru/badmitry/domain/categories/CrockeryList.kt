package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object CrockeryList {
    val entities = listOf(
        Entity(
            nameResId = R.string.crockery_cup,
            imageResId = R.drawable.crockery_cup,
            nameSoundResId = R.raw.crockery_cup,
        ),
        Entity(
            nameResId = R.string.crockery_fork,
            imageResId = R.drawable.crockery_fork,
            nameSoundResId = R.raw.crockery_fork,
        ),
        Entity(
            nameResId = R.string.crockery_knife,
            imageResId = R.drawable.crockery_knife,
            nameSoundResId = R.raw.crockery_knife,
        ),
        Entity(
            nameResId = R.string.crockery_plate,
            imageResId = R.drawable.crockery_plate,
            nameSoundResId = R.raw.crockery_plate,
        ),
        Entity(
            nameResId = R.string.crockery_pot,
            imageResId = R.drawable.crockery_pot,
            nameSoundResId = R.raw.crockery_pot,
        ),
        Entity(
            nameResId = R.string.crockery_spoon,
            imageResId = R.drawable.crockery_spoon,
            nameSoundResId = R.raw.crockery_spoon,
        ),
    )
}
