package bwf.idat.topitopapp.repository

import bwf.idat.topitopapp.model.User
import bwf.idat.topitopapp.retrofit.RetrofitHelper

class UserRepository {
    suspend fun getMeals():List<User>{
        val response = RetrofitHelper.userInterface.validarUser()
        return response.user
    }

}