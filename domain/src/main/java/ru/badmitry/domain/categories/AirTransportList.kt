package ru.badmitry.domain.categories

import ru.badmitry.domain.Entity
import  ru.badmitry.resources.R

object AirTransportList {
    val entities = listOf(
        Entity(
            nameResId = R.string.air_transport_plain,
            imageResId = R.drawable.air_transprt_plain,
            nameSoundResId = R.raw.air_transprt_plain,
        ),
        Entity(
            nameResId = R.string.air_transport_helicopter,
            imageResId = R.drawable.air_transprt_helicopter,
            nameSoundResId = R.raw.air_transprt_helicopter,
        ),
        Entity(
            nameResId = R.string.air_transport_fighter,
            imageResId = R.drawable.air_transport_fighter,
            nameSoundResId = R.raw.air_transprt_fighter,
        ),
        Entity(
            nameResId = R.string.air_transport_balloon,
            imageResId = R.drawable.air_transport_balloon,
            nameSoundResId = R.raw.air_transprt_balloon,
        ),
        Entity(
            nameResId = R.string.air_transport_parachute,
            imageResId = R.drawable.air_transport_parachute,
            nameSoundResId = R.raw.air_transprt_parachute,
        ),
        Entity(
            nameResId = R.string.air_transport_glider,
            imageResId = R.drawable.air_transport_glider,
            nameSoundResId = R.raw.air_transprt_glider,
        ),
        Entity(
            nameResId = R.string.air_transport_rocket,
            imageResId = R.drawable.air_transport_rocket,
            nameSoundResId = R.raw.air_transport_rocket,
        ),
        Entity(
            nameResId = R.string.air_transport_biplane,
            imageResId = R.drawable.air_transport_biplane,
            nameSoundResId = R.raw.air_transport_biplane,
        ),
    )
}
