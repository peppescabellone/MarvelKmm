package it.to.marvelkmm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Url(
    @SerialName("url") val url: String,
    @SerialName("type") val type: UrlType
)
