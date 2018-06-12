package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Credential
  implements SafeParcelable
{
  public static final Parcelable.Creator<Credential> CREATOR = new a();
  final String aEN;
  final String aID;
  final String aIE;
  final Uri aIF;
  final List<IdToken> aIG;
  final String aIH;
  final String aII;
  final String aIJ;
  final String aIK;
  final String mName;
  final int mVersionCode;
  
  Credential(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, List<IdToken> paramList, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.mVersionCode = paramInt;
    this.aID = paramString1;
    this.aIE = paramString2;
    this.aEN = ((String)w.ah(paramString3));
    this.mName = paramString4;
    this.aIF = paramUri;
    if (paramList == null) {}
    for (paramString1 = Collections.emptyList();; paramString1 = Collections.unmodifiableList(paramList))
    {
      this.aIG = paramString1;
      this.aIH = paramString5;
      this.aII = paramString6;
      this.aIJ = paramString7;
      this.aIK = paramString8;
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof Credential)) {
        return false;
      }
      paramObject = (Credential)paramObject;
    } while ((TextUtils.equals(this.aEN, ((Credential)paramObject).aEN)) && (TextUtils.equals(this.mName, ((Credential)paramObject).mName)) && (v.c(this.aIF, ((Credential)paramObject).aIF)) && (TextUtils.equals(this.aIH, ((Credential)paramObject).aIH)) && (TextUtils.equals(this.aII, ((Credential)paramObject).aII)) && (TextUtils.equals(this.aIJ, ((Credential)paramObject).aIJ)));
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.aEN, this.mName, this.aIF, this.aIH, this.aII, this.aIJ });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/auth/api/credentials/Credential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */