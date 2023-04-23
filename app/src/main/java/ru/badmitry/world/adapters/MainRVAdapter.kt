package ru.badmitry.world.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.badmitry.world.databinding.RvItemMainBinding
import ru.badmitry.world.navigation.Tasks
import ru.badmitry.world.viewmodels.MainFragmentViewModel

class MainRVAdapter(
    private val context: Context,
    private val viewModel: MainFragmentViewModel
) : RecyclerView.Adapter<MainRVAdapter.ViewHolder>() {
    private lateinit var adapterBinding: RvItemMainBinding

    inner class ViewHolder(private val binding: RvItemMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(task: Tasks) {
            binding.title.text = context.getString(task.taskNameId)
            binding.item.setOnClickListener {
                viewModel.onItemClick(task)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        adapterBinding =
            RvItemMainBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(adapterBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(Tasks.values()[position])
    }

    override fun getItemCount(): Int {
        return Tasks.values().size
    }
}