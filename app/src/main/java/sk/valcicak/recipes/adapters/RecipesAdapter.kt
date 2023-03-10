package sk.valcicak.recipes.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sk.valcicak.recipes.databinding.RecipesRowLayoutBinding
import sk.valcicak.recipes.models.FoodRecipe
import sk.valcicak.recipes.models.Result

class RecipesAdapter: RecyclerView.Adapter<RecipesAdapter.MyViewHolder>() {

    private var recipe = emptyList<Result>()

    class MyViewHolder(
        private val binding: RecipesRowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(result: sk.valcicak.recipes.models.Result){
            binding.result = result
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup):MyViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RecipesRowLayoutBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyViewHolder {
        return MyViewHolder.from( parent )
    }

    override fun onBindViewHolder(
        holder: MyViewHolder, position: Int
    ) {
        val currentResult = recipe[position]
        holder.bind(currentResult)
    }

    override fun getItemCount(): Int {
        return recipe.size
    }

    fun setData(newData: FoodRecipe){
        recipe = newData.results
        notifyDataSetChanged()
    }

}