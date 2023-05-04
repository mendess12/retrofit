package com.example.retrofit.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofit.R
import com.example.retrofit.adapter.DataAdapter
import com.example.retrofit.databinding.FragmentListBinding
import com.example.retrofit.viewmodel.ListFragmentViewModel

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private val viewModel: ListFragmentViewModel by viewModels()
    private lateinit var dataAdapter: DataAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        binding.recyclerView.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.layoutManager = linearLayoutManager
        observeLiveData()
        viewModel.getData()
    }

    private fun observeLiveData() {
        viewModel.dataList.observe(viewLifecycleOwner) {
            if (it != null) {
                dataAdapter = DataAdapter(it)
                binding.recyclerView.adapter = dataAdapter
            } else {
                Toast.makeText(requireContext(), "Livedata is null", Toast.LENGTH_LONG).show()
            }
        }
    }
}