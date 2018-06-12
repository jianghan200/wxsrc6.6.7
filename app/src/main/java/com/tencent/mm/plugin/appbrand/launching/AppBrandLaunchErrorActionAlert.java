package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.support.annotation.Keep;
import com.tencent.mm.plugin.appbrand.ipc.a;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.base.h;

final class AppBrandLaunchErrorActionAlert
  extends AppBrandLaunchErrorAction
{
  final String eHA;
  final String eHz;
  
  @Keep
  AppBrandLaunchErrorActionAlert(Parcel paramParcel)
  {
    super(paramParcel);
    this.eHz = paramParcel.readString();
    this.eHA = paramParcel.readString();
  }
  
  AppBrandLaunchErrorActionAlert(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    super(paramString1, paramInt);
    this.eHz = paramString2;
    this.eHA = paramString3;
  }
  
  final void cE(Context paramContext)
  {
    String str1 = this.eHA;
    String str2 = this.eHz;
    if (!(paramContext instanceof Activity))
    {
      a.a(null, str1, str2, ad.getResources().getString(s.j.app_ok), "", null, null, null);
      return;
    }
    h.a(paramContext, str1, str2, false, null);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.eHz);
    paramParcel.writeString(this.eHA);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchErrorActionAlert.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */