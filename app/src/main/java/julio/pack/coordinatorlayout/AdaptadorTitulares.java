package julio.pack.coordinatorlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorTitulares extends RecyclerView.Adapter<AdaptadorTitulares.AdaptadorViewHolder> {

    private List<Titular> titulares;
    Context context;

    public AdaptadorTitulares(Context context, List<Titular> titulares) {
        this.context = context;
        this.titulares = titulares;
        setHasStableIds(true);
    }

    public AdaptadorTitulares() {
        super();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder( AdaptadorViewHolder holder, int position, List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorViewHolder holder, int position) {
        holder.lblTitulo.setText(titulares.get(position).titulo);
        holder.lblSubtitulo.setText(titulares.get(position).subtitulo);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return titulares != null ? titulares.size() : 0;
    }

    @NonNull
    @Override
    public AdaptadorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_titular, parent, false);

        return new AdaptadorViewHolder(view);
    }

    public class AdaptadorViewHolder extends RecyclerView.ViewHolder  {
        TextView lblTitulo, lblSubtitulo;

        public AdaptadorViewHolder(@NonNull View itemView) {
            super(itemView);

            lblTitulo = itemView.findViewById(R.id.lblTitulo);
            lblSubtitulo = itemView.findViewById(R.id.lblSubtitulo);

        }
    }
}
