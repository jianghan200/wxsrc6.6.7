package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.s.b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AASelectContactUI
  extends MMBaseSelectContactUI
{
  private String chatroomName;
  private HashSet<String> eCq;
  private HashSet<String> eCr;
  private long eCs;
  private int eCt;
  private CheckBox eCu;
  private View eCv;
  private String title;
  
  private void Wp()
  {
    if (this.eCr.size() > 0) {
      updateOptionMenuText(1, getString(a.i.aa_confirm_num, new Object[] { Integer.valueOf(this.eCr.size()) }));
    }
    while ((this.eCr.size() == 1) && (this.eCr.contains(q.GF())))
    {
      enableOptionMenu(1, false);
      return;
      updateOptionMenuText(1, getString(a.i.app_ok));
    }
    enableOptionMenu(1, true);
  }
  
  protected final void Wj()
  {
    super.Wj();
    this.title = getIntent().getStringExtra("titile");
    this.eCs = getIntent().getLongExtra("max_select_num", 20L);
    this.eCt = getIntent().getIntExtra("select_type", 1);
    this.chatroomName = getIntent().getStringExtra("chatroomName");
    if (!s.fq(this.chatroomName)) {
      x.i("MicroMsg.AASelectContactUI", "is single chat");
    }
    this.eCr = new HashSet();
    this.eCq = new HashSet();
    String str = getIntent().getStringExtra("always_select_contact");
    if (!bi.oW(str)) {
      this.eCq.addAll(Arrays.asList(str.split(",")));
    }
    str = getIntent().getStringExtra("already_select_contact");
    if (!bi.oW(str))
    {
      this.eCr.addAll(bi.F(str.split(",")));
      Wp();
    }
    this.eCu = ((CheckBox)findViewById(a.f.toggle_select_all));
    this.eCv = findViewById(a.f.toggle_select_all_click_area);
    this.eCv.setOnClickListener(new AASelectContactUI.1(this));
    if (this.eCr.size() == com.tencent.mm.plugin.aa.a.h.pb(this.chatroomName).size()) {
      this.eCu.setChecked(true);
    }
    for (;;)
    {
      this.eCu.setOnCheckedChangeListener(new AASelectContactUI.2(this));
      return;
      this.eCu.setChecked(false);
    }
  }
  
  protected final boolean Wk()
  {
    return false;
  }
  
  protected final boolean Wl()
  {
    return false;
  }
  
  protected final String Wm()
  {
    return this.title;
  }
  
  protected final o Wn()
  {
    return new d(this, this.chatroomName);
  }
  
  protected final m Wo()
  {
    return new e(this, this.chatroomName);
  }
  
  public final boolean a(a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.eCr.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final boolean b(a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.eCq.contains(parama.guS.field_username);
    }
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.aa_select_contact_ui;
  }
  
  public final void iV(int paramInt)
  {
    n localn = cyp();
    Object localObject = localn.FM(paramInt - getContentLV().getHeaderViewsCount());
    if (localObject == null) {}
    while (((a)localObject).guS == null) {
      return;
    }
    x.i("MicroMsg.AASelectContactUI", "ClickUser=%s", new Object[] { ((a)localObject).guS.field_username });
    localObject = ((a)localObject).guS.field_username;
    if (((String)localObject).equals(q.GF()))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(4) });
      cyv();
      if (!this.eCr.contains(localObject)) {
        break label191;
      }
      this.eCr.remove(localObject);
      label122:
      if (this.eCr.size() != com.tencent.mm.plugin.aa.a.h.pb(this.chatroomName).size()) {
        break label203;
      }
      this.eCu.setChecked(true);
    }
    for (;;)
    {
      localn.notifyDataSetChanged();
      Wp();
      return;
      com.tencent.mm.plugin.report.service.h.mEJ.h(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(5) });
      break;
      label191:
      this.eCr.add(localObject);
      break label122;
      label203:
      this.eCu.setChecked(false);
    }
  }
  
  protected final void initView()
  {
    super.initView();
    a(1, getString(a.i.app_ok), new AASelectContactUI.3(this), s.b.tmX);
    Wp();
    this.lbw.setOnContactDeselectListener(this);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        if ((AASelectContactUI.b(AASelectContactUI.this) != null) && (AASelectContactUI.b(AASelectContactUI.this).size() > 0) && (AASelectContactUI.b(AASelectContactUI.this).size() <= AASelectContactUI.d(AASelectContactUI.this)) && ((AASelectContactUI.b(AASelectContactUI.this).size() != 1) || (!AASelectContactUI.b(AASelectContactUI.this).contains(q.GF())))) {
          com.tencent.mm.ui.base.h.a(AASelectContactUI.this, AASelectContactUI.this.getString(a.i.aa_select_contact_back_confirm), null, AASelectContactUI.this.getString(a.i.aa_select_contact_save), AASelectContactUI.this.getString(a.i.aa_select_contact_not_save), false, new AASelectContactUI.4.1(this), new AASelectContactUI.4.2(this));
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(7) });
          return true;
          AASelectContactUI.this.finish();
        }
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("always_select_contact");
    if (!bi.oW(paramBundle)) {
      this.eCq.addAll(bi.F(paramBundle.split(",")));
    }
  }
  
  public final void pf(String paramString)
  {
    this.eCr.remove(paramString);
    cyp().notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/AASelectContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */