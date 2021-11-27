package com.helenzys.interviewtask.ui.viewModel

import NumberData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.helenzys.interviewtask.data.repo.Repo

class MainViewModel :ViewModel() {

    private var numberRepo:Repo = Repo();
    private var numberData:MutableLiveData<List<NumberData>> = MutableLiveData()

    private var selectedData:MutableLiveData<NumberData> = MutableLiveData()
    init {
        var data: List<NumberData> = numberRepo.getNumberList(10);
        numberData.postValue(data);
    }
     fun getData():LiveData<List<NumberData>>{
        return  numberData;
    }

    fun setSelectedData(data:NumberData){
        selectedData.postValue(data);
    }

    fun getSelectedData():LiveData<NumberData>{
        return selectedData;
    }

}