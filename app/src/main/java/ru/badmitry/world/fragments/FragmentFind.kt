package ru.badmitry.world.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.Screen
import ru.badmitry.domain.Entity
import ru.badmitry.domain.main.MainCategories
import ru.badmitry.world.MainActivity
import ru.badmitry.world.R
import ru.badmitry.world.adapters.FindRVAdapter
import ru.badmitry.world.databinding.FragmentFindBinding


class FragmentFind : Fragment(), Screen {
    private lateinit var binding: FragmentFindBinding
    private val entityList: List<Entity>? by lazy {
        val categoryId = arguments?.getInt(CATEGORY_ID) ?: 0
        return@lazy MainCategories.values().getOrNull(categoryId)?.entityList
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFindBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            entityList?.let { entities ->
                vpLayout.isUserInputEnabled = false
                vpLayout.adapter = FindRVAdapter(requireContext(), entities, ::goToNextElement)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as MainActivity).initToolbar(R.string.task_find, true)
    }

    private fun goToNextElement() {
        Handler(Looper.getMainLooper()).postDelayed({
            val currentItemNumber = binding.vpLayout.currentItem
            if (currentItemNumber < (entityList?.count() ?: 0) - 1) {
                binding.vpLayout.setCurrentItem(currentItemNumber + 1, false)
            } else {
                requireActivity().onBackPressedDispatcher.onBackPressed()
            }
        }, 1000)
    }

    companion object {
        private const val CATEGORY_ID = "category id"
        fun newInstance(id: Int): Fragment {
            val args = Bundle()
            args.putInt(CATEGORY_ID, id)
            val fragment = FragmentFind()
            fragment.arguments = args
            return fragment
        }
    }
}