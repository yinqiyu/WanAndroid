package com.eric.wanandroid.base.net

import com.eric.wanandroid.bean.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


/**
 * Created by eric on 20-9-21
 */
interface OpenApi {

    /**
     * 首页轮播图
     */
    @GET("banner/json")
    fun getBanner(): Call<HomeBannerEntity>

    /**
     * 获取首页文章
     */
    @GET("article/list/{page}/json")
    fun getHomeArticle(
        @Path("page") page: String
    ): Call<HomeArticleEntity>

    /**
     * 获取个人积分信息
     */
    @GET("lg/coin/userinfo/json")
    fun getPersonalInfo(): Call<PersonalInfoEntity>

    /**
     * 获取问答列表
     */
    @GET("wenda/list/{page}/json")
    fun getQAList(
        @Path("page") page: String
    ): Call<QAEntity>

    @GET("user_article/list/{page}/json")
    fun getSquareArticle(
        @Path("page") page: String
    ): Call<SquareEntity>
}