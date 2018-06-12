package com.tencent.mm.an;

import com.tencent.mm.an.a.b;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.dc;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.y.g.a;
import java.util.LinkedList;

public final class e
  implements b
{
  public final avq a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11)
  {
    avq localavq = new avq();
    localavq.rYj = paramInt;
    localavq.rYo = paramString1;
    localavq.rYl = paramString2;
    localavq.rYm = paramString3;
    localavq.rYr = paramString4;
    localavq.rYq = paramString5;
    localavq.rYp = paramString6;
    localavq.rYu = paramString8;
    localavq.jQb = paramString11;
    localavq.rYt = paramString9;
    localavq.rsp = paramString7;
    localavq.rYk = 0.0F;
    localavq.rYn = paramString10;
    localavq.rgC = 1;
    localavq.rYs = null;
    localavq.rvP = paramString7;
    return localavq;
  }
  
  public final avq a(g.a parama, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (parama == null) {
      return null;
    }
    avq localavq = new avq();
    localavq.rYj = 0;
    localavq.rsp = paramString1;
    localavq.rYk = 0.0F;
    localavq.rYn = "";
    localavq.rYo = paramString2;
    localavq.rYt = paramString4;
    localavq.rgC = 1;
    localavq.rYs = null;
    localavq.rYl = parama.title;
    localavq.rYm = parama.description;
    localavq.rYr = parama.url;
    localavq.rYq = parama.dwn;
    localavq.rYp = parama.dwN;
    localavq.jQb = parama.appId;
    localavq.rYu = paramString3;
    return localavq;
  }
  
  public final avq a(String paramString, bsu parambsu, int paramInt)
  {
    String str = null;
    if ((parambsu == null) || (parambsu.sqc == null) || (parambsu.sqc.ruA == null) || (parambsu.sqc.ruA.size() <= 0)) {}
    ate localate;
    do
    {
      return null;
      localate = (ate)parambsu.sqc.ruA.get(0);
    } while (localate == null);
    avq localavq = new avq();
    localavq.rYj = paramInt;
    localavq.rsp = parambsu.ksA;
    localavq.rYk = 0.0F;
    localavq.rYn = "";
    localavq.rYo = localate.rVE;
    localavq.rYt = null;
    localavq.rgC = 1;
    localavq.rYs = null;
    localavq.rYl = localate.bHD;
    localavq.rYm = localate.jOS;
    if (parambsu.sqc != null) {
      str = parambsu.sqc.jPK;
    }
    localavq.rYr = str;
    localavq.rYq = localate.rVI;
    localavq.rYp = localate.jPK;
    localavq.rYv = localate.rVF;
    localavq.rvP = localate.ksA;
    localavq.rYu = paramString;
    localavq.jQb = parambsu.sqb.ksA;
    localavq.rYA = parambsu.hbL;
    return localavq;
  }
  
  public final avq a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12)
  {
    avq localavq = new avq();
    localavq.rYj = 7;
    localavq.rYo = paramString1;
    localavq.rYw = paramString2;
    localavq.rYl = paramString3;
    localavq.rYm = paramString4;
    localavq.rYr = paramString5;
    localavq.rYq = paramString6;
    localavq.rYp = paramString7;
    localavq.rYu = paramString9;
    localavq.jQb = paramString12;
    localavq.rYt = paramString10;
    localavq.rsp = paramString8;
    localavq.rYk = 0.0F;
    localavq.rYn = paramString11;
    localavq.rgC = 1;
    localavq.rYs = null;
    localavq.rvP = paramString8;
    return localavq;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/an/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */