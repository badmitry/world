package ru.badmitry.world.adapters

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.badmitry.domain.Entity
import ru.badmitry.world.databinding.RvItemFindBinding

class FindRVAdapter(
    private val context: Context,
    private val entities: List<Entity>,
    private val nextElementAction: () -> Unit
) : RecyclerView.Adapter<FindRVAdapter.ViewHolder>() {
    private lateinit var adapterBinding: RvItemFindBinding

    inner class ViewHolder(private val binding: RvItemFindBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var text = ""
        var mediaPlayerName: MediaPlayer? = null
        fun bind(entity: Entity) {
            val nameValues = entities.filter { it != entity }.map {
                context.getString(it.nameResId).uppercase()
            }.shuffled()
            text = context.getString(entity.nameResId).uppercase()
            val listWords = listOf(
                text,
                nameValues.getOrElse(0) { "" },
                nameValues.getOrElse(1) { "" },
                nameValues.getOrElse(2) { "" },
                nameValues.getOrElse(3) { "" },
            ).shuffled()
            mediaPlayerName = MediaPlayer.create(context, entity.nameSoundResId)
            binding.image.setImageDrawable(context.getDrawable(entity.imageResId))
            binding.image.setOnClickListener {
                mediaPlayerName?.start()
            }
            binding.run {
                rvLetter.layoutManager = LinearLayoutManager(context)
                rvLetter.adapter = WordsRVAdapter(context, ::onLetterClick, listWords)
            }
        }

        private fun onLetterClick(word: String): Boolean {
            return if (text == word) {
                mediaPlayerName?.start()
                nextElementAction.invoke()
                true
            } else {
                false
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, payloads: MutableList<Any>) {
        super.onBindViewHolder(holder, position, payloads)
    }

    override fun onViewAttachedToWindow(holder: ViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.mediaPlayerName?.start()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        adapterBinding =
            RvItemFindBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(adapterBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(entities[position])
    }

    override fun getItemCount(): Int {
        return entities.size
    }
}