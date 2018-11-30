package tamil.com.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tamil.com.retrofit.Model.GetAndroidList;
import tamil.com.retrofit.api.ApiClient;
import tamil.com.retrofit.api.ApiInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<GetAndroidList> call = apiService.getAndroidVersion();
        call.enqueue(new Callback<GetAndroidList>() {
            @Override
            public void onResponse(Call<GetAndroidList> call, Response<GetAndroidList> response) {


                int statusCode = response.code();
                try {

                    if (response.body() != null) {

                        List<GetAndroidList.Item> allUserses = response.body().getAndroid();
                        String ver = allUserses.get(0).getVer();
                        String api = allUserses.get(0).getApi();

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<GetAndroidList> call, Throwable t) {
                // Log error here since request failed
                Log.e("q123", t.toString());
            }
        });
    }
}
