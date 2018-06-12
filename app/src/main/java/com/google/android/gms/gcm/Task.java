package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class Task
  implements Parcelable
{
  private final String aQM;
  private final boolean aQN;
  private final boolean aQO;
  private final int aQP;
  private final boolean aQQ;
  private final Bundle mExtras;
  private final String mTag;
  
  @Deprecated
  Task(Parcel paramParcel)
  {
    this.aQM = paramParcel.readString();
    this.mTag = paramParcel.readString();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.aQN = bool1;
      if (paramParcel.readInt() != 1) {
        break label73;
      }
    }
    label73:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.aQO = bool1;
      this.aQP = 2;
      this.aQQ = false;
      this.mExtras = null;
      return;
      bool1 = false;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.aQM);
    paramParcel.writeString(this.mTag);
    if (this.aQN)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.aQO) {
        break label52;
      }
    }
    label52:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/gcm/Task.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */