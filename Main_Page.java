<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.android.acethetest.Main_Page">

    <ImageView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="centerCrop"
        android:src="@drawable/constitution_government" />


    <Button
        android:id="@+id/enter_button"
        style="?android:attr/borderlessButtonStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginBottom="120dp"
        android:fontFamily="@font/playball"
        android:text="enter: your test awaits!"
        android:textAllCaps="true"
        android:textColor="#000000"
        android:textSize="25sp"
        android:textStyle="bold" />

</RelativeLayout>
