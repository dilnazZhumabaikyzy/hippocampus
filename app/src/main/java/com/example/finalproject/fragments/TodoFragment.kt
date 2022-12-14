package com.example.finalproject.fragments



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.finalproject.R
import com.example.finalproject.data.DatasoureTodo
import com.example.finalproject.databinding.FragmentTodoBinding

class TodoFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val binding: FragmentTodoBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_todo, container, false)


        val myDataset = DatasoureTodo().loadtodos()

        val recyclerView =  binding.todoRecyclerView

        return binding.root


    }
}