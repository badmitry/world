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
import ru.badmitry.world.adapters.WriteRVAdapter
import ru.badmitry.world.databinding.FragmentShowBinding


class FragmentWrite : Fragment(), Screen {
    private lateinit var binding: FragmentShowBinding
    private val entityList: List<Entity>? by lazy {
        val categoryId = arguments?.getInt(CATEGORY_ID) ?: 0
        return@lazy MainCategories.values().getOrNull(categoryId)?.entityList
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentShowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            entityList?.let { entities ->
                vpLayout.isUserInputEnabled = false
                vpLayout.adapter = WriteRVAdapter(requireContext(), entities, ::goToNextElement)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as MainActivity).initToolbar(R.string.task_write, true)
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
            val fragment = FragmentWrite()
            fragment.arguments = args
            return fragment
        }
    }
}