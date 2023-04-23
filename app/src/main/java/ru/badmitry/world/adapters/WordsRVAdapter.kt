package ru.badmitry.world.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.badmitry.world.R
import ru.badmitry.world.databinding.RvItemWordsBinding

class WordsRVAdapter(
    private val context: Context,
    private val action: (text: String) -> Boolean,
    private val words: List<String>,
) : RecyclerView.Adapter<WordsRVAdapter.ViewHolder>() {
    private lateinit var adapterBinding: RvItemWordsBinding

    inner class ViewHolder(private val binding: RvItemWordsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(word: String) {
            binding.tvWord.text = word
            binding.item.setOnClickListener {
                if (action.invoke(word)) {
                    binding.item.setBackgroundColor(context.getColor(R.color.world_green))
                } else {
                    binding.item.setBackgroundColor(context.getColor(R.color.world_red))
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        adapterBinding =
            RvItemWordsBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(adapterBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(words[position])
    }

    override fun getItemCount(): Int {
        return words.size
    }
}