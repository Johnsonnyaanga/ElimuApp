package com.example.elimuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class tutor_profile extends AppCompatActivity {
    private Button btn_select;
    private Button btn_upload;
    private Uri mImageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_profile);
        FirebaseStorage mStorageRef = FirebaseStorage.getInstance().getReference("uploads");
        FirebaseDatabase mDatabaseRef = FirebaseDatabase.getInstance().getReference("uploads");

        btn_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }
        });
        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadImage();
            }
        });
    }
private String getFileExtension(Uri uri){
    ContentResolver cR = getContentResolver();
    MimeTypeMap mime = MimeTypeMap.getSingleton();
    return mime.getExtensionFromMimeType(cR.getType(uri));
}
    private void uploadImage() {
if(mImageUri != null){
StorageReference fileReference = mStorgeRef.child(System.currentTimeMillis()+"."+getFileExtension(mImageUri));
fileReference.putFile(mImageUri)
        .addOsuccessListner
    }else{
    Toast.makeText(this,"no file selected",Toast.LENGTH_SHORT).show();
    }

    private void selectImage(){
        Intent intent = new Intent();
        intent.setType("/image*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(
                intent,PICK_IMAGE_REQUEST
               );

    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==PICK_IMAGE_REQUEST&&resultCode==RESULT_OK
        &&data!=null &&data.getData()!=null){
            mImageUrl = data.getData();
            picasso.with(this).load(mImageUri).into(mImageView);
        }

    }

    }

