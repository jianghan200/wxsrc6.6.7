package com.tencent.mm.platformtools;

import android.os.Bundle;
import com.tencent.mm.modelsimple.q.a;
import com.tencent.mm.protocal.c.asr;
import com.tencent.mm.protocal.c.ass;
import com.tencent.mm.protocal.c.bnp;
import com.tencent.mm.protocal.c.brj;
import com.tencent.mm.protocal.c.bup;
import com.tencent.mm.protocal.c.ec;
import com.tencent.mm.protocal.i.d;
import com.tencent.mm.protocal.i.e;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
{
  public static q.a a(com.tencent.mm.modelsimple.q paramq)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("kscene_type", 73);
    return a(paramq, localBundle);
  }
  
  private static q.a a(com.tencent.mm.modelsimple.q paramq, Bundle paramBundle)
  {
    if (paramq == null) {
      return null;
    }
    if (((i.e)paramq.dJM.Id()).qWn.srN == null) {
      return null;
    }
    Object localObject = ((i.e)paramq.dJM.Id()).qWn.srN.reD;
    if ((localObject != null) && (((bnp)localObject).slI != null) && (((bnp)localObject).slI.size() > 0))
    {
      q.a locala = new q.a();
      localObject = ((bnp)localObject).slI.iterator();
      while (((Iterator)localObject).hasNext())
      {
        brj localbrj = (brj)((Iterator)localObject).next();
        if (localbrj.mEb == 19) {
          locala.bLe = localbrj.spx;
        } else if (localbrj.mEb == 20) {
          locala.efV = localbrj.spx;
        } else if (localbrj.mEb == 21) {
          locala.bSc = localbrj.spx;
        }
      }
      locala.efW = paramBundle;
      locala.type = 0;
      if (!bi.oW(locala.bLe))
      {
        locala.username = ((i.d)paramq.dJM.KV()).qWk.rUY.hbL;
        return locala;
      }
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/platformtools/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */