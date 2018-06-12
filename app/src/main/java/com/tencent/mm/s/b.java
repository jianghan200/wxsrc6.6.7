package com.tencent.mm.s;

import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public final class b
{
  SparseArray<a> dlB = new SparseArray();
  HashMap<aa.a, a> dlC = new HashMap();
  SparseArray<b> dlD = new SparseArray();
  HashMap<aa.a, b> dlE = new HashMap();
  private Random dlF = new Random();
  com.tencent.mm.storage.x dlG = null;
  
  private a c(aa.a parama)
  {
    String str = (String)this.dlG.get(parama, null);
    if (str == null) {
      return null;
    }
    String[] arrayOfString = str.split("\\|");
    if (arrayOfString.length != 3)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "loadDataSource array.length != 3 content %s", new Object[] { str });
      return null;
    }
    try
    {
      parama = a(parama, Integer.valueOf(arrayOfString[0]).intValue(), unescape(arrayOfString[1]), unescape(arrayOfString[2]));
      return parama;
    }
    catch (Exception parama)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bi.i(parama) });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "loadDataSource exception content %s", new Object[] { str });
    }
    return null;
  }
  
  private b d(aa.a parama)
  {
    String str = (String)this.dlG.get(parama, null);
    if (str == null) {
      return e(parama);
    }
    String[] arrayOfString = str.split("\\|");
    if (arrayOfString.length % 2 != 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "loadWatcher array.length %% 2 != 0 content %s", new Object[] { str });
      return null;
    }
    try
    {
      parama = e(parama);
      int i = 0;
      while (i < arrayOfString.length)
      {
        parama.dlK.put(arrayOfString[i], unescape(arrayOfString[(i + 1)]));
        i += 2;
      }
      return parama;
    }
    catch (Exception parama)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bi.i(parama) });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "loadWatcher exception content %s", new Object[] { str });
    }
    return null;
  }
  
  private static String fz(String paramString)
  {
    return paramString.replaceAll("\\|", "%7C");
  }
  
  private a gn(int paramInt)
  {
    String str = (String)this.dlG.get(paramInt, null);
    if (str == null) {
      return null;
    }
    Object localObject = str.split("\\|");
    if (localObject.length != 3)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "loadDataSource array.length != 3 content %s", new Object[] { str });
      return null;
    }
    try
    {
      localObject = a(paramInt, Integer.valueOf(localObject[0]).intValue(), unescape(localObject[1]), unescape(localObject[2]));
      return (a)localObject;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bi.i(localException) });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "loadDataSource exception content %s", new Object[] { str });
    }
    return null;
  }
  
  private b go(int paramInt)
  {
    String str = (String)this.dlG.get(paramInt, null);
    if (str == null) {
      return gp(paramInt);
    }
    String[] arrayOfString = str.split("\\|");
    if (arrayOfString.length % 2 != 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "loadWatcher array.length %% 2 != 0 content %s", new Object[] { str });
      return null;
    }
    try
    {
      b localb = gp(paramInt);
      paramInt = 0;
      while (paramInt < arrayOfString.length)
      {
        localb.dlJ.put(Integer.valueOf(arrayOfString[paramInt]).intValue(), unescape(arrayOfString[(paramInt + 1)]));
        paramInt += 2;
      }
      return localb;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bi.i(localException) });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "loadWatcher exception content %s", new Object[] { str });
    }
    return null;
  }
  
  private static String unescape(String paramString)
  {
    return paramString.replaceAll("%7C", "|");
  }
  
  final String Co()
  {
    return String.format("%d%04d", new Object[] { Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.dlF.nextInt(Math.abs(this.dlF.nextInt(Integer.MAX_VALUE))) % 10000) });
  }
  
  final a a(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    a locala = new a();
    locala.dlx = paramInt1;
    locala.type = paramInt2;
    locala.value = paramString1;
    locala.bLe = paramString2;
    return locala;
  }
  
  final a a(aa.a parama, int paramInt, String paramString1, String paramString2)
  {
    a locala = new a();
    locala.dly = parama;
    locala.type = paramInt;
    locala.value = paramString1;
    locala.bLe = paramString2;
    return locala;
  }
  
  public final a a(aa.a parama1, aa.a parama2, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSourceKey %s, watcherKey %s, type %d", new Object[] { parama1, parama2, Integer.valueOf(paramInt) });
    a locala = f(parama1);
    if (locala == null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSource == null");
      return null;
    }
    if ((locala.type & paramInt) == 0)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NewBadgeDecoder", "[alex] peek, dataSource.type is wrong");
      return null;
    }
    parama2 = g(parama2);
    if (parama2 != null)
    {
      String str = (String)parama2.dlK.get(parama1.name());
      if ((str != null) && (str.equals(locala.bLe))) {
        return null;
      }
      if (str == null)
      {
        str = Co();
        parama2.dlK.put(parama1.name(), str);
        a(parama2);
      }
      return locala;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
    return null;
  }
  
  final void a(a parama)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(parama.type);
    localStringBuffer.append("|");
    localStringBuffer.append(fz(parama.value));
    localStringBuffer.append("|");
    localStringBuffer.append(fz(parama.bLe));
    if (parama.dly != null)
    {
      this.dlG.a(parama.dly, localStringBuffer.toString());
      return;
    }
    this.dlG.set(parama.dlx, localStringBuffer.toString());
  }
  
  final void a(b paramb)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject1;
    if (paramb.dlA != null)
    {
      localObject1 = paramb.dlK.entrySet().iterator();
      i = 0;
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        String str = (String)((Map.Entry)localObject2).getKey();
        localObject2 = (String)((Map.Entry)localObject2).getValue();
        if (i != 0) {
          localStringBuffer.append("|");
        }
        localStringBuffer.append(str);
        localStringBuffer.append("|");
        localStringBuffer.append(fz((String)localObject2));
        i += 1;
      }
      this.dlG.a(paramb.dlA, localStringBuffer.toString());
      return;
    }
    int i = 0;
    while (i < paramb.dlJ.size())
    {
      int j = paramb.dlJ.keyAt(i);
      localObject1 = (String)paramb.dlJ.get(j);
      if (i != 0) {
        localStringBuffer.append("|");
      }
      localStringBuffer.append(j);
      localStringBuffer.append("|");
      localStringBuffer.append(fz((String)localObject1));
      i += 1;
    }
    this.dlG.set(paramb.dlI, localStringBuffer.toString());
  }
  
  final b e(aa.a parama)
  {
    b localb = new b();
    localb.dlA = parama;
    return localb;
  }
  
  public final a f(aa.a parama)
  {
    a locala2 = (a)this.dlC.get(parama);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala2 = c(parama);
      locala1 = locala2;
      if (locala2 != null)
      {
        this.dlC.put(parama, locala2);
        locala1 = locala2;
      }
    }
    return locala1;
  }
  
  final b g(aa.a parama)
  {
    b localb2 = (b)this.dlE.get(parama);
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = d(parama);
      if (localb1 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "[carl] loadWatcher watcher == null");
        localb1 = null;
      }
    }
    else
    {
      return localb1;
    }
    this.dlE.put(parama, localb1);
    return localb1;
  }
  
  final b gp(int paramInt)
  {
    b localb = new b();
    localb.dlI = paramInt;
    return localb;
  }
  
  public final a gq(int paramInt)
  {
    a locala2 = (a)this.dlB.get(paramInt);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala2 = gn(paramInt);
      locala1 = locala2;
      if (locala2 != null)
      {
        this.dlB.put(paramInt, locala2);
        locala1 = locala2;
      }
    }
    return locala1;
  }
  
  final b gr(int paramInt)
  {
    b localb2 = (b)this.dlD.get(paramInt);
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = go(paramInt);
      if (localb1 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "[carl] loadWatcher watcher == null");
        localb1 = null;
      }
    }
    else
    {
      return localb1;
    }
    this.dlD.put(paramInt, localb1);
    return localb1;
  }
  
  public final a x(int paramInt1, int paramInt2, int paramInt3)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSourceId %d, watcherId %d, type %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    a locala = gq(paramInt1);
    if (locala == null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSource == null");
      return null;
    }
    if ((locala.type & paramInt3) == 0)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NewBadgeDecoder", "[alex] peek, dataSource.type is wrong");
      return null;
    }
    b localb = gr(paramInt2);
    if (localb != null)
    {
      String str = (String)localb.dlJ.get(paramInt1);
      if ((str != null) && (str.equals(locala.bLe))) {
        return null;
      }
      if (str == null)
      {
        str = Co();
        localb.dlJ.put(paramInt1, str);
        a(localb);
      }
      return locala;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
    return null;
  }
  
  public final class a
  {
    String bLe;
    int dlx;
    aa.a dly;
    int type;
    public String value;
    
    public a() {}
  }
  
  public final class b
  {
    aa.a dlA;
    int dlI;
    SparseArray<String> dlJ = new SparseArray();
    HashMap<String, String> dlK = new HashMap();
    
    public b() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/s/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */