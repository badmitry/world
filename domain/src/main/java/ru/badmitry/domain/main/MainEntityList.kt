package ru.badmitry.domain.main

object MainEntityList {
    val mainEntity = MainCategories.values().map {
        MainEntity(
            id = it.ordinal,
            imageRes = it.imageRes,
            nameRes = it.cardNameRes
        )
    }
}