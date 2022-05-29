package com.ammarsultan1443.localisermavoiture;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.ammarsultan1443.localisermavoiture.R;

public class iLocateFragment extends Fragment {
    private ImageView earth;
    private Button buttonSettings;
    private Button buttonLocate;
    private Button buttonSearch;
    private Button buttonServiceCar;
    private ConstraintLayout constraintLayoutiLocate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("ILOCATEFRAGMENT","onCreateView accessed");
        return inflater.inflate(R.layout.fragment_ilocate,
                container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("ILOCATEFRAGMENT","onViewCreated accessed");
        constraintLayoutiLocate=(ConstraintLayout) view.
                findViewById(R.id.constraintLayoutiLocate);
        earth =(ImageView)view.findViewById(R.id.imageViewEarth);
        buttonSettings=(Button)view.findViewById(R.id.imageButtonSettings);
        buttonLocate=(Button)view.findViewById(R.id.imageButtonLocate);
        buttonSearch=(Button)view.findViewById(R.id.imageButtonSearch);
        buttonServiceCar=(Button)view.findViewById(R.id.imageButtonServiceCar);

        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "button settings clicked",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SettingsActivity.class);
                startActivity(intent);
            }
        });
        buttonLocate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "button Locate clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
