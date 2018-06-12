package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.g.a.gl;
import com.tencent.mm.g.a.gl.b;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.game.d.db;
import com.tencent.mm.plugin.game.model.h;
import com.tencent.mm.plugin.webview.model.ae;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams;
import com.tencent.mm.pluginsdk.p;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;

public class CommonLogicTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<CommonLogicTask> CREATOR = new CommonLogicTask.1();
  public Runnable jGe;
  public Bundle jfZ = new Bundle();
  public int type;
  
  public CommonLogicTask() {}
  
  CommonLogicTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  private static int oH(String paramString)
  {
    try
    {
      int i = bi.getInt(g.AT().getValue(paramString), 1);
      return i;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ComonLogicTask", "getIntValFromDynamicConfig parseInt failed, val: " + paramString);
    }
    return 1;
  }
  
  public final void aai()
  {
    int i = 0;
    boolean bool2 = true;
    boolean bool1 = true;
    switch (this.type)
    {
    }
    for (;;)
    {
      ahH();
      Object localObject1;
      do
      {
        return;
        if (this.jfZ == null) {
          break;
        }
        bool1 = this.jfZ.getBoolean("permission_allow", false);
        localObject1 = this.jfZ.getString("url");
        if (bi.oW((String)localObject1))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ComonLogicTask", "ACTIVITY_JUMP_HANDLER, url is null");
          return;
        }
        p.a.qyl.a(ad.getContext(), (String)localObject1, bool1);
        break;
        if (this.jfZ == null) {
          break;
        }
        localObject1 = this.jfZ.getIntArray("getConfigStgKey");
      } while ((localObject1 == null) || (localObject1.length == 0));
      Object localObject2 = new ArrayList();
      int j = localObject1.length;
      while (i < j)
      {
        int k = localObject1[i];
        au.HU();
        ((ArrayList)localObject2).add(bi.oV((String)com.tencent.mm.model.c.DT().get(k, null)));
        i += 1;
      }
      this.jfZ.putStringArrayList("getConfigStgValue", (ArrayList)localObject2);
      continue;
      if (this.jfZ != null)
      {
        localObject1 = this.jfZ.getString("localId");
        localObject1 = com.tencent.mm.plugin.webview.modeltools.e.bUX().Qq((String)localObject1);
        if (localObject1 != null)
        {
          this.jfZ.putParcelable("item", (Parcelable)localObject1);
          continue;
          i = oH("WebViewDownLoadFileSwitch");
          if (this.jfZ == null) {
            this.jfZ = new Bundle();
          }
          localObject1 = this.jfZ;
          if (i == 1) {}
          for (;;)
          {
            ((Bundle)localObject1).putBoolean("allowDownloadFile", bool1);
            break;
            bool1 = false;
          }
          i = oH("EnableWebviewScanQRCode");
          localObject1 = this.jfZ;
          if (i == 1) {}
          for (bool1 = bool2;; bool1 = false)
          {
            ((Bundle)localObject1).putBoolean("allow_webview_scan", bool1);
            break;
          }
          this.jfZ.putBoolean("has_set_uin", au.HX());
          continue;
          localObject1 = new ch();
          com.tencent.mm.pluginsdk.model.e.a((ch)localObject1, 1, this.jfZ.getString("image_path", ""));
          a.sFg.m((b)localObject1);
          this.jfZ.putInt("fav_simple_img_result", ((ch)localObject1).bJG.ret);
          continue;
          localObject1 = aj.Qu(this.jfZ.getString("localId"));
          this.jfZ.putString("file_path", (String)localObject1);
          continue;
          localObject1 = this.jfZ.getString("game_hv_menu_appid");
          localObject2 = new gl();
          ((gl)localObject2).bPC.nc = 3;
          ((gl)localObject2).bPC.bPE = ((String)localObject1);
          a.sFg.m((b)localObject2);
          this.jfZ.putString("game_hv_menu_pbcache", ((gl)localObject2).bPD.result);
          continue;
          localObject1 = h.aTL().aTN();
          if (localObject1 != null)
          {
            localObject2 = new GameSettingParams();
            ((GameSettingParams)localObject2).bQE = ((db)localObject1).dxh;
            ((GameSettingParams)localObject2).bQF = ((db)localObject1).jOk;
            this.jfZ.putParcelable("game_setting_params", (Parcelable)localObject2);
            continue;
            com.tencent.mm.plugin.webview.ui.tools.game.c.aa(this.jfZ);
          }
        }
      }
    }
  }
  
  public final void aaj()
  {
    if (this.jGe != null) {
      this.jGe.run();
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void g(Parcel paramParcel)
  {
    this.type = paramParcel.readInt();
    this.jfZ = paramParcel.readBundle(getClass().getClassLoader());
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.type);
    paramParcel.writeBundle(this.jfZ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/CommonLogicTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */