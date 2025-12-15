package com.example.portfolioshowcase.ui.madlibs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.portfolioshowcase.databinding.FragmentMadlibsBinding;

public class MadlibsFragment extends Fragment {

    private FragmentMadlibsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MadlibsViewModel MadlibsViewModel =
                new ViewModelProvider(this).get(MadlibsViewModel.class);

        binding = FragmentMadlibsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMadlibs;
        MadlibsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}