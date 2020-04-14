package com.chummy_tummies.apis

import com.chummy_tummies.models.User
import com.chummy_tummies.models.UserLoginRequest
interface InternalApiService {

	fun userLogin(userLoginRequest: UserLoginRequest?): List<User>
}
