package com.mussa1.myfacebook;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
public class home extends Fragment {

    private RecyclerView recyclerView;
    private Postadapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclev);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        List<Post> posts = new ArrayList<>();
        Post obj1=new Post("Wood Master", R.drawable.fixify5, R.drawable.fixify5, "Best Carpenting services in Lahore!");
        posts.add(obj1);

        Post obj2=new Post("Go Painters", R.drawable.fixify4, R.drawable.fixify10, "Paint your Walls");
        posts.add(obj2);

        Post obj3= new Post("Windward Plumbing", R.drawable.fixify4, R.drawable.fixify7, "Class in Work");
posts.add(obj3);
        Post obj4=new Post("Royal Electric", R.drawable.fixify4, R.drawable.fixify8, "All Equipments");
        posts.add(obj4);
        Post obj5=new Post("Home Gardeners", R.drawable.fixify4, R.drawable.fixify9, "Happy Gardening");
        posts.add(obj5);

        Post obj6=new Post("MM Ceiling Works", R.drawable.fixify4, R.drawable.fixify6, "High Ceilings");
        posts.add(obj6);
        Post obj7=new Post("The Cleaners", R.drawable.fixify4, R.drawable.fixify11, "Providing you Clean homes");
        posts.add(obj7);
        Post obj8=new Post("Pest Controller", R.drawable.fixify4, R.drawable.fixify12, "Pest free Homes");
        posts.add(obj8);
        Post obj9=new Post("Home Security", R.drawable.fixify4, R.drawable.fixify13, "Securing Homes");
        posts.add(obj9);
        Post obj10=new Post("HM Dry Cleaners", R.drawable.fixify4, R.drawable.fixify14, "Laundry at doorstep");
        posts.add(obj10);


        adapter = new Postadapter(posts);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
