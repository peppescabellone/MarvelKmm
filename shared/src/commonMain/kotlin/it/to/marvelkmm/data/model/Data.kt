package it.to.marvelkmm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("results") val characters: List<SuperHero>,
    @SerialName("offset") val offset: Int,
    @SerialName("limit") val limit: Int,
    @SerialName("total") val total: Int,
    @SerialName("count") val count: Int,
)
