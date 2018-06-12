package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class dr
{
  private Context a = null;
  
  public dr(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramInt != 101) {
      ct.c("com strategy unmatch key: %d", new Object[] { Integer.valueOf(paramInt) });
    }
    ch localch;
    Object localObject1;
    int i;
    for (;;)
    {
      return;
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
      {
        localch = cf.a(this.a).e();
        if (localch == null)
        {
          ct.c("imposible! common strategy null!", new Object[0]);
          return;
        }
        try
        {
          localObject1 = new cr();
          ((cr)localObject1).a(new cv(paramArrayOfByte));
          if (localch == null)
          {
            i = 0;
            if (i == 0) {
              continue;
            }
            if (paramBoolean)
            {
              ct.e("update common strategy should save ", new Object[0]);
              localObject1 = this.a;
              if (paramArrayOfByte != null)
              {
                localObject2 = new cl();
                ((cl)localObject2).a(paramInt);
                ((cl)localObject2).a(paramArrayOfByte);
                e.a((Context)localObject1, (cl)localObject2);
              }
            }
            ct.e("com strategy changed notify! ", new Object[0]);
            paramArrayOfByte = cf.a(this.a);
            paramArrayOfByte.a(localch);
            if (!paramBoolean) {
              continue;
            }
            paramArrayOfByte.b();
          }
        }
        catch (Throwable paramArrayOfByte)
        {
          ct.a(paramArrayOfByte);
          ct.d("error to common strategy!", new Object[0]);
          return;
        }
      }
    }
    int k = 0;
    if (!((cr)localObject1).c.equals(localch.b()))
    {
      ct.b("strategy url changed to: %s", new Object[] { ((cr)localObject1).c });
      k = 1;
      localch.a(((cr)localObject1).c);
    }
    if (((cr)localObject1).b != localch.c())
    {
      ct.b("QueryPeriod changed to: %d", new Object[] { Integer.valueOf(((cr)localObject1).b) });
      k = 1;
      localch.a(((cr)localObject1).b);
    }
    Object localObject2 = ((cr)localObject1).a;
    label306:
    Object localObject3;
    int m;
    label350:
    int j;
    label383:
    boolean bool;
    label454:
    label676:
    label723:
    label759:
    label836:
    label935:
    int n;
    if (localch == null)
    {
      i = 0;
      break label1142;
      localObject1 = ((cr)localObject1).d;
      if (localch == null)
      {
        i = 0;
        break label1153;
      }
    }
    else
    {
      i = 0;
      if (localObject2 != null)
      {
        localObject3 = localch.e();
        if (localObject3 == null) {
          break label1142;
        }
        m = 0;
        i = 0;
        j = i;
        if (m >= ((SparseArray)localObject3).size()) {
          break label1138;
        }
        ch.a locala = (ch.a)((SparseArray)localObject3).valueAt(m);
        Iterator localIterator = ((ArrayList)localObject2).iterator();
        if (!localIterator.hasNext()) {
          break label1177;
        }
        cs localcs = (cs)localIterator.next();
        j = i;
        if (localcs.a != locala.e()) {
          break label1164;
        }
        ct.a("server module strategy mid: %d", new Object[] { Byte.valueOf(localcs.a) });
        if (localcs.b != 1) {
          break label1171;
        }
        bool = true;
        if (locala.a() != bool)
        {
          ct.b("mid: %d , isUsable changed: %b ", new Object[] { Byte.valueOf(localcs.a), Boolean.valueOf(bool) });
          i = 1;
          locala.a(bool);
        }
        j = i;
        if (!locala.b().equals(localcs.c))
        {
          ct.b("mid: %d , url changed: %s", new Object[] { Byte.valueOf(localcs.a), localcs.c });
          j = 1;
          locala.a(localcs.c);
        }
        if (localcs.a != 1)
        {
          i = j;
          if (localcs.a != 2) {}
        }
        else
        {
          if ((locala.c() == null) || (localcs.d == null)) {
            break label836;
          }
          i = j;
          if (!locala.c().equals(localcs.d))
          {
            ct.b("mid: %d , detail changed...", new Object[] { Byte.valueOf(localcs.a) });
            i = 1;
            locala.a(localcs.d);
            cf.a(this.a).a(localcs.a, localcs.d);
          }
        }
        j = i;
        if (localcs.a != 1) {
          break label1164;
        }
        if ((locala.d() != null) && (localcs.e != null))
        {
          if (!locala.d().equals(localcs.e))
          {
            ct.b("mid: %d , PreventEventCode changed...", new Object[] { Byte.valueOf(localcs.a) });
            i = 1;
            locala.a(e.a(localcs.e));
          }
          if ((locala.f() == null) || (localcs.f == null)) {
            break label935;
          }
          j = i;
          if (locala.f().equals(localcs.f)) {
            break label1164;
          }
        }
        for (;;)
        {
          ct.b("mid: %d , SampleEventSet changed...", new Object[] { Byte.valueOf(localcs.a) });
          j = 1;
          locala.b(e.a(localcs.f));
          break label1164;
          i = j;
          if (localcs.d == null) {
            break label676;
          }
          i = j;
          if (locala.c() != null) {
            break label676;
          }
          ct.b("mid: %d , detail changed...", new Object[] { Byte.valueOf(localcs.a) });
          i = 1;
          locala.a(localcs.d);
          cf.a(this.a).a(localcs.a, localcs.d);
          break label676;
          if (locala.d() != null) {
            break label723;
          }
          if (localcs.e == null) {
            break label759;
          }
          break label723;
          if (locala.f() == null) {
            if (localcs.f == null) {
              break;
            }
          }
        }
      }
      localObject2 = localch.e();
      if (localObject2 == null) {
        break label1142;
      }
      n = ((SparseArray)localObject2).size();
      m = 0;
      i = 0;
    }
    for (;;)
    {
      j = i;
      if (m < n)
      {
        localObject3 = (ch.a)((SparseArray)localObject2).valueAt(m);
        if (!((ch.a)localObject3).a()) {
          break label1186;
        }
        ct.b("mid: %d , server not response strategy, sdk local close it!", new Object[] { Integer.valueOf(((ch.a)localObject3).e()) });
        i = 1;
        ((ch.a)localObject3).a(false);
        break label1186;
        k = 0;
        if ((localObject1 != null) && (localch.d() != null))
        {
          i = k;
          if (!((Map)localObject1).equals(localch.d()))
          {
            localch.a((Map)localObject1);
            i = 1;
          }
        }
        else
        {
          i = k;
          if (localObject1 != null)
          {
            i = k;
            if (localch.d() == null)
            {
              localch.a((Map)localObject1);
              i = 1;
            }
          }
        }
      }
      label1138:
      label1142:
      label1153:
      while (i == 0)
      {
        i = j;
        break;
        do
        {
          j = k;
          break;
          i = j;
        } while (i == 0);
        j = 1;
        break label306;
      }
      i = 1;
      break;
      label1164:
      i = j;
      break label383;
      label1171:
      bool = false;
      break label454;
      label1177:
      m += 1;
      break label350;
      label1186:
      m += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */