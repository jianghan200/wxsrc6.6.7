package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.s.b;
import java.util.HashSet;

public class SelectLabelContactUI
  extends MMBaseSelectContactUI
{
  private HashSet<String> eCr;
  private int hOX;
  private String label;
  private HashSet<String> ulw;
  
  private void Wp()
  {
    if ((s.fb(this.hOX, 64)) && (this.eCr.size() > 0))
    {
      updateOptionMenuText(1, getString(R.l.app_ok) + "(" + this.eCr.size() + ")");
      enableOptionMenu(1, true);
      return;
    }
    updateOptionMenuText(1, getString(R.l.app_ok));
    enableOptionMenu(1, false);
  }
  
  private void aaO(String paramString)
  {
    if (s.fb(this.hOX, 16384))
    {
      localIntent = new Intent();
      localIntent.putExtra("Select_Contact", paramString);
      setResult(-1, localIntent);
      finish();
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(this, ChattingUI.class);
    localIntent.putExtra("Chat_User", paramString);
    localIntent.putExtra("finish_direct", true);
    startActivity(localIntent);
    finish();
  }
  
  protected final void Wj()
  {
    super.Wj();
    this.label = getIntent().getStringExtra("label");
    this.hOX = getIntent().getIntExtra("list_attr", 0);
    this.eCr = new HashSet();
    this.ulw = new HashSet();
    String str = getIntent().getStringExtra("always_select_contact");
    if (!bi.oW(str)) {
      this.ulw.addAll(bi.F(str.split(",")));
    }
    str = getIntent().getStringExtra("already_select_contact");
    if (!bi.oW(str)) {
      this.eCr.addAll(bi.F(str.split(",")));
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
    return this.label;
  }
  
  protected final o Wn()
  {
    String str = com.tencent.mm.plugin.label.a.a.aYK().FA(this.label);
    return new h(this, s.fb(this.hOX, 64), com.tencent.mm.plugin.label.a.a.aYK().FD(str));
  }
  
  protected final m Wo()
  {
    return null;
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.eCr.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.ulw.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final void iV(int paramInt)
  {
    int i = getContentLV().getHeaderViewsCount();
    n localn = cyp();
    Object localObject = localn.FM(paramInt - i);
    if (localObject == null) {}
    while (((com.tencent.mm.ui.contact.a.a)localObject).guS == null) {
      return;
    }
    localObject = ((com.tencent.mm.ui.contact.a.a)localObject).guS.field_username;
    x.i("MicroMsg.SelectLabelContactUI", "ClickUser=%s", new Object[] { localObject });
    if (s.fb(this.hOX, 64))
    {
      if ((!this.ulw.contains(localObject)) && (!this.eCr.contains(localObject)) && (s.fb(this.hOX, 131072)) && (this.ulw.size() + this.eCr.size() >= getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)))
      {
        com.tencent.mm.ui.base.h.a(this.mController.tml, getString(R.l.select_contact_num_limit_tips, new Object[] { Integer.valueOf(getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) }), getString(R.l.app_remind), new SelectLabelContactUI.2(this));
        return;
      }
      if (!this.ulw.contains(localObject))
      {
        if (!this.eCr.contains(localObject)) {
          break label237;
        }
        this.eCr.remove(localObject);
      }
      for (;;)
      {
        Wp();
        localn.notifyDataSetChanged();
        return;
        label237:
        this.eCr.add(localObject);
      }
    }
    aaO((String)localObject);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (s.fb(this.hOX, 64)) {
      a(1, getString(R.l.app_ok), new SelectLabelContactUI.1(this), s.b.tmX);
    }
    Wp();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/contact/SelectLabelContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */