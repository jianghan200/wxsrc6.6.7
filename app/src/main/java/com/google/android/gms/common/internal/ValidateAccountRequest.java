package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValidateAccountRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<ValidateAccountRequest> CREATOR = new d();
  final IBinder aMV;
  final Scope[] aMW;
  final int aNl;
  final Bundle aNm;
  final String aNn;
  final int mVersionCode;
  
  ValidateAccountRequest(int paramInt1, int paramInt2, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, String paramString)
  {
    this.mVersionCode = paramInt1;
    this.aNl = paramInt2;
    this.aMV = paramIBinder;
    this.aMW = paramArrayOfScope;
    this.aNm = paramBundle;
    this.aNn = paramString;
  }
  
  public ValidateAccountRequest(p paramp, Scope[] paramArrayOfScope, String paramString) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/common/internal/ValidateAccountRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */