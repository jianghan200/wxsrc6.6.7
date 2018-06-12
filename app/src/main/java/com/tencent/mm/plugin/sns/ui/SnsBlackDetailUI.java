package com.tencent.mm.plugin.sns.ui;

import android.os.Bundle;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsBlackDetailUI
  extends SnsTagDetailUI
  implements e, m.b
{
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.SnsBlackDetailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null) {
      this.tipDialog.dismiss();
    }
  }
  
  protected final void aZV()
  {
    if (((this.obG + " " + bi.c(this.jzp, ",")).equals(this.bKg)) && (this.noJ != 0L))
    {
      finish();
      return;
    }
    if (af.byu().q(this.noJ, this.obG))
    {
      h.b(this, getString(i.j.sns_tag_exist, new Object[] { this.obG }), getString(i.j.app_tip), true);
      return;
    }
    Object localObject2 = bCY();
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = new LinkedList();
    Iterator localIterator = ((List)localObject2).iterator();
    String str;
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (!this.jzp.contains(str)) {
        localLinkedList.add(str);
      }
    }
    localIterator = this.jzp.iterator();
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (!((List)localObject2).contains(str)) {
        ((List)localObject1).add(str);
      }
    }
    localObject2 = localLinkedList.iterator();
    while (((Iterator)localObject2).hasNext()) {
      s.s((String)((Iterator)localObject2).next(), false);
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      s.s((String)((Iterator)localObject1).next(), true);
    }
    com.tencent.mm.plugin.sns.c.a.ezo.vl();
    finish();
  }
  
  public final void bCV()
  {
    x.d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI __onCreate");
    g.Ek();
    ((i)g.l(i.class)).FR().a(this);
  }
  
  protected final void bCW()
  {
    x.d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI __onDestroy");
    g.Ek();
    if (g.Eg().Dx())
    {
      g.Ek();
      ((i)g.l(i.class)).FR().b(this);
    }
  }
  
  protected final void bCX() {}
  
  protected final List<String> bCY()
  {
    Object localObject = new LinkedList();
    if (this.noJ == 4L)
    {
      new LinkedList();
      localObject = s.Hv();
    }
    return (List<String>)localObject;
  }
  
  protected final void cr(List<String> paramList)
  {
    ay localay = af.byc();
    String str1 = q.GF();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str2 = (String)paramList.next();
      if ((!this.jzp.contains(str2)) && (com.tencent.mm.l.a.gd(localay.Yg(str2).field_type)) && (!str1.equals(str2))) {
        this.jzp.add(str2);
      }
    }
    if (this.hLp != null) {
      this.hLp.bt(this.jzp);
    }
    updateTitle();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI onCreate");
  }
  
  public void onDestroy()
  {
    if (this.tipDialog != null) {
      this.tipDialog.dismiss();
    }
    g.Ek();
    g.Eh().dpP.b(290, this);
    g.Ek();
    g.Eh().dpP.b(291, this);
    g.Ek();
    g.Eh().dpP.b(292, this);
    g.Ek();
    g.Eh().dpP.b(293, this);
    g.Ek();
    if (g.Eg().Dx())
    {
      g.Ek();
      ((i)g.l(i.class)).FR().b(this);
    }
    super.onDestroy();
  }
  
  protected final void yp(String paramString)
  {
    super.yp(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsBlackDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */