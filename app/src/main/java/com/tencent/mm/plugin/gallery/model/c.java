package com.tencent.mm.plugin.gallery.model;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.tencent.mm.R.l;
import com.tencent.mm.a.f;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class c
{
  private static int bkq = 0;
  public static boolean jAA;
  public static boolean jAB;
  public static boolean jAC;
  private static c jAy = null;
  public static boolean jAz = false;
  private HashSet<GalleryItem.MediaItem> jAD = new HashSet();
  private ArrayList<Bundle> jAE = new ArrayList();
  private HashMap<Integer, Boolean> jAF = new HashMap();
  private l jAt;
  private a jAu;
  private e jAv;
  private ArrayList<GalleryItem.MediaItem> jAw = null;
  private LinkedHashSet<GalleryItem.MediaItem> jAx = new LinkedHashSet();
  
  static
  {
    jAA = false;
    jAB = false;
    jAC = false;
  }
  
  private c()
  {
    if (this.jAu == null) {
      this.jAu = new a();
    }
    if (this.jAt == null) {
      this.jAt = new l();
    }
    if (this.jAv == null) {
      this.jAv = new e();
    }
  }
  
  public static GalleryItem.MediaItem CS(String paramString)
  {
    paramString = GalleryItem.MediaItem.a(0, 0L, paramString, "", "");
    if (aRd().jAw != null)
    {
      int i = aRd().jAw.indexOf(paramString);
      if (i >= 0) {
        return (GalleryItem.MediaItem)aRd().jAw.get(i);
      }
    }
    return null;
  }
  
  public static void a(com.tencent.mm.plugin.gallery.stub.a parama, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    x.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] selectSize:%s isSendRaw:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean1) });
    if (parama == null)
    {
      x.e("MicroMsg.GalleryCore", "invoker is null");
      return;
    }
    int i;
    if (aRd().jAt.aRI() == 3) {
      i = 1;
    }
    for (;;)
    {
      label53:
      int j;
      label73:
      label199:
      Object localObject;
      int n;
      int i1;
      int i2;
      int i3;
      boolean bool2;
      int m;
      boolean bool3;
      label339:
      int k;
      if (aRd().jAD != null)
      {
        j = aRd().jAD.size();
        x.i("MicroMsg.GalleryCore", "[reportPhotoEdit] fromScene:%s,selectSize:%s,editSize:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(j) });
        if (j > 0) {
          parama.al(13858, i + "," + paramInt + "," + j + ",0");
        }
        boolean bool1 = parama.fi(true);
        x.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] imageState:%s", new Object[] { Boolean.valueOf(bool1) });
        Iterator localIterator = aRd().jAE.iterator();
        label347:
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject = (Bundle)localIterator.next();
          String str = ((Bundle)localObject).getString("after_photo_edit");
          if ((!bool1) || (!paramBoolean2))
          {
            x.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] delete file:%s", new Object[] { str });
            FileOp.deleteFile(str);
            r.a(str, ad.getContext());
          }
          n = ((Bundle)localObject).getInt("report_info_emotion_count");
          i1 = ((Bundle)localObject).getInt("report_info_text_count");
          i2 = ((Bundle)localObject).getInt("report_info_mosaic_count");
          i3 = ((Bundle)localObject).getInt("report_info_doodle_count");
          bool2 = ((Bundle)localObject).getBoolean("report_info_iscrop");
          m = ((Bundle)localObject).getInt("report_info_undo_count");
          bool3 = ((Bundle)localObject).getBoolean("report_info_is_rotation");
          if (!bool2) {
            break label589;
          }
          paramInt = 1;
          if (!bool3) {
            break label594;
          }
          k = 1;
          x.i("MicroMsg.GalleryCore", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,isRotation:%s", new Object[] { Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(paramInt), Integer.valueOf(m), Integer.valueOf(k) });
        } while (j <= 0);
      }
      for (;;)
      {
        try
        {
          localObject = new StringBuilder().append(i).append(",").append(paramBoolean1).append(",").append(n).append(",").append(i1).append(",").append(i2).append(",").append(i3).append(",");
          if (!bool2) {
            break label600;
          }
          paramInt = 1;
          localObject = ((StringBuilder)localObject).append(paramInt).append(",").append(m).append(",2");
          if (!bool3) {
            break label605;
          }
          paramInt = 1;
          parama.al(13857, paramInt);
        }
        catch (RemoteException localRemoteException)
        {
          x.printErrStackTrace("MicroMsg.GalleryCore", localRemoteException, "", new Object[0]);
        }
        break label199;
        break;
        if (aRd().jAt.aRI() != 4) {
          break label610;
        }
        i = 2;
        break label53;
        j = 0;
        break label73;
        label589:
        paramInt = 0;
        break label339;
        label594:
        k = 0;
        break label347;
        label600:
        paramInt = 0;
        continue;
        label605:
        paramInt = 0;
      }
      label610:
      i = 0;
    }
  }
  
  public static void a(com.tencent.mm.plugin.gallery.stub.a parama, String paramString, int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = 2;
    int k = aRd().jAt.aRI();
    int i;
    switch (k)
    {
    case 5: 
    case 6: 
    default: 
      i = 0;
    }
    for (;;)
    {
      x.i("MicroMsg.GalleryCore", "[handleSelectImagePreviewReport] source:%s", new Object[] { Integer.valueOf(k) });
      if (parama != null) {
        break;
      }
      x.e("MicroMsg.GalleryCore", "invoker is null");
      return;
      i = 1;
      continue;
      i = j;
      if (!bi.oW(paramString))
      {
        i = j;
        if (paramString.equals(ad.getContext().getString(R.l.favorite)))
        {
          i = 6;
          continue;
          i = 3;
        }
      }
    }
    try
    {
      parama.al(14205, i + "," + i + "," + paramArrayOfInt[0] + "," + paramArrayOfInt[1] + "," + paramArrayOfInt[2] + "," + paramArrayOfInt[3] + "," + paramBoolean1 + "," + paramBoolean2 + "," + jAz + "," + jAA + "," + jAB + "," + jAC);
      jAz = false;
      jAA = false;
      jAB = false;
      jAC = false;
      return;
    }
    catch (RemoteException parama)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.GalleryCore", parama, "", new Object[0]);
      }
    }
  }
  
  private static c aRd()
  {
    if (jAy == null) {
      jAy = new c();
    }
    return jAy;
  }
  
  public static a aRe()
  {
    return aRd().jAu;
  }
  
  public static l aRf()
  {
    return aRd().jAt;
  }
  
  public static e aRg()
  {
    return aRd().jAv;
  }
  
  public static ArrayList<GalleryItem.MediaItem> aRh()
  {
    return aRd().jAw;
  }
  
  public static HashSet<GalleryItem.MediaItem> aRi()
  {
    return aRd().jAD;
  }
  
  public static ArrayList<Bundle> aRj()
  {
    return aRd().jAE;
  }
  
  public static LinkedHashSet<GalleryItem.MediaItem> aRk()
  {
    return aRd().jAx;
  }
  
  public static void aRl()
  {
    aRd().jAF.clear();
  }
  
  public static int aRm()
  {
    return aRd().jAF.size();
  }
  
  public static void initialize()
  {
    try
    {
      bkq += 1;
      return;
    }
    finally {}
  }
  
  public static void qn(int paramInt)
  {
    aRd().jAF.put(Integer.valueOf(paramInt), Boolean.valueOf(true));
  }
  
  public static void release(boolean paramBoolean)
  {
    try
    {
      if (bkq > 0) {
        bkq -= 1;
      }
      if ((paramBoolean) && (bkq == 0))
      {
        aRd().jAt = null;
        if (aRd().jAu != null)
        {
          localObject1 = aRd().jAu.jAe;
          if (((b)localObject1).jAp != null)
          {
            ((b)localObject1).jAp.a(new b.4((b)localObject1));
            ((b)localObject1).jAp = null;
          }
          if (((b)localObject1).jAq != null)
          {
            d locald = ((b)localObject1).jAq;
            locald.aRo();
            locald.aRp();
            locald.aRr();
            ((b)localObject1).jAq = null;
          }
          aRd().jAu = null;
        }
        Object localObject1 = aRd().jAv;
        if (((e)localObject1).jAK != null)
        {
          ((e)localObject1).jAK.quit();
          ((e)localObject1).jAK = null;
        }
        ((e)localObject1).jAN = null;
        if (((e)localObject1).jAL != null)
        {
          ((e)localObject1).jAL.quit();
          ((e)localObject1).jAL = null;
        }
        ((e)localObject1).jAO = null;
        if (((e)localObject1).jAM != null)
        {
          ((e)localObject1).jAM.quit();
          ((e)localObject1).jAM = null;
        }
        ((e)localObject1).jAP = null;
        aRd().jAv = null;
        jAy = null;
      }
      return;
    }
    finally {}
  }
  
  public static void v(ArrayList<GalleryItem.MediaItem> paramArrayList)
  {
    aRd().jAw = paramArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */