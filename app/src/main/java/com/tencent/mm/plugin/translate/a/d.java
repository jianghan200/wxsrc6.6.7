package com.tencent.mm.plugin.translate.a;

import android.util.SparseArray;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class d
  implements e
{
  public int index;
  public boolean oEA = false;
  public b oEB;
  a oEC;
  public al oED = new al(new d.1(this), false);
  public SparseArray<c.c> oEz = null;
  long start;
  
  public d(int paramInt, a parama)
  {
    this.index = paramInt;
    this.oEC = parama;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (this.oEB != paraml)
    {
      x.e("MicroMsg.WorkingTranslate", "not my translate work");
      return;
    }
    this.oED.SO();
    x.d("MicroMsg.WorkingTranslate", "translate take time : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - this.start) });
    if (((b)paraml).oEq != null) {}
    for (int i = ((b)paraml).oEq.size();; i = 0)
    {
      x.d("MicroMsg.WorkingTranslate", "errType : %s, errCode : %s, errMsg : %s, translatedMsg.size() : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
      bIS();
      this.oEC.a(paramInt2, this.oEz, ((b)paraml).oEq);
      return;
    }
  }
  
  public final void bIS()
  {
    this.oEB = null;
    this.oEA = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/translate/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */