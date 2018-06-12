package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.wearable.Channel;

public class ChannelImpl
  implements SafeParcelable, Channel
{
  public static final Parcelable.Creator<ChannelImpl> CREATOR = new bb();
  final String bdn;
  final String bem;
  final String ben;
  final int mVersionCode;
  
  ChannelImpl(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.mVersionCode = paramInt;
    this.bem = ((String)w.ah(paramString1));
    this.bdn = ((String)w.ah(paramString2));
    this.ben = ((String)w.ah(paramString3));
  }
  
  public final e<Status> a(c paramc, Uri paramUri)
  {
    w.j(paramc, "client is null");
    w.j(paramUri, "uri is null");
    return paramc.b(new ChannelImpl.1(this, paramc, paramUri));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ChannelImpl)) {
        return false;
      }
      paramObject = (ChannelImpl)paramObject;
    } while ((this.bem.equals(((ChannelImpl)paramObject).bem)) && (v.c(((ChannelImpl)paramObject).bdn, this.bdn)) && (v.c(((ChannelImpl)paramObject).ben, this.ben)) && (((ChannelImpl)paramObject).mVersionCode == this.mVersionCode));
    return false;
  }
  
  public final String getPath()
  {
    return this.ben;
  }
  
  public int hashCode()
  {
    return this.bem.hashCode();
  }
  
  public final String rO()
  {
    return this.bdn;
  }
  
  public String toString()
  {
    return "ChannelImpl{versionCode=" + this.mVersionCode + ", token='" + this.bem + '\'' + ", nodeId='" + this.bdn + '\'' + ", path='" + this.ben + '\'' + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bb.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/wearable/internal/ChannelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */