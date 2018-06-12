package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class OneoffTask
  extends Task
{
  public static final Parcelable.Creator<OneoffTask> CREATOR = new OneoffTask.1();
  private final long aQI;
  private final long aQJ;
  
  @Deprecated
  private OneoffTask(Parcel paramParcel)
  {
    super(paramParcel);
    this.aQI = paramParcel.readLong();
    this.aQJ = paramParcel.readLong();
  }
  
  public String toString()
  {
    return super.toString() + " windowStart=" + this.aQI + " windowEnd=" + this.aQJ;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.aQI);
    paramParcel.writeLong(this.aQJ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/gcm/OneoffTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */