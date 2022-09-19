package dev.mateux.service;

import java.util.List;

import dev.mateux.model.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {
    String BASE_URL = "https://api.github.com/";

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);

}

