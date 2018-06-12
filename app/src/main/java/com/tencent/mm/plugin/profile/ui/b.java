package com.tencent.mm.plugin.profile.ui;

import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.m.a;
import java.util.List;

public final class b
  extends m
{
  private String bWm;
  private ab guS;
  private ag handler = new ag();
  private com.tencent.mm.plugin.fts.a.a.a jsw;
  private List<com.tencent.mm.plugin.fts.a.a.l> jte;
  private com.tencent.mm.plugin.fts.a.l lUA = new com.tencent.mm.plugin.fts.a.l()
  {
    public final void b(j paramAnonymousj)
    {
      if (paramAnonymousj.bjW == 0)
      {
        b.a(b.this, paramAnonymousj.jsx);
        if (b.a(b.this) != null) {
          b.c(b.this).q(paramAnonymousj.joH.bWm, b.b(b.this).size(), true);
        }
      }
      b.this.notifyDataSetChanged();
    }
  };
  
  public b(com.tencent.mm.ui.contact.l paraml, int paramInt, ab paramab)
  {
    super(paraml, false, paramInt);
    this.guS = paramab;
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    this.bWm = paramString;
    paramArrayOfInt = new i();
    paramArrayOfInt.bWm = paramString;
    paramArrayOfInt.handler = this.handler;
    paramArrayOfInt.jsv = this.lUA;
    paramArrayOfInt.jso = this.guS.field_username;
    paramArrayOfInt.jsn = 7;
    this.jsw = ((n)g.n(n.class)).search(2, paramArrayOfInt);
  }
  
  public final void acV()
  {
    this.bWm = null;
    if (this.jsw != null) {
      ((n)g.n(n.class)).cancelSearchTask(this.jsw);
    }
  }
  
  public final int getCount()
  {
    if (this.jte == null) {
      return 0;
    }
    return this.jte.size();
  }
  
  protected final com.tencent.mm.ui.contact.a.a iW(int paramInt)
  {
    e locale = new e(paramInt);
    au.HU();
    locale.guS = c.FR().Yg(((com.tencent.mm.plugin.fts.a.a.l)this.jte.get(paramInt)).jrv);
    return locale;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */