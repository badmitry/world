package ru.badmitry.domain.main

import ru.badmitry.domain.Entity
import ru.badmitry.domain.categories.*
import ru.badmitry.resources.R

enum class MainCategories(val entityList: List<Entity>, val imageRes: Int, val cardNameRes: Int) {
    HOME_ANIMALS(HomeAnimalList.entities,  R.drawable.home_animal_cow, R.string.home_animals),
    FOREST_ANIMALS(ForexAnimalList.entities, R.drawable.forest_animal_bear, R.string.forest_animal),
    VEGETABLE_FRUIT(FruitList.entities, R.drawable.fruit_apple, R.string.fruit),
    NUMBERS(NumbersList.entities, R.drawable.number_ten, R.string.number),
    COLORS(ColorsList.entities, R.drawable.colors_red, R.string.colors),
    CLOTHES(ClothesList.entities, R.drawable.clothes_socks, R.string.clothes),
    CROCKERY(CrockeryList.entities, R.drawable.crockery_cup, R.string.crockery),
    AIR_TRANSPORT(AirTransportList.entities, R.drawable.air_transprt_plain, R.string.air_transport),
    TOYS(ToysList.entities, R.drawable.toys_balloon, R.string.toys),
    Furniture(FurnitureList.entities, R.drawable.furniture_chair, R.string.furniture),
    INSECT(InsectList.entities, R.drawable.insect_fly, R.string.insect),
    PROFESSIONS(ProfessionsList.entities, R.drawable.profession_cook, R.string.profession),
    FLOWERS(FlowersList.entities, R.drawable.flowers_chamomile, R.string.flowers),
    BODY(BodyList.entities, R.drawable.body_eye, R.string.body),
}