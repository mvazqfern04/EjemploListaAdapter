package com.example.ejemplolistview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link frg_sumar#newInstance} factory method to
 * create an instance of this fragment.
 */
public class frg_sumar extends Fragment {
    EditText eNum,eObjetivo;
    Button botSum;

    public frg_sumar() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment frg_sumar.
     */
    // TODO: Rename and change types and number of parameters
    public static frg_sumar newInstance() {
        frg_sumar fragment = new frg_sumar();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frg_sumar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        botSum=view.findViewById(R.id.botSum);
        eNum=view.findViewById(R.id.eNum);
        botSum.setOnClickListener(view1 -> frgBotSum());
    }

    public void seteObjetivo(EditText e){
        this.eObjetivo=e;
    }

    private void frgBotSum() {
        String num = eNum.getText().toString();
        String num2 = eObjetivo.getText().toString();
        int cant=0;
        try{
            cant = Integer.parseInt(num);
            eObjetivo.setText((cant+Integer.parseInt(num2)));
            Toast.makeText(getContext(),"Sumado correctamente",Toast.LENGTH_SHORT).show();
        }catch (Exception e){

        }
    }
}