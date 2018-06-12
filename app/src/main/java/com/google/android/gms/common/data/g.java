package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class g
  implements Parcelable.Creator<DataHolder>
{
  static void a(DataHolder paramDataHolder, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.a(paramParcel, 1, paramDataHolder.aMh);
    b.c(paramParcel, 1000, paramDataHolder.mVersionCode);
    b.a(paramParcel, 2, paramDataHolder.aMj, paramInt);
    b.c(paramParcel, 3, paramDataHolder.aJC);
    b.a(paramParcel, 4, paramDataHolder.aMk);
    b.u(paramParcel, i);
  }
  
  public static DataHolder b(Parcel paramParcel)
  {
    int k = a.c(paramParcel);
    Bundle localBundle = null;
    int i = 0;
    CursorWindow[] arrayOfCursorWindow = null;
    String[] arrayOfString = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        arrayOfString = a.p(paramParcel, m);
        break;
      case 1000: 
        j = a.e(paramParcel, m);
        break;
      case 2: 
        arrayOfCursorWindow = (CursorWindow[])a.b(paramParcel, m, CursorWindow.CREATOR);
        break;
      case 3: 
        i = a.e(paramParcel, m);
        break;
      case 4: 
        localBundle = a.m(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a("Overread allowed size end=" + k, paramParcel);
    }
    paramParcel = new DataHolder(j, arrayOfString, arrayOfCursorWindow, i, localBundle);
    paramParcel.oW();
    return paramParcel;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/common/data/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */