package sk.valcicak.recipes.data.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap
import sk.valcicak.recipes.models.FoodRecipe
import sk.valcicak.recipes.models.Result

interface FoodRecipesAPI {

    @GET( "/recipes/complexSearch" )
    suspend fun getRecipes (
        @QueryMap queries: Map<String, String>
    ): Response<FoodRecipe>
}