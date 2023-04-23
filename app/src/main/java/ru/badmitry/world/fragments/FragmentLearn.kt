package ru.badmitry.world.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.Screen
import ru.badmitry.domain.main.MainCategories
import ru.badmitry.world.MainActivity
import ru.badmitry.world.R
import ru.badmitry.world.adapters.LearnRVAdapter
import ru.badmitry.world.databinding.FragmentShowBinding


class FragmentLearn : Fragment(), Screen {
    private lateinit var binding: FragmentShowBinding
    private val categoryId: Int by lazy { arguments?.getInt(CATEGORY_ID) ?: 0 }

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
            MainCategories.values().getOrNull(categoryId)?.entityList?.let { entities ->
                vpLayout.adapter = LearnRVAdapter(requireContext(), entities)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as MainActivity).initToolbar(R.string.task_learn, true)
    }

    companion object {
        private const val CATEGORY_ID = "category id"
        fun newInstance(id: Int): Fragment {
            val args = Bundle()
            args.putInt(CATEGORY_ID, id)
            val fragment = FragmentLearn()
            fragment.arguments = args
            return fragment
        }
    }
}