package com.tencent.mm.app.plugin;

import android.content.Context;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.d.b;
import com.tencent.mm.pluginsdk.ui.d.g;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

public final class d
  implements b
{
  private static d bAo = null;
  URISpanHandlerSet bAp;
  ArrayList<URISpanHandlerSet.BaseUriSpanHandler> bAq = new ArrayList();
  ArrayList<URISpanHandlerSet.BaseUriSpanHandler> bAr = new ArrayList();
  ArrayList<URISpanHandlerSet.BaseUriSpanHandler> bAs = new ArrayList();
  Context mContext = null;
  
  private d()
  {
    long l = bi.VF();
    x.d("MicroMsg.URISpanHandler", "init URISpanHandler");
    this.mContext = ad.getContext();
    this.bAp = new URISpanHandlerSet(this.mContext);
    Class[] arrayOfClass = URISpanHandlerSet.class.getDeclaredClasses();
    int j = arrayOfClass.length;
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        Class localClass = arrayOfClass[i];
        if ((localClass != null) && (localClass.getSuperclass() != null) && (localClass.isAnnotationPresent(URISpanHandlerSet.a.class)) && (localClass.getSuperclass().getName().equals(URISpanHandlerSet.BaseUriSpanHandler.class.getName())))
        {
          for (;;)
          {
            Object localObject2;
            try
            {
              Object localObject1 = (URISpanHandlerSet.a)localClass.getAnnotation(URISpanHandlerSet.a.class);
              localObject2 = localClass.getDeclaredConstructor(new Class[] { URISpanHandlerSet.class });
              if (localObject2 == null) {
                break;
              }
              localObject2 = (URISpanHandlerSet.BaseUriSpanHandler)URISpanHandlerSet.BaseUriSpanHandler.class.cast(((Constructor)localObject2).newInstance(new Object[] { this.bAp }));
              localObject1 = ((URISpanHandlerSet.a)localObject1).vC();
              if (localObject1 == URISpanHandlerSet.PRIORITY.LOW)
              {
                this.bAs.add(localObject2);
                x.d("MicroMsg.URISpanHandler", "successfully add: %s", new Object[] { localClass.getName() });
                break label392;
              }
              if (localObject1 == URISpanHandlerSet.PRIORITY.NORMAL)
              {
                this.bAr.add(localObject2);
                continue;
              }
              if (localException != URISpanHandlerSet.PRIORITY.HIGH) {
                continue;
              }
            }
            catch (Exception localException)
            {
              x.printErrStackTrace("MicroMsg.URISpanHandler", localException, "", new Object[0]);
              x.d("MicroMsg.URISpanHandler", "add %s error: %s, errorType:%s", new Object[] { localClass.getName(), localException.getMessage(), localException.getClass().getName() });
            }
            this.bAq.add(localObject2);
          }
          x.d("MicroMsg.URISpanHandler", "failed to add %s, constructor is null!!", new Object[] { localClass.getName() });
        }
      }
      else
      {
        x.d("MicroMsg.URISpanHandler", "init URISpanHandler used :%d ms", new Object[] { Long.valueOf(bi.VF() - l) });
        return;
      }
      label392:
      i += 1;
    }
  }
  
  private static boolean c(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool2 = false;
    int j = paramArrayOfInt.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramArrayOfInt[i] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static d vA()
  {
    if (bAo == null) {
      bAo = new d();
    }
    return bAo;
  }
  
  public final boolean a(Context paramContext, m paramm, g paramg)
  {
    if (paramm == null)
    {
      x.d("MicroMsg.URISpanHandler", "handleSpanClick, hrefInfo is null");
      return false;
    }
    int i = paramm.type;
    if (paramg == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.URISpanHandler", "handleSpanClick, hrefInfo.getType:%d, callback==null:%b, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size:%d, mLowPriorityHandlerList.size:%d", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool), Integer.valueOf(this.bAq.size()), Integer.valueOf(this.bAr.size()), Integer.valueOf(this.bAs.size()) });
      if (paramContext != null) {
        break;
      }
      x.e("MicroMsg.URISpanHandler", "handleSpanClick, context is null!");
      this.bAp.mContext = null;
      return false;
    }
    this.mContext = paramContext;
    this.bAp.mContext = this.mContext;
    paramContext = this.bAq.iterator();
    URISpanHandlerSet.BaseUriSpanHandler localBaseUriSpanHandler;
    while (paramContext.hasNext())
    {
      localBaseUriSpanHandler = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
      if ((c(localBaseUriSpanHandler.vB(), paramm.type)) && (localBaseUriSpanHandler.a(paramm, paramg)))
      {
        x.d("MicroMsg.URISpanHandler", "handleSpanClick, %s handle", new Object[] { localBaseUriSpanHandler.getClass().getName() });
        this.mContext = null;
        this.bAp.mContext = null;
        return true;
      }
    }
    paramContext = this.bAr.iterator();
    while (paramContext.hasNext())
    {
      localBaseUriSpanHandler = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
      if ((c(localBaseUriSpanHandler.vB(), paramm.type)) && (localBaseUriSpanHandler.a(paramm, paramg)))
      {
        x.d("MicroMsg.URISpanHandler", "handleSpanClick, %s handle", new Object[] { localBaseUriSpanHandler.getClass().getName() });
        this.mContext = null;
        this.bAp.mContext = null;
        return true;
      }
    }
    paramContext = this.bAs.iterator();
    while (paramContext.hasNext())
    {
      localBaseUriSpanHandler = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
      if ((c(localBaseUriSpanHandler.vB(), paramm.type)) && (localBaseUriSpanHandler.a(paramm, paramg)))
      {
        x.d("MicroMsg.URISpanHandler", "handleSpanClick, %s handle", new Object[] { localBaseUriSpanHandler.getClass().getName() });
        this.mContext = null;
        this.bAp.mContext = null;
        return true;
      }
    }
    this.mContext = null;
    this.bAp.mContext = null;
    x.d("MicroMsg.URISpanHandler", "handleSpanClick, nothing handle");
    return false;
  }
  
  public final m u(Context paramContext, String paramString)
  {
    x.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, url:%s, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size:%d, mLowPriorityHandlerList.size：%d", new Object[] { paramString, Integer.valueOf(this.bAq.size()), Integer.valueOf(this.bAr.size()), Integer.valueOf(this.bAs.size()) });
    if (paramContext == null)
    {
      x.e("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl error, context is null!");
      this.bAp.mContext = null;
      return null;
    }
    this.mContext = paramContext;
    this.bAp.mContext = this.mContext;
    if (bi.oW(paramString))
    {
      x.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, url is null");
      this.mContext = null;
      this.bAp.mContext = null;
      return null;
    }
    paramContext = this.bAq.iterator();
    m localm;
    while (paramContext.hasNext())
    {
      localm = ((URISpanHandlerSet.BaseUriSpanHandler)paramContext.next()).db(paramString);
      if (localm != null)
      {
        x.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, result.type:%d", new Object[] { Integer.valueOf(localm.type) });
        this.mContext = null;
        this.bAp.mContext = null;
        return localm;
      }
    }
    paramContext = this.bAr.iterator();
    while (paramContext.hasNext())
    {
      localm = ((URISpanHandlerSet.BaseUriSpanHandler)paramContext.next()).db(paramString);
      if (localm != null)
      {
        x.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, result.type:%d", new Object[] { Integer.valueOf(localm.type) });
        this.mContext = null;
        this.bAp.mContext = null;
        return localm;
      }
    }
    paramContext = this.bAs.iterator();
    while (paramContext.hasNext())
    {
      localm = ((URISpanHandlerSet.BaseUriSpanHandler)paramContext.next()).db(paramString);
      if (localm != null)
      {
        x.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, result.type:%d", new Object[] { Integer.valueOf(localm.type) });
        this.mContext = null;
        this.bAp.mContext = null;
        return localm;
      }
    }
    this.mContext = null;
    this.bAp.mContext = null;
    x.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, nothing match");
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/app/plugin/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */