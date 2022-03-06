package fastcampus.aop.part3.aop.part4.aop_part4_chapter05.utillity

import fastcampus.aop.part3.aop.part4.aop_part4_chapter05.data.response.GithubAccessTokenResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface AuthApiService {

    @FormUrlEncoded
    @POST("login/oauth/access_token")
    @Headers("Accept: application/json")
    suspend fun getAccessToken(
        @Field("client_id") clientId: String,
        @Field("client_secret") clientSecret: String,
        @Field("code") code: String
    ): GithubAccessTokenResponse

}