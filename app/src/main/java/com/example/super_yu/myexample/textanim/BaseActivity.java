package com.example.super_yu.myexample.textanim;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.iwant.loongman.super_textview_base_library.AnimationListener;
import com.iwant.loongman.super_textview_base_library.HTextView;

/**
 * Created by super_yu on 2017/9/12.
 */

public class BaseActivity extends AppCompatActivity {


    String[] sentences = {"What is design?",
            "Design is not just",
            "what it looks like and feels like.",
            "Design is how it works. \n- Steve Jobs",
            "Older people",
            "sit down and ask,",
            "'What is it?'",
            "but the boy asks,",
            "'What can I do with it?'. \n- Steve Jobs",
            "Swift",
            "Objective-C",
            "iPhone",
            "iPad",
            "Mac Mini", "MacBook Pro", "Mac Pro", "爱老婆", "老婆和女儿"};
    int index;

    class ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v instanceof HTextView) {
                if (index + 1 >= sentences.length) {
                    index = 0;
                }
                ((HTextView) v).animateText(sentences[index++]);
            }
        }
    }

    class SimpleAnimationListener implements AnimationListener {

        private Context context;

        public SimpleAnimationListener(Context context) {
            this.context = context;
        }
        @Override
        public void onAnimationEnd(HTextView hTextView) {
            Toast.makeText(context, "Animation finished", Toast.LENGTH_SHORT).show();
        }
    }



}
