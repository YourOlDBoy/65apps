package com.gmail.moshen1ser2.contactlistapp;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

public class ContactListFragment extends ListFragment {

    public static final Contact[] contacts = {
            new Contact("Петрович", "89812345678", "89887654321", 123)
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<Contact> contactAdapter = new ArrayAdapter<Contact>(getActivity(), 0, contacts) {

            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                convertView = getLayoutInflater().inflate(R.layout.fragment_contacts, null, false);

                TextView nameView = (TextView) convertView.findViewById(R.id.name);
                TextView numberView = (TextView) convertView.findViewById(R.id.number);

                nameView.setText(contacts[position].getName());
                numberView.setText(contacts[position].getNumber1());
                return convertView;
            }
        };
        setListAdapter(contactAdapter);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        ContactDetailsFragment detailsFragment = ContactDetailsFragment.newInstance((int) id);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, detailsFragment).addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onStart() {
        super.onStart();
        getActivity().setTitle("Список контактов");
    }



}
