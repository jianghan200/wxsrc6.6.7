package com.tencent.mm.plugin.gallery.ui;

import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;

final class e
{
  private c jDA;
  int jDz = -1;
  
  public e(c paramc)
  {
    this.jDA = paramc;
  }
  
  final void qG(int paramInt)
  {
    c localc = this.jDA;
    if ((localc.jBz == null) || (localc.jBz.size() <= paramInt) || (paramInt < 0)) {
      return;
    }
    long l = ((GalleryItem.MediaItem)localc.jBz.get(paramInt)).jAU;
    String str3 = ((GalleryItem.MediaItem)localc.jBz.get(paramInt)).iSr;
    String str2 = ((GalleryItem.MediaItem)localc.jBz.get(paramInt)).egA;
    String str1 = str3;
    if (bi.oW(str3)) {
      str1 = str2;
    }
    com.tencent.mm.plugin.gallery.model.c.aRe().b(str1, ((GalleryItem.MediaItem)localc.jBz.get(paramInt)).getType(), str2, l);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gallery/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */