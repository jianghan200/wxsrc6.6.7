package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;

public class ConnectionConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new u();
  boolean aFp;
  final int aMd;
  final String bdi;
  final int bdj;
  final boolean bdk;
  String bdl;
  boolean bdm;
  String bdn;
  final String mName;
  final int mVersionCode;
  
  ConnectionConfiguration(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, String paramString3, boolean paramBoolean3, String paramString4)
  {
    this.mVersionCode = paramInt1;
    this.mName = paramString1;
    this.bdi = paramString2;
    this.aMd = paramInt2;
    this.bdj = paramInt3;
    this.bdk = paramBoolean1;
    this.aFp = paramBoolean2;
    this.bdl = paramString3;
    this.bdm = paramBoolean3;
    this.bdn = paramString4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ConnectionConfiguration)) {}
    do
    {
      return false;
      paramObject = (ConnectionConfiguration)paramObject;
    } while ((!v.c(Integer.valueOf(this.mVersionCode), Integer.valueOf(((ConnectionConfiguration)paramObject).mVersionCode))) || (!v.c(this.mName, ((ConnectionConfiguration)paramObject).mName)) || (!v.c(this.bdi, ((ConnectionConfiguration)paramObject).bdi)) || (!v.c(Integer.valueOf(this.aMd), Integer.valueOf(((ConnectionConfiguration)paramObject).aMd))) || (!v.c(Integer.valueOf(this.bdj), Integer.valueOf(((ConnectionConfiguration)paramObject).bdj))) || (!v.c(Boolean.valueOf(this.bdk), Boolean.valueOf(((ConnectionConfiguration)paramObject).bdk))) || (!v.c(Boolean.valueOf(this.bdm), Boolean.valueOf(((ConnectionConfiguration)paramObject).bdm))));
    return true;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.mVersionCode), this.mName, this.bdi, Integer.valueOf(this.aMd), Integer.valueOf(this.bdj), Boolean.valueOf(this.bdk), Boolean.valueOf(this.bdm) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ConnectionConfiguration[ ");
    localStringBuilder.append("mName=" + this.mName);
    localStringBuilder.append(", mAddress=" + this.bdi);
    localStringBuilder.append(", mType=" + this.aMd);
    localStringBuilder.append(", mRole=" + this.bdj);
    localStringBuilder.append(", mEnabled=" + this.bdk);
    localStringBuilder.append(", mIsConnected=" + this.aFp);
    localStringBuilder.append(", mPeerNodeId=" + this.bdl);
    localStringBuilder.append(", mBtlePriority=" + this.bdm);
    localStringBuilder.append(", mNodeId=" + this.bdn);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    u.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/ConnectionConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */