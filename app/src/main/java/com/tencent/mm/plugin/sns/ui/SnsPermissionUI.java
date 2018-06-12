package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.a.qg;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.i.m;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.w;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.LinkedList;
import java.util.List;

public class SnsPermissionUI
  extends MMPreference
  implements e
{
  private f eOE;
  private boolean nZp = false;
  private ab nZq = null;
  private boolean nZr = false;
  private boolean nZs = false;
  private long nZt = 0L;
  private int scene = 0;
  public p tipDialog = null;
  private String userName = "";
  
  private static boolean Lz(String paramString)
  {
    t localt = af.byu().fk(5L);
    if (bi.oW(localt.field_memberList)) {
      return false;
    }
    return bi.F(localt.field_memberList.split(",")).contains(paramString);
  }
  
  private void btU()
  {
    g.Ek();
    this.nZq = ((i)g.l(i.class)).FR().Yg(this.userName);
    this.nZq.setUsername(this.userName);
    boolean bool1 = this.nZq.BF();
    boolean bool2 = Lz(this.userName);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("sns_outside_permiss");
    localCheckBoxPreference.qpJ = bool1;
    int i = this.nZq.sex;
    x.d("MicroMsg.SnsPermissionUI", "sex:%d", new Object[] { Integer.valueOf(i) });
    if (i == 1)
    {
      localCheckBoxPreference.setTitle(i.j.sns_outside_permiss_male);
      localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("sns_black_permiss");
      if (i != 1) {
        break label204;
      }
      localCheckBoxPreference.setTitle(i.j.sns_black_permiss_male);
    }
    for (;;)
    {
      localCheckBoxPreference.qpJ = bool2;
      if (!com.tencent.mm.l.a.gd(this.nZq.field_type)) {
        this.eOE.aaa("sns_black_permiss");
      }
      this.eOE.notifyDataSetChanged();
      return;
      if (i != 2) {
        break;
      }
      localCheckBoxPreference.setTitle(i.j.sns_outside_permiss_female);
      break;
      label204:
      if (i == 2) {
        localCheckBoxPreference.setTitle(i.j.sns_black_permiss_female);
      }
    }
  }
  
  public final int Ys()
  {
    return i.m.sns_premission;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " " + paraml.getType());
    if (paraml.getType() == 291)
    {
      paramString = new StringBuilder("tipDialog ");
      if (this.tipDialog != null) {
        break label133;
      }
    }
    label133:
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.SnsPermissionUI", bool);
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      btU();
      if (this.nZr) {
        this.nZs = true;
      }
      return;
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (paramf.equals("sns_outside_permiss"))
    {
      paramf = new qg();
      paramf.caP.caR = true;
      paramf.caP.caQ = false;
      paramf.caP.username = this.userName;
      com.tencent.mm.sdk.b.a.sFg.m(paramf);
      if (this.nZq.BF()) {
        s.k(this.nZq);
      }
      for (;;)
      {
        return true;
        s.j(this.nZq);
      }
    }
    if (paramf.equals("sns_black_permiss"))
    {
      paramf = new qg();
      paramf.caP.caR = false;
      paramf.caP.caQ = true;
      paramf.caP.username = this.userName;
      com.tencent.mm.sdk.b.a.sFg.m(paramf);
      boolean bool = Lz(this.userName);
      paramf = this.userName;
      int i;
      if (bool)
      {
        i = 2;
        if ((i != 1) || (5L != 5L)) {
          break label277;
        }
        this.nZr = true;
      }
      for (this.nZs = false;; this.nZs = false)
      {
        paramPreference = new LinkedList();
        paramPreference.add(paramf);
        paramf = new w(i, 5L, "", paramPreference.size(), paramPreference, this.scene);
        g.Ek();
        g.Eh().dpP.a(paramf, 0);
        getString(i.j.app_tip);
        this.tipDialog = h.a(this, getString(i.j.sns_tag_save), true, new SnsPermissionUI.2(this, paramf));
        return true;
        i = 1;
        break;
        label277:
        this.nZr = false;
      }
    }
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      x.d("MicroMsg.SnsPermissionUI", "dispatchKeyEvent");
      setResult(-1, new Intent());
      finish();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final void initView()
  {
    this.eOE = this.tCL;
    setMMTitle(i.j.sns_permiss);
    setBackBtn(new SnsPermissionUI.1(this));
    btU();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g.Ek();
    g.Eh().dpP.a(291, this);
    this.userName = getIntent().getStringExtra("sns_permission_userName");
    this.nZp = getIntent().getBooleanExtra("sns_permission_anim", false);
    this.nZt = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
    this.scene = getIntent().getIntExtra("sns_permission_block_scene", 0);
    x.d("MicroMsg.SnsPermissionUI", "SnsPermissionUI, scene:%d", new Object[] { Integer.valueOf(this.scene) });
    g.Ek();
    this.nZq = ((i)g.l(i.class)).FR().Yg(this.userName);
    if (this.nZq == null)
    {
      x.e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", new Object[] { this.userName });
      finish();
    }
    this.nZq.setUsername(this.userName);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.plugin.sns.c.a.ezo.vl();
    g.Ek();
    g.Eh().dpP.b(291, this);
    if ((this.nZt != 0L) && (this.nZt != -1L))
    {
      pv localpv = new pv();
      localpv.caA.caB = this.nZs;
      localpv.caA.bPm = this.nZt;
      com.tencent.mm.sdk.b.a.sFg.m(localpv);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsPermissionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */