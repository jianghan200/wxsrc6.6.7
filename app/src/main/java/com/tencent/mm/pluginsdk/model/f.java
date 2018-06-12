package com.tencent.mm.pluginsdk.model;

import android.content.Intent;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fav.a.ad;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wa;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public final class f
  implements ad
{
  public final boolean a(ch paramch, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11)
  {
    wl localwl = new wl();
    wr localwr = new wr();
    vx localvx = new vx();
    localvx.CF(5);
    localvx.UQ(paramString7);
    localvx.UH(paramString3);
    localvx.CE(paramInt);
    localvx.UB(paramString1);
    localvx.UC(paramString2);
    localvx.UZ(paramString11);
    paramString2 = new wa();
    paramString2.dyL = paramString1;
    paramString2.rBq = paramInt;
    paramString2.dyJ = paramString3;
    paramString2.dyN = paramString5;
    paramString2.dyM = paramString4;
    paramString2.dyO = paramString6;
    paramString2.dyP = paramString9;
    paramString2.dyQ = paramString10;
    localvx.a(paramString2);
    localwr.Vw(paramString8);
    localwr.Vx(q.GF());
    localwr.CO(0);
    localwr.fU(bi.VF());
    localwl.a(localwr);
    localwl.rBI.add(localvx);
    paramch.bJF.title = localvx.title;
    paramch.bJF.desc = localvx.title;
    paramch.bJF.bJH = localwl;
    paramch.bJF.type = 4;
    return true;
  }
  
  public final boolean a(ch paramch, Intent paramIntent)
  {
    return e.a(paramch, paramIntent);
  }
  
  public final boolean a(ch paramch, String paramString)
  {
    return e.a(paramch, 2, paramString);
  }
  
  public final boolean a(ch paramch, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    String str = String.format("%s#%s", new Object[] { paramString1, "" });
    wl localwl = new wl();
    wr localwr = new wr();
    localwr.Vw(paramString2);
    localwr.CO(2);
    localwr.fU(System.currentTimeMillis());
    localwr.VB(paramString1);
    localwr.Vy(str);
    paramString1 = new vx();
    paramString1.UT(str);
    paramString1.kY(true);
    paramString1.CF(5);
    paramString1.UB(paramString3);
    paramString1.UC(paramString4);
    paramString1.Va(paramString5);
    paramString1.kX(true);
    localwl.rBI.add(paramString1);
    paramString1 = new xa();
    paramString1.VM(paramString6);
    paramString1.VL(paramString7);
    localwl.b(paramString1);
    localwl.a(localwr);
    paramch.bJF.bJH = localwl;
    paramch.bJF.desc = paramString3;
    paramch.bJF.type = 5;
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */