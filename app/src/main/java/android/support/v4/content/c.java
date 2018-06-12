package android.support.v4.content;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c<D>
{
  Context mContext;
  public int mId;
  public boolean mg = false;
  public b<D> qW;
  public a<D> qX;
  public boolean qY = false;
  public boolean qZ = true;
  public boolean ra = false;
  public boolean rb = false;
  
  public c(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
  }
  
  public final void a(a<D> parama)
  {
    if (this.qX == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.qX != parama) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.qX = null;
  }
  
  public final void a(b<D> paramb)
  {
    if (this.qW == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.qW != paramb) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.qW = null;
  }
  
  public final void deliverResult(D paramD)
  {
    if (this.qW != null) {
      this.qW.b(this, paramD);
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.mId);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.qW);
    if ((this.mg) || (this.ra) || (this.rb))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.mg);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.ra);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.rb);
    }
    if ((this.qY) || (this.qZ))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.qY);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.qZ);
    }
  }
  
  public void onReset() {}
  
  public void onStartLoading() {}
  
  public void onStopLoading() {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    android.support.v4.e.c.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.mId);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static abstract interface a<D> {}
  
  public static abstract interface b<D>
  {
    public abstract void b(c<D> paramc, D paramD);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/content/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */