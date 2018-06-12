package com.tencent.mm.plugin.bottle.a;

import android.content.Context;
import android.database.Cursor;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.k;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;

public final class c
{
  private static int hjT = 1;
  private static int hjU = 1;
  
  public static String a(Context paramContext, ab paramab)
  {
    if (paramab == null) {
      paramContext = paramContext.getString(R.l.bottle_unknowed_city);
    }
    String str;
    do
    {
      do
      {
        return paramContext;
        if (!RegionCodeDecoder.Zh(paramab.getCountryCode())) {
          break;
        }
        str = paramab.getCity();
        paramContext = str;
      } while (!bi.oW(str));
      str = r.gV(paramab.getProvince());
      paramContext = str;
    } while (!bi.oW(str));
    RegionCodeDecoder.cmS();
    return RegionCodeDecoder.getLocName(paramab.getCountryCode());
    return paramContext.getString(R.l.bottle_unknowed_city);
  }
  
  public static int auc()
  {
    return hjT;
  }
  
  public static int aud()
  {
    return hjU;
  }
  
  public static int aue()
  {
    return k.GB();
  }
  
  public static void auf()
  {
    b localb = i.auk();
    long l = bi.VF() - 7776000000L;
    Object localObject = "select distinct content , msgtype from bottleinfo1 where bottleinfo1.createtime < " + l;
    Cursor localCursor = localb.dCZ.b((String)localObject, null, 0);
    int j = localCursor.getCount();
    int i;
    if (j > 0)
    {
      String[] arrayOfString = new String[j];
      i = 0;
      localObject = arrayOfString;
      if (i < j)
      {
        localCursor.moveToPosition(i);
        if (localCursor.getInt(1) == 3) {
          arrayOfString[i] = localCursor.getString(0);
        }
        for (;;)
        {
          i += 1;
          break;
          arrayOfString[i] = null;
        }
      }
    }
    else
    {
      localObject = null;
    }
    localCursor.close();
    if (j > 0) {
      localb.dCZ.delete("bottleinfo1", "createtime< ?", new String[] { String.valueOf(l) });
    }
    if (localObject == null) {}
    for (;;)
    {
      return;
      i = 0;
      while (i < localObject.length)
      {
        x.d("MicroMsg.BottleLogic", "delete path:" + com.tencent.mm.modelvoice.q.getFullPath(localObject[i]));
        if (!bi.oW(com.tencent.mm.modelvoice.q.getFullPath(localObject[i]))) {
          e.deleteFile(com.tencent.mm.modelvoice.q.getFullPath(localObject[i]));
        }
        i += 1;
      }
    }
  }
  
  public static String b(Context paramContext, ab paramab)
  {
    if (paramab == null)
    {
      paramab = paramContext.getString(R.l.bottle_unknowed_city);
      return paramab;
    }
    String str = r.gV(paramab.getProvince());
    Object localObject = str;
    if (RegionCodeDecoder.Zh(paramab.getCountryCode()))
    {
      if (!bi.oW(paramab.getCity())) {
        break label92;
      }
      localObject = new StringBuilder();
      RegionCodeDecoder.cmS();
    }
    label92:
    for (localObject = RegionCodeDecoder.getLocName(paramab.getCountryCode()) + str;; localObject = str + paramab.getCity())
    {
      paramab = (ab)localObject;
      if (!bi.oW((String)localObject)) {
        break;
      }
      return paramContext.getString(R.l.bottle_unknowed_city);
    }
  }
  
  public static void ng(int paramInt)
  {
    hjT = paramInt;
  }
  
  public static void nh(int paramInt)
  {
    hjU = paramInt;
  }
  
  public static int ni(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 1: 
      return 1;
    case 2: 
      return 3;
    case 3: 
      return 34;
    }
    return 43;
  }
  
  public static String wU(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return null;
      paramString = paramString.split("@bottle:");
    } while ((paramString == null) || (paramString.length < 2));
    return paramString[1];
  }
  
  public static void wV(String paramString)
  {
    a locala = null;
    com.tencent.mm.plugin.bottle.a.ezo.vl();
    au.HU();
    if (com.tencent.mm.model.c.FT().GT(paramString) != 1) {}
    bd localbd;
    Object localObject1;
    do
    {
      do
      {
        return;
        au.HU();
        localbd = com.tencent.mm.model.c.FT().GE(paramString);
      } while ((localbd == null) || (!localbd.field_talker.equals(paramString)));
      localObject1 = wU(paramString);
    } while (bi.oW((String)localObject1));
    Object localObject2 = i.auk();
    String str = "select bottleinfo1.parentclientid,bottleinfo1.childcount,bottleinfo1.bottleid,bottleinfo1.bottletype,bottleinfo1.msgtype,bottleinfo1.voicelen,bottleinfo1.content,bottleinfo1.createtime,bottleinfo1.reserved1,bottleinfo1.reserved2,bottleinfo1.reserved3,bottleinfo1.reserved4 from bottleinfo1   where bottleinfo1.bottleid = \"" + bi.oU((String)localObject1) + "\"";
    localObject2 = ((b)localObject2).dCZ.b(str, null, 0);
    if (localObject2 == null)
    {
      locala = null;
      label127:
      if ((locala == null) || (!locala.aub().equals(localObject1)) || (locala.hjQ != 1)) {
        break label487;
      }
      localObject1 = new bd();
      ((bd)localObject1).ep(paramString);
      if (localbd.field_createTime > locala.hjS) {
        break label489;
      }
    }
    label487:
    label489:
    for (long l = localbd.field_createTime - 1L;; l = locala.hjS)
    {
      ((bd)localObject1).ay(l);
      ((bd)localObject1).setType(ni(locala.msgType));
      ((bd)localObject1).setStatus(2);
      ((bd)localObject1).eX(1);
      if (((bd)localObject1).getType() != 34) {
        break label519;
      }
      ((bd)localObject1).setContent(n.b(com.tencent.mm.model.q.GF(), locala.hjR, false));
      paramString = locala.getContent() + bi.VF();
      if (j.fN(com.tencent.mm.modelvoice.q.getFullPath(locala.getContent()), com.tencent.mm.modelvoice.q.getFullPath(paramString))) {
        break label497;
      }
      x.e("MicroMsg.BottleLogic", "Copy Bottle Voice File Failed :" + locala.getContent());
      return;
      if (((Cursor)localObject2).moveToFirst())
      {
        locala = new a();
        locala.hjN = ((Cursor)localObject2).getString(0);
        locala.hjO = ((Cursor)localObject2).getInt(1);
        locala.hjP = ((Cursor)localObject2).getString(2);
        locala.hjQ = ((Cursor)localObject2).getInt(3);
        locala.msgType = ((Cursor)localObject2).getInt(4);
        locala.hjR = ((Cursor)localObject2).getInt(5);
        locala.content = ((Cursor)localObject2).getString(6);
        locala.hjS = ((Cursor)localObject2).getLong(7);
        locala.dCV = ((Cursor)localObject2).getInt(8);
        locala.dSJ = ((Cursor)localObject2).getInt(9);
        locala.dCX = ((Cursor)localObject2).getString(10);
        locala.dCY = ((Cursor)localObject2).getString(11);
      }
      ((Cursor)localObject2).close();
      break label127;
      break;
    }
    label497:
    ((bd)localObject1).eq(paramString);
    for (;;)
    {
      au.HU();
      com.tencent.mm.model.c.FT().T((bd)localObject1);
      return;
      label519:
      ((bd)localObject1).setContent(locala.getContent());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */