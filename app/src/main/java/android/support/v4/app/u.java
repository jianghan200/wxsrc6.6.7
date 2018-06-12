package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.c.a;
import android.support.v4.content.c.b;
import android.support.v4.e.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

public final class u
  extends t
{
  public static boolean DEBUG = false;
  l mHost;
  boolean mRetaining;
  final String mWho;
  boolean mg;
  final k<a> oX = new k();
  final k<a> oY = new k();
  boolean oZ;
  
  u(String paramString, l paraml, boolean paramBoolean)
  {
    this.mWho = paramString;
    this.mHost = paraml;
    this.mg = paramBoolean;
  }
  
  private a c(int paramInt, t.a<Object> parama)
  {
    a locala = new a(paramInt, parama);
    locala.pc = parama.X(paramInt);
    return locala;
  }
  
  private a d(int paramInt, t.a<Object> parama)
  {
    try
    {
      this.oZ = true;
      parama = c(paramInt, parama);
      a(parama);
      return parama;
    }
    finally
    {
      this.oZ = false;
    }
  }
  
  public final <D> android.support.v4.content.c<D> W(int paramInt)
  {
    if (this.oZ) {
      throw new IllegalStateException("Called while creating a loader");
    }
    a locala = (a)this.oX.get(paramInt);
    if (locala != null)
    {
      if (locala.pi != null) {
        return locala.pi.pc;
      }
      return locala.pc;
    }
    return null;
  }
  
  public final <D> android.support.v4.content.c<D> a(int paramInt, t.a<D> parama)
  {
    if (this.oZ) {
      throw new IllegalStateException("Called while creating a loader");
    }
    a locala = (a)this.oX.get(paramInt);
    if (DEBUG) {
      new StringBuilder("initLoader in ").append(this).append(": args=").append(null);
    }
    if (locala == null)
    {
      locala = d(paramInt, parama);
      parama = locala;
      if (DEBUG) {
        new StringBuilder("  Created new loader ").append(locala);
      }
    }
    for (parama = locala;; parama = locala)
    {
      if ((parama.pd) && (this.mg)) {
        parama.c(parama.pc, parama.mData);
      }
      return parama.pc;
      if (DEBUG) {
        new StringBuilder("  Re-using existing loader ").append(locala);
      }
      locala.pb = parama;
    }
  }
  
  final void a(a parama)
  {
    this.oX.put(parama.mId, parama);
    if (this.mg) {
      parama.start();
    }
  }
  
  public final <D> android.support.v4.content.c<D> b(int paramInt, t.a<D> parama)
  {
    if (this.oZ) {
      throw new IllegalStateException("Called while creating a loader");
    }
    a locala1 = (a)this.oX.get(paramInt);
    if (DEBUG) {
      new StringBuilder("restartLoader in ").append(this).append(": args=").append(null);
    }
    a locala2;
    if (locala1 != null)
    {
      locala2 = (a)this.oY.get(paramInt);
      if (locala2 == null) {
        break label379;
      }
      if (!locala1.pd) {
        break label145;
      }
      if (DEBUG) {
        new StringBuilder("  Removing last inactive loader: ").append(locala1);
      }
      locala2.pe = false;
      locala2.destroy();
    }
    for (;;)
    {
      locala1.pc.qY = true;
      this.oY.put(paramInt, locala1);
      for (;;)
      {
        return d(paramInt, parama).pc;
        label145:
        if (locala1.mg) {
          break;
        }
        this.oX.put(paramInt, null);
        locala1.destroy();
      }
      if (DEBUG) {
        new StringBuilder("  Canceling: ").append(locala1);
      }
      if ((locala1.mg) && (locala1.pc != null) && (locala1.ph))
      {
        if (DEBUG) {
          new StringBuilder("onLoadCanceled: ").append(locala1);
        }
        if ((!locala1.nY) && (locala1.pj.oX.get(locala1.mId) == locala1))
        {
          locala2 = locala1.pi;
          if (locala2 != null)
          {
            if (DEBUG) {
              new StringBuilder("  Switching to pending loader: ").append(locala2);
            }
            locala1.pi = null;
            locala1.pj.oX.put(locala1.mId, null);
            locala1.destroy();
            locala1.pj.a(locala2);
          }
        }
      }
      if (locala1.pi != null)
      {
        if (DEBUG) {
          new StringBuilder("  Removing pending loader: ").append(locala1.pi);
        }
        locala1.pi.destroy();
        locala1.pi = null;
      }
      locala1.pi = c(paramInt, parama);
      return locala1.pi.pc;
      label379:
      if (DEBUG) {
        new StringBuilder("  Making last loader inactive: ").append(locala1);
      }
    }
  }
  
  public final boolean bq()
  {
    int j = this.oX.size();
    int i = 0;
    boolean bool2 = false;
    if (i < j)
    {
      a locala = (a)this.oX.valueAt(i);
      if ((locala.mg) && (!locala.pe)) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        bool2 |= bool1;
        i += 1;
        break;
      }
    }
    return bool2;
  }
  
  final void br()
  {
    if (DEBUG) {
      new StringBuilder("Starting in ").append(this);
    }
    if (this.mg)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStart when already started: ").append(this);
    }
    for (;;)
    {
      return;
      this.mg = true;
      int i = this.oX.size() - 1;
      while (i >= 0)
      {
        ((a)this.oX.valueAt(i)).start();
        i -= 1;
      }
    }
  }
  
  final void bs()
  {
    if (DEBUG) {
      new StringBuilder("Stopping in ").append(this);
    }
    if (!this.mg)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStop when not started: ").append(this);
      return;
    }
    int i = this.oX.size() - 1;
    while (i >= 0)
    {
      ((a)this.oX.valueAt(i)).stop();
      i -= 1;
    }
    this.mg = false;
  }
  
  final void bt()
  {
    if (DEBUG) {
      new StringBuilder("Retaining in ").append(this);
    }
    if (!this.mg)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doRetain when not started: ").append(this);
    }
    for (;;)
    {
      return;
      this.mRetaining = true;
      this.mg = false;
      int i = this.oX.size() - 1;
      while (i >= 0)
      {
        a locala = (a)this.oX.valueAt(i);
        if (DEBUG) {
          new StringBuilder("  Retaining: ").append(locala);
        }
        locala.mRetaining = true;
        locala.pf = locala.mg;
        locala.mg = false;
        locala.pb = null;
        i -= 1;
      }
    }
  }
  
  final void bu()
  {
    int i = this.oX.size() - 1;
    while (i >= 0)
    {
      ((a)this.oX.valueAt(i)).pg = true;
      i -= 1;
    }
  }
  
  final void bv()
  {
    int i = this.oX.size() - 1;
    while (i >= 0)
    {
      a locala = (a)this.oX.valueAt(i);
      if ((locala.mg) && (locala.pg))
      {
        locala.pg = false;
        if (locala.pd) {
          locala.c(locala.pc, locala.mData);
        }
      }
      i -= 1;
    }
  }
  
  final void bw()
  {
    if (!this.mRetaining)
    {
      if (DEBUG) {
        new StringBuilder("Destroying Active in ").append(this);
      }
      i = this.oX.size() - 1;
      while (i >= 0)
      {
        ((a)this.oX.valueAt(i)).destroy();
        i -= 1;
      }
      this.oX.clear();
    }
    if (DEBUG) {
      new StringBuilder("Destroying Inactive in ").append(this);
    }
    int i = this.oY.size() - 1;
    while (i >= 0)
    {
      ((a)this.oY.valueAt(i)).destroy();
      i -= 1;
    }
    this.oY.clear();
  }
  
  public final void destroyLoader(int paramInt)
  {
    if (this.oZ) {
      throw new IllegalStateException("Called while creating a loader");
    }
    if (DEBUG) {
      new StringBuilder("destroyLoader in ").append(this).append(" of ").append(paramInt);
    }
    int i = this.oX.indexOfKey(paramInt);
    a locala;
    if (i >= 0)
    {
      locala = (a)this.oX.valueAt(i);
      this.oX.removeAt(i);
      locala.destroy();
    }
    paramInt = this.oY.indexOfKey(paramInt);
    if (paramInt >= 0)
    {
      locala = (a)this.oY.valueAt(paramInt);
      this.oY.removeAt(paramInt);
      locala.destroy();
    }
    if ((this.mHost != null) && (!bq())) {
      this.mHost.mFragmentManager.bl();
    }
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int j = 0;
    String str;
    int i;
    a locala;
    if (this.oX.size() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      str = paramString + "    ";
      i = 0;
      while (i < this.oX.size())
      {
        locala = (a)this.oX.valueAt(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.oX.keyAt(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(locala.toString());
        locala.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
    }
    if (this.oY.size() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      str = paramString + "    ";
      i = j;
      while (i < this.oY.size())
      {
        locala = (a)this.oY.valueAt(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.oY.keyAt(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(locala.toString());
        locala.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    android.support.v4.e.c.a(this.mHost, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  final class a
    implements c.a<Object>, c.b<Object>
  {
    Object mData;
    final int mId;
    boolean mRetaining;
    boolean mg;
    boolean nY;
    final Bundle pa;
    t.a<Object> pb;
    android.support.v4.content.c<Object> pc;
    boolean pd;
    boolean pe;
    boolean pf;
    boolean pg;
    boolean ph;
    a pi;
    
    public a(Bundle paramBundle)
    {
      this.mId = paramBundle;
      this.pa = null;
      t.a locala;
      this.pb = locala;
    }
    
    public final void b(android.support.v4.content.c<Object> paramc, Object paramObject)
    {
      if (u.DEBUG) {
        new StringBuilder("onLoadComplete: ").append(this);
      }
      if (this.nY) {}
      do
      {
        do
        {
          return;
        } while (u.this.oX.get(this.mId) != this);
        a locala = this.pi;
        if (locala != null)
        {
          if (u.DEBUG) {
            new StringBuilder("  Switching to pending loader: ").append(locala);
          }
          this.pi = null;
          u.this.oX.put(this.mId, null);
          destroy();
          u.this.a(locala);
          return;
        }
        if ((this.mData != paramObject) || (!this.pd))
        {
          this.mData = paramObject;
          this.pd = true;
          if (this.mg) {
            c(paramc, paramObject);
          }
        }
        paramc = (a)u.this.oY.get(this.mId);
        if ((paramc != null) && (paramc != this))
        {
          paramc.pe = false;
          paramc.destroy();
          u.this.oY.remove(this.mId);
        }
      } while ((u.a(u.this) == null) || (u.this.bq()));
      u.a(u.this).mFragmentManager.bl();
    }
    
    final void c(android.support.v4.content.c<Object> paramc, Object paramObject)
    {
      String str;
      if (this.pb != null)
      {
        if (u.a(u.this) == null) {
          break label176;
        }
        str = u.a(u.this).mFragmentManager.nZ;
        u.a(u.this).mFragmentManager.nZ = "onLoadFinished";
      }
      for (;;)
      {
        try
        {
          if (u.DEBUG)
          {
            StringBuilder localStringBuilder1 = new StringBuilder("  onLoadFinished in ").append(paramc).append(": ");
            StringBuilder localStringBuilder2 = new StringBuilder(64);
            android.support.v4.e.c.a(paramObject, localStringBuilder2);
            localStringBuilder2.append("}");
            localStringBuilder1.append(localStringBuilder2.toString());
          }
          this.pb.a(paramc, paramObject);
          if (u.a(u.this) != null) {
            u.a(u.this).mFragmentManager.nZ = str;
          }
          this.pe = true;
          return;
        }
        finally
        {
          if (u.a(u.this) != null) {
            u.a(u.this).mFragmentManager.nZ = str;
          }
        }
        label176:
        str = null;
      }
    }
    
    final void destroy()
    {
      a locala = this;
      if (u.DEBUG) {
        new StringBuilder("  Destroying: ").append(locala);
      }
      locala.nY = true;
      boolean bool = locala.pe;
      locala.pe = false;
      Object localObject;
      if ((locala.pb != null) && (locala.pc != null) && (locala.pd) && (bool))
      {
        if (u.DEBUG) {
          new StringBuilder("  Reseting: ").append(locala);
        }
        if (u.a(locala.pj) == null) {
          break label245;
        }
        localObject = u.a(locala.pj).mFragmentManager.nZ;
        u.a(locala.pj).mFragmentManager.nZ = "onLoaderReset";
      }
      for (;;)
      {
        if (u.a(locala.pj) != null) {
          u.a(locala.pj).mFragmentManager.nZ = ((String)localObject);
        }
        locala.pb = null;
        locala.mData = null;
        locala.pd = false;
        if (locala.pc != null)
        {
          if (locala.ph)
          {
            locala.ph = false;
            locala.pc.a(locala);
            locala.pc.a(locala);
          }
          localObject = locala.pc;
          ((android.support.v4.content.c)localObject).onReset();
          ((android.support.v4.content.c)localObject).qZ = true;
          ((android.support.v4.content.c)localObject).mg = false;
          ((android.support.v4.content.c)localObject).qY = false;
          ((android.support.v4.content.c)localObject).ra = false;
          ((android.support.v4.content.c)localObject).rb = false;
        }
        if (locala.pi != null)
        {
          locala = locala.pi;
          break;
        }
        return;
        label245:
        localObject = null;
      }
    }
    
    public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      String str = paramString;
      paramString = this;
      for (;;)
      {
        paramPrintWriter.print(str);
        paramPrintWriter.print("mId=");
        paramPrintWriter.print(paramString.mId);
        paramPrintWriter.print(" mArgs=");
        paramPrintWriter.println(paramString.pa);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mCallbacks=");
        paramPrintWriter.println(paramString.pb);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mLoader=");
        paramPrintWriter.println(paramString.pc);
        if (paramString.pc != null) {
          paramString.pc.dump(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
        if ((paramString.pd) || (paramString.pe))
        {
          paramPrintWriter.print(str);
          paramPrintWriter.print("mHaveData=");
          paramPrintWriter.print(paramString.pd);
          paramPrintWriter.print("  mDeliveredData=");
          paramPrintWriter.println(paramString.pe);
          paramPrintWriter.print(str);
          paramPrintWriter.print("mData=");
          paramPrintWriter.println(paramString.mData);
        }
        paramPrintWriter.print(str);
        paramPrintWriter.print("mStarted=");
        paramPrintWriter.print(paramString.mg);
        paramPrintWriter.print(" mReportNextStart=");
        paramPrintWriter.print(paramString.pg);
        paramPrintWriter.print(" mDestroyed=");
        paramPrintWriter.println(paramString.nY);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mRetaining=");
        paramPrintWriter.print(paramString.mRetaining);
        paramPrintWriter.print(" mRetainingStarted=");
        paramPrintWriter.print(paramString.pf);
        paramPrintWriter.print(" mListenerRegistered=");
        paramPrintWriter.println(paramString.ph);
        if (paramString.pi == null) {
          break;
        }
        paramPrintWriter.print(str);
        paramPrintWriter.println("Pending Loader ");
        paramPrintWriter.print(paramString.pi);
        paramPrintWriter.println(":");
        paramString = paramString.pi;
        str = str + "  ";
      }
    }
    
    final void start()
    {
      if ((this.mRetaining) && (this.pf)) {
        this.mg = true;
      }
      do
      {
        do
        {
          return;
        } while (this.mg);
        this.mg = true;
        if (u.DEBUG) {
          new StringBuilder("  Starting: ").append(this);
        }
        if ((this.pc == null) && (this.pb != null)) {
          this.pc = this.pb.X(this.mId);
        }
      } while (this.pc == null);
      if ((this.pc.getClass().isMemberClass()) && (!Modifier.isStatic(this.pc.getClass().getModifiers()))) {
        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.pc);
      }
      if (!this.ph)
      {
        localc = this.pc;
        int i = this.mId;
        if (localc.qW != null) {
          throw new IllegalStateException("There is already a listener registered");
        }
        localc.qW = this;
        localc.mId = i;
        localc = this.pc;
        if (localc.qX != null) {
          throw new IllegalStateException("There is already a listener registered");
        }
        localc.qX = this;
        this.ph = true;
      }
      android.support.v4.content.c localc = this.pc;
      localc.mg = true;
      localc.qZ = false;
      localc.qY = false;
      localc.onStartLoading();
    }
    
    final void stop()
    {
      if (u.DEBUG) {
        new StringBuilder("  Stopping: ").append(this);
      }
      this.mg = false;
      if ((!this.mRetaining) && (this.pc != null) && (this.ph))
      {
        this.ph = false;
        this.pc.a(this);
        this.pc.a(this);
        android.support.v4.content.c localc = this.pc;
        localc.mg = false;
        localc.onStopLoading();
      }
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("LoaderInfo{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mId);
      localStringBuilder.append(" : ");
      android.support.v4.e.c.a(this.pc, localStringBuilder);
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */