package com.chummy_tummies.app.login

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    @GetMapping("/login")
    fun login(
            @RequestParam(value = "email") email: String,
            @RequestParam(value = "password") password: String
    ): QLogin {

        return QLogin(email, password)
    }

}