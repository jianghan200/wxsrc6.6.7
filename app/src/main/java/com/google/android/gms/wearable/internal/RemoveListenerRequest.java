package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RemoveListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<RemoveListenerRequest> CREATOR = new ah();
  public final w bdT;
  final int mVersionCode;
  
  RemoveListenerRequest(int paramInt, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    if (paramIBinder != null)
    {
      this.bdT = w.a.s(paramIBinder);
      return;
    }
    this.bdT = null;
  }
  
  public RemoveListenerRequest(w paramw)
  {
    this.mVersionCode = 1;
    this.bdT = paramw;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ah.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/RemoveListenerRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */