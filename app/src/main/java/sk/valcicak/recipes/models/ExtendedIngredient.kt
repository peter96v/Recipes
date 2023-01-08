package sk.valcicak.recipes.models
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExtendedIngredient(
    @Json(name = "amount")
    val amount: Double, // 2.0
    @Json(name = "consistency")
    val consistency: String, // SOLID
    @Json(name = "image")
    val image: String, // broccoli.jpg
    @Json(name = "name")
    val name: String, // broccoli
    @Json(name = "original")
    val original: String, // 2 cups cooked broccoli, chopped small
    @Json(name = "unit")
    val unit: String // cups
)