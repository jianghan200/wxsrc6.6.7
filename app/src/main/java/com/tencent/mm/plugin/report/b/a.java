package com.tencent.mm.plugin.report.b;

import com.tencent.mm.a.e;
import com.tencent.mm.protocal.c.amj;
import com.tencent.mm.protocal.c.avj;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  private static String filename = "heavy_user_id_mapping.dat";
  private static Object lock = new Object();
  private a mDG = null;
  private int mDH = 0;
  private int mDI = 1;
  private int mDJ = 2;
  private int mDK = 3;
  
  private static void a(amj paramamj, boolean paramBoolean)
  {
    avj localavj;
    if (paramBoolean)
    {
      x.i("MicroMsg.HeavyUserIDMappingStg", "################################# svr heavy user strategy #############################");
      x.i("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + paramamj.rOY + ", ret:" + paramamj.rPa);
      paramamj = paramamj.rOZ.iterator();
      while (paramamj.hasNext())
      {
        localavj = (avj)paramamj.next();
        x.i("MicroMsg.HeavyUserIDMappingStg", "origin:" + localavj.rYf + ", userid:" + localavj.rYg);
      }
      x.i("MicroMsg.HeavyUserIDMappingStg", "#################################  End ################################################");
      return;
    }
    x.d("MicroMsg.HeavyUserIDMappingStg", "################################# Local heavy user strategy #############################");
    x.d("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + paramamj.rOY + ", ret:" + paramamj.rPa);
    paramamj = paramamj.rOZ.iterator();
    while (paramamj.hasNext())
    {
      localavj = (avj)paramamj.next();
      x.d("MicroMsg.HeavyUserIDMappingStg", "origin:" + localavj.rYf + ", userid:" + localavj.rYg);
    }
    x.d("MicroMsg.HeavyUserIDMappingStg", "#################################  End ################################################");
  }
  
  public static amj brI()
  {
    x.d("MicroMsg.HeavyUserIDMappingStg", "getIDMappingObj");
    synchronized (lock)
    {
      byte[] arrayOfByte1 = e.f(aa.duN + filename, 0, -1);
      if (arrayOfByte1 == null)
      {
        x.w("MicroMsg.HeavyUserIDMappingStg", "get file content fail, filename" + filename);
        return null;
      }
    }
    ??? = new amj();
    try
    {
      ((amj)???).aG(arrayOfByte2);
      a((amj)???, false);
      return (amj)???;
    }
    catch (IOException localIOException)
    {
      x.printErrStackTrace("MicroMsg.HeavyUserIDMappingStg", localIOException, "", new Object[0]);
    }
    return null;
  }
  
  public static int vs(int paramInt)
  {
    x.d("MicroMsg.HeavyUserIDMappingStg", "getIDMappingVersion,chanel:" + paramInt);
    amj localamj = brI();
    if (localamj == null) {
      return 0;
    }
    paramInt = localamj.rOY;
    x.i("MicroMsg.HeavyUserIDMappingStg", "version:" + paramInt);
    return paramInt;
  }
  
  public final void a(amj paramamj, int paramInt)
  {
    x.i("MicroMsg.HeavyUserIDMappingStg", "saveIDMapping, channel:" + paramInt);
    if (paramamj == null)
    {
      x.w("MicroMsg.HeavyUserIDMappingStg", "HeavyUserRespInfo is null");
      return;
    }
    Object localObject2;
    if (this.mDH != paramamj.rPa)
    {
      localObject2 = new StringBuilder("heavyUserRespInfo.RespType Unnormal, type:");
      paramInt = paramamj.rPa;
      if (this.mDI == paramInt) {
        ??? = "服务器过载";
      }
      for (;;)
      {
        x.e("MicroMsg.HeavyUserIDMappingStg", (String)??? + ",version:" + paramamj.rOY);
        return;
        if (this.mDJ == paramInt) {
          ??? = "服务器没有配置表";
        } else if (this.mDK == paramInt) {
          ??? = "服务器配置表错误";
        } else {
          ??? = "非法的错误类型";
        }
      }
    }
    int i = vs(paramInt);
    int j = paramamj.rOY;
    if (i == j)
    {
      x.d("MicroMsg.HeavyUserIDMappingStg", "client has same version with Srv, version:" + j);
      return;
    }
    x.i("MicroMsg.HeavyUserIDMappingStg", "version changed, client:" + vs(paramInt) + ", svr:" + j);
    a(paramamj, true);
    try
    {
      localObject2 = paramamj.toByteArray();
      synchronized (lock)
      {
        x.i("MicroMsg.HeavyUserIDMappingStg", "new version:" + paramamj.rOY);
        e.b(aa.duN, filename, (byte[])localObject2);
        return;
      }
      return;
    }
    catch (IOException paramamj)
    {
      x.printErrStackTrace("MicroMsg.HeavyUserIDMappingStg", paramamj, "", new Object[0]);
    }
  }
  
  public static abstract interface a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */