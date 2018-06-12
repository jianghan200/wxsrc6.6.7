package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Patterns;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSignInConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator<EmailSignInConfig> CREATOR = new a();
  final Uri aJr;
  String aJs;
  Uri aJt;
  final int versionCode;
  
  EmailSignInConfig(int paramInt, Uri paramUri1, String paramString, Uri paramUri2)
  {
    w.j(paramUri1, "Server widget url cannot be null in order to use email/password sign in.");
    w.i(paramUri1.toString(), "Server widget url cannot be null in order to use email/password sign in.");
    w.e(Patterns.WEB_URL.matcher(paramUri1.toString()).matches(), "Invalid server widget url");
    this.versionCode = paramInt;
    this.aJr = paramUri1;
    this.aJs = paramString;
    this.aJt = paramUri2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/auth/api/signin/EmailSignInConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */