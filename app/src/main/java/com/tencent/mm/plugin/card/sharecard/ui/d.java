package com.tencent.mm.plugin.card.sharecard.ui;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.report.service.h;
import java.util.ArrayList;

public final class d
  implements a
{
  private c hzK;
  
  public d(c paramc)
  {
    this.hzK = paramc;
  }
  
  public final void Ij()
  {
    if (this.hzK != null) {
      this.hzK.a(null, null);
    }
  }
  
  public final void onCreate()
  {
    if (this.hzK != null) {
      am.axi().c(this.hzK);
    }
  }
  
  public final void onDestroy()
  {
    if (this.hzK != null)
    {
      am.axi().d(this.hzK);
      Object localObject = this.hzK;
      ((c)localObject).hzI.release();
      ((c)localObject).hzI = null;
      ((c)localObject).aYc();
      int i = (int)(((c)localObject).endTime - ((c)localObject).beginTime);
      localObject = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(24);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(25);
      localIDKey2.SetValue(i);
      ((ArrayList)localObject).add(localIDKey1);
      ((ArrayList)localObject).add(localIDKey2);
      h.mEJ.b((ArrayList)localObject, true);
      this.hzK = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */