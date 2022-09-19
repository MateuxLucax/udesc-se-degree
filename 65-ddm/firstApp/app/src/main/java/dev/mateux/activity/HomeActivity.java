package dev.mateux.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.mateux.R;
import dev.mateux.adapter.RepoAdapter;
import dev.mateux.model.Repo;
import dev.mateux.service.GithubService;
import dev.mateux.service.retrofit.RetrofitInitializer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView reposList = findViewById(R.id.home_list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        reposList.setLayoutManager(layoutManager);
        GithubService service = new RetrofitInitializer().getGithubService();

        Call<List<Repo>> reposCall = service.listRepos(getIntent().getExtras().getString("user"));
        reposCall.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                List<Repo> repos = response.body();
                reposList.setAdapter(new RepoAdapter(repos));
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                System.out.println("error while fetching repos. " + t.getMessage());
            }
        });
    }

}