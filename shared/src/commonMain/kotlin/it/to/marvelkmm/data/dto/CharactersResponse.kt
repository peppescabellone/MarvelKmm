package it.to.marvelkmm.data.dto

import it.to.marvelkmm.data.model.Data
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharactersResponse(
    @SerialName("data") val data: Data

)
