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
 * @param email 
 * @param password 
 * @param phone 
 */
data class UserLoginRequest(

    @get:NotNull 
    @JsonProperty("email") val email: kotlin.String,

    @get:NotNull 
    @JsonProperty("password") val password: kotlin.String,

    @JsonProperty("phone") val phone: kotlin.String? = null
) {

}

