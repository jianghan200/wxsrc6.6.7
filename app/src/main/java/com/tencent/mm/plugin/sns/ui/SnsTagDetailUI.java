package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.i.m;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.v;
import com.tencent.mm.plugin.sns.model.w;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.pluginsdk.ui.applet.j;
import com.tencent.mm.pluginsdk.ui.applet.k.b;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsTagDetailUI
  extends MMPreference
  implements e, m.b
{
  protected String bKg = "";
  protected f eOE;
  protected ContactListExpandPreference hLp;
  protected List<String> jzp = new ArrayList();
  protected long noJ;
  protected String obG = "";
  private boolean obH = false;
  protected ContactListExpandPreference.a obI = new SnsTagDetailUI.9(this);
  protected int scene = 0;
  protected p tipDialog = null;
  
  private void bDN()
  {
    Preference localPreference = this.eOE.ZZ("settings_tag_name");
    if (localPreference != null)
    {
      if (this.obG.length() > 20) {
        this.obG = this.obG.substring(0, 20);
      }
      localPreference.setSummary(this.obG);
      this.eOE.notifyDataSetChanged();
    }
  }
  
  public final int Ys()
  {
    return i.m.tag_detail_pref;
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsTagDetailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null) {
      this.tipDialog.dismiss();
    }
    switch (paraml.getType())
    {
    }
    do
    {
      return;
      finish();
      return;
      finish();
      return;
    } while ((this.hLp == null) || (!this.obH) || ((this instanceof SnsBlackDetailUI)));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsTagDetailUI", "update form net");
    paramString = (v)paraml;
    this.bKg = (this.obG + " " + bi.c(paramString.eQ(this.noJ), ","));
    new LinkedList();
    paramString = this.jzp;
    this.jzp = bCY();
    if (paramString != null)
    {
      paramString = paramString.iterator();
      while (paramString.hasNext())
      {
        paraml = (String)paramString.next();
        if (!this.jzp.contains(paraml)) {
          this.jzp.add(paraml);
        }
      }
    }
    this.hLp.bt(this.jzp);
    this.hLp.notifyChanged();
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject) {}
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if ((paramf.equals("settings_tag_name")) && ((this.noJ >= 6L) || (this.noJ == 0L)))
    {
      paramPreference = new Intent();
      paramPreference.putExtra("Contact_mode_name_type", 3);
      paramPreference.putExtra("Contact_Nick", bi.aG(this.obG, " "));
      com.tencent.mm.plugin.sns.c.a.ezn.a(paramPreference, this);
    }
    if (paramf.equals("delete_tag_name")) {
      h.a(this, i.j.set_tag_del_cmd, i.j.app_tip, new SnsTagDetailUI.1(this), new SnsTagDetailUI.2(this));
    }
    return false;
  }
  
  protected void aZV()
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
    final w localw = new w(3, this.noJ, this.obG, this.jzp.size(), this.jzp, this.scene);
    g.Ek();
    g.Eh().dpP.a(localw, 0);
    getString(i.j.app_tip);
    this.tipDialog = h.a(this, getString(i.j.sns_tag_save), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        g.Ek();
        g.Eh().dpP.c(localw);
      }
    });
  }
  
  protected void bCV()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsTagDetailUI", "Base __onCreate");
    g.Ek();
    g.Eh().dpP.a(290, this);
    g.Ek();
    g.Eh().dpP.a(291, this);
    g.Ek();
    g.Eh().dpP.a(292, this);
    g.Ek();
    g.Eh().dpP.a(293, this);
    g.Ek();
    ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().a(this);
    if (af.byu().bBG().size() == 0)
    {
      g.Ek();
      g.Eh().dpP.a(new v(1), 0);
      this.obH = true;
    }
  }
  
  protected void bCW()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsTagDetailUI", "Base __onDestroy");
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
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().b(this);
    }
  }
  
  protected void bCX()
  {
    if (this.noJ != 0L)
    {
      g.Ek();
      g.Eh().dpP.a(new com.tencent.mm.plugin.sns.model.x(this.noJ, this.obG), 0);
    }
    getString(i.j.app_tip);
    this.tipDialog = h.a(this, getString(i.j.sns_tag_save), true, new SnsTagDetailUI.3(this));
  }
  
  protected List<String> bCY()
  {
    LinkedList localLinkedList = new LinkedList();
    t localt = af.byu().fk(this.noJ);
    Object localObject = localLinkedList;
    if (localt.field_memberList != null)
    {
      localObject = localLinkedList;
      if (!localt.field_memberList.equals("")) {
        localObject = bi.F(localt.field_memberList.split(","));
      }
    }
    return (List<String>)localObject;
  }
  
  protected void cr(List<String> paramList)
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
    if (this.hLp != null)
    {
      this.hLp.bt(this.jzp);
      this.hLp.notifyChanged();
    }
    if (this.jzp.size() > 0) {
      this.hLp.kG(true).kH(true);
    }
    for (;;)
    {
      updateTitle();
      return;
      this.hLp.kG(true).kH(false);
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      if (((this.obG + " " + bi.c(this.jzp, ",")).equals(this.bKg)) && (this.noJ != 0L)) {
        finish();
      }
      for (;;)
      {
        return true;
        h.a(this, i.j.sns_tag_cancel, i.j.app_tip, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            SnsTagDetailUI.this.finish();
          }
        }, null);
      }
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final void initView()
  {
    this.eOE = this.tCL;
    this.hLp = ((ContactListExpandPreference)this.eOE.ZZ("roominfo_contact_anchor"));
    if (this.hLp != null)
    {
      this.hLp.a(this.eOE, this.hLp.mKey);
      this.hLp.kG(true).kH(true);
      this.hLp.p(null, this.jzp);
      this.hLp.a(new k.b()
      {
        public final boolean oe(int paramAnonymousInt)
        {
          ContactListExpandPreference localContactListExpandPreference = SnsTagDetailUI.this.hLp;
          if (localContactListExpandPreference.qJA != null) {}
          for (boolean bool = localContactListExpandPreference.qJA.qIM.Ca(paramAnonymousInt);; bool = true)
          {
            if (!bool) {
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsTagDetailUI", "onItemLongClick " + paramAnonymousInt);
            }
            return true;
          }
        }
      });
      this.hLp.a(this.obI);
    }
    getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
    setBackBtn(new SnsTagDetailUI.5(this));
    a(0, getString(i.j.app_finish), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SnsTagDetailUI.this.aZV();
        return true;
      }
    }, s.b.tmX);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1) {}
    do
    {
      return;
      switch (paramInt1)
      {
      default: 
        return;
      }
    } while (paramIntent == null);
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    if (bi.oV(q.GF()).equals(paramIntent)) {
      paramInt2 = 1;
    }
    while (paramInt2 != 0)
    {
      h.b(this, getString(i.j.add_room_mem_memberExits, new Object[] { Integer.valueOf(0), Integer.valueOf(0) }), getString(i.j.app_tip), true);
      return;
      if (this.jzp == null)
      {
        paramInt2 = 0;
      }
      else
      {
        Iterator localIterator = this.jzp.iterator();
        paramInt1 = 0;
        label132:
        paramInt2 = paramInt1;
        if (localIterator.hasNext())
        {
          if (!((String)localIterator.next()).equals(paramIntent)) {
            break label299;
          }
          paramInt1 = 1;
        }
      }
    }
    label299:
    for (;;)
    {
      break label132;
      paramIntent = bi.F(paramIntent.split(","));
      if (paramIntent == null) {
        break;
      }
      cr(paramIntent);
      while (((this.obG + " " + bi.c(this.jzp, ",")).equals(this.bKg)) && (this.noJ != 0L))
      {
        enableOptionMenu(false);
        return;
        paramIntent = paramIntent.getStringExtra("k_sns_tag_name");
        if (paramIntent != null) {
          this.obG = paramIntent;
        }
        updateTitle();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsTagDetailUI", "updateName " + this.obG);
      }
      enableOptionMenu(true);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bCV();
    this.scene = getIntent().getIntExtra("k_tag_detail_sns_block_scene", 0);
    this.noJ = getIntent().getLongExtra("k_sns_tag_id", 0L);
    if (this.noJ == 4L) {
      this.obG = getString(i.j.sns_tag_outsiders);
    }
    while (this.noJ == 0L)
    {
      Object localObject = getIntent().getStringExtra("k_sns_tag_list");
      this.obG = bi.aG(getIntent().getStringExtra("k_sns_tag_name"), "");
      paramBundle = af.byc();
      String str1 = q.GF();
      localObject = bi.F(((String)localObject).split(","));
      if (localObject == null) {
        break label257;
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str2 = (String)((Iterator)localObject).next();
        if ((!this.jzp.contains(str2)) && (com.tencent.mm.l.a.gd(paramBundle.Yg(str2).field_type)) && (!str1.equals(str2))) {
          this.jzp.add(str2);
        }
      }
      if (this.noJ == 5L) {
        this.obG = getString(i.j.sns_tag_snsblack);
      } else {
        this.obG = af.byu().fk(this.noJ).field_tagName;
      }
    }
    this.jzp = bCY();
    label257:
    if ((this.obG == null) || (this.obG.equals("")))
    {
      this.obG = getString(i.j.sns_tag_name_unknow);
      this.obG = aj.Mm(getString(i.j.sns_tag_name_unknow));
    }
    initView();
    bDN();
    updateTitle();
    if (this.noJ < 6L)
    {
      this.eOE.aaa("delete_tag_name");
      this.eOE.aaa("delete_tag_name_category");
      if (this.noJ > 0L)
      {
        this.eOE.aaa("settings_tag_name");
        this.eOE.aaa("settings_tag_name_category");
      }
    }
    if (this.noJ == 4L)
    {
      this.eOE.aaa("black");
      this.eOE.aaa("group");
      if (this.noJ != 0L) {
        break label543;
      }
      enableOptionMenu(true);
    }
    for (;;)
    {
      this.bKg = (this.obG + " " + bi.c(this.jzp, ","));
      return;
      if (this.noJ == 5L)
      {
        this.eOE.aaa("outside");
        this.eOE.aaa("group");
        break;
      }
      this.eOE.aaa("black");
      this.eOE.aaa("outside");
      break;
      label543:
      enableOptionMenu(false);
    }
  }
  
  public void onDestroy()
  {
    if (this.tipDialog != null) {
      this.tipDialog.dismiss();
    }
    bCW();
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
    bDN();
  }
  
  protected final void updateTitle()
  {
    setMMTitle(this.obG + "(" + this.jzp.size() + ")");
  }
  
  protected void yp(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return;
    }
    this.jzp.remove(paramString);
    if (this.hLp != null)
    {
      this.hLp.bt(this.jzp);
      this.hLp.notifyChanged();
    }
    if ((this.jzp.size() == 0) && (this.hLp != null))
    {
      this.hLp.cdV();
      this.hLp.kG(true).kH(false);
      this.eOE.notifyDataSetChanged();
    }
    for (;;)
    {
      updateTitle();
      return;
      if (this.hLp != null) {
        this.hLp.kG(true).kH(true);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsTagDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */