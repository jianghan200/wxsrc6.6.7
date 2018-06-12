package com.tencent.c.b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.c.d.a.c;
import com.tencent.c.d.a.e;
import com.tencent.c.d.a.g;
import com.tencent.c.d.b.d.a;
import com.tencent.c.f.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public Context mContext = null;
  public b vhS;
  
  public a(Context paramContext)
  {
    this.mContext = paramContext;
    this.vhS = new b(paramContext);
  }
  
  public static com.tencent.c.c.b.b a(Context paramContext, com.tencent.c.a.a parama, int paramInt)
  {
    if (parama == null) {
      return null;
    }
    com.tencent.c.c.b.b localb = new com.tencent.c.c.b.b();
    localb.viC = paramInt;
    localb.viD = null;
    localb.viE = parama.byT;
    Object localObject = parama.vhN;
    if (localObject == null)
    {
      localObject = null;
      localb.viF = ((byte[])localObject);
      paramContext = com.tencent.c.f.a.bJ(paramContext, parama.byT);
      if (paramContext.size() > 1)
      {
        localb.viU = new ArrayList();
        paramContext = paramContext.iterator();
        while (paramContext.hasNext())
        {
          localObject = (byte[])paramContext.next();
          localb.viU.add(localObject);
        }
      }
    }
    else
    {
      int i = ((String)localObject).length() / 2;
      byte[] arrayOfByte = new byte[i];
      char[] arrayOfChar = ((String)localObject).toCharArray();
      paramInt = 0;
      for (;;)
      {
        localObject = arrayOfByte;
        if (paramInt >= i) {
          break;
        }
        int j = paramInt * 2;
        int k = (byte)"0123456789ABCDEF".indexOf(arrayOfChar[j]);
        arrayOfByte[paramInt] = ((byte)((byte)"0123456789ABCDEF".indexOf(arrayOfChar[(j + 1)]) | k << 4));
        paramInt += 1;
      }
    }
    localb.viG = parama.fileSize;
    localb.viH = parama.vhM;
    localb.viI = parama.versionCode;
    localb.viJ = parama.versionName;
    localb.viK = 0;
    if (parama.dPU == 1) {
      localb.viK |= 0x1;
    }
    localb.viK |= 0x2;
    if ((!parama.vhO.startsWith("/data")) && (!parama.vhO.startsWith("/system"))) {
      localb.viK |= 0x4;
    }
    localb.viL = com.tencent.c.f.a.act(parama.vhO);
    localb.viM = 0;
    localb.viN = 0;
    localb.viO = 0;
    localb.viP = null;
    localb.viQ = 0;
    localb.viR = false;
    localb.viS = 0;
    localb.viT = 0;
    return localb;
  }
  
  public static com.tencent.c.c.b.d cFc()
  {
    com.tencent.c.c.b.d locald = new com.tencent.c.c.b.d();
    for (;;)
    {
      int i;
      try
      {
        locald.vjk = Build.FINGERPRINT;
        locald.vjl = com.tencent.c.f.d.cFw();
        locald.dMB = Build.BRAND;
        locald.model = Build.MODEL;
        locald.vjm = Build.VERSION.SDK_INT;
        locald.vjn = Build.CPU_ABI;
        locald.platform = com.tencent.c.f.d.acu("ro.board.platform");
        if (com.tencent.c.d.a.f.cFg())
        {
          i = 2;
          locald.root = i;
          return locald;
        }
        Object localObject2 = com.tencent.c.d.b.d.cFh();
        if (!((Collection)localObject2).isEmpty()) {
          break label358;
        }
        i = 1;
        if (i != 0) {
          break label372;
        }
        Object localObject1 = new ArrayList(3);
        ((List)localObject1).add(new g());
        ((List)localObject1).add(new com.tencent.c.d.a.d());
        if (com.tencent.c.d.b.f.cFi()) {
          ((List)localObject1).add(new c());
        }
        localObject2 = ((List)localObject2).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          d.a locala = (d.a)((Iterator)localObject2).next();
          if (locala == null) {
            continue;
          }
          Iterator localIterator = ((List)localObject1).iterator();
          if (localIterator.hasNext())
          {
            ((com.tencent.c.d.a.b)localIterator.next()).a(locala);
            continue;
          }
          continue;
        }
        localObject1 = ((List)localObject1).iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label372;
        }
        if (!((com.tencent.c.d.a.b)((Iterator)localObject1).next()).cFe()) {
          continue;
        }
        i = 1;
      }
      catch (Exception localException)
      {
        return locald;
      }
      if (e.cFf())
      {
        i = 1;
      }
      else
      {
        if (!com.tencent.c.d.a.a.aco("/system/bin/debuggerd"))
        {
          i = 1;
        }
        else if (!com.tencent.c.d.a.a.aco("/system/bin/debuggerd64"))
        {
          i = 1;
        }
        else if (!com.tencent.c.d.a.a.aco("/system/bin/ddexe"))
        {
          i = 1;
        }
        else if (!com.tencent.c.d.a.a.acp("/system/etc/install-recovery.sh"))
        {
          i = 1;
        }
        else if (!com.tencent.c.d.a.a.acp("/system/bin/install-recovery.sh"))
        {
          i = 1;
        }
        else
        {
          h.i("BootScriptChecker : everything seems ok");
          i = 0;
          break label377;
          i = 0;
          continue;
          label358:
          i = 0;
          continue;
          for (;;)
          {
            if (i == 0) {
              break label375;
            }
            i = 2;
            break;
            label372:
            i = 0;
          }
          label375:
          continue;
        }
        label377:
        if (i != 0) {
          i = 1;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/c/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */