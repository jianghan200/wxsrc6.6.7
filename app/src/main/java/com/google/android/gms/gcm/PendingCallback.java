package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PendingCallback
  implements Parcelable
{
  public static final Parcelable.Creator<PendingCallback> CREATOR = new PendingCallback.1();
  final IBinder aMX;
  
  public PendingCallback(Parcel paramParcel)
  {
    this.aMX = paramParcel.readStrongBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.aMX);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/gcm/PendingCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */