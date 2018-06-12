package com.tencent.mm.plugin.sns.j;

import android.database.Cursor;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.b;
import com.tencent.mm.plugin.sns.storage.i;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.ui.aw;
import com.tencent.mm.protocal.c.boh;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class a
  extends com.tencent.mm.vending.app.a
  implements com.tencent.mm.ab.e
{
  String gtX;
  boolean nNG;
  String ocI;
  boolean ocJ;
  int ocK;
  public volatile aw oeg;
  protected volatile am.a oha;
  private h.a oni;
  
  static c.b bFa()
  {
    c.b localb = new c.b();
    Object localObject4 = af.byt().bAP();
    int j = ((Cursor)localObject4).getCount();
    Object localObject3 = "";
    Object localObject1 = localObject3;
    if (j > 0)
    {
      ((Cursor)localObject4).moveToFirst();
      localObject1 = new j();
      ((j)localObject1).d((Cursor)localObject4);
    }
    Object localObject2;
    try
    {
      localObject1 = ((boh)new boh().aG(((j)localObject1).field_curActionBuf)).seC;
      ((Cursor)localObject4).close();
      localObject3 = ((String)g.Ei().DT().get(aa.a.taf, "")).split("&");
      localObject4 = new ArrayList();
      int i = 2;
      while (i < localObject3.length)
      {
        long l = bi.getLong(localObject3[i], 0L);
        if (l != 0L) {
          ((List)localObject4).add(Long.valueOf(l));
        }
        i += 1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.SnsTimelineInteractor", localException, "", new Object[0]);
        localObject2 = localObject3;
      }
      Collections.reverse((List)localObject4);
      if (((List)localObject4).size() <= 0) {}
    }
    for (localObject3 = (Long)((List)localObject4).get(0);; localObject3 = null)
    {
      i.h((Long)localObject3);
      localb.onp = j;
      localb.ono = ((String)localObject2);
      localb.onq = ((List)localObject4);
      return localb;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor onSceneEnd  errType %d %d %s %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml.toString() });
  }
  
  public final void a(h.a parama)
  {
    this.oha = af.bye();
    c.a locala = (c.a)P(c.a.class);
    this.oni = parama;
    this.oha.a(1, locala.gtX, this.oni);
  }
  
  public final am.a bye()
  {
    return this.oha;
  }
  
  public final void g(String paramString, boolean paramBoolean, int paramInt)
  {
    this.oha.a(1, paramString, paramBoolean, paramInt);
  }
  
  public final void h(String paramString, boolean paramBoolean, int paramInt)
  {
    this.oha.b(1, paramString, paramBoolean, paramInt);
  }
  
  protected final void onCreate()
  {
    super.onCreate();
    a(c.b.class, new a.1(this));
    a(c.a.class, new a.2(this));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor onCreate %s", new Object[] { this });
    af.byj().nmF.clear();
    af.byj();
    b.bxr();
  }
  
  protected final void onDestroy()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor onDestroy %s", new Object[] { this });
    g.Ek();
    if ((g.Eg().Dx()) && (this.oha != null) && (this.oni != null)) {
      this.oha.a(this.oni, 1);
    }
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */