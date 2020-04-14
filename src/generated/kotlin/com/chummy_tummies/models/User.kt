package com.chummy_tummies.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param id 
 * @param name 
 * @param email 
 * @param phone 
 * @param password 
 */
data class User(

    @get:NotNull 
    @JsonProperty("id") val id: kotlin.String,

    @get:NotNull 
    @JsonProperty("name") val name: kotlin.String,

    @get:NotNull 
    @JsonProperty("email") val email: kotlin.String,

    @get:NotNull 
    @JsonProperty("phone") val phone: kotlin.String,

    @JsonProperty("password") val password: kotlin.String? = null
) {

}

