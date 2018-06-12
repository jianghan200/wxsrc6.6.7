package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.l.a;
import com.tencent.mm.model.aa;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afo;
import com.tencent.mm.protocal.c.afp;
import com.tencent.mm.protocal.c.awy;
import com.tencent.mm.protocal.c.fk;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  public static String efA;
  public static String efB;
  public static String efC;
  public static String efD;
  public static String efE;
  private static int efF;
  private static int efG = 0;
  private static int efH = 22;
  private static int efI = 0;
  private static boolean efJ = false;
  public static String efv;
  public static String efw;
  public static String efx;
  public static String efy;
  public static String efz;
  private com.tencent.mm.ab.e diJ;
  
  public l(int paramInt)
  {
    efF = paramInt;
  }
  
  public static int QW()
  {
    return efG;
  }
  
  public static boolean QX()
  {
    return (efI & 0x2) != 0;
  }
  
  public static boolean QY()
  {
    return (efH & 0x4) != 0;
  }
  
  public static int QZ()
  {
    return efF;
  }
  
  public static boolean Ra()
  {
    return (efI & 0x200) != 0;
  }
  
  public static boolean Rb()
  {
    return (efI & 0x400) != 0;
  }
  
  public static void bO(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      efH |= 0x4;
      return;
    }
    efH &= 0xFFFFFFFB;
  }
  
  public static boolean il(int paramInt)
  {
    return efF != paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    b.a locala = new b.a();
    afo localafo = new afo();
    localafo.iwP = w.chP();
    x.d("MicroMsg.NetSceneGetOnlineInfo", "language %s", new Object[] { localafo.iwP });
    locala.dIG = localafo;
    locala.dIH = new afp();
    locala.uri = "/cgi-bin/micromsg-bin/getonlineinfo";
    locala.dIF = 526;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diJ = parame1;
    return a(parame, locala.KT(), this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetOnlineInfo", "ongynetend %d, %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (afp)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      efG = paramArrayOfByte.rJA;
      x.d("MicroMsg.NetSceneGetOnlineInfo", "iconType:%d onlineInfoFlag:%d", new Object[] { Integer.valueOf(efG), Integer.valueOf(paramArrayOfByte.rbZ) });
      Object localObject = bl.z(paramArrayOfByte.rJz, "summary");
      paramInt1 = efH;
      if (localObject != null)
      {
        efv = (String)((Map)localObject).get(".summary.banner");
        x.d("MicroMsg.NetSceneGetOnlineInfo", "onlineinfo, count:%d, summary:%s", new Object[] { Integer.valueOf(paramArrayOfByte.rJx), paramArrayOfByte.rJz });
        localObject = (afo)((com.tencent.mm.ab.b)paramq).dID.dIL;
        Iterator localIterator = paramArrayOfByte.rJy.iterator();
        while (localIterator.hasNext())
        {
          paramq = (awy)localIterator.next();
          if (paramq.rgs.cfV().hashCode() != ((afo)localObject).shX.rgs.cfV().hashCode())
          {
            localObject = bl.z(paramq.saa, "wording");
            x.d("MicroMsg.NetSceneGetOnlineInfo", paramq.saa);
            if (localObject != null)
            {
              efw = (String)((Map)localObject).get(".wording.title");
              efx = (String)((Map)localObject).get(".wording.notify");
              efy = (String)((Map)localObject).get(".wording.mute_title");
              efz = (String)((Map)localObject).get(".wording.mute_tips");
              efA = (String)((Map)localObject).get(".wording.exit");
              efB = (String)((Map)localObject).get(".wording.exit_confirm");
              efC = (String)((Map)localObject).get(".wording.lock_title");
              efD = (String)((Map)localObject).get(".wording.mute_lock_title");
              efE = (String)((Map)localObject).get(".wording.exit");
            }
            paramInt1 = paramq.sac;
          }
        }
      }
    }
    for (;;)
    {
      int i = paramArrayOfByte.rbZ;
      efI = i;
      if ((i & 0x2) == 0)
      {
        efJ = true;
        if (paramInt1 != efH)
        {
          efH = paramInt1;
          au.HU();
          c.Dt();
        }
        if ((paramArrayOfByte.rbZ & 0x40) != 0)
        {
          au.HU();
          paramArrayOfByte = c.FR().Yg("filehelper");
          if (paramArrayOfByte != null)
          {
            paramq = paramArrayOfByte;
            if (!bi.oW(paramArrayOfByte.field_username)) {}
          }
          else
          {
            aa.w(paramArrayOfByte);
            au.HU();
            paramq = c.FR().Yg("filehelper");
          }
          if ((paramq != null) && (!a.gd(paramq.field_type)))
          {
            paramq.Bb();
            au.HU();
            c.FR().a(paramq.field_username, paramq);
          }
          au.HU();
          paramq = c.FW().Yq("filehelper");
          if (paramq != null) {
            break label631;
          }
          paramq = new com.tencent.mm.storage.ai("filehelper");
          paramq.as(bi.VF());
          au.HU();
          c.FW().d(paramq);
        }
      }
      for (;;)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        efJ = false;
        break;
        label631:
        paramq.as(bi.VF());
        au.HU();
        c.FW().a(paramq, "filehelper");
      }
    }
  }
  
  public final int getType()
  {
    return 526;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelsimple/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */