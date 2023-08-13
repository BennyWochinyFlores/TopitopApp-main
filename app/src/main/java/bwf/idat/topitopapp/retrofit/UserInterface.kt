package bwf.idat.topitopapp.retrofit

import bwf.idat.topitopapp.response.UserListResponse
import retrofit2.http.POST

interface UserInterface {
    @POST("login/login")
    suspend fun validarUser():UserListResponse

}