package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class PeriodicTask
  extends Task
{
  public static final Parcelable.Creator<PeriodicTask> CREATOR = new PeriodicTask.1();
  protected long aQK = -1L;
  protected long aQL = -1L;
  
  @Deprecated
  private PeriodicTask(Parcel paramParcel)
  {
    super(paramParcel);
    this.aQK = paramParcel.readLong();
    this.aQL = paramParcel.readLong();
  }
  
  public String toString()
  {
    return super.toString() + " period=" + this.aQK + " flex=" + this.aQL;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.aQK);
    paramParcel.writeLong(this.aQL);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/gcm/PeriodicTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */