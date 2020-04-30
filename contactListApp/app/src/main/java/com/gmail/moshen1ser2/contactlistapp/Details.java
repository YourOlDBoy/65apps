package com.gmail.moshen1ser2.contactlistapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details extends Fragment {
    static Details newInstance(int index) {
        Details f = new Details();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Детали контакта");
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        int index = this.getArguments().getInt("index");
        TextView contactName = (TextView) view.findViewById(R.id.name);
        TextView firstContactNumber = (TextView) view.findViewById(R.id.number1);
        TextView secondContactNumber = (TextView) view.findViewById(R.id.number2);
        contactName.setText(ContactsFragment.contacts[index].getName());
        firstContactNumber.setText(ContactsFragment.contacts[index].getNumber1());
        secondContactNumber.setText(ContactsFragment.contacts[index].getNumber2());
        return view;
    }
}
