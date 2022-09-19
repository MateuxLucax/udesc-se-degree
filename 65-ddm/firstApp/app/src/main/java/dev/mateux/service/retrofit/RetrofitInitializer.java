package dev.mateux.service.retrofit;

import dev.mateux.service.GithubService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInitializer {

    private final Retrofit retrofit;

    public RetrofitInitializer() {
        retrofit = new Retrofit.Builder()
                .baseUrl(GithubService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    public GithubService getGithubService() {
        return retrofit.create(GithubService.class);
    }
}
