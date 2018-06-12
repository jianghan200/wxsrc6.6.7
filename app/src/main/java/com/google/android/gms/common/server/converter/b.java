package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class b
  implements Parcelable.Creator<StringToIntConverter>
{
  static void a(StringToIntConverter paramStringToIntConverter, Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramStringToIntConverter.mVersionCode);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramStringToIntConverter.aOQ.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new StringToIntConverter.Entry(str, ((Integer)paramStringToIntConverter.aOQ.get(str)).intValue()));
    }
    com.google.android.gms.common.internal.safeparcel.b.b(paramParcel, 2, localArrayList);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/common/server/converter/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */