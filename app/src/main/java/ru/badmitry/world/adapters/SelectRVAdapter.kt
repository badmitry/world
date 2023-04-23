package ru.badmitry.world.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.badmitry.domain.main.MainEntity
import ru.badmitry.world.databinding.RvItemSelectBinding
import ru.badmitry.world.viewmodels.SelectCategoriesViewModel

class SelectRVAdapter(
    private val context: Context,
    private val entities: List<MainEntity>,
    private val viewModel: SelectCategoriesViewModel
) : RecyclerView.Adapter<SelectRVAdapter.ViewHolder>() {
    private lateinit var adapterBinding: RvItemSelectBinding

    inner class ViewHolder(private val binding: RvItemSelectBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(entity: MainEntity) {
            binding.title.text = context.getString(entity.nameRes)
            binding.image.setImageDrawable(context.getDrawable(entity.imageRes))
            binding.item.setOnClickListener {
                viewModel.onItemClick(entity.id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        adapterBinding =
            RvItemSelectBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(adapterBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(entities[position])
    }

    override fun getItemCount(): Int {
        return entities.size
    }
}