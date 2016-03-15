package com.minimize.android.rxretrorealm

import retrofit.http.GET
import retrofit.http.Path
import rx.Observable

/**
 * Created by ahmedrizwan on 15/03/2016.
 *
 */

interface GithubService {
  @GET("users/{username}")
  fun getGithubUser(@Path("username") username: String): Observable<Github>
}



