package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public final class e
  implements Parcelable.Creator<PasswordSpecification>
{
  static void a(PasswordSpecification paramPasswordSpecification, Parcel paramParcel)
  {
    int j = b.t(paramParcel, 20293);
    b.a(paramParcel, 1, paramPasswordSpecification.aIU);
    b.c(paramParcel, 1000, paramPasswordSpecification.mVersionCode);
    b.a(paramParcel, 2, paramPasswordSpecification.aIV);
    List localList = paramPasswordSpecification.aIW;
    if (localList != null)
    {
      int k = b.t(paramParcel, 3);
      int m = localList.size();
      paramParcel.writeInt(m);
      int i = 0;
      while (i < m)
      {
        paramParcel.writeInt(((Integer)localList.get(i)).intValue());
        i += 1;
      }
      b.u(paramParcel, k);
    }
    b.c(paramParcel, 4, paramPasswordSpecification.aIX);
    b.c(paramParcel, 5, paramPasswordSpecification.aIY);
    b.u(paramParcel, j);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/auth/api/credentials/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */