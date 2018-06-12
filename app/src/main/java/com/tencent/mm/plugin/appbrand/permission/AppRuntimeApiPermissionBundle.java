package com.tencent.mm.plugin.appbrand.permission;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.bk.b;
import com.tencent.mm.protocal.c.ob;
import java.util.LinkedList;

public final class AppRuntimeApiPermissionBundle
  implements Parcelable
{
  public static final Parcelable.Creator<AppRuntimeApiPermissionBundle> CREATOR = new AppRuntimeApiPermissionBundle.1();
  final byte[] gqf;
  final byte[] gqg;
  final byte[] gqh;
  
  private AppRuntimeApiPermissionBundle(Parcel paramParcel)
  {
    this.gqf = paramParcel.createByteArray();
    this.gqg = paramParcel.createByteArray();
    this.gqh = paramParcel.createByteArray();
  }
  
  public AppRuntimeApiPermissionBundle(ob paramob)
  {
    this.gqf = paramob.rsl.toByteArray();
    this.gqg = ((b)paramob.rsm.get(0)).toByteArray();
    this.gqh = ((b)paramob.rsm.get(1)).toByteArray();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByteArray(this.gqf);
    paramParcel.writeByteArray(this.gqg);
    paramParcel.writeByteArray(this.gqh);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/permission/AppRuntimeApiPermissionBundle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */