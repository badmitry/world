package ru.badmitry.world.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.terrakok.cicerone.Screen
import dagger.android.support.DaggerFragment
import ru.badmitry.world.MainActivity
import ru.badmitry.world.R
import ru.badmitry.world.adapters.MainRVAdapter
import ru.badmitry.world.databinding.FragmentMainBinding
import ru.badmitry.world.viewmodels.MainFragmentViewModel
import javax.inject.Inject


class FragmentMain : DaggerFragment(), Screen {
    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: MainFragmentViewModel

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, vmFactory)[MainFragmentViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            rvItems.layoutManager = LinearLayoutManager(requireContext())
            rvItems.adapter = MainRVAdapter(requireContext(), viewModel)
        }
    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as MainActivity).initToolbar(R.string.app_name, false)
    }
}