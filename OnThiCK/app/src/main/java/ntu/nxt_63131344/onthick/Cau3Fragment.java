package ntu.nxt_63131344.onthick;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandscape;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau3, container, false);

        // Initialize data
        recyclerViewData = getRecyclerViewData();

        // Find RecyclerView in the fragment layout
        recyclerViewLandscape = view.findViewById(R.id.recyclerLand);

        // Set the layout manager for RecyclerView
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(getActivity());
        recyclerViewLandscape.setLayoutManager(layoutLinear);

        // Uncomment one of the following lines to use a different layout manager
        // RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        // recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);

        // RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(getActivity(), 2);
        // recyclerViewLandscape.setLayoutManager(layoutGrid);

        // Initialize the adapter with the data
        landScapeAdapter = new LandScapeAdapter(getActivity(), recyclerViewData);

        // Set the adapter for RecyclerView
        recyclerViewLandscape.setAdapter(landScapeAdapter);

        return view;
    }

    private ArrayList<LandScape> getRecyclerViewData() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<>();
        dsDuLieu.add(new LandScape("cotcohanoi", "Cột cờ Hà Nội"));
        dsDuLieu.add(new LandScape("thapeiffel", "Tháp Eiffel"));
        dsDuLieu.add(new LandScape("cungdienbuckingham", "Cung điện Buckingham"));
        dsDuLieu.add(new LandScape("tuongnuthan", "Tượng nữ thần tự do"));
        return dsDuLieu;
    }
}
