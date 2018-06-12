package com.tencent.mm.ipcinvoker.extension.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.ipcinvoker.extension.a;
import com.tencent.mm.ipcinvoker.extension.c;

class WrapperParcelable
  implements Parcelable
{
  public static final Parcelable.Creator<WrapperParcelable> CREATOR = new WrapperParcelable.1();
  Object dna;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.dna != null)
    {
      a locala = c.ax(this.dna);
      if (locala != null)
      {
        paramParcel.writeInt(1);
        paramParcel.writeString(locala.getClass().getName());
        locala.a(this.dna, paramParcel);
        return;
      }
    }
    paramParcel.writeInt(1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ipcinvoker/extension/event/WrapperParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */