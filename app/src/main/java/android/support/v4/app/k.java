package android.support.v4.app;

public final class k
{
  final l<?> mHost;
  
  k(l<?> paraml)
  {
    this.mHost = paraml;
  }
  
  public final boolean execPendingActions()
  {
    return this.mHost.mFragmentManager.execPendingActions();
  }
  
  final Fragment findFragmentByWho(String paramString)
  {
    return this.mHost.mFragmentManager.findFragmentByWho(paramString);
  }
  
  public final void noteStateNotSaved()
  {
    this.mHost.mFragmentManager.nX = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */