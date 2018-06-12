package com.tencent.mm.ui.widget.snackbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class Snack
  implements Parcelable
{
  public static final Parcelable.Creator<Snack> CREATOR = new Snack.1();
  final String kjg;
  final String uMv;
  final int uMw;
  final Parcelable uMx;
  final short uMy;
  final int uMz;
  
  Snack(Parcel paramParcel)
  {
    this.kjg = paramParcel.readString();
    this.uMv = paramParcel.readString();
    this.uMw = paramParcel.readInt();
    this.uMx = paramParcel.readParcelable(paramParcel.getClass().getClassLoader());
    this.uMy = ((short)paramParcel.readInt());
    this.uMz = paramParcel.readInt();
  }
  
  Snack(String paramString1, String paramString2, int paramInt1, Parcelable paramParcelable, short paramShort, int paramInt2)
  {
    this.kjg = paramString1;
    this.uMv = paramString2;
    this.uMw = paramInt1;
    this.uMx = paramParcelable;
    this.uMy = paramShort;
    this.uMz = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.kjg);
    paramParcel.writeString(this.uMv);
    paramParcel.writeInt(this.uMw);
    paramParcel.writeParcelable(this.uMx, 0);
    paramParcel.writeInt(this.uMy);
    paramParcel.writeInt(this.uMz);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/widget/snackbar/Snack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */