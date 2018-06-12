package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.z;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.cv;
import com.tencent.mm.g.a.cv.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.bw;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.y;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.s;
import java.util.Iterator;
import java.util.List;

public class ExdeviceDeviceProfileUI
  extends MMPreference
  implements com.tencent.mm.ab.e
{
  private String bvw;
  private p fUo;
  private String iAG;
  private String iAH;
  private String iAa;
  private int iBE;
  private p iBL = null;
  private String iCI;
  private String iCJ;
  private boolean iCK;
  private String iCL;
  private boolean iCM;
  private String iCN;
  private h.b iCO;
  private String ius;
  private String iut;
  private long ivC;
  private String izI;
  
  private void a(DeviceProfileHeaderPreference paramDeviceProfileHeaderPreference)
  {
    String str;
    if (bi.oW(this.iAG))
    {
      str = this.ius;
      if (bi.oW(this.iCJ)) {
        break label104;
      }
      paramDeviceProfileHeaderPreference.setName(this.iCJ);
      paramDeviceProfileHeaderPreference.Ao(getString(R.l.exdevice_device_name, new Object[] { str }));
      paramDeviceProfileHeaderPreference.H(3, true);
      paramDeviceProfileHeaderPreference.H(4, true);
      paramDeviceProfileHeaderPreference.H(1, false);
    }
    for (;;)
    {
      str = this.iAa;
      paramDeviceProfileHeaderPreference.iAa = str;
      if (paramDeviceProfileHeaderPreference.izX != null) {
        paramDeviceProfileHeaderPreference.izX.setText(str);
      }
      return;
      str = this.iAG;
      break;
      label104:
      paramDeviceProfileHeaderPreference.setName(str);
      paramDeviceProfileHeaderPreference.Ao("");
      paramDeviceProfileHeaderPreference.H(3, false);
      paramDeviceProfileHeaderPreference.H(4, false);
      paramDeviceProfileHeaderPreference.H(1, this.iCK);
    }
  }
  
  private void aHL()
  {
    runOnUiThread(new ExdeviceDeviceProfileUI.2(this));
  }
  
  private void aHR()
  {
    com.tencent.mm.ui.base.preference.h localh = this.tCL;
    Object localObject = (DeviceProfileHeaderPreference)localh.ZZ("device_profile_header");
    ((DeviceProfileHeaderPreference)localObject).a(1, new ExdeviceDeviceProfileUI.8(this));
    ((DeviceProfileHeaderPreference)localObject).a(4, new ExdeviceDeviceProfileUI.9(this));
    a((DeviceProfileHeaderPreference)localObject);
    ((DeviceProfileHeaderPreference)localObject).setIconUrl(this.iCL);
    localObject = (KeyValuePreference)localh.ZZ("message_manage");
    KeyValuePreference localKeyValuePreference1 = (KeyValuePreference)localh.ZZ("connect_setting");
    KeyValuePreference localKeyValuePreference2 = (KeyValuePreference)localh.ZZ("user_list");
    ((KeyValuePreference)localObject).lO(true);
    localKeyValuePreference1.lO(true);
    localKeyValuePreference2.lO(true);
    localh.bw("message_manage", true);
    localh.bw("connect_setting", true);
    localh.bw("user_list", true);
    boolean bool;
    if (this.iCM)
    {
      localh.bw("sub_device_desc", false);
      localh.ZZ("sub_device_desc").setTitle(getResources().getString(R.l.exdevice_sub_device_desc, new Object[] { this.iCN }));
      localh.bw("bind_device", true);
      bool = true;
    }
    for (;;)
    {
      localh.bw("unbind_device", bool);
      if (bi.oW(this.iCI)) {
        localh.bw("open_device_panel", true);
      }
      return;
      localh.bw("sub_device_desc", true);
      localh.bw("bind_device", this.iCK);
      if (!this.iCK) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  private void aHS()
  {
    runOnUiThread(new ExdeviceDeviceProfileUI.3(this));
  }
  
  private void aHT()
  {
    runOnUiThread(new ExdeviceDeviceProfileUI.4(this));
  }
  
  private void f(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    if (paramb != null)
    {
      this.iut = paramb.field_deviceID;
      this.izI = paramb.field_deviceType;
      this.iCJ = bi.oV(paramb.cCR);
      this.iAG = bi.oV(paramb.cCS);
      this.ius = bi.oV(paramb.field_brandName);
      this.iAa = bi.oV(paramb.cCT);
      this.iCL = bi.oV(paramb.iconUrl);
      this.iCI = bi.oV(paramb.jumpUrl);
    }
  }
  
  private void j(com.tencent.mm.ab.l paraml)
  {
    runOnUiThread(new ExdeviceDeviceProfileUI.5(this, paraml));
  }
  
  public final int Ys()
  {
    return R.o.exdevice_device_profile_pref;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paraml == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExdeviceDeviceProfileUI", "scene is null.");
    }
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExdeviceDeviceProfileUI", "type = %s", new Object[] { Integer.valueOf(paraml.getType()) });
      if ((paraml instanceof com.tencent.mm.plugin.exdevice.model.l))
      {
        aHL();
        au.DF().b(paraml.getType(), this);
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paraml.getType()) });
          aHS();
          return;
        }
        aHT();
        f(ad.aHe().cz(this.iut, this.izI));
        runOnUiThread(new ExdeviceDeviceProfileUI.11(this));
        return;
      }
      if ((paraml instanceof com.tencent.mm.plugin.exdevice.model.m))
      {
        aHL();
        au.DF().b(paraml.getType(), this);
        com.tencent.mm.plugin.exdevice.h.b localb = ad.aHe().cX(com.tencent.mm.plugin.exdevice.j.b.Az(this.bvw));
        if ((paramInt1 != 0) || (paramInt2 != 0) || (localb == null))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paraml.getType()) });
          aHS();
          return;
        }
        f(localb);
        runOnUiThread(new ExdeviceDeviceProfileUI.12(this));
        aHT();
        return;
      }
      if ((paraml instanceof y))
      {
        aHL();
        au.DF().b(1263, this);
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paraml.getType()) });
          Toast.makeText(this.mController.tml, getString(R.l.exdevice_edit_alias_failed), 1).show();
          return;
        }
        this.iCJ = ((y)paraml).cCR;
        runOnUiThread(new ExdeviceDeviceProfileUI.13(this));
        paramString = ad.aHe().cz(this.iut, this.izI);
        if (paramString == null)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", new Object[] { this.iut, this.izI });
          return;
        }
        paramString.du(this.iCJ);
        ad.aHe().c(paramString, new String[0]);
        return;
      }
    } while (!(paraml instanceof com.tencent.mm.plugin.exdevice.model.x));
    aHL();
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd, unbind failed (%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paraml.getType()) });
      runOnUiThread(new ExdeviceDeviceProfileUI.6(this));
      return;
    }
    runOnUiThread(new ExdeviceDeviceProfileUI.14(this));
    finish();
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExdeviceDeviceProfileUI", "onPreferenceTreeClcik.(key : %s)", new Object[] { paramPreference.mKey });
    if ("bind_device".equals(paramPreference.mKey)) {
      if (bi.oW(this.iAH))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExdeviceDeviceProfileUI", "Do unauth bind device.");
        paramf = new com.tencent.mm.plugin.exdevice.model.m(com.tencent.mm.plugin.exdevice.j.b.Az(this.bvw), this.ius, "3", this.ivC);
        j(paramf);
        au.DF().a(1262, this);
        au.DF().a(paramf, 0);
      }
    }
    do
    {
      for (;;)
      {
        return true;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExdeviceDeviceProfileUI", "Do normal bind device.");
        paramf = this.iAH;
        int i = this.iBE;
        au.DF().a(536, this);
        paramPreference = new cv();
        paramPreference.bKm.bKo = paramf;
        paramPreference.bKm.opType = 1;
        paramPreference.bKm.bKp = i;
        com.tencent.mm.sdk.b.a.sFg.m(paramPreference);
        paramf = paramPreference.bKn.bKq;
        getString(R.l.app_tip);
        this.iBL = com.tencent.mm.ui.base.h.a(this, getString(R.l.exdevice_binding), true, new ExdeviceDeviceProfileUI.10(this, paramf));
        continue;
        if ("unbind_device".equals(paramPreference.mKey))
        {
          paramf = new alx();
          paramf.hbO = this.iut;
          paramf.reT = this.izI;
          paramPreference = ad.aHe().cz(this.iut, this.izI);
          if (paramPreference != null)
          {
            paramPreference = paramPreference.cDa;
            if ((paramPreference != null) && (paramPreference.length() > 0))
            {
              paramPreference = paramPreference.split(",");
              i = 0;
              while (i < paramPreference.length)
              {
                ad.aHe().cB(paramPreference[i], this.izI);
                i += 1;
              }
            }
          }
          paramf = new com.tencent.mm.plugin.exdevice.model.x(paramf, 2);
          j(paramf);
          au.DF().a(537, this);
          au.DF().a(paramf, 0);
        }
        else if ("open_device_panel".equals(paramPreference.mKey))
        {
          com.tencent.mm.plugin.exdevice.model.f.ae(this.mController.tml, this.iCI);
        }
        else
        {
          if (!"contact_info_biz_go_chatting".equals(paramPreference.mKey)) {
            break;
          }
          au.HU();
          paramf = com.tencent.mm.model.c.FR().Yg(this.ius);
          paramPreference = new Intent();
          paramPreference.putExtra("device_id", this.iut);
          paramPreference.putExtra("device_type", this.izI);
          paramPreference.putExtra("KIsHardDevice", true);
          paramPreference.putExtra("KHardDeviceBindTicket", this.iAH);
          if (paramf != null) {
            if ((com.tencent.mm.l.a.gd(paramf.field_type)) && (paramf.ckW()))
            {
              z.MY().kA(paramf.field_username);
              paramPreference.putExtra("Chat_User", this.ius);
              paramPreference.putExtra("finish_direct", true);
              com.tencent.mm.plugin.exdevice.a.isu.e(paramPreference, this.mController.tml);
            }
            else
            {
              paramPreference.putExtra("Contact_User", this.ius);
              paramPreference.putExtra("force_get_contact", true);
              d.b(this.mController.tml, "profile", ".ui.ContactInfoUI", paramPreference);
            }
          }
        }
      }
    } while (("message_manage".equals(paramPreference.mKey)) || ("connect_setting".equals(paramPreference.mKey)) || ("user_list".equals(paramPreference.mKey)));
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    super.onCreate(paramBundle);
    setBackBtn(new ExdeviceDeviceProfileUI.1(this));
    setMMTitle(R.l.exdevice_bind_device_profile_title);
    this.iCO = new ExdeviceDeviceProfileUI.7(this);
    paramBundle = getIntent();
    this.bvw = paramBundle.getStringExtra("device_mac");
    this.ivC = paramBundle.getLongExtra("device_ble_simple_proto", 0L);
    this.iCI = paramBundle.getStringExtra("device_jump_url");
    this.ius = paramBundle.getStringExtra("device_brand_name");
    this.iut = paramBundle.getStringExtra("device_id");
    this.izI = paramBundle.getStringExtra("device_type");
    this.iAH = paramBundle.getStringExtra("bind_ticket");
    this.iBE = paramBundle.getIntExtra("subscribe_flag", 0);
    this.iCK = paramBundle.getBooleanExtra("device_has_bound", false);
    this.iAG = paramBundle.getStringExtra("device_title");
    this.iCJ = paramBundle.getStringExtra("device_alias");
    this.iAa = paramBundle.getStringExtra("device_desc");
    this.iCL = paramBundle.getStringExtra("device_icon_url");
    if ((bi.oW(this.iut)) || (bi.oW(this.izI))) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExdeviceDeviceProfileUI", "deviceId or deviceType is null.", new Object[] { this.iut, this.izI });
    }
    while (i == 0)
    {
      Toast.makeText(this.mController.tml, R.l.exdevice_jump_failed, 1).show();
      finish();
      return;
      paramBundle = ad.aHe().cz(this.iut, this.izI);
      if (paramBundle != null)
      {
        this.iCK = true;
        if (bi.oW(this.iCJ)) {
          this.iCJ = bi.oV(paramBundle.cCR);
        }
        if (bi.oW(this.iAG)) {
          this.iAG = bi.oV(paramBundle.cCS);
        }
        if (bi.oW(this.ius)) {
          this.ius = bi.oV(paramBundle.field_brandName);
        }
        if (bi.oW(this.iAa)) {
          this.iAa = bi.oV(paramBundle.cCT);
        }
        if (bi.oW(this.iCL)) {
          this.iCL = bi.oV(paramBundle.iconUrl);
        }
        if (bi.oW(this.iCI)) {
          this.iCI = bi.oV(paramBundle.jumpUrl);
        }
        if (paramBundle.cCV == 2)
        {
          this.iCM = true;
          this.iCN = this.iAG;
          paramBundle = ad.aHe().aHJ().iterator();
          com.tencent.mm.plugin.exdevice.h.b localb;
          do
          {
            do
            {
              if (!paramBundle.hasNext()) {
                break;
              }
              localb = (com.tencent.mm.plugin.exdevice.h.b)paramBundle.next();
            } while (!localb.field_deviceType.equals(this.izI));
            localObject = localb.cDa;
          } while ((localObject == null) || (((String)localObject).length() <= 0));
          Object localObject = ((String)localObject).split(",");
          i = 0;
          label509:
          if (i < localObject.length) {
            if (localObject[i].equals(this.iut)) {
              if (!bi.oW(localb.cCR)) {
                break label575;
              }
            }
          }
          label575:
          for (this.iCN = localb.cCS;; this.iCN = localb.cCR)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExdeviceDeviceProfileUI", "mGateWayTitle %s", new Object[] { this.iCN });
            i += 1;
            break label509;
            break;
          }
        }
      }
      else
      {
        if (bi.oW(this.iAH)) {
          continue;
        }
      }
      i = 1;
    }
    aHR();
  }
  
  protected void onDestroy()
  {
    au.DF().b(537, this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/exdevice/ui/ExdeviceDeviceProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */