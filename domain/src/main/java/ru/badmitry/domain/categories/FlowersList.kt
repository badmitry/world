package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object FlowersList {
    val entities = listOf(
        Entity(
            nameResId = R.string.flowers_chamomile,
            imageResId = R.drawable.flowers_chamomile,
            nameSoundResId = R.raw.flowers_chamomile,
        ),
        Entity(
            nameResId = R.string.flowers_dandelion,
            imageResId = R.drawable.flowers_dandelion,
            nameSoundResId = R.raw.flowers_dandelion,
        ),
        Entity(
            nameResId = R.string.flowers_poppy,
            imageResId = R.drawable.flowers_poppy,
            nameSoundResId = R.raw.flowers_poppy,
        ),
        Entity(
            nameResId = R.string.flowers_rose,
            imageResId = R.drawable.flowers_rose,
            nameSoundResId = R.raw.flowers_rose,
        ),
    )
}
