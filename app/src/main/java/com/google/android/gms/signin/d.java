package com.google.android.gms.signin;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.signin.internal.e;
import java.util.Set;

public abstract interface d
  extends a.b
{
  public abstract void a(p paramp, Set<Scope> paramSet, e parame);
  
  public abstract void a(p paramp, boolean paramBoolean);
  
  public abstract void a(t paramt);
  
  public abstract void connect();
  
  public abstract void qT();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/signin/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */