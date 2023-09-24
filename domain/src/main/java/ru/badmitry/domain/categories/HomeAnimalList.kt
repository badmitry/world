package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object HomeAnimalList {
    val entities = listOf(
        Entity(
            nameResId  =R.string.home_animals_cow,
            imageResId = R.drawable.home_animal_cow,
            nameSoundResId = R.raw.home_animal_cow_name,
            soundResId = R.raw.home_animal_cow_sound
        ),
        Entity(
            nameResId  =R.string.home_animals_horse,
            imageResId = R.drawable.home_animal_horse,
            nameSoundResId = R.raw.home_animal_horse_name,
            soundResId = R.raw.home_animal_horse_sound
        ),
        Entity(
            nameResId = R.string.home_animals_pig,
            imageResId = R.drawable.home_animal_pig,
            nameSoundResId = R.raw.home_animal_pig_name,
            soundResId = R.raw.home_animal_pig_sound
        ),
        Entity(
            nameResId = R.string.home_animals_goat,
            imageResId = R.drawable.home_animal_goat,
            nameSoundResId = R.raw.home_animal_goat_name,
            soundResId = R.raw.home_animal_goat_sound
        ),
        Entity(
            nameResId = R.string.home_animals_sheep,
            imageResId = R.drawable.home_animal_sheep,
            nameSoundResId = R.raw.home_animal_sheep_name,
            soundResId = R.raw.home_animal_sheep_sound
        ),
        Entity(
            nameResId = R.string.home_animals_dog,
            imageResId = R.drawable.home_animal_dog,
            nameSoundResId = R.raw.home_animal_dog_name,
            soundResId = R.raw.home_animal_dog_sound
        ),
        Entity(
            nameResId = R.string.home_animals_cat,
            imageResId = R.drawable.home_animal_cat,
            nameSoundResId = R.raw.home_animal_cat_name,
            soundResId = R.raw.home_animal_cat_sound
        ),
    )
}
