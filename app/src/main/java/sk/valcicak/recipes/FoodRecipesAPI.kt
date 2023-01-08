package sk.valcicak.recipes

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap
import sk.valcicak.recipes.models.Recipe

interface FoodRecipesAPI {

    @GET( "/recipes/complexSearch" )
    suspend fun getRecipes (
        @QueryMap queries: Map<String, String>
    ): Response<Recipe>
}