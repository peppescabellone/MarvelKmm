package it.to.marvelkmm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SuperHero(
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
    @SerialName("description") val description: String,
  //  @SerialName("resourceURI") val resourceURI: Thumbnail,
  //  @SerialName("urls") val urls: List<Url> = listOf()
)
