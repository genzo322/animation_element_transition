package com.example.animation_transition;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainActivity4 extends Fragment {
   ImageView img_taylor, img_music;

   @Nullable
   @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInsanceState){
       View view = inflater.inflate(R.layout.activity_main4, container, false);

      img_music = view.findViewById(R.id.img_music);
      img_taylor = view.findViewById(R.id.img_Taylor);

      Animation animation = AnimationUtils.loadAnimation(view.getContext(), R.anim.anirotate);
      Animation animation1 = AnimationUtils.loadAnimation(view.getContext(), R.anim.aniblink);

      img_taylor.startAnimation(animation);
      img_music.startAnimation(animation1);

       return view;
   }
}