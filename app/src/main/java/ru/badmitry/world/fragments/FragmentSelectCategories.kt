package ru.badmitry.world.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.github.terrakok.cicerone.Screen
import dagger.android.support.DaggerFragment
import ru.badmitry.domain.main.MainEntityList
import ru.badmitry.world.MainActivity
import ru.badmitry.world.adapters.SelectRVAdapter
import ru.badmitry.world.databinding.FragmentSelectBinding
import ru.badmitry.world.viewmodels.SelectCategoriesViewModel
import javax.inject.Inject


class FragmentSelectCategories : DaggerFragment(), Screen {
    private lateinit var binding: FragmentSelectBinding
    private lateinit var viewModel: SelectCategoriesViewModel
    private val taskId: Int by lazy { arguments?.getInt(TASK_ID, 0) ?: 0 }

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, vmFactory)[SelectCategoriesViewModel::class.java]
        viewModel.setTask(taskId)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            rvItems.layoutManager = GridLayoutManager(requireContext(), 2)
            rvItems.adapter =
                SelectRVAdapter(requireContext(), MainEntityList.mainEntity, viewModel)
        }
        viewModel.titleLiveData.observe(
            viewLifecycleOwner
        ) {
            (requireActivity() as? MainActivity)?.initToolbar(it, true)
        }
    }

    companion object {
        private const val TASK_ID = "tast id"
        fun newInstance(taskId: Int): Fragment {
            val args = Bundle()
            args.putInt(TASK_ID, taskId)
            val fragment = FragmentSelectCategories()
            fragment.arguments = args
            return fragment
        }
    }
}