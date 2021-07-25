package com.example.breakingnews.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SourceContentPage : AppCompatActivity() {

    // private val viewModel by viewModels<MainViewModel>()
    // private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // val sourceId = getSourceId()
        // getSourceContents(sourceId)
        // initUi()
    }

    /*
    private fun initUi(){
        viewModel.sourceContents.observe(this, { news ->
            news.data?.articles?.let { recyclerBody(it) }
        })
    }

    private fun getSourceContents(sources: String){
        viewModel.getSourceContents(sources)
    }

    private fun getSourceId(): String{
        val bundle: Bundle? = intent.extras
        val sourceId = bundle!!.getString("id")
        return sourceId!!
    }

    private fun recyclerBody(articles: List<Articles>){
        recycler_source_content.apply {
            layoutManager = LinearLayoutManager(this@SourceContentPage)
            newsAdapter = NewsAdapter()
            setHasFixedSize(true)
            val recyclerDecoration = DividerItemDecoration(this@SourceContentPage, RecyclerView.VERTICAL)
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
