package com.tencent.mm.ui.chatting.b;

import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.AbsListView;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.b;
import com.tencent.mm.ak.d;
import com.tencent.mm.ak.d.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.a.ln;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.b.b.g;
import com.tencent.mm.ui.chatting.b.b.n;
import com.tencent.mm.ui.chatting.gallery.f.a;
import java.util.LinkedList;

@com.tencent.mm.ui.chatting.b.a.a(cwo=n.class)
public class r
  extends a
  implements d.a, y.a, n
{
  private com.tencent.mm.sdk.b.c tQa = new r.1(this);
  private al tQb = new al(new r.2(this), false);
  private com.tencent.mm.ui.chatting.gallery.f tQc = f.a.tVr;
  
  private void SO()
  {
    if (au.HX()) {
      o.Pg().a(this);
    }
    this.tQb.SO();
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject) {}
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, l paraml) {}
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, l paraml)
  {
    com.tencent.mm.modelcontrol.c.NM();
    if (!com.tencent.mm.modelcontrol.c.NN()) {
      o.Pg().a(this);
    }
    if ((paramInt3 == 0) && (paramInt4 == 0)) {}
    for (boolean bool = true;; bool = false)
    {
      o.Ph();
      b.a(paramLong1, paramLong2, bool);
      au.HU();
      paramObject = com.tencent.mm.model.c.FT().dW(paramLong2);
      ((g)this.bAG.O(g.class)).a(paramLong2, (bd)paramObject, bool);
      return;
    }
  }
  
  public final void anA()
  {
    this.tQb.SO();
    this.tQb.J(1000L, 1000L);
  }
  
  public final void cpG() {}
  
  public final void cpH()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.tQa);
  }
  
  public final void cpI()
  {
    ln localln = new ln();
    localln.bVQ.bVR = true;
    com.tencent.mm.sdk.b.a.sFg.a(localln, Looper.getMainLooper());
    y.b(this);
  }
  
  public final void cpJ()
  {
    ln localln = new ln();
    localln.bVQ.bVR = false;
    com.tencent.mm.sdk.b.a.sFg.a(localln, Looper.getMainLooper());
    y.c(this);
    SO();
  }
  
  public final void cpK()
  {
    SO();
    com.tencent.mm.sdk.b.a.sFg.c(this.tQa);
    com.tencent.mm.ui.chatting.gallery.f localf = this.tQc;
    localf.qD.clear();
    localf.aRU();
  }
  
  public final void cun()
  {
    super.cun();
    SO();
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    if ((bi.oW(paramString)) || (paramBitmap == null) || (this.bAG == null)) {
      return;
    }
    com.tencent.mm.ui.chatting.c.a.cwt().post(new r.3(this));
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    super.onScrollStateChanged(paramAbsListView, paramInt);
    o.Pj().br(paramInt);
    if (paramInt == 0) {
      anA();
    }
    while (paramInt != 2) {
      return;
    }
    SO();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/chatting/b/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */