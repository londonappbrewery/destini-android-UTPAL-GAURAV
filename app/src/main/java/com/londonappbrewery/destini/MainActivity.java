package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public int StoryTracker = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final Button Ans1 = findViewById(R.id.buttonTop);
        final Button Ans2 = findViewById(R.id.buttonBottom);
        final TextView Story = findViewById(R.id.storyTextView);





        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Story.setText(R.string.T3_Story);
                Ans1.setText(R.string.T3_Ans1);
                Ans2.setText(R.string.T3_Ans2);
                StoryTracker = (StoryTracker*10)+1;

                Ans1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Story.setText(R.string.T6_End);
                        Ans1.setText("END");
                        Ans2.setVisibility(View.INVISIBLE);
                        StoryTracker = (StoryTracker*10)+1;

                        Ans1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                finish();
                            }
                        });
                    }
                });

                Ans2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Story.setText(R.string.T5_End);
                        Ans1.setText("END");
                        Ans2.setVisibility(View.INVISIBLE);
                        StoryTracker = (StoryTracker*10)+2;

                        Ans1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                finish();
                            }
                        });
                    }
                });
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Story.setText(R.string.T2_Story);
                Ans1.setText(R.string.T2_Ans1);
                Ans2.setText(R.string.T2_Ans2);
                StoryTracker = (StoryTracker*10)+2;

                Ans2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Story.setText(R.string.T4_End);
                        Ans1.setText("END");
                        Ans2.setVisibility(View.INVISIBLE);
                        StoryTracker = (StoryTracker*10)+2;

                        Ans1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                finish();
                            }
                        });
                    }
                });

                Ans1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Story.setText(R.string.T3_Story);
                        Ans1.setText(R.string.T3_Ans1);
                        Ans2.setText(R.string.T3_Ans2);
                        StoryTracker = (StoryTracker*10)+1;

                        Ans1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Story.setText(R.string.T6_End);
                                Ans1.setText("END");
                                Ans2.setVisibility(View.INVISIBLE);
                                StoryTracker = (StoryTracker*10)+1;

                                Ans1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        finish();
                                    }
                                });
                            }
                        });

                        Ans2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Story.setText(R.string.T5_End);
                                Ans1.setText("END");
                                Ans2.setVisibility(View.INVISIBLE);
                                StoryTracker = (StoryTracker*10)+2;

                                Ans1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        finish();
                                    }
                                });
                            }
                        });
                    }
                });

            }
        });

    }
}
