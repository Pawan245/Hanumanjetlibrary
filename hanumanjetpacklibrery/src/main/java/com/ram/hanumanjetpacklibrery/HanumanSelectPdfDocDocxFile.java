package com.ram.hanumanjetpacklibrery;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;


public  class HanumanSelectPdfDocDocxFile extends AppCompatActivity {


    public  void SelectHanumanPdfDocDocxFile(Context context,double filelimit,final Fileuploadcallback callback) {


        try {


            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.setType("*/*");
            String[] extraMimeTypes = {"application/pdf", "application/doc", "application/docx"};
            intent.putExtra(Intent.EXTRA_MIME_TYPES, extraMimeTypes);

            try {
                ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(
                        new ActivityResultContracts.StartActivityForResult(),
                        new ActivityResultCallback<ActivityResult>() {
                            @Override
                            public void onActivityResult(ActivityResult result) {
                                if (result.getResultCode() == Activity.RESULT_OK) {
                                    // There are no request codes
                                    Intent data = result.getData();
                                    try {


                                        Uri selectedImage = data.getData();

                                        String nm = getPath(getApplicationContext(), selectedImage);
                                        File file = new File(getPath(getApplicationContext(), selectedImage));
                                        File myFile = new File("" + nm + "");
                                        String filename = file.getName();
                                        String filenameArray[] = filename.split("\\.");
                                        String extension = filenameArray[filenameArray.length - 1];


                                        /*****************************/





                                        double sd = myFile.length() / 1024.00;
                                        final double df = sd / 1024.00;

                                        if (df < filelimit && df > 0) {


                                            AlertDialog alertDialog = new AlertDialog.Builder(context).create();
                                            alertDialog.setTitle("Information");
                                            alertDialog.setMessage("Do you want to continue this Action ?");
                                            alertDialog.setCancelable(false);
                                            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes",
                                                    new DialogInterface.OnClickListener() {
                                                        public void onClick(DialogInterface dialog, int which) {


                                                            callback.onSelected(extension.toUpperCase(),myFile);




                                                        }
                                                    });

                                            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No",
                                                    new DialogInterface.OnClickListener() {
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            dialog.dismiss();
                                                        }
                                                    });


                                            alertDialog.show();


                                        }
                                        else
                                        {



                                           ToasterMessage.ShowToast(context,"File size is too large ,Max "+filelimit+" MB allowed");

                                        }



                                    } catch (Exception e) {
                                        //Log.i("wq", "" + e.toString() + "");
                                    }
                                }
                            }
                        });




                someActivityResultLauncher.launch((Intent.createChooser(intent, "ACTION_OPEN_DOCUMENT")));


            } catch (Exception ex) {

            }
        } catch (Exception ex) {

        }




    }


    @SuppressLint("NewApi")
    public String getPath(Context context, Uri uri) {


        try {
            final boolean needToCheckUri = Build.VERSION.SDK_INT >= 19;
            String selection = null;
            String[] selectionArgs = null;
            // Uri is different in versions after KITKAT (Android 4.4), we need to
            // deal with different Uris.
            if (needToCheckUri && DocumentsContract.isDocumentUri(context.getApplicationContext(), uri)) {
                if (isExternalStorageDocument(uri)) {
                    final String docId = DocumentsContract.getDocumentId(uri);
                    final String[] split = docId.split(":");
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                } else if (isDownloadsDocument(uri)) {
                    final String id = DocumentsContract.getDocumentId(uri);
                    uri = ContentUris.withAppendedId(
                            Uri.parse("content://downloads/public_downloads"), Long.valueOf(id));
                } else if (isMediaDocument(uri)) {
                    final String docId = DocumentsContract.getDocumentId(uri);
                    final String[] split = docId.split(":");
                    final String type = split[0];
                    if ("image".equals(type)) {
                        uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(type)) {
                        uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(type)) {
                        uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    selection = "_id=?";
                    selectionArgs = new String[]{split[1]};
                }
            }
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                String[] projection = {MediaStore.Images.Media.DATA};
                Cursor cursor = null;
                try {
                    cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs, null);
                    int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
                    if (cursor.moveToFirst()) {
                        return cursor.getString(column_index);
                    }
                } catch (Exception e) {
                }
            } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } catch (Exception ex) {
            return null;
        }
        return null;
    }


    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is ExternalStorageProvider.
     */
    public boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    public boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    public boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public interface  Fileuploadcallback {
        void onSelected(String filetype,File file);

    }


}
