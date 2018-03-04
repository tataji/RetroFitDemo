package com.test.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.test.retrofitdemo.model.Post;
import com.test.retrofitdemo.model.PostReponseChild;
import com.test.retrofitdemo.model.PostResponseParent;
import com.test.retrofitdemo.rest.ApiClient;
import com.test.retrofitdemo.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Post post=new Post("","","3","","22","","","");
        Call<PostResponseParent> call = apiService.savePost1(post);
        call.enqueue(new Callback<PostResponseParent>() {
            public void onResponse(Call<PostResponseParent> call, Response<PostResponseParent> response) {
                int statusCode = response.code();
                Log.d("status",statusCode+"");
                List<PostReponseChild> child = response.body().getCrimeDetails();
              for (int i=0;i<child.size();i++)

              {
                  Log.d("crimeno",child.get(i).getCrimeId());
              }

            }
            public void onFailure(Call<PostResponseParent> call, Throwable t) {

            }

        });


    }
}
