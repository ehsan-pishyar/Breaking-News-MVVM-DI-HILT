package com.example.breakingnews.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchNewsPage : AppCompatActivity() {

    // private val viewModel by viewModels<MainViewModel>()
    // private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //initSearchField()
    }

    /*
    private fun getEverything(q: String){
        viewModel.getEverything(q)
    }

    private fun initUi(){
        viewModel.everything.observe(this, { news ->
            news.data?.articles?.let { recyclerBody(it) }
        })
    }

    private fun initSearchField() {
        etxt_search.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                checkSearchField(s.toString().trim())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                recycler_search.visibility = View.INVISIBLE
                not_found_search.visibility = View.VISIBLE
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                checkSearchField(s.toString().trim())
            }
        })
    }

    private fun checkSearchField(char: String){
        if (char.isEmpty()){
            recycler_search.visibility = View.INVISIBLE
            not_found_search.visibility = View.VISIBLE
        }else{
            recycler_search.visibility = View.VISIBLE
            not_found_search.visibility = View.INVISIBLE
            getEverything(char)
            initUi()
        }
    }

    /*
    private fun initRecyclerview(text: String){
        val service = NewsFactory.getRetrofitService()
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getEverything(text, NewsFactory.API_KEY)
            withContext(Dispatchers.Main) {
                try {
                    val allNews: NewsApi? = response.body()
                    recyclerBody(allNews!!.articles)
                } catch (e: HttpException) {
                    e.message()
                } catch (e: Throwable) {
                    e.message
                }
            }
        }
    }
     */

    private fun recyclerBody(articles: List<Articles>){
        recycler_search.apply {
            layoutManager = LinearLayoutManager(this@SearchNewsPage)
            newsAdapter = NewsAdapter()
            setHasFixedSize(true)
            val recyclerDecoration = DividerItemDecoration(this@SearchNewsPage, RecyclerView.VERTICAL)
            addItemDecoration(recyclerDecoration)
            adapter = newsAdapter
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // make this shit a separate function
        when(item.itemId){
            R.id.about_menu -> {
                startActivity(Intent(this, AboutMePage::class.java))
            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
        overridePendingTransition(0, 0)
        finish()
    }

    override fun onNewsClick(articles: Articles, position: Int) {
        val intent = Intent(this, NewsContentPage::class.java)
        intent.putExtra("title", articles.title)
        intent.putExtra("description", articles.description)
        intent.putExtra("content", articles.content)
        intent.putExtra("author", articles.author)
        intent.putExtra("urlToImage", articles.urlToImage)
        intent.putExtra("source", articles.source.name)

        startActivity(intent)
    }
     */
}
