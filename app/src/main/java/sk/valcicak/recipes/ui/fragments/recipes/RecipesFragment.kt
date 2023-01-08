package sk.valcicak.recipes.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sk.valcicak.recipes.R

class RecipesFragment : Fragment() {

    private lateinit var recyclerViewRecipeCard : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_recipes, container, false)

        //recyclerViewRecipeCard = view.findViewById(R.id.recipe_card_recycler_view)
        // recyclerViewRecipeCard.layoutManager = LinearLayoutManager(this)

        return view
    }
}