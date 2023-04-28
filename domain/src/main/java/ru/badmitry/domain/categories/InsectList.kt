package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object InsectList {
    val entities = listOf(
        Entity(
            nameResId = R.string.insect_wasp,
            imageResId = R.drawable.insect_wasp,
            nameSoundResId = R.raw.insect_wasp,
        ),
        Entity(
            nameResId = R.string.insect_spider,
            imageResId = R.drawable.insect_spider,
            nameSoundResId = R.raw.insect_spider,
        ),
        Entity(
            nameResId = R.string.insect_bug,
            imageResId = R.drawable.insect_bug,
            nameSoundResId = R.raw.insect_bug,
        ),
        Entity(
            nameResId = R.string.insect_fly,
            imageResId = R.drawable.insect_fly,
            nameSoundResId = R.raw.insect_fly,
        ),
        Entity(
            nameResId = R.string.insect_butterfly,
            imageResId = R.drawable.insect_butterfly,
            nameSoundResId = R.raw.insect_butterfly,
        ),
        Entity(
            nameResId = R.string.insect_mosquito,
            imageResId = R.drawable.insect_mosquito,
            nameSoundResId = R.raw.insect_mosquito,
        )
    )
}
