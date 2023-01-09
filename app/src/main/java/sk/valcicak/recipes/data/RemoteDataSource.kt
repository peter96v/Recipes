package sk.valcicak.recipes.data

import retrofit2.Response
import sk.valcicak.recipes.data.network.FoodRecipesAPI
import sk.valcicak.recipes.models.FoodRecipe
import sk.valcicak.recipes.models.Result
import javax.inject.Inject

class RemoteDataSource @Inject constructor (
    private val foodRecipesAPI: FoodRecipesAPI
){

    suspend  fun getRecipes( queries: Map<String, String>):Response<FoodRecipe>{
       return foodRecipesAPI.getRecipes(queries)
    }



}