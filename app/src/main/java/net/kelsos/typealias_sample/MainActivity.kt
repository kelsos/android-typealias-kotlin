package net.kelsos.typealias_sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import net.kelsos.library_module.Provider

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    takesTypeAlias { "hello world" }

  }

  fun takesTypeAlias(provider: Provider) {
    findViewById<TextView>(R.id.textView).setText(provider.invoke())
  }
}

