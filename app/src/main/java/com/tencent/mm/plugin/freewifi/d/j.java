package com.tencent.mm.plugin.freewifi.d;

import android.os.Build;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.protocal.c.ast;
import com.tencent.mm.protocal.c.asu;
import com.tencent.mm.protocal.c.asv;
import java.util.LinkedList;

public final class j
  extends c
{
  public j(LinkedList<asv> paramLinkedList, int paramInt)
  {
    aOR();
    ast localast = (ast)this.diG.dID.dIL;
    localast.rVc = Build.BRAND;
    localast.rVb = paramInt;
    localast.rVa = paramLinkedList;
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new ast();
    locala.dIH = new asu();
    locala.uri = "/cgi-bin/mmo2o-bin/manufacturerapinfo";
    locala.dIF = 1707;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final asu aPe()
  {
    return (asu)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 1707;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */