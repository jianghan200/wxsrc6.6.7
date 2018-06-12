package com.tencent.mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class k
  implements g
{
  private static int jAW = 100;
  public static String jBe = "date_added";
  public static String jBf = "datetaken";
  public static String jBg = "date_mix";
  protected ContentResolver evN = this.mContext.getContentResolver();
  private boolean jBh = false;
  boolean jBi = false;
  protected Context mContext = ad.getContext();
  long start = 0L;
  
  protected static long cU(String paramString1, String paramString2)
  {
    long l2 = 0L;
    long l3 = System.currentTimeMillis();
    long l1 = l2;
    if (!bi.oW(paramString1)) {
      l1 = l2;
    }
    for (;;)
    {
      try
      {
        l2 = TimeUnit.MILLISECONDS.convert(bi.getLong(paramString1, 0L), TimeUnit.MILLISECONDS);
        l1 = l2;
        if (l2 <= l3)
        {
          l1 = l2;
          long l4 = l3 / 1000L;
          l1 = l2;
          if (l2 >= l4) {
            return l2;
          }
        }
      }
      catch (NumberFormatException paramString1)
      {
        x.printErrStackTrace("MicroMsg.MediaQueryBase", paramString1, "", new Object[0]);
      }
      l2 = l1;
      if (!bi.oW(paramString2)) {
        try
        {
          l2 = TimeUnit.MILLISECONDS.convert(bi.getLong(paramString2, 0L), TimeUnit.SECONDS);
          l1 = l2;
          l2 = l1;
          if (l1 <= l3) {
            return l1;
          }
        }
        catch (NumberFormatException paramString1)
        {
          x.printErrStackTrace("MicroMsg.MediaQueryBase", paramString1, "", new Object[0]);
        }
      }
    }
    return l1;
  }
  
  protected abstract String CT(String paramString);
  
  /* Error */
  public final ArrayList<GalleryItem.MediaItem> a(String paramString, int paramInt, g.c paramc, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 73	java/lang/System:currentTimeMillis	()J
    //   4: putfield 47	com/tencent/mm/plugin/gallery/model/k:start	J
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 43	com/tencent/mm/plugin/gallery/model/k:jBh	Z
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_0
    //   17: aload_1
    //   18: iload_2
    //   19: aload_3
    //   20: lload 4
    //   22: invokevirtual 115	com/tencent/mm/plugin/gallery/model/k:b	(Ljava/lang/String;ILcom/tencent/mm/plugin/gallery/model/g$c;J)Ljava/util/ArrayList;
    //   25: astore_1
    //   26: aload_0
    //   27: monitorenter
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield 43	com/tencent/mm/plugin/gallery/model/k:jBh	Z
    //   33: aload_0
    //   34: monitorexit
    //   35: ldc 97
    //   37: ldc 117
    //   39: iconst_1
    //   40: anewarray 4	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: invokestatic 73	java/lang/System:currentTimeMillis	()J
    //   48: aload_0
    //   49: getfield 47	com/tencent/mm/plugin/gallery/model/k:start	J
    //   52: lsub
    //   53: invokestatic 123	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   56: aastore
    //   57: invokestatic 127	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: aload_1
    //   61: areturn
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    //   67: astore_1
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_1
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	k
    //   0	72	1	paramString	String
    //   0	72	2	paramInt	int
    //   0	72	3	paramc	g.c
    //   0	72	4	paramLong	long
    // Exception table:
    //   from	to	target	type
    //   9	16	62	finally
    //   63	65	62	finally
    //   28	35	67	finally
    //   68	70	67	finally
  }
  
  public final void aRA()
  {
    try
    {
      if (this.jBh) {
        this.jBi = true;
      }
      return;
    }
    finally {}
  }
  
  protected abstract Uri aRB();
  
  protected abstract String[] aRC();
  
  protected abstract String aRD();
  
  protected abstract String aRE();
  
  protected final boolean aRG()
  {
    try
    {
      boolean bool = this.jBi;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public ArrayList<GalleryItem.AlbumItem> aRz()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    try
    {
      Cursor localCursor = this.evN.query(aRB(), getProjection(), getSelection(), null, aRD());
      if (localCursor == null)
      {
        x.d("MicroMsg.MediaQueryBase", "no media folder now");
        return localArrayList;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.MediaQueryBase", "query album list failed : [%s]", new Object[] { localException.getMessage() });
        localObject1 = null;
      }
    }
    if (((Cursor)localObject1).moveToFirst()) {}
    for (;;)
    {
      Object localObject2 = Long.valueOf(0L);
      try
      {
        long l = bi.getLong(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("_id")), 0L);
        localObject2 = Long.valueOf(l);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        String str1;
        String str2;
        for (;;) {}
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
      str1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("_data"));
      str2 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow(aRE()));
      if ((bi.oW(str2)) && (getType() == 2)) {
        x.e("MicroMsg.MediaQueryBase", "null or nill album name, ignore this folder");
      }
      while (!((Cursor)localObject1).moveToNext())
      {
        ((Cursor)localObject1).close();
        return localArrayList;
        int i = ((Cursor)localObject1).getInt(3);
        x.i("MicroMsg.MediaQueryBase", str1 + "====" + str2 + "=====" + localObject2 + ", " + i);
        if ((i == 0) || ((bi.oW(str1)) && (bi.oW(null))))
        {
          x.e("MicroMsg.MediaQueryBase", "query album failed, " + i + ", " + str1 + "," + null);
        }
        else
        {
          Object localObject3;
          if (!bi.oW(str1))
          {
            localObject3 = str1;
            if (e.cn(str1)) {}
          }
          else
          {
            localObject3 = null;
          }
          if (!bi.oW(null)) {
            e.cn(null);
          }
          if (localObject3 == null)
          {
            x.e("MicroMsg.MediaQueryBase", "this item has no thumb path and orignal path");
          }
          else
          {
            str1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("mime_type"));
            localObject2 = GalleryItem.MediaItem.a(getType(), ((Long)localObject2).longValue(), (String)localObject3, null, str1);
            localObject3 = new GalleryItem.AlbumItem(str2, i);
            ((GalleryItem.AlbumItem)localObject3).jAR = ((GalleryItem.MediaItem)localObject2);
            localArrayList.add(localObject3);
          }
        }
      }
    }
  }
  
  public ArrayList<GalleryItem.MediaItem> b(String paramString, int paramInt, g.c paramc, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    try
    {
      Cursor localCursor = this.evN.query(aRB(), aRC(), CT(paramString), null, aRD());
      if (localCursor == null)
      {
        x.d("MicroMsg.MediaQueryBase", "query album failed: " + paramString);
        if (paramc != null) {
          paramc.a(localArrayList, paramLong);
        }
        return localArrayList;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.MediaQueryBase", "query media items in album failed : [%s]", new Object[] { localException.getMessage() });
        localObject1 = null;
      }
      paramInt = 0;
      if (!((Cursor)localObject1).moveToFirst()) {}
    }
    label656:
    label736:
    for (;;)
    {
      paramString = Long.valueOf(0L);
      try
      {
        l = bi.getLong(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("_id")), 0L);
        paramString = Long.valueOf(l);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        long l;
        String str1;
        String str2;
        String str3;
        Object localObject2;
        for (;;) {}
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          continue;
          paramInt = 0;
        }
      }
      str1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("_data"));
      str2 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow(jBg));
      l = ((Cursor)localObject1).getLong(((Cursor)localObject1).getColumnIndexOrThrow(jBg));
      str3 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow(jBe));
      localObject2 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow(jBf));
      if ((str2 == null) || (str2.equals("")) || (str2.equals(Integer.valueOf(0))))
      {
        h.mEJ.a(363L, 1L, 1L, true);
        if (0L != l) {
          h.mEJ.a(363L, 4L, 1L, true);
        }
        if (((str3 == null) || (str3.equals("")) || (str3.equals(Integer.valueOf(0)))) && (localObject2 != null) && (!((String)localObject2).equals("")) && (!((String)localObject2).equals(Integer.valueOf(0)))) {
          h.mEJ.a(363L, 3L, 1L, true);
        }
        if (((localObject2 == null) || (((String)localObject2).equals("")) || (((String)localObject2).equals(Integer.valueOf(0)))) && (str3 != null) && (!str3.equals("")) && (!str3.equals(Integer.valueOf(0)))) {
          h.mEJ.a(363L, 2L, 1L, true);
        }
        localObject2 = GalleryItem.MediaItem.x(getType(), paramString.longValue());
        if ((!bi.oW(str1)) && (new File(str1).exists())) {
          ((GalleryItem.MediaItem)localObject2).egA = str1;
        }
        ((GalleryItem.MediaItem)localObject2).jAV = cU(str2, str3);
        if ((!bi.oW(((GalleryItem.MediaItem)localObject2).egA)) || (!bi.oW(((GalleryItem.MediaItem)localObject2).iSr))) {
          break label656;
        }
        x.e("MicroMsg.MediaQueryBase", "thumb file and orignal file both not exist");
      }
      for (paramInt = 0;; paramInt = 1)
      {
        if (((Cursor)localObject1).moveToNext()) {
          break label736;
        }
        ((Cursor)localObject1).close();
        if ((paramInt == 0) && (paramc != null)) {
          paramc.a(localArrayList, paramLong);
        }
        return localArrayList;
        if ((localObject2 == null) || (((String)localObject2).equals("")) || (((String)localObject2).equals(Integer.valueOf(0))))
        {
          h.mEJ.a(363L, 6L, 1L, true);
          break;
        }
        if ((str3 != null) && (!str3.equals("")) && (!str3.equals(Integer.valueOf(0)))) {
          break;
        }
        h.mEJ.a(363L, 5L, 1L, true);
        break;
        str1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("mime_type"));
        paramString = str1;
        if (bi.oW(str1)) {
          paramString = "";
        }
        ((GalleryItem.MediaItem)localObject2).mMimeType = paramString;
        localArrayList.add(localObject2);
        if ((localArrayList.size() % jAW != 0) || (paramc == null)) {
          break label748;
        }
        paramc.a(localArrayList, paramLong);
        localArrayList.clear();
      }
    }
  }
  
  protected abstract String[] getProjection();
  
  protected abstract String getSelection();
  
  protected abstract int getType();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */