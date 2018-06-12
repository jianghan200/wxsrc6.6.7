package com.tencent.mm.plugin.brandservice.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.plugin.brandservice.b.h;
import com.tencent.mm.plugin.brandservice.b.i;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.protocal.c.asd;
import com.tencent.mm.protocal.c.asf;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.Iterator;
import java.util.LinkedList;

public class ReceiveTemplateMsgMgrUI
  extends MMPreference
  implements e
{
  private static LinkedList<asd> hpN;
  private ProgressDialog eHw;
  protected f gua;
  private String hpM;
  private boolean hpO = false;
  
  private void da(boolean paramBoolean)
  {
    View localView1 = findViewById(b.d.receive_template_msg_empty_tips);
    View localView2 = findViewById(b.d.receive_template_msg_header_ll);
    if (localView1 != null)
    {
      if (!paramBoolean) {
        break label43;
      }
      ((TextView)localView1).setVisibility(0);
      if (localView2 != null) {
        localView2.setVisibility(8);
      }
    }
    label43:
    do
    {
      return;
      ((TextView)localView1).setVisibility(8);
    } while (localView2 == null);
    localView2.setVisibility(0);
  }
  
  public final int Ys()
  {
    return b.i.receive_template_msg;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    CheckBoxPreference localCheckBoxPreference = null;
    if (paraml == null) {
      x.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], scene is null", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    }
    do
    {
      return;
      x.i("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paraml.getType()) });
      if (paraml.getType() == 1031)
      {
        if ((this.eHw != null) && (this.eHw.isShowing()))
        {
          this.eHw.dismiss();
          this.eHw = null;
        }
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          Toast.makeText(ad.getContext(), ad.getContext().getString(b.h.receive_template_msg_ui_fail_get_options), 1).show();
          da(true);
          return;
        }
        paraml = (d)paraml;
        paramString = localCheckBoxPreference;
        if (paraml.diG != null)
        {
          paramString = localCheckBoxPreference;
          if (paraml.diG.dIE.dIL != null) {
            paramString = (asf)paraml.diG.dIE.dIL;
          }
        }
        hpN = paramString.rUy;
        paramString = hpN;
        this.gua.removeAll();
        if ((paramString == null) || (paramString.size() <= 0))
        {
          x.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "recvOption is empty");
          da(true);
          return;
        }
        da(false);
        x.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "initBody options.size = %d", new Object[] { Integer.valueOf(paramString.size()) });
        paramString = paramString.iterator();
        if (paramString.hasNext())
        {
          paraml = (asd)paramString.next();
          localCheckBoxPreference = new CheckBoxPreference(this);
          localCheckBoxPreference.tDr = false;
          localCheckBoxPreference.setKey(paraml.rUx);
          localCheckBoxPreference.setTitle(paraml.bHD);
          if (paraml.rbZ == 0) {}
          for (boolean bool = true;; bool = false)
          {
            localCheckBoxPreference.qpJ = bool;
            this.gua.a(localCheckBoxPreference);
            break;
          }
        }
        this.gua.notifyDataSetChanged();
        x.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "initBodyView finish");
        return;
      }
    } while ((paraml.getType() != 1030) || ((paramInt1 == 0) && (paramInt2 == 0)));
    Toast.makeText(ad.getContext(), ad.getContext().getString(b.h.receive_template_msg_ui_fail_set_options), 0).show();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (hpN == null) {
      x.w("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "mRecvOptions == null");
    }
    for (;;)
    {
      return false;
      paramf = paramPreference.mKey;
      if (bi.oW(paramf))
      {
        x.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "key is null");
        return false;
      }
      Iterator localIterator = hpN.iterator();
      asd localasd;
      while (localIterator.hasNext())
      {
        localasd = (asd)localIterator.next();
        if (paramf.equals(bi.oV(localasd.rUx)))
        {
          this.hpO = true;
          if (!((CheckBoxPreference)paramPreference).isChecked()) {
            break label130;
          }
        }
      }
      label130:
      for (localasd.rbZ = 0; this.hpO; localasd.rbZ = 1)
      {
        x.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "option change, do scene");
        ah.i(new ReceiveTemplateMsgMgrUI.3(this), 4000L);
        return false;
      }
    }
  }
  
  public final int auY()
  {
    return b.e.receive_template_msg_header;
  }
  
  protected final int getLayoutId()
  {
    return b.e.receive_template_msg_mgr;
  }
  
  protected final void initView()
  {
    setMMTitle(b.h.contact_info_receive_tmp_msg_title);
    this.gua = this.tCL;
    this.hpM = getIntent().getStringExtra("enterprise_biz_name");
    if (bi.oW(this.hpM))
    {
      x.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "bizName is null");
      finish();
      return;
    }
    setBackBtn(new ReceiveTemplateMsgMgrUI.1(this));
    d locald = new d(this.hpM);
    g.DF().a(locald, 0);
    getString(b.h.app_tip);
    this.eHw = h.a(this, getString(b.h.receive_template_msg_ui_waiting_get_options), true, new ReceiveTemplateMsgMgrUI.2(this, locald));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g.DF().a(1031, this);
    g.DF().a(1030, this);
    initView();
  }
  
  protected void onDestroy()
  {
    g.DF().b(1031, this);
    g.DF().b(1030, this);
    super.onDestroy();
  }
  
  protected void onPause()
  {
    if (this.hpO)
    {
      x.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onPause option change");
      this.hpO = false;
      com.tencent.mm.plugin.brandservice.b.l locall = new com.tencent.mm.plugin.brandservice.b.l(this.hpM, hpN);
      g.DF().a(locall, 0);
    }
    super.onPause();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */