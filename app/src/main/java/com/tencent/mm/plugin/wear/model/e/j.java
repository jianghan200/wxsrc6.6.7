package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.bk.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.cek;
import com.tencent.mm.protocal.c.cel;
import com.tencent.mm.protocal.c.cep;
import com.tencent.mm.protocal.c.ceq;
import com.tencent.mm.protocal.c.ces;
import com.tencent.mm.protocal.c.cet;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends a
{
  public String pJU = "";
  
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11019));
    localArrayList.add(Integer.valueOf(11020));
    localArrayList.add(Integer.valueOf(11021));
    localArrayList.add(Integer.valueOf(11031));
    return localArrayList;
  }
  
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return null;
      Object localObject2 = new cek();
      try
      {
        ((cek)localObject2).aG(paramArrayOfByte);
        localObject1 = new cel();
        ((cel)localObject1).szt = ((cek)localObject2).szt;
        if (((cel)localObject1).szt) {
          au.HU();
        }
        for (paramArrayOfByte = c.FT().M(((cek)localObject2).rdS, ((cek)localObject2).see);; paramArrayOfByte = c.FT().L(((cek)localObject2).rdS, ((cek)localObject2).see))
        {
          paramInt = 0;
          while ((paramInt < 10) && (paramInt < paramArrayOfByte.size()))
          {
            localObject2 = (bd)paramArrayOfByte.get(paramInt);
            ((cel)localObject1).rLq.add(h.aa((bd)localObject2));
            paramInt += 1;
          }
          au.HU();
        }
        if (paramArrayOfByte.size() > 10) {}
        for (bool = true;; bool = false)
        {
          ((cel)localObject1).szb = bool;
          try
          {
            paramArrayOfByte = ((cel)localObject1).toByteArray();
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            x.printErrStackTrace("MicroMsg.Wear.HttpMessageServer", paramArrayOfByte, "", new Object[0]);
          }
        }
        continue;
        this.pJU = "";
        continue;
        com.tencent.mm.plugin.wear.model.c.a.ee(9, 0);
        com.tencent.mm.plugin.wear.model.c.a.zC(8);
        localObject1 = new cep();
        try
        {
          ((cep)localObject1).aG(paramArrayOfByte);
          this.pJU = ((cep)localObject1).rdS;
          paramArrayOfByte = new ceq();
          au.HU();
          localObject1 = c.FT().L(((cep)localObject1).rdS, ((cep)localObject1).see);
          paramInt = 0;
          while ((paramInt < 10) && (paramInt < ((List)localObject1).size()))
          {
            localObject2 = (bd)((List)localObject1).get(paramInt);
            paramArrayOfByte.rLq.add(h.aa((bd)localObject2));
            paramInt += 1;
          }
          if (((List)localObject1).size() <= 10) {}
        }
        catch (IOException paramArrayOfByte)
        {
          return null;
        }
        for (;;)
        {
          paramArrayOfByte.szb = bool;
          try
          {
            paramArrayOfByte = paramArrayOfByte.toByteArray();
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            x.printErrStackTrace("MicroMsg.Wear.HttpMessageServer", paramArrayOfByte, "", new Object[0]);
          }
          bool = false;
        }
        continue;
        com.tencent.mm.plugin.wear.model.c.a.ee(12, 0);
        com.tencent.mm.plugin.wear.model.c.a.zC(14);
        localObject1 = new ces();
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          Object localObject1;
          ((ces)localObject1).aG(paramArrayOfByte);
          au.HU();
          paramArrayOfByte = c.FT().dW(((ces)localObject1).szl);
          localObject2 = new cet();
          String str = q.getFullPath(paramArrayOfByte.field_imgPath);
          ((cet)localObject2).szE = o.d(str, 0, true);
          ((cet)localObject2).szl = ((ces)localObject1).szl;
          ((cet)localObject2).rdU = new b(FileOp.e(str, 0, -1));
          q.H(paramArrayOfByte);
          try
          {
            paramArrayOfByte = ((cet)localObject2).toByteArray();
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            return null;
          }
          paramArrayOfByte = paramArrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          for (;;) {}
        }
      }
    }
  }
  
  protected final boolean zD(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return true;
    }
    return false;
  }
  
  protected final boolean zE(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */