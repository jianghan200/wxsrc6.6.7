package com.tencent.mm.plugin.sns.storage;

import com.tencent.mm.plugin.sns.model.af;

public final class h
{
  public static n Nk(String paramString)
  {
    if (v.Lr(paramString)) {
      return af.byo().fi(v.NE(paramString));
    }
    paramString = af.byr().eZ(v.NE(paramString));
    if (paramString != null) {
      return paramString.bAL();
    }
    return null;
  }
  
  public static n Nl(String paramString)
  {
    if (v.Lr(paramString)) {
      return af.byo().xd(v.NF(paramString));
    }
    paramString = af.byr().xa(v.NF(paramString));
    if (paramString != null) {
      return paramString.bAL();
    }
    return null;
  }
  
  public static boolean a(String paramString, n paramn)
  {
    if (v.Lr(paramString)) {
      return af.byo().b(v.NE(paramString), paramn);
    }
    return af.byr().b(v.NE(paramString), paramn.bBp());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */