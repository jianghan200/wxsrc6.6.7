package com.tencent.mm.plugin.freewifi.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.protocal.c.bij;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.is;
import com.tencent.mm.protocal.c.it;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class k
  extends c
{
  public k(String paramString1, bij parambij, int paramInt, String paramString2)
  {
    aOR();
    if ((8 != paramInt) || (9 != paramInt)) {
      x.e("MicroMsg.FreeWifi.NetSceneScanAndReportNearFieldFreeWifi", "invalid channel, channel is :%d", new Object[] { Integer.valueOf(paramInt) });
    }
    is localis = (is)this.diG.dID.dIL;
    localis.riA = paramString1;
    localis.rjX = parambij;
    localis.qZe = paramInt;
    localis.qZf = paramString2;
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new is();
    locala.dIH = new it();
    locala.uri = "/cgi-bin/mmo2o-bin/bizwificonnect";
    locala.dIF = 1705;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final String aPf()
  {
    LinkedList localLinkedList = ((it)this.diG.dIE.dIL).rjY;
    if ((localLinkedList != null) && (localLinkedList.size() == 1)) {
      return ((cs)localLinkedList.get(0)).rcP;
    }
    return null;
  }
  
  public final int getType()
  {
    return 1705;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */