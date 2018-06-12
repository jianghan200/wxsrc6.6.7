package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;

public class AccountChangeEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new e();
  final int aIs;
  final long aIt;
  final String aIu;
  final int aIv;
  final int aIw;
  final String aIx;
  
  AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.aIs = paramInt1;
    this.aIt = paramLong;
    this.aIu = ((String)w.ah(paramString1));
    this.aIv = paramInt2;
    this.aIw = paramInt3;
    this.aIx = paramString2;
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
      if (!(paramObject instanceof AccountChangeEvent)) {
        break;
      }
      paramObject = (AccountChangeEvent)paramObject;
    } while ((this.aIs == ((AccountChangeEvent)paramObject).aIs) && (this.aIt == ((AccountChangeEvent)paramObject).aIt) && (v.c(this.aIu, ((AccountChangeEvent)paramObject).aIu)) && (this.aIv == ((AccountChangeEvent)paramObject).aIv) && (this.aIw == ((AccountChangeEvent)paramObject).aIw) && (v.c(this.aIx, ((AccountChangeEvent)paramObject).aIx)));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.aIs), Long.valueOf(this.aIt), this.aIu, Integer.valueOf(this.aIv), Integer.valueOf(this.aIw), this.aIx });
  }
  
  public String toString()
  {
    String str = "UNKNOWN";
    switch (this.aIv)
    {
    }
    for (;;)
    {
      return "AccountChangeEvent {accountName = " + this.aIu + ", changeType = " + str + ", changeData = " + this.aIx + ", eventIndex = " + this.aIw + "}";
      str = "ADDED";
      continue;
      str = "REMOVED";
      continue;
      str = "RENAMED_TO";
      continue;
      str = "RENAMED_FROM";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/auth/AccountChangeEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */