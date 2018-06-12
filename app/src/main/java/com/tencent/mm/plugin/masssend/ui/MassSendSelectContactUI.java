package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.c;
import com.tencent.mm.ui.contact.c.a;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MassSendSelectContactUI
  extends MMBaseSelectContactUI
{
  private HashSet<String> eCr;
  private List<String> gRN;
  private Button lbu;
  private boolean lbv;
  private MultiSelectContactView lbw;
  
  private void sv(int paramInt)
  {
    if (paramInt > 0)
    {
      updateOptionMenuText(1, getString(R.l.mass_send_next) + "(" + this.eCr.size() + ")");
      enableOptionMenu(1, true);
      return;
    }
    updateOptionMenuText(1, getString(R.l.mass_send_next));
    enableOptionMenu(1, false);
  }
  
  protected final void Gr(String paramString)
  {
    h.mEJ.h(11225, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
    Intent localIntent = new Intent();
    localIntent.putExtra("label", paramString);
    localIntent.putExtra("always_select_contact", bi.c(new ArrayList(this.eCr), ","));
    localIntent.putExtra("list_attr", s.s(new int[] { 16384, 64 }));
    d.b(this, ".ui.contact.SelectLabelContactUI", localIntent, 0);
  }
  
  protected final void Wj()
  {
    super.Wj();
    this.gRN = new ArrayList();
    this.gRN.addAll(s.cyz());
    this.gRN.addAll(s.cyA());
    this.gRN.add(com.tencent.mm.model.q.GF());
    this.eCr = new HashSet();
  }
  
  protected final boolean Wk()
  {
    return false;
  }
  
  protected final boolean Wl()
  {
    return true;
  }
  
  protected final String Wm()
  {
    return getString(R.l.mass_send_select_contact_title);
  }
  
  protected final com.tencent.mm.ui.contact.o Wn()
  {
    c.a locala = new c.a();
    locala.uhW = true;
    return new c(this, this.gRN, true, locala);
  }
  
  protected final m Wo()
  {
    return new com.tencent.mm.ui.contact.q(this, this.gRN, true, this.scene);
  }
  
  public final boolean a(a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.eCr.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final int[] bbG()
  {
    return new int[] { 131072 };
  }
  
  protected final boolean bcN()
  {
    return true;
  }
  
  protected final int getLayoutId()
  {
    return R.i.mass_send_select_contact;
  }
  
  public final void iV(int paramInt)
  {
    n localn = cyp();
    Object localObject = localn.FM(paramInt - getContentLV().getHeaderViewsCount());
    if (localObject == null) {}
    while (((a)localObject).guS == null) {
      return;
    }
    x.i("MicroMsg.MassSendSelectContactUI", "ClickUser=%s", new Object[] { ((a)localObject).guS.field_username });
    localObject = ((a)localObject).guS.field_username;
    cyv();
    if (this.eCr.contains(localObject))
    {
      this.eCr.remove(localObject);
      this.lbw.Ty((String)localObject);
    }
    for (;;)
    {
      sv(this.eCr.size());
      localn.notifyDataSetChanged();
      cyv();
      cyw();
      return;
      this.eCr.add(localObject);
      this.lbw.Ty((String)localObject);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.MassSendSelectContactUI", "requestCode=%d | resultCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1) {}
    do
    {
      return;
      switch (paramInt1)
      {
      default: 
        return;
      }
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (bi.oW(paramIntent))
      {
        x.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
        return;
      }
      x.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS select username=%s", new Object[] { paramIntent });
      paramIntent = paramIntent.split(",");
      paramInt2 = paramIntent.length;
      paramInt1 = i;
      while (paramInt1 < paramInt2)
      {
        Object localObject = paramIntent[paramInt1];
        if (this.eCr.add(localObject)) {
          this.lbw.Ty((String)localObject);
        }
        paramInt1 += 1;
      }
      sv(this.eCr.size());
      cyp().notifyDataSetChanged();
    } while (this.eMS == null);
    this.eMS.clearFocus();
    this.eMS.czQ();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.MassSendSelectContactUI", "create!");
    this.lbw = this.lbw;
    if (this.lbw == null)
    {
      finish();
      return;
    }
    this.lbw.setBackgroundDrawable(null);
    a(1, getString(R.l.mass_send_next), new MassSendSelectContactUI.1(this), s.b.tmX);
    this.lbu = ((Button)findViewById(R.h.select_all));
    this.lbu.setOnClickListener(new MassSendSelectContactUI.2(this));
    this.lbw.setOnContactDeselectListener(new MassSendSelectContactUI.3(this));
    sv(this.eCr.size());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */