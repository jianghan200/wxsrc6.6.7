package com.tencent.mm.ui.transmit;

import android.os.Looper;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.a.h;
import com.tencent.mm.ui.contact.m;
import java.util.HashSet;
import java.util.List;

public final class b
  extends m
{
  String bWm;
  private ag handler = new ag(Looper.getMainLooper());
  j jsk;
  private com.tencent.mm.plugin.fts.a.a.a jsw;
  private MMCreateChatroomUI uDd;
  private com.tencent.mm.plugin.fts.a.l uDe = new b.1(this);
  
  public b(MMCreateChatroomUI paramMMCreateChatroomUI, int paramInt)
  {
    super(paramMMCreateChatroomUI, false, paramInt);
    this.uDd = paramMMCreateChatroomUI;
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    this.bWm = paramString;
    paramArrayOfInt = new i();
    paramArrayOfInt.handler = this.handler;
    paramArrayOfInt.jsv = this.uDe;
    paramArrayOfInt.bWm = paramString;
    paramArrayOfInt.jsu = com.tencent.mm.plugin.fts.a.c.b.jsU;
    paramArrayOfInt.jsq = new int[] { 131072 };
    paramArrayOfInt.jst.add("filehelper");
    paramArrayOfInt.jst.add(q.GF());
    paramArrayOfInt.jst.addAll(this.uDd.uDh.cAa());
    this.jsw = ((com.tencent.mm.plugin.fts.a.n)g.n(com.tencent.mm.plugin.fts.a.n.class)).search(2, paramArrayOfInt);
  }
  
  public final void acV()
  {
    if (this.jsw != null) {
      ((com.tencent.mm.plugin.fts.a.n)g.n(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(this.jsw);
    }
    this.bWm = null;
  }
  
  public final int getCount()
  {
    if ((this.jsk != null) && (this.jsk.jsx != null)) {
      return this.jsk.jsx.size();
    }
    return 0;
  }
  
  protected final com.tencent.mm.ui.contact.a.a iW(int paramInt)
  {
    com.tencent.mm.plugin.fts.a.a.l locall = (com.tencent.mm.plugin.fts.a.a.l)this.jsk.jsx.get(paramInt);
    Object localObject;
    if (locall.jrv.equals("no_result​")) {
      localObject = new h(paramInt);
    }
    for (;;)
    {
      ((com.tencent.mm.ui.contact.a.a)localObject).bWm = this.bWm;
      ((com.tencent.mm.ui.contact.a.a)localObject).scene = this.scene;
      ((com.tencent.mm.ui.contact.a.a)localObject).ujX = false;
      return (com.tencent.mm.ui.contact.a.a)localObject;
      localObject = new d(paramInt);
      ((d)localObject).fyJ = locall;
      ((com.tencent.mm.ui.contact.a.a)localObject).jrx = this.jsk.jrx;
      ((com.tencent.mm.ui.contact.a.a)localObject).ujX = bwq();
      ((d)localObject).djH = true;
      ((d)localObject).jtl = (paramInt + 1);
      ((d)localObject).cF(((d)localObject).fyJ.type, ((d)localObject).fyJ.jru);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/transmit/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */