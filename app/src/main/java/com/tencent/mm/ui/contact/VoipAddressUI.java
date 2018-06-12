package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.LauncherUI;
import java.util.ArrayList;
import java.util.List;

public class VoipAddressUI
  extends MMBaseSelectContactUI
{
  private List<String> gRN;
  private String talker = "";
  private boolean umj = false;
  private boolean umk = false;
  private com.tencent.mm.sdk.b.c uml = new VoipAddressUI.1(this);
  
  private void bny()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 82, "", "");
    x.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this });
    if (!bool) {
      return;
    }
    su localsu = new su();
    localsu.cdE.bOh = 5;
    localsu.cdE.talker = this.talker;
    localsu.cdE.context = this;
    if (this.umj) {}
    for (int i = 2;; i = 1)
    {
      localsu.cdE.cdz = 3;
      com.tencent.mm.plugin.report.service.h.mEJ.h(11033, new Object[] { Integer.valueOf(i), Integer.valueOf(2), Integer.valueOf(0) });
      com.tencent.mm.sdk.b.a.sFg.m(localsu);
      YC();
      return;
    }
  }
  
  private void bnz()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.CAMERA", 19, "", "");
    x.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this });
    if (!bool) {}
    do
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 19, "", "");
      x.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this });
    } while (!bool);
    su localsu = new su();
    localsu.cdE.bOh = 5;
    localsu.cdE.talker = this.talker;
    localsu.cdE.context = this;
    if (this.umj) {}
    for (int i = 2;; i = 1)
    {
      localsu.cdE.cdz = 2;
      com.tencent.mm.plugin.report.service.h.mEJ.h(11033, new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(0) });
      com.tencent.mm.sdk.b.a.sFg.m(localsu);
      YC();
      return;
    }
  }
  
  public static void gR(Context paramContext)
  {
    int i = 0;
    boolean bool;
    if (1 == bi.getInt(g.AT().getValue("VOIPCallType"), 0))
    {
      bool = true;
      Intent localIntent = new Intent(paramContext, VoipAddressUI.class);
      localIntent.putExtra("Add_address_titile", paramContext.getString(R.l.address_title_select_contact));
      localIntent.putExtra("voip_video", bool);
      paramContext.startActivity(localIntent);
      paramContext = com.tencent.mm.plugin.report.service.h.mEJ;
      if (!bool) {
        break label97;
      }
    }
    for (;;)
    {
      paramContext.h(11034, new Object[] { Integer.valueOf(1), Integer.valueOf(i) });
      return;
      bool = false;
      break;
      label97:
      i = 1;
    }
  }
  
  protected final void Wj()
  {
    super.Wj();
    String str = getIntent().getStringExtra("LauncherUI.Shortcut.LaunchType");
    this.umk = getIntent().getBooleanExtra("voip_video", true);
    if (str != null)
    {
      this.umj = true;
      if (!str.equals("launch_type_voip")) {
        break label89;
      }
      this.umk = true;
    }
    for (;;)
    {
      this.gRN = new ArrayList();
      this.gRN.addAll(s.cyz());
      this.gRN.addAll(s.cyA());
      return;
      label89:
      if (str.equals("launch_type_voip_audio")) {
        this.umk = false;
      }
    }
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
    String str2 = getIntent().getStringExtra("Add_address_titile");
    String str1 = str2;
    if (!bi.oW(str2)) {
      str1 = getString(R.l.address_title_select_contact);
    }
    return str1;
  }
  
  protected final o Wn()
  {
    c.a locala = new c.a();
    locala.uhW = true;
    locala.uhV = true;
    return new c(this, this.gRN, false, locala);
  }
  
  protected final m Wo()
  {
    return new q(this, this.gRN, false, this.scene);
  }
  
  public final int[] bbG()
  {
    return new int[] { 131072 };
  }
  
  protected final void bbH()
  {
    if (this.umj)
    {
      Intent localIntent = new Intent(this, LauncherUI.class);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
    }
    YC();
    finish();
  }
  
  public final void iV(int paramInt)
  {
    com.tencent.mm.ui.contact.a.a locala = (com.tencent.mm.ui.contact.a.a)getContentLV().getAdapter().getItem(paramInt);
    if (locala == null) {}
    while (locala.guS == null) {
      return;
    }
    this.talker = locala.guS.field_username;
    if (this.umk)
    {
      bnz();
      return;
    }
    bny();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.sFg.b(this.uml);
  }
  
  public void onDestroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.uml);
    super.onDestroy();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.VoipAddressUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    case 19: 
      if (paramArrayOfInt[0] == 0)
      {
        bnz();
        return;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
      for (paramInt = R.l.permission_camera_request_again_msg; paramArrayOfInt[0] != 0; paramInt = R.l.permission_microphone_request_again_msg)
      {
        com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new VoipAddressUI.2(this), new VoipAddressUI.3(this));
        return;
      }
    }
    if (paramArrayOfInt[0] == 0)
    {
      bny();
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_location_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new VoipAddressUI.4(this), null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/contact/VoipAddressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */