package com.tencent.mm.av;

import android.os.HandlerThread;
import android.util.Base64;
import com.tencent.map.swlocation.api.LocationUpdateListener;
import com.tencent.map.swlocation.api.ServerMessageListener;
import com.tencent.mm.a.h;
import com.tencent.mm.ar.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private static final byte[] edN = "@wechat*weixin!!".getBytes();
  private static b edO;
  private boolean edP = false;
  private ah edQ;
  int edR = 5000;
  int edS = 5000;
  int edT = 30000;
  private int edU = 3600;
  private c edV;
  private List<d> edW = new ArrayList();
  private List<d> edX = new ArrayList();
  private com.tencent.mm.sdk.b.c edY = new b.3(this);
  private al edZ;
  private LocationUpdateListener eea;
  private int eeb;
  private ServerMessageListener eec;
  private long startTime = 0L;
  
  public b()
  {
    com.tencent.mm.kernel.g.Ek();
    this.edZ = new al(com.tencent.mm.kernel.g.Em().lnJ.getLooper(), new b.4(this), false);
    this.eea = new b.5(this);
    this.eeb = 0;
    this.eec = new b.6(this);
  }
  
  public static b Qv()
  {
    if (edO == null) {
      edO = new b();
    }
    return edO;
  }
  
  private static String Qw()
  {
    String str1 = q.zy();
    com.tencent.mm.kernel.g.Eg();
    String str2 = new com.tencent.mm.a.o(a.Df()).toString();
    str1 = str1 + "_" + str2;
    try
    {
      str2 = new String(Base64.encode(new ag().encrypt(str1.getBytes("UTF-8"), edN), 0), "UTF-8");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SenseWhereHelper", "create encrypt imei[%s], original imei[%s]", new Object[] { str2, bi.Xf(str1) });
      return str2;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.SenseWhereHelper", localException, "", new Object[0]);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SenseWhereHelper", "create imei error: " + localException.toString());
    }
    return "";
  }
  
  private boolean Qy()
  {
    com.tencent.mm.kernel.g.Eg();
    if (new com.tencent.mm.a.o(a.Df()).longValue() < 1000000L)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SenseWhereHelper", "it boss uin do not start sense where.");
      return false;
    }
    Object localObject = com.tencent.mm.k.g.AT().getValue("AndroidSenseWhereArgs");
    if (bi.oW((String)localObject))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SenseWhereHelper", "it has no config do not start sense where.");
      return false;
    }
    try
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SenseWhereHelper", "sense where config : " + (String)localObject);
      localObject = ((String)localObject).split(";");
      int i = bi.getInt(localObject[0], 0);
      com.tencent.mm.kernel.g.Eg();
      int j = h.aM(a.Df() + 5, 100);
      if (j > i)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SenseWhereHelper", "do not start sense where.uinhash %d, percent %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        return false;
      }
      this.edS = bi.getInt(localObject[1], 5000);
      this.edR = bi.getInt(localObject[2], 5000);
      this.edT = bi.getInt(localObject[3], 30000);
      this.edU = bi.getInt(localObject[4], 3600);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SenseWhereHelper", "check sense where report args[%d, %d, %d, %d]", new Object[] { Integer.valueOf(this.edS), Integer.valueOf(this.edR), Integer.valueOf(this.edT), Integer.valueOf(this.edU) });
      long l = bi.bG(((Long)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sUd, Long.valueOf(0L))).longValue());
      if (l > this.edU) {
        return true;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SenseWhereHelper", "it is not time out. diff[%d], collection interval[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(this.edU) });
      return false;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.SenseWhereHelper", localException, "", new Object[0]);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SenseWhereHelper", "check sense where config error: " + localException.toString());
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SenseWhereHelper", "it default do not start sense where.");
    }
    return false;
  }
  
  public static void Qz()
  {
    if (bi.bG(bi.a((Long)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sUc, null), 0L)) * 1000L > 21600000L)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SenseWhereHelper", "update sense where location package list.");
      k localk = new k(36);
      com.tencent.mm.kernel.g.Eh().dpP.a(localk, 0);
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sUc, Long.valueOf(bi.VE()));
    }
  }
  
  public final void Qx()
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Em().H(new b.2(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/av/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */