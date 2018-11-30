package tamil.com.retrofit.api;

import retrofit2.Call;
import retrofit2.http.GET;
import tamil.com.retrofit.Model.GetAndroidList;

public interface ApiInterface {

    @GET("android/jsonandroid")
    Call<GetAndroidList> getAndroidVersion();
}
