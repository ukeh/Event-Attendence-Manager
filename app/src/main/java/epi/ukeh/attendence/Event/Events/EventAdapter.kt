package epi.ukeh.attendence.Event.Events

import android.support.v7.widget.RecyclerView
import android.util.EventLog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import epi.ukeh.attendence.Event.Event
import epi.ukeh.attendence.R
import kotlinx.android.synthetic.main.event_row.view.*

class EventAdapter(val events:ArrayList<Event>):RecyclerView.Adapter<EventAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val layout=LayoutInflater.from(parent.context).inflate(R.layout.event_row,parent,false)
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int {return events.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(events.get(position))

    }

    class ViewHolder(val view:View):RecyclerView.ViewHolder(view)
    {
        fun bind(event:Event)
        {
            view.name.text=event.name
            view.venue.text=event.venue
            view.date.text=event.date
        }
    }
}