package com.tencent.mm.plugin.gallery.model;

import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class i
  extends k
{
  private String[] jBb = { "camera", "screenshot", "download" };
  
  protected final String CT(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.ImageQuery", "get media item selection, but album name is null, do select all");
      paramString = "_size>10240";
      String[] arrayOfString = this.jBb;
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        paramString = paramString + " or lower(_data) like '%" + str + "%'";
        i += 1;
      }
      x.d("MicroMsg.ImageQuery", "where %s", new Object[] { paramString });
      return paramString;
    }
    return "bucket_display_name=\"" + paramString + "\"";
  }
  
  public final Uri aRB()
  {
    return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
  }
  
  protected final String[] aRC()
  {
    return new String[] { "_id", "_data", "COALESCE(" + k.jBf, k.jBe + ",0) AS " + jBg, k.jBf, k.jBe, "mime_type" };
  }
  
  public final String aRD()
  {
    return k.jBg + " desc,_id desc";
  }
  
  protected final String aRE()
  {
    return "bucket_display_name";
  }
  
  public final ArrayList<GalleryItem.AlbumItem> aRz()
  {
    return super.aRz();
  }
  
  public final String[] getProjection()
  {
    return new String[] { "_id", "_data", "bucket_display_name", "count(*)", "COALESCE(" + k.jBf, k.jBe + ",0) AS " + jBg, k.jBf, k.jBe, "mime_type" };
  }
  
  public final String getSelection()
  {
    return "0==0) GROUP BY (bucket_display_name";
  }
  
  protected final int getType()
  {
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */