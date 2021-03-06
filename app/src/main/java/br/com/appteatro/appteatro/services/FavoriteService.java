package br.com.appteatro.appteatro.services;

import br.com.appteatro.appteatro.domain.model.Favorito;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HTTP;
import retrofit2.http.POST;

/**
 * Created by Windows 10 on 31/03/2018.
 */

public interface FavoriteService {

    @POST("favorito")
    Call<Favorito> inserirFavorito(@Body Favorito favorito);

    @HTTP(method = "DELETE", path = "/favorito", hasBody = true)
    Call<ResponseBody> deletarFavorito(@Body Favorito favorito);
}
