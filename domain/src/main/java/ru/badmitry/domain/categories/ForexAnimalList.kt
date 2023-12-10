package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object ForexAnimalList {
    val entities = listOf(
        Entity(
            nameResId = R.string.forest_animal_hedgehog,
            imageResId = R.drawable.forest_animal_hedgehog,
            nameSoundResId = R.raw.forest_animal_hedgehog_name,
            soundResId = R.raw.forest_animal_hedgehog_sound
        ),
        Entity(
            nameResId = R.string.forest_animal_fox,
            imageResId = R.drawable.forest_animal_fox,
            nameSoundResId = R.raw.forest_animal_fox_name,
            soundResId = R.raw.forest_animal_fox_sound
        ),
        Entity(
            nameResId = R.string.forest_animal_wolf,
            imageResId = R.drawable.forest_animal_wolf,
            nameSoundResId = R.raw.forest_animal_wolf_name,
            soundResId = R.raw.forest_animal_wolf_sound
        ),
        Entity(
            nameResId = R.string.forest_animal_hare,
            imageResId = R.drawable.forest_animal_hare,
            nameSoundResId = R.raw.forest_animal_hare_name,
            soundResId = R.raw.forest_animal_hare_sound
        ),
        Entity(
            nameResId = R.string.forest_animal_squirrel,
            imageResId = R.drawable.forest_animal_squirrel,
            nameSoundResId = R.raw.forest_animal_squirrel_name,
            soundResId = R.raw.forest_animal_squirrel_sound
        ),
        Entity(
            nameResId = R.string.forest_animal_bear,
            imageResId = R.drawable.forest_animal_bear,
            nameSoundResId = R.raw.forest_animal_bear_name,
            soundResId = R.raw.forest_animal_bear_sound
        ),
    )
}
