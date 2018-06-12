package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import java.util.ArrayList;
import java.util.List;

public class ServiceAppUI
  extends MMPreference
  implements e
{
  private com.tencent.mm.ui.base.preference.f eOE;
  private ServicePreference osP;
  private ServicePreference osQ;
  private PreferenceTitleCategory osR;
  private PreferenceTitleCategory osS;
  private List<com.tencent.mm.pluginsdk.model.app.f> osT = new ArrayList();
  private List<com.tencent.mm.pluginsdk.model.app.f> osU = new ArrayList();
  private AdapterView.OnItemClickListener osV;
  private AdapterView.OnItemClickListener osW;
  private String talker;
  
  public final int Ys()
  {
    return R.o.service_app_pref;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      return;
    }
    x.e("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.service_app_list);
    this.talker = getIntent().getStringExtra("service_app_talker_user");
    setBackBtn(new ServiceAppUI.1(this));
    this.osT.clear();
    this.osU.clear();
    Cursor localCursor;
    if (s.fq(this.talker))
    {
      localCursor = ao.bmf().dh(0, 2);
      if (localCursor != null) {
        if (!localCursor.moveToFirst()) {}
      }
    }
    label456:
    for (;;)
    {
      com.tencent.mm.pluginsdk.model.app.f localf = new com.tencent.mm.pluginsdk.model.app.f();
      localf.d(localCursor);
      if (localf.field_serviceAppType == 1) {
        this.osT.add(localf);
      }
      for (;;)
      {
        if (localCursor.moveToNext()) {
          break label456;
        }
        localCursor.close();
        if (this.osV == null) {
          this.osV = new ServiceAppUI.2(this);
        }
        if (this.osW == null) {
          this.osW = new ServiceAppUI.3(this);
        }
        this.eOE = this.tCL;
        this.eOE.removeAll();
        if (this.osT.size() > 0)
        {
          this.osP = new ServicePreference(this);
          this.osP.mSx = this.osT;
          if (this.osV != null) {
            this.osP.osG = this.osV;
          }
          if (this.osR == null)
          {
            this.osR = new PreferenceTitleCategory(this);
            this.osR.setTitle(R.l.wx_service_app_list);
          }
          this.eOE.a(this.osR);
          this.eOE.a(this.osP);
        }
        if (this.osU.size() > 0)
        {
          this.osQ = new ServicePreference(this);
          this.osQ.mSx = this.osU;
          if (this.osW != null) {
            this.osQ.osG = this.osW;
          }
          if (this.osS == null)
          {
            this.osS = new PreferenceTitleCategory(this);
            this.osS.setTitle(R.l.biz_service_app_list);
          }
          this.eOE.a(this.osS);
          this.eOE.a(this.osQ);
        }
        return;
        if (s.hf(this.talker))
        {
          localCursor = ao.bmf().dh(0, 4);
          break;
        }
        localCursor = ao.bmf().dh(0, 1);
        break;
        if (localf.field_serviceAppType == 2) {
          this.osU.add(localf);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.osP != null) {
      this.osP.onPause();
    }
    if (this.osQ != null) {
      this.osQ.onPause();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    initView();
    if (this.osP != null) {
      this.osP.onResume();
    }
    if (this.osQ != null) {
      this.osQ.onResume();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */