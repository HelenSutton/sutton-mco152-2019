package sutton.net;

import com.google.gson.Gson;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public interface JsonPlaceholderAPI {
    @GET ("/users")
    Observable<UserList> getUserList();

    @GET("/photos")
    Observable<PhotoList> getPhotoList();


}
