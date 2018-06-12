package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.e;

public final class a
  extends p.a
{
  private Account aIy;
  int aNo;
  private Context mContext;
  
  public static Account b(p paramp)
  {
    Account localAccount = null;
    long l;
    if (paramp != null) {
      l = Binder.clearCallingIdentity();
    }
    try
    {
      localAccount = paramp.pc();
      Binder.restoreCallingIdentity(l);
      return localAccount;
    }
    catch (RemoteException paramp)
    {
      paramp = paramp;
      Binder.restoreCallingIdentity(l);
      return null;
    }
    finally
    {
      paramp = finally;
      Binder.restoreCallingIdentity(l);
      throw paramp;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    return this.aIy.equals(((a)paramObject).aIy);
  }
  
  public final Account pc()
  {
    int i = Binder.getCallingUid();
    if (i == this.aNo) {
      return this.aIy;
    }
    if (e.q(this.mContext, i))
    {
      this.aNo = i;
      return this.aIy;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/common/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */