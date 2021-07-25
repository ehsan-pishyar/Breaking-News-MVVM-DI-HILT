package com.example.breakingnews.ui.viewmodel

import android.content.Context
import android.net.ConnectivityManager
import android.net.ConnectivityManager.*
import android.net.NetworkCapabilities.*
import android.os.Build
import androidx.lifecycle.*
import com.example.breakingnews.BaseApplication
import com.example.breakingnews.data.model.Articles
import com.example.breakingnews.data.model.NewsResponse
import com.example.breakingnews.data.model.SourcesResponse
import com.example.breakingnews.repository.MainRepository
import com.example.breakingnews.utils.Resource
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
    ) : ViewModel() {

    private val _topHeadLineNews = MutableLiveData<Resource<NewsResponse>>()
    val topHeadlineNews: LiveData<Resource<NewsResponse>> get() = _topHeadLineNews

    private val _everything = MutableLiveData<Resource<NewsResponse>>()
    val everything: LiveData<Resource<NewsResponse>> get() = _everything

    private val _sources = MutableLiveData<Resource<SourcesResponse>>()
    val sources: LiveData<Resource<SourcesResponse>> get() = _sources

    private val _sourceContents = MutableLiveData<Resource<NewsResponse>>()
    val sourceContents: LiveData<Resource<NewsResponse>> get() = _sourceContents

    init {
        getTopHeadlineNews()
        getSources()
    }

    private fun getTopHeadlineNews() =
        viewModelScope.launch {
            _topHeadLineNews.value = Resource.loading(null)
            mainRepository.getTopHeadlineNews().let{ response ->
                if (response.isSuccessful){
                    _topHeadLineNews.value = Resource.success(response.body()!!)
                } else _topHeadLineNews.value = Resource.error(null, response.errorBody().toString())
            }
            /*
            try {
                if (isConnectionAvailable()){
                    mainRepository.getTopHeadlineNews().let{ response ->
                        if (response.isSuccessful){
                            _topHeadLineNews.value = Resource.success(response.body()!!)
                        } else _topHeadLineNews.value = Resource.error(null, response.errorBody().toString())
                    }
                }else{
                    enableInternetDialog()
                }
            }catch (t: Throwable){
                when(t){
                    is IOException -> _topHeadLineNews.value = Resource.error(null, "Network Error")
                    else -> _topHeadLineNews.value = Resource.error(null, "Conversion Error")
                }
            }

             */
        }

    fun getEverything(q: String) =
        viewModelScope.launch {
            _everything.value = Resource.loading(null)
            mainRepository.getEverything(q).let { response ->
                if (response.isSuccessful) {
                    _everything.value = Resource.success(response.body()!!)
                } else _everything.value =
                    Resource.error(null, response.errorBody().toString())
            }
            /*
            try {
                if (isConnectionAvailable()) {
                    mainRepository.getEverything(q).let { response ->
                        if (response.isSuccessful) {
                            _everything.value = Resource.success(response.body()!!)
                        } else _everything.value =
                            Resource.error(null, response.errorBody().toString())
                    }
                }else{
                    enableInternetDialog()
                }
            }catch (t: Throwable){
                when(t){
                    is IOException -> _everything.value = Resource.error(null, "Network Error")
                    else -> _everything.value = Resource.error(null, "Conversion Error")
                }
            }

             */
        }

    private fun getSources() =
        viewModelScope.launch {
            _sources.value = Resource.loading(null)
            mainRepository.getSources().let { response ->
                if (response.isSuccessful){
                    _sources.value = Resource.success(response.body()!!)
                }else _sources.value = Resource.error(null, response.errorBody().toString())
            }
            /*
            try {
                if (isConnectionAvailable()){
                    mainRepository.getSources().let { response ->
                        if (response.isSuccessful){
                            _sources.value = Resource.success(response.body()!!)
                        }else _sources.value = Resource.error(null, response.errorBody().toString())
                    }
                }else{
                    enableInternetDialog()
                }
            }catch (t: Throwable){
                when(t){
                    is IOException -> _sources.value = Resource.error(null, "Network Error")
                    else -> _sources.value = Resource.error(null, "Conversion Error")
                }
            }

             */

        }

    fun getSourceContents(sources: String) =
        viewModelScope.launch {
            _sourceContents.value = Resource.loading(null)
            mainRepository.getSourcesContents(sources).let { response ->
                if (response.isSuccessful){
                    _sourceContents.value = Resource.success(response.body()!!)
                }else _sourceContents.value = Resource.error(null, response.errorBody().toString())
            }
            /*
            try {
                if (isConnectionAvailable()){
                    mainRepository.getSourcesContents(sources).let { response ->
                        if (response.isSuccessful){
                            _sourceContents.value = Resource.success(response.body()!!)
                        }else _sourceContents.value = Resource.error(null, response.errorBody().toString())
                    }
                }
            }catch (t: Throwable){
                when(t){
                    is IOException -> _sourceContents.value = Resource.error(null, "Network Error")
                    else -> _sourceContents.value = Resource.error(null, "Conversion Error")
                }
            }

             */

        }

    fun saveNewsToDB(article: Articles) =
        viewModelScope.launch {
            mainRepository.saveNewsToDB(article)
        }

    fun getNewsFromDB() = mainRepository.getArticlesFromDB()

    fun deleteNewsFromDB(article: Articles) =
        viewModelScope.launch {
            mainRepository.deleteNewsFromDB(article)
        }

    /*
    private fun isConnectionAvailable(): Boolean {
        val connectivityManager = getApplication<BaseApplication>().getSystemService(
            Context.CONNECTIVITY_SERVICE
        ) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            val activeNetwork = connectivityManager.activeNetwork ?: return false
            val capabilities = connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false
            return when {
                capabilities.hasTransport(TRANSPORT_WIFI) -> true
                capabilities.hasTransport(TRANSPORT_CELLULAR) -> true
                capabilities.hasTransport(TRANSPORT_ETHERNET) -> true
                else -> false
            }
        }else{
            connectivityManager.activeNetworkInfo?.run {
                return when(type) {
                    TYPE_WIFI -> true
                    TYPE_MOBILE -> true
                    TYPE_ETHERNET -> true
                    else -> false
                }
            }
        }
        return false
    }

    private fun enableInternetDialog(){
        Snackbar.make(getApplication(), "You dont have access to network", Snackbar.LENGTH_LONG).apply {
            setAction("Undo"){
                
            }
            show()
        }
    }

     */
}