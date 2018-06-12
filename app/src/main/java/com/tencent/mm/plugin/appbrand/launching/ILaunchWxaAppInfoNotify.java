package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;

public abstract interface ILaunchWxaAppInfoNotify
{
  public static final ILaunchWxaAppInfoNotify gfI = new ILaunchWxaAppInfoNotify.1();
  
  public abstract void a(String paramString1, int paramInt, String paramString2, t paramt);
  
  public static class LaunchInfoIpcWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<LaunchInfoIpcWrapper> CREATOR = new ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper.1();
    public String appId;
    public int fmv;
    public AppRuntimeApiPermissionBundle fqP;
    public AppBrandLaunchErrorAction gfJ;
    
    LaunchInfoIpcWrapper() {}
    
    LaunchInfoIpcWrapper(Parcel paramParcel)
    {
      this.appId = paramParcel.readString();
      this.fmv = paramParcel.readInt();
      this.fqP = ((AppRuntimeApiPermissionBundle)paramParcel.readParcelable(AppRuntimeApiPermissionBundle.class.getClassLoader()));
      this.gfJ = ((AppBrandLaunchErrorAction)paramParcel.readParcelable(AppBrandLaunchErrorAction.class.getClassLoader()));
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.fmv);
      paramParcel.writeParcelable(this.fqP, paramInt);
      paramParcel.writeParcelable(this.gfJ, paramInt);
    }
  }
  
  public static final class a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/ILaunchWxaAppInfoNotify.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */