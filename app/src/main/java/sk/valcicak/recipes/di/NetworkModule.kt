package sk.valcicak.recipes.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import sk.valcicak.recipes.util.Constants
import sk.valcicak.recipes.data.network.FoodRecipesAPI
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn( SingletonComponent::class )
object NetworkModule {

    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .build()
    }

    @Singleton
    @Provides
    fun provideConverterFactory():MoshiConverterFactory{
        return MoshiConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideRetrofitInstance(
        okHttpClient: OkHttpClient,
        moshiConverterFactory: MoshiConverterFactory
    ): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.API_BASE_URL)
            .client( okHttpClient )
            .addConverterFactory( moshiConverterFactory)
            .build()
    }

    @Singleton
    @Provides
    fun provideAPIService( retrofit: Retrofit): FoodRecipesAPI {
        return retrofit.create(FoodRecipesAPI::class.java)
    }

}