package com.ammarsultan1443.localisermavoiture;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.ammarsultan1443.localisermavoiture.R;
import com.google.android.material.textfield.TextInputLayout;

public class iLocateFragment extends Fragment {
    private ImageView earth;
    private Button buttonSettings;
    private Button buttonLocate;
    private Button buttonSearch;
    private Button buttonServiceCar;
    private Button buttonValidate;
    private Button buttonCancel;
    private Button buttonMoreOptions;
    private Button buttonSearchValidate;
    private Button buttonSearchCancel;
    private Button buttonSearchMoreOptions;
    private Button buttonLookup;
    private EditText editTextSearch;
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
        //if buttonLocate clicked those buttons show up
        buttonValidate=(Button)view.findViewById(R.id.imageButtonValidate);
        buttonCancel=(Button)view.findViewById(R.id.imageButtonCancel);
        buttonMoreOptions=(Button)view.findViewById(R.id.imageButtonMoreOptions);
        //if buttonSearch clicked then those buttons show up
        buttonSearchValidate=(Button)view.findViewById(R.id.SearchValidate);
        buttonSearchCancel=(Button)view.findViewById(R.id.SearchCancel);
        buttonSearchMoreOptions=(Button)view.findViewById(R.id.SearchMoreOptions);
        editTextSearch=(EditText)view.findViewById(R.id.editTextSearchBar);
        buttonLookup=(Button)view.findViewById(R.id.lookup);

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
                buttonLocate.setVisibility(View.GONE);
                buttonSearch.setVisibility(View.GONE);
                buttonServiceCar.setVisibility(View.GONE);
                buttonSettings.setVisibility(View.GONE);
                buttonValidate.setVisibility(View.VISIBLE);
                buttonCancel.setVisibility(View.VISIBLE);
                buttonMoreOptions.setVisibility(View.VISIBLE);

            }
        });

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSearchValidate.setVisibility(View.VISIBLE);
                buttonSearchCancel.setVisibility(View.VISIBLE);
                buttonSearchMoreOptions.setVisibility(View.VISIBLE);
                editTextSearch.setVisibility(View.VISIBLE);
                buttonLookup.setVisibility(View.VISIBLE);
            }
        });

    }
}
