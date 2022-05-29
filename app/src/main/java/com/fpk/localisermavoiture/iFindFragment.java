package com.fpk.localisermavoiture;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class iFindFragment extends Fragment {
    private ImageView earth2;
    private Button buttonServiceCar2;
    private Button buttonNearBy;
    private Button buttonMyLocations;
    private ConstraintLayout constraintLayoutiFind;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ifind,container,
                false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        constraintLayoutiFind=(ConstraintLayout)view.findViewById(R.id.constraintLayoutiFind);
        earth2=(ImageView)view.findViewById(R.id.imageViewEarth2);
        buttonServiceCar2=(Button) view.findViewById(R.id.imageButtonFindCar);
        buttonNearBy=(Button)view.findViewById(R.id.imageButtonNearBy);
        buttonMyLocations=(Button)view.findViewById(R.id.imageButtonMyLocations);
        buttonServiceCar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        buttonNearBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        buttonMyLocations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
