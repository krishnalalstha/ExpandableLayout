package com.krish.animation.demo;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GooglePlayLikeAnimationActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ExpandablePanel panel = (ExpandablePanel) findViewById(R.id.foo);

		panel.setOnExpandListener(new ExpandablePanel.OnExpandListener() {
			public void onCollapse(View handle, View content) {
				Button btn = (Button) handle;
				btn.setText("More");
			}

			public void onExpand(View handle, View content) {
				Button btn = (Button) handle;
				btn.setText("Less");
			}
		});
	}

}
