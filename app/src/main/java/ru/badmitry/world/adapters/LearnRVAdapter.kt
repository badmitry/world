package ru.badmitry.world.adapters

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.badmitry.domain.Entity
import ru.badmitry.world.databinding.RvItemLearnBinding

class LearnRVAdapter(
    private val context: Context,
    private val entities: List<Entity>
) : RecyclerView.Adapter<LearnRVAdapter.ViewHolder>() {
    private lateinit var adapterBinding: RvItemLearnBinding

    inner class ViewHolder(private val binding: RvItemLearnBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var mediaPlayerName: MediaPlayer? = null
        fun bind(entity: Entity) {
            mediaPlayerName = null
            mediaPlayerName = MediaPlayer.create(context, entity.nameSoundResId)
            val mediaPlayerSound = entity.soundResId?.let { MediaPlayer.create(context, it) }
            binding.title.text = context.getString(entity.nameResId)
            binding.image.setImageDrawable(context.getDrawable(entity.imageResId))
            binding.image.setOnClickListener {
                mediaPlayerName?.start()
            }
            binding.title.setOnClickListener {
                mediaPlayerName?.start()
            }
            mediaPlayerSound?.let {
                binding.sound.visibility = View.VISIBLE
            }
            binding.sound.setOnClickListener {
                if (mediaPlayerName?.isPlaying == false) {
                    mediaPlayerSound?.start() ?: mediaPlayerName?.start()
                }
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
            RvItemLearnBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(adapterBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(entities[position])
    }

    override fun getItemCount(): Int {
        return entities.size
    }
}