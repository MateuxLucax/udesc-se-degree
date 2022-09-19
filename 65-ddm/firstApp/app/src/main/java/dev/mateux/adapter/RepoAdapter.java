package dev.mateux.adapter;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.mateux.R;
import dev.mateux.model.Repo;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.ViewHolder> {

    private final List<Repo> repos;

    public RepoAdapter(List<Repo> repos) {
        this.repos = repos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_adapter_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Repo repo = repos.get(position);
        holder.getRepoName().setText(repo.getName());
        holder.setRepoLink(repo.getFullName());
    }

    @Override
    public int getItemCount() {
        return repos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView repoName;
        private String repoLink;

        public ViewHolder(View view) {
            super(view);
            repoName = view.findViewById(R.id.repo_name);

            view.setOnClickListener(clickView -> {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/" + repoLink));
                clickView.getContext().startActivity(intent);
            });
        }

        public void setRepoLink(String repoLink) {
            this.repoLink = repoLink;
        }

        public TextView getRepoName() {
            return repoName;
        }
    }
}
