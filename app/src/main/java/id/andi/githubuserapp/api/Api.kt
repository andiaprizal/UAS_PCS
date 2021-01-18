package id.andi.githubuserapp.api

import id.andi.githubuserapp.data.model.DetailUserResponse
import id.andi.githubuserapp.data.model.User
import id.andi.githubuserapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 473076699cd13bb9e9b0c09930819733673ba9ee")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 473076699cd13bb9e9b0c09930819733673ba9ee")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 473076699cd13bb9e9b0c09930819733673ba9ee")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 473076699cd13bb9e9b0c09930819733673ba9ee")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}