package com.example.androidgestures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity(), GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener{

    var gDetector: GestureDetectorCompat? = null
    lateinit var getGestureText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this, this )
        gDetector?.setOnDoubleTapListener(this)
        getGestureText = findViewById(R.id.getGestureText)
    }


    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        return true
    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        getGestureText.text = "On Double Tap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        getGestureText.text = "On Double Tap Event"
        return true
    }

    override fun onDown(e: MotionEvent): Boolean {
        getGestureText.text = "onDown"
        return true
    }

    override fun onShowPress(e: MotionEvent) {
        getGestureText.text = "On Show Press"
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        getGestureText.text = "On Single Tap Up"
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        getGestureText.text = "On Scroll"
        return true
    }

    override fun onLongPress(e: MotionEvent) {
        getGestureText.text = "On Long Press"
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        getGestureText.text = "On Fling"
        return true
    }
}