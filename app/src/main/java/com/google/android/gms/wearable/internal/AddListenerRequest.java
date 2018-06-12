package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AddListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<AddListenerRequest> CREATOR = new ab();
  public final w bdT;
  public final IntentFilter[] bdU;
  public final String bdV;
  public final String bdW;
  final int mVersionCode;
  
  AddListenerRequest(int paramInt, IBinder paramIBinder, IntentFilter[] paramArrayOfIntentFilter, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    if (paramIBinder != null) {}
    for (this.bdT = w.a.s(paramIBinder);; this.bdT = null)
    {
      this.bdU = paramArrayOfIntentFilter;
      this.bdV = paramString1;
      this.bdW = paramString2;
      return;
    }
  }
  
  public AddListenerRequest(ap paramap)
  {
    this.mVersionCode = 1;
    this.bdT = paramap;
    this.bdU = paramap.bfp;
    this.bdV = paramap.bfq;
    this.bdW = paramap.bfr;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ab.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/AddListenerRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */