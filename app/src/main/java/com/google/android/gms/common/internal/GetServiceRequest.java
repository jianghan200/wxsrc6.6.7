package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetServiceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetServiceRequest> CREATOR = new j();
  final int aNc;
  int aNd;
  String aNe;
  IBinder aNf;
  Scope[] aNg;
  Bundle aNh;
  Account aNi;
  final int version;
  
  public GetServiceRequest(int paramInt)
  {
    this.version = 2;
    this.aNd = b.aJF;
    this.aNc = paramInt;
  }
  
  GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount)
  {
    this.version = paramInt1;
    this.aNc = paramInt2;
    this.aNd = paramInt3;
    this.aNe = paramString;
    if (paramInt1 < 2)
    {
      paramString = null;
      if (paramIBinder != null) {
        paramString = a.b(p.a.g(paramIBinder));
      }
    }
    for (this.aNi = paramString;; this.aNi = paramAccount)
    {
      this.aNg = paramArrayOfScope;
      this.aNh = paramBundle;
      return;
      this.aNf = paramIBinder;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/common/internal/GetServiceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */