package com.tencent.mm.plugin.clean.c;

import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class f
  extends Thread
{
  private int hQQ = 0;
  private int hQR = 0;
  private h hRg;
  private HashSet<String> hRl;
  private boolean isStop = false;
  
  public f(HashSet<String> paramHashSet, h paramh)
  {
    this.hRl = paramHashSet;
    this.hRg = paramh;
  }
  
  private int a(File paramFile, PInt paramPInt, PLong paramPLong)
  {
    int j = 0;
    int i = paramPInt.value;
    Object localObject;
    if (paramFile != null)
    {
      localObject = paramFile.getAbsolutePath();
      x.d("MicroMsg.DeleteOtherAccController", "delete [%d] [%s]", new Object[] { Integer.valueOf(i), localObject });
      if (paramPInt.value < 10) {
        break label77;
      }
      if (!this.isStop) {
        break label72;
      }
      i = -1;
    }
    label72:
    label77:
    do
    {
      do
      {
        return i;
        localObject = "null";
        break;
        paramPInt.value = 0;
        i = j;
      } while (paramFile == null);
      i = j;
    } while (!paramFile.exists());
    if (paramFile.isDirectory())
    {
      localObject = paramFile.listFiles();
      if (localObject != null)
      {
        i = 0;
        while (i < localObject.length)
        {
          if (a(localObject[i], paramPInt, paramPLong) == -1) {
            return -1;
          }
          i += 1;
        }
      }
      FileOp.deleteFile(paramFile.getAbsolutePath());
    }
    for (;;)
    {
      return 1;
      paramPLong.value += paramFile.length();
      FileOp.deleteFile(paramFile.getAbsolutePath());
      paramPInt.value += 1;
    }
  }
  
  private void aBs()
  {
    if (this.isStop) {
      return;
    }
    ah.A(new f.1(this));
  }
  
  private static void c(String paramString, ArrayList<String> paramArrayList)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return;
      x.i("MicroMsg.DeleteOtherAccController", "check paths [%s]", new Object[] { paramString });
      Object localObject = new File(paramString);
      if ((((File)localObject).exists()) && (((File)localObject).isDirectory()))
      {
        localObject = ((File)localObject).list();
        if ((localObject != null) && (localObject.length > 0))
        {
          int j = localObject.length;
          int i = 0;
          while (i < j)
          {
            String str = localObject[i];
            str = paramString + File.separator + str;
            x.d("MicroMsg.DeleteOtherAccController", "check add path[%s]", new Object[] { str });
            paramArrayList.add(str);
            i += 1;
          }
        }
      }
    }
  }
  
  private void cj(long paramLong)
  {
    if (this.isStop) {
      return;
    }
    ah.A(new f.2(this, paramLong));
  }
  
  public final void run()
  {
    if ((this.hRl == null) || (this.hRl.isEmpty()))
    {
      x.w("MicroMsg.DeleteOtherAccController", "delete paths is null.");
      cj(0L);
      return;
    }
    Object localObject1 = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = new StringBuilder("mm");
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eg();
    localObject2 = com.tencent.mm.a.g.u(a.Df().getBytes());
    Object localObject3 = this.hRl.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (String)((Iterator)localObject3).next();
      x.i("MicroMsg.DeleteOtherAccController", "uinPath[%s] path[%s]", new Object[] { localObject2, localObject4 });
      if (!bi.fS((String)localObject2, (String)localObject4))
      {
        c(com.tencent.mm.kernel.g.Ei().dqo + (String)localObject4, (ArrayList)localObject1);
        c(aa.duN + (String)localObject4, localArrayList);
      }
    }
    this.hQQ = (((ArrayList)localObject1).size() + localArrayList.size());
    this.hQR = 0;
    localObject2 = new PLong();
    localObject3 = new PLong();
    int j = ((ArrayList)localObject1).size();
    Object localObject4 = new PInt();
    int i = 0;
    while ((!this.isStop) && (i < j))
    {
      ((PInt)localObject4).value = 0;
      String str = (String)((ArrayList)localObject1).get(i);
      i += 1;
      x.i("MicroMsg.DeleteOtherAccController", "ready to delete index[%d] path[%s] pDelete[%d]", new Object[] { Integer.valueOf(i), str, Integer.valueOf(((PInt)localObject4).value) });
      if (a(new File(str), (PInt)localObject4, (PLong)localObject2) == -1) {
        break;
      }
      this.hQR += 1;
      aBs();
    }
    j = localArrayList.size();
    localObject1 = new PInt();
    i = 0;
    while ((!this.isStop) && (i < j))
    {
      ((PInt)localObject1).value = 0;
      localObject4 = (String)localArrayList.get(i);
      i += 1;
      x.i("MicroMsg.DeleteOtherAccController", "ready to delete index[%d] path[%s] pDelete[%d]", new Object[] { Integer.valueOf(i), localObject4, Integer.valueOf(((PInt)localObject1).value) });
      if (a(new File((String)localObject4), (PInt)localObject1, (PLong)localObject3) == -1) {
        break;
      }
      this.hQR += 1;
      aBs();
    }
    x.i("MicroMsg.DeleteOtherAccController", "delete finish sd[%d] data[%d]", new Object[] { Long.valueOf(((PLong)localObject2).value), Long.valueOf(((PLong)localObject3).value) });
    cj(((PLong)localObject2).value);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/clean/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */