package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.w.a.k;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class a
{
  public static void a(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt)
  {
    b(paramActivity, paramIntent1, paramIntent2, paramString, paramInt, null);
  }
  
  public static void b(final Activity paramActivity, Intent paramIntent1, final Intent paramIntent2, final String paramString, final int paramInt, final a parama)
  {
    boolean bool;
    if ((paramIntent1 == null) || (paramIntent1.getData() == null)) {
      if (paramIntent1 == null)
      {
        bool = true;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AsyncObtainImage", "param error, %b", new Object[] { Boolean.valueOf(bool) });
      }
    }
    do
    {
      return;
      bool = false;
      break;
      if (paramIntent1.getData().toString().startsWith("content://com.google.android.gallery3d")) {
        break label124;
      }
      paramIntent1 = e(paramActivity, paramIntent1, paramString);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AsyncObtainImage", "resolvePhotoFromIntent, filePath:%s", new Object[] { paramIntent1 });
    } while (bi.oW(paramIntent1));
    if (parama != null) {
      paramIntent2.putExtra("CropImage_OutputPath", parama.NT(paramIntent1));
    }
    paramIntent2.putExtra("CropImage_ImgPath", paramIntent1);
    paramActivity.startActivityForResult(paramIntent2, paramInt);
    return;
    label124:
    new AsyncTask()
    {
      private String filePath;
      private Uri uri;
      private ProgressDialog uvD;
      private boolean uvE;
      
      private Integer czA()
      {
        try
        {
          if (this.uri == null) {
            return null;
          }
          Bitmap localBitmap = c.m(this.uri);
          this.filePath = a.v(paramString, localBitmap);
          return null;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.AsyncObtainImage", localException, "doInBackground", new Object[0]);
        }
        return null;
      }
      
      protected final void onPreExecute()
      {
        try
        {
          this.uri = this.heh.getData();
          this.uvE = false;
          Activity localActivity = paramActivity;
          paramActivity.getString(a.k.app_tip);
          this.uvD = h.a(localActivity, paramActivity.getString(a.k.app_getting_img), true, new a.2.1(this));
          return;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.AsyncObtainImage", localException, "onPreExecute", new Object[0]);
        }
      }
    }.execute(new Integer[] { Integer.valueOf(0) });
  }
  
  public static String e(Context paramContext, Intent paramIntent, String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    Cursor localCursor = null;
    if ((paramContext == null) || (paramIntent == null) || (paramString == null))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AsyncObtainImage", "resolvePhotoFromIntent fail, invalid argument");
      paramIntent = localCursor;
      return paramIntent;
    }
    Uri localUri = Uri.parse(paramIntent.toURI());
    localCursor = paramContext.getContentResolver().query(localUri, null, null, null, null);
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AsyncObtainImage", "resolve photo from cursor");
      paramContext = (Context)localObject2;
    }
    label383:
    label386:
    for (;;)
    {
      try
      {
        if (!localUri.toString().startsWith("content://com.google.android.gallery3d")) {
          continue;
        }
        paramContext = (Context)localObject2;
        paramIntent = v(paramString, c.m(paramIntent.getData()));
        paramContext = paramIntent;
      }
      catch (Exception paramIntent)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.AsyncObtainImage", paramIntent, "resolve photo error.", new Object[0]);
        continue;
      }
      paramIntent = paramContext;
      if (localCursor == null) {
        break;
      }
      localCursor.close();
      return paramContext;
      paramContext = (Context)localObject2;
      localCursor.moveToFirst();
      paramContext = (Context)localObject2;
      paramIntent = localCursor.getString(localCursor.getColumnIndex("_data"));
      paramContext = paramIntent;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AsyncObtainImage", "photo from resolver, path:" + paramIntent);
      paramContext = paramIntent;
      continue;
      if (paramIntent.getData() != null)
      {
        paramString = paramIntent.getData().getPath();
        paramContext = paramString;
        if (!new File(paramString).exists()) {
          paramContext = null;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AsyncObtainImage", "photo file from data, path:" + paramContext);
        if (paramContext != null) {
          break label386;
        }
        paramContext = paramIntent.getData().getHost();
        if (new File(paramContext).exists()) {
          break label383;
        }
        paramContext = (Context)localObject1;
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AsyncObtainImage", "photo file from data, host:" + paramContext);
        break;
        if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("inline-data")))
        {
          paramContext = v(paramString, (Bitmap)paramIntent.getExtras().get("data"));
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AsyncObtainImage", "resolve photo from action-inline-data:%s", new Object[] { paramContext });
          break;
        }
        if (localCursor != null) {
          localCursor.close();
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AsyncObtainImage", "resolve photo from intent failed");
        return null;
      }
    }
  }
  
  public static String v(String paramString, Bitmap paramBitmap)
  {
    try
    {
      Object localObject = g.u(DateFormat.format("yyyy-MM-dd-HH-mm-ss", System.currentTimeMillis()).toString().getBytes()) + ".jpg";
      paramString = paramString + (String)localObject;
      localObject = new File(paramString);
      if (!((File)localObject).exists()) {
        ((File)localObject).createNewFile();
      }
      localObject = new BufferedOutputStream(new FileOutputStream((File)localObject));
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
      ((BufferedOutputStream)localObject).close();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AsyncObtainImage", "photo image from data, path:" + paramString);
      return paramString;
    }
    catch (IOException paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.AsyncObtainImage", paramString, "saveBmp Error.", new Object[0]);
    }
    return null;
  }
  
  public static abstract interface a
  {
    public abstract String NT(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/tools/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */