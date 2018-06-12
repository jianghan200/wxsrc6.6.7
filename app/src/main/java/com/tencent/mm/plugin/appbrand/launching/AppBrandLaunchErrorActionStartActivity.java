package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.support.annotation.Keep;
import com.tencent.mm.bg.d;

final class AppBrandLaunchErrorActionStartActivity
  extends AppBrandLaunchErrorAction
{
  final String geE;
  final String geF;
  final Intent geG;
  
  @Keep
  AppBrandLaunchErrorActionStartActivity(Parcel paramParcel)
  {
    super(paramParcel);
    this.geE = paramParcel.readString();
    this.geF = paramParcel.readString();
    this.geG = ((Intent)paramParcel.readParcelable(Intent.class.getClassLoader()));
  }
  
  AppBrandLaunchErrorActionStartActivity(String paramString1, int paramInt, String paramString2, String paramString3, Intent paramIntent)
  {
    super(paramString1, paramInt);
    this.geE = paramString2;
    this.geF = paramString3;
    this.geG = paramIntent;
  }
  
  final void cE(Context paramContext)
  {
    Intent localIntent = this.geG;
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    for (;;)
    {
      d.b(paramContext, this.geE, this.geF, localIntent);
      return;
      localIntent.setFlags(localIntent.getFlags() & 0xEFFFFFFF);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.geE);
    paramParcel.writeString(this.geF);
    paramParcel.writeParcelable(this.geG, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchErrorActionStartActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */