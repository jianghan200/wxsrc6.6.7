package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.ApplicationInfo;
import android.os.Looper;
import android.util.LruCache;
import com.tencent.mm.sdk.f.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class an
  implements SharedPreferences
{
  private static ag sHn = null;
  private static final Object sHv = new Object();
  private static final LruCache<String, an> sHx = new LruCache(5);
  private Map<String, Object> dmW = null;
  private boolean dpK = false;
  private File fgV = null;
  private int mMode = 0;
  private FLock sHo = null;
  private File sHp = null;
  private boolean sHq = false;
  private int sHr = 0;
  private long sHs = 0L;
  private long sHt = 0L;
  private final Object sHu = new Object();
  private final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> sHw = new WeakHashMap();
  
  private an()
  {
    throw new RuntimeException("Not supported.");
  }
  
  private an(Context paramContext, String paramString, int paramInt)
  {
    Context localContext = paramContext.getApplicationContext();
    if (sHn == null) {
      sHn = new ag(Looper.getMainLooper());
    }
    String str = localContext.getApplicationInfo().dataDir;
    if (str != null)
    {
      paramContext = str;
      if (str.length() != 0) {}
    }
    else
    {
      x.w("MicroMsg.MultiProcSharedPreferences", "Failed to retrive data path by ApplicationInfo.dataDir, use prefix hardcoded version instead.");
      paramContext = "/data/data/" + localContext.getPackageName();
    }
    x.i("MicroMsg.MultiProcSharedPreferences", "Path to store sp data: " + paramContext);
    paramContext = new File(paramContext, "shared_prefs");
    if (!paramContext.exists())
    {
      paramContext.mkdirs();
      this.fgV = new File(paramContext, paramString + ".xml");
      paramContext = this.fgV;
      this.sHp = new File(paramContext.getPath() + ".bak");
      this.mMode = paramInt;
      if ((paramInt & 0x4) == 0) {
        break label367;
      }
    }
    label367:
    for (boolean bool = true;; bool = false)
    {
      this.sHq = bool;
      if (this.sHq) {
        this.sHo = new FLock(this.fgV.getPath() + ".lock");
      }
      cir();
      return;
      if ((paramContext.canRead()) && (paramContext.canWrite())) {
        break;
      }
      paramContext.setReadable(true, true);
      paramContext.setWritable(true, true);
      break;
    }
  }
  
  private void cir()
  {
    try
    {
      this.dpK = false;
      e.b(new Runnable()
      {
        public final void run()
        {
          synchronized (an.this)
          {
            an.a(an.this);
            return;
          }
        }
      }, "MultiProcessSP-LoadThread").start();
      return;
    }
    finally {}
  }
  
  private void cis()
  {
    while (!this.dpK) {
      try
      {
        wait();
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
  
  public static SharedPreferences m(Context paramContext, String paramString, int paramInt)
  {
    int i = 1;
    if (a.ciu())
    {
      x.i("MicroMsg.MultiProcSharedPreferences", "sp: %s, use Flock version MultiProcessSP.", new Object[] { paramString });
      an localan = (an)sHx.get(paramString);
      if (localan == null)
      {
        paramContext = new an(paramContext, paramString, paramInt);
        sHx.put(paramString, paramContext);
      }
      do
      {
        return paramContext;
        paramContext = localan;
      } while ((paramInt & 0x4) == 0);
      for (;;)
      {
        try
        {
          if (localan.sHr <= 0)
          {
            paramInt = i;
            if (localan.sHs == localan.fgV.lastModified())
            {
              if (localan.sHt != localan.fgV.length()) {
                paramInt = i;
              }
            }
            else
            {
              if (paramInt != 0) {
                break;
              }
              return localan;
            }
          }
        }
        finally {}
        paramInt = 0;
      }
      localan.cir();
      return localan;
    }
    x.i("MicroMsg.MultiProcSharedPreferences", "sp: %s, use system sp.", new Object[] { paramString });
    return paramContext.getSharedPreferences(paramString, paramInt);
  }
  
  public final boolean contains(String paramString)
  {
    try
    {
      cis();
      boolean bool = this.dmW.containsKey(paramString);
      return bool;
    }
    finally {}
  }
  
  public final SharedPreferences.Editor edit()
  {
    try
    {
      cis();
      return new b((byte)0);
    }
    finally {}
  }
  
  public final Map<String, ?> getAll()
  {
    try
    {
      cis();
      HashMap localHashMap = new HashMap(this.dmW);
      return localHashMap;
    }
    finally {}
  }
  
  public final boolean getBoolean(String paramString, boolean paramBoolean)
  {
    try
    {
      cis();
      paramString = (Boolean)this.dmW.get(paramString);
      if (paramString != null) {
        paramBoolean = paramString.booleanValue();
      }
      return paramBoolean;
    }
    finally {}
  }
  
  public final float getFloat(String paramString, float paramFloat)
  {
    try
    {
      cis();
      paramString = (Float)this.dmW.get(paramString);
      if (paramString != null) {
        paramFloat = paramString.floatValue();
      }
      return paramFloat;
    }
    finally {}
  }
  
  public final int getInt(String paramString, int paramInt)
  {
    try
    {
      cis();
      paramString = (Integer)this.dmW.get(paramString);
      if (paramString != null) {
        paramInt = paramString.intValue();
      }
      return paramInt;
    }
    finally {}
  }
  
  public final long getLong(String paramString, long paramLong)
  {
    try
    {
      cis();
      paramString = (Long)this.dmW.get(paramString);
      if (paramString != null) {
        paramLong = paramString.longValue();
      }
      return paramLong;
    }
    finally {}
  }
  
  public final String getString(String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        cis();
        paramString1 = (String)this.dmW.get(paramString1);
        if (paramString1 != null) {
          return paramString1;
        }
      }
      finally {}
      paramString1 = paramString2;
    }
  }
  
  public final Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    for (;;)
    {
      try
      {
        cis();
        paramString = (Set)this.dmW.get(paramString);
        if (paramString != null) {
          return paramString;
        }
      }
      finally {}
      paramString = paramSet;
    }
  }
  
  public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    try
    {
      this.sHw.put(paramOnSharedPreferenceChangeListener, sHv);
      return;
    }
    finally {}
  }
  
  public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    try
    {
      this.sHw.remove(paramOnSharedPreferenceChangeListener);
      return;
    }
    finally {}
  }
  
  public static final class a
  {
    private static SharedPreferences mPref = ad.getContext().getSharedPreferences("pref_MultiProcSP_dyncfg", 4);
    public static String sHA = "pref_key_is_disabled_MultiProcSP_manually";
    public static String sHz = "pref_key_is_enable_MultiProcSP";
    
    private static boolean Wt(String paramString)
    {
      SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("pref_MultiProcSP_dyncfg", 4);
      mPref = localSharedPreferences;
      if (localSharedPreferences == null)
      {
        x.w("MicroMsg.MultiProcSharedPreferences", "SharedPreferences in DynamicConfigStorage initialize failed.");
        return false;
      }
      boolean bool = mPref.getBoolean(paramString, false);
      x.d("MicroMsg.MultiProcSharedPreferences", "DynamicConfigStorage, getValue:%b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    
    public static boolean ciu()
    {
      return (!Wt(sHA)) && (Wt(sHz));
    }
    
    public static void lf(boolean paramBoolean)
    {
      setValue(sHA, paramBoolean);
    }
    
    public static void setValue(String paramString, boolean paramBoolean)
    {
      if (mPref == null)
      {
        x.w("MicroMsg.MultiProcSharedPreferences", "SharedPreferences in DynamicConfigStorage initialize failed.");
        return;
      }
      SharedPreferences.Editor localEditor = mPref.edit();
      localEditor.putBoolean(paramString, paramBoolean);
      localEditor.commit();
    }
  }
  
  private final class b
    implements SharedPreferences.Editor
  {
    private final Map<String, Object> sHB = new HashMap();
    private boolean sHC = false;
    
    private b() {}
    
    private FileOutputStream M(File paramFile)
    {
      try
      {
        FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
        return localFileOutputStream;
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        Object localObject = paramFile.getParentFile();
        if (!((File)localObject).mkdir())
        {
          x.e("MicroMsg.MultiProcSharedPreferences", "Couldn't create directory for SharedPreferences file " + paramFile);
          return null;
        }
        an.e((File)localObject, an.h(an.this));
        try
        {
          localObject = new FileOutputStream(paramFile);
          return (FileOutputStream)localObject;
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          x.e("MicroMsg.MultiProcSharedPreferences", "Couldn't create SharedPreferences file " + paramFile, new Object[] { localFileNotFoundException2 });
        }
      }
      return null;
    }
    
    private void a(final an.c paramc)
    {
      if ((paramc.dba == null) || (paramc.sHI == null) || (paramc.sHI.size() == 0)) {}
      for (;;)
      {
        return;
        if (Looper.myLooper() != Looper.getMainLooper()) {
          break;
        }
        int i = paramc.sHI.size() - 1;
        while (i >= 0)
        {
          String str = (String)paramc.sHI.get(i);
          Iterator localIterator = paramc.dba.iterator();
          while (localIterator.hasNext())
          {
            SharedPreferences.OnSharedPreferenceChangeListener localOnSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener)localIterator.next();
            if (localOnSharedPreferenceChangeListener != null) {
              localOnSharedPreferenceChangeListener.onSharedPreferenceChanged(an.this, str);
            }
          }
          i -= 1;
        }
      }
      an.cit().post(new Runnable()
      {
        public final void run()
        {
          an.b.b(an.b.this, paramc);
        }
      });
    }
    
    private void a(final an.c paramc, Runnable arg2)
    {
      int j = 1;
      paramc = new Runnable()
      {
        public final void run()
        {
          synchronized (an.f(an.this))
          {
            an.b.a(an.b.this, paramc);
          }
          synchronized (an.this)
          {
            an.g(an.this);
            if (paramRunnable != null) {
              paramRunnable.run();
            }
            return;
            localObject2 = finally;
            throw ((Throwable)localObject2);
          }
        }
      };
      int i;
      if (??? == null) {
        i = 1;
      }
      while (i != 0) {
        synchronized (an.this)
        {
          if (an.b(an.this) == 1)
          {
            i = j;
            if (i != 0)
            {
              paramc.run();
              return;
              i = 0;
            }
          }
          else
          {
            i = 0;
          }
        }
      }
      au.ciA().execute(paramc);
    }
    
    private an.c civ()
    {
      an.c localc1 = new an.c((byte)0);
      for (;;)
      {
        Object localObject2;
        String str;
        synchronized (an.this)
        {
          if (an.b(an.this) > 0) {
            an.a(an.this, new HashMap(an.c(an.this)));
          }
          localc1.sHJ = an.c(an.this);
          an.d(an.this);
          if (an.e(an.this).size() > 0)
          {
            i = 1;
            if (i != 0)
            {
              localc1.sHI = new ArrayList();
              localc1.dba = new HashSet(an.e(an.this).keySet());
            }
            try
            {
              if (this.sHC)
              {
                if (!an.c(an.this).isEmpty())
                {
                  localc1.sHH = true;
                  an.c(an.this).clear();
                }
                this.sHC = false;
              }
              Iterator localIterator = this.sHB.entrySet().iterator();
              if (!localIterator.hasNext()) {
                break;
              }
              localObject2 = (Map.Entry)localIterator.next();
              str = (String)((Map.Entry)localObject2).getKey();
              localObject2 = ((Map.Entry)localObject2).getValue();
              if (localObject2 != this) {
                break label300;
              }
              if (!an.c(an.this).containsKey(str)) {
                continue;
              }
              an.c(an.this).remove(str);
              localc1.sHH = true;
              if (i == 0) {
                continue;
              }
              localc1.sHI.add(str);
              continue;
              localc2 = finally;
            }
            finally {}
          }
        }
        int i = 0;
        continue;
        label300:
        if (an.c(an.this).containsKey(str))
        {
          Object localObject3 = an.c(an.this).get(str);
          if ((localObject3 != null) && (localObject3.equals(localObject2))) {}
        }
        else
        {
          an.c(an.this).put(str, localObject2);
        }
      }
      this.sHB.clear();
      return localc2;
    }
    
    public final void apply()
    {
      final an.c localc = civ();
      final Runnable local1 = new Runnable()
      {
        public final void run()
        {
          try
          {
            localc.sHK.await();
            return;
          }
          catch (InterruptedException localInterruptedException) {}
        }
      };
      au.O(local1);
      a(localc, new Runnable()
      {
        public final void run()
        {
          local1.run();
          au.P(local1);
        }
      });
      a(localc);
    }
    
    public final SharedPreferences.Editor clear()
    {
      try
      {
        this.sHC = true;
        return this;
      }
      finally {}
    }
    
    public final boolean commit()
    {
      an.c localc = civ();
      a(localc, null);
      try
      {
        localc.sHK.await();
        a(localc);
        return localc.sHL;
      }
      catch (InterruptedException localInterruptedException) {}
      return false;
    }
    
    public final SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
    {
      try
      {
        this.sHB.put(paramString, Boolean.valueOf(paramBoolean));
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putFloat(String paramString, float paramFloat)
    {
      try
      {
        this.sHB.put(paramString, Float.valueOf(paramFloat));
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putInt(String paramString, int paramInt)
    {
      try
      {
        this.sHB.put(paramString, Integer.valueOf(paramInt));
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putLong(String paramString, long paramLong)
    {
      try
      {
        this.sHB.put(paramString, Long.valueOf(paramLong));
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putString(String paramString1, String paramString2)
    {
      try
      {
        this.sHB.put(paramString1, paramString2);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
    {
      try
      {
        this.sHB.put(paramString, paramSet);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor remove(String paramString)
    {
      try
      {
        this.sHB.put(paramString, this);
        return this;
      }
      finally {}
    }
  }
  
  private static final class c
  {
    public Set<SharedPreferences.OnSharedPreferenceChangeListener> dba = null;
    public boolean sHH = false;
    public List<String> sHI = null;
    public Map<String, Object> sHJ = null;
    public final CountDownLatch sHK = new CountDownLatch(1);
    public volatile boolean sHL = false;
    
    public final void lg(boolean paramBoolean)
    {
      this.sHL = paramBoolean;
      this.sHK.countDown();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */