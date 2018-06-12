package com.tencent.mm.plugin.gallery.model;

import android.net.Uri;
import android.provider.MediaStore.Video.Media;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class n
  extends k
{
  protected final String CT(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.VideoQuery", "get media item selection, but album name is null, do select all");
      return null;
    }
    return "bucket_display_name=\"" + paramString + "\"";
  }
  
  protected final Uri aRB()
  {
    return MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
  }
  
  protected final String[] aRC()
  {
    return new String[] { "_id", "_data", "COALESCE(" + k.jBf, k.jBe + ",0) AS " + jBg, k.jBf, k.jBe, "mime_type" };
  }
  
  protected final String aRD()
  {
    return k.jBf + " desc,_id desc";
  }
  
  protected final String aRE()
  {
    return "bucket_display_name";
  }
  
  public final ArrayList<GalleryItem.AlbumItem> aRz()
  {
    return super.aRz();
  }
  
  protected final String[] getProjection()
  {
    return new String[] { "_id", "_data", "bucket_display_name", "count(*)", "COALESCE(" + k.jBf, k.jBe + ",0) AS " + jBg, k.jBf, k.jBe, "mime_type" };
  }
  
  protected final String getSelection()
  {
    return "0==0) GROUP BY (bucket_display_name";
  }
  
  protected final int getType()
  {
    return 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */