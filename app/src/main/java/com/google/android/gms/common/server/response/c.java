package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class c
  implements Parcelable.Creator<FieldMappingDictionary>
{
  static void a(FieldMappingDictionary paramFieldMappingDictionary, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramFieldMappingDictionary.mVersionCode);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramFieldMappingDictionary.aPf.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new FieldMappingDictionary.Entry(str, (Map)paramFieldMappingDictionary.aPf.get(str)));
    }
    b.b(paramParcel, 2, localArrayList);
    b.a(paramParcel, 3, paramFieldMappingDictionary.aPh);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/common/server/response/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */