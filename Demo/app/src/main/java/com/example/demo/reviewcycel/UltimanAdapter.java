package com.example.demo.reviewcycel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo.R;

import java.util.ArrayList;
import java.util.List;


    public class UltimanAdapter extends RecyclerView.Adapter<UltimanAdapter.ViewHolder> {
        private ArrayList<Ultiman> mUltimanList;
        private Context context;
       private OnItemClickListener onItemClickListener;
      public UltimanAdapter(Context context, ArrayList<Ultiman> mUltimanList){
          this.context = context;//上下文
          this.mUltimanList=mUltimanList ;
      }
        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.ultiman,parent,false);
            return new ViewHolder(view);
        }
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Ultiman data=mUltimanList.get(position);
            holder.UltimanImage.setImageResource(data.getImageId());
            holder.UltimanMame.setText(data.getName());
        }

        @Override
        public int getItemCount() {
            return mUltimanList.size();
        }
        class ViewHolder extends RecyclerView.ViewHolder{
             public ImageView UltimanImage;
           public   TextView UltimanMame;
          public  ViewHolder(View view){
                super(view);
                UltimanImage=(ImageView)view.findViewById(R.id.ultiman_image);
                UltimanMame=(TextView)view.findViewById(R.id.ultiman_name);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(onItemClickListener!=null){
                            onItemClickListener.OnItemClick(v, mUltimanList.get(getLayoutPosition()));
                        }
                    }
                });

           }

       }
        public interface OnItemClickListener {
            public void OnItemClick(View view, Ultiman data);
        }

        //需要外部访问，所以需要设置set方法，方便调用
        public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
            this.onItemClickListener = onItemClickListener;
        }


    }


