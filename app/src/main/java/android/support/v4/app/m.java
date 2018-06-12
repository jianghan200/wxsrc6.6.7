package android.support.v4.app;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class m
{
  public abstract Fragment J(String paramString);
  
  public abstract Fragment R(int paramInt);
  
  public abstract void S(int paramInt);
  
  public abstract void a(Bundle paramBundle, String paramString, Fragment paramFragment);
  
  public abstract q bk();
  
  public abstract Fragment c(Bundle paramBundle, String paramString);
  
  public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract Fragment.SavedState e(Fragment paramFragment);
  
  public abstract boolean executePendingTransactions();
  
  public abstract int getBackStackEntryCount();
  
  public abstract List<Fragment> getFragments();
  
  public abstract boolean isDestroyed();
  
  public abstract void popBackStack();
  
  public abstract boolean popBackStackImmediate();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */