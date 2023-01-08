package sk.valcicak.recipes.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FoodRecipe (
    @Json(name = "results")
    val recipes: List<Recipe>
)