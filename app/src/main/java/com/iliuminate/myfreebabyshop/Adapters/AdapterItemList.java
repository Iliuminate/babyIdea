package com.iliuminate.myfreebabyshop.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iliuminate.myfreebabyshop.Entities.ItemBabyEntity;
import com.iliuminate.myfreebabyshop.R;

import java.util.List;

/**
 * Created by cdiaza on 03/10/2017.
 */

public class AdapterItemList extends RecyclerView.Adapter<AdapterItemList.ViewHolder> {

    private List<ItemBabyEntity> mDataset;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
        public View viewMainItem;
        public TextView mTitulo;


        public ViewHolder(View v) {
            super(v);
            viewMainItem = v;
        }
    }


    public AdapterItemList(List<ItemBabyEntity> myDataset) {
        mDataset = myDataset;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_item_baby, parent, false);
        // set the view's size, margins, paddings and layout parameters
        //...
        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        ((TextView)(holder.viewMainItem).findViewById(R.id.info_text)).setText(mDataset.get(position).getItemName());
        ((TextView)(holder.viewMainItem).findViewById(R.id.description)).setText(mDataset.get(position).getItemDescription());
        ((TextView)(holder.viewMainItem).findViewById(R.id.dateadd)).setText(mDataset.get(position).getDateAdd().toString());
        ((TextView)(holder.viewMainItem).findViewById(R.id.serial)).setText(mDataset.get(position).getItemSerial());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
