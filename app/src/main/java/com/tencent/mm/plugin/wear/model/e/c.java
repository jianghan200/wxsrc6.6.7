package com.tencent.mm.plugin.wear.model.e;

import android.database.Cursor;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.c.cdr;
import com.tencent.mm.protocal.c.cdx;
import com.tencent.mm.protocal.c.cdy;
import com.tencent.mm.protocal.c.ceu;
import com.tencent.mm.protocal.c.cev;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.contact.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends a
{
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11008));
    localArrayList.add(Integer.valueOf(11009));
    return localArrayList;
  }
  
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 5;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    cdr localcdr;
    if (paramInt == 11008)
    {
      com.tencent.mm.plugin.wear.model.c.a.zC(6);
      localObject1 = new ceu();
      for (;;)
      {
        try
        {
          ((ceu)localObject1).aG(paramArrayOfByte);
          paramArrayOfByte = new LinkedList();
          paramArrayOfByte.addAll(s.cyz());
          paramArrayOfByte.addAll(s.cyA());
          au.HU();
          paramArrayOfByte = com.tencent.mm.model.c.FW().k(paramArrayOfByte, ((ceu)localObject1).rjC);
          if (((ceu)localObject1).rjC == 0)
          {
            paramInt = i;
            localObject2 = new cev();
            ((cev)localObject2).rjC = ((ceu)localObject1).rjC;
            if ((paramArrayOfByte != null) && (paramArrayOfByte.moveToNext()))
            {
              localObject3 = paramArrayOfByte.getString(paramArrayOfByte.getColumnIndex("username"));
              au.HU();
              localObject3 = com.tencent.mm.model.c.FR().Yg((String)localObject3);
              ((cev)localObject2).rjC += 1;
              if ((((ab)localObject3).ckW()) || (((ab)localObject3).BA())) {
                continue;
              }
              localcdr = new cdr();
              localcdr.hcS = r.c((ab)localObject3);
              localcdr.hbL = ((ai)localObject3).field_username;
              ((cev)localObject2).rHc.add(localcdr);
              if (((cev)localObject2).rHc.size() < paramInt) {
                continue;
              }
              ((cev)localObject2).szb = paramArrayOfByte.moveToNext();
            }
            x.d("MicroMsg.Wear.HttpContactServer", "request offset: %d | return offset: %d | return size: %d", new Object[] { Integer.valueOf(((ceu)localObject1).rjC), Integer.valueOf(((cev)localObject2).rjC), Integer.valueOf(((cev)localObject2).rHc.size()) });
            if (paramArrayOfByte != null) {
              paramArrayOfByte.close();
            }
          }
          paramInt = 20;
        }
        catch (IOException paramArrayOfByte)
        {
          try
          {
            paramArrayOfByte = ((cev)localObject2).toByteArray();
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            return null;
          }
          paramArrayOfByte = paramArrayOfByte;
          x.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
          return null;
        }
      }
    }
    if (paramInt == 11009)
    {
      com.tencent.mm.plugin.wear.model.c.a.zC(7);
      localObject1 = new cdx();
      do
      {
        try
        {
          ((cdx)localObject1).aG(paramArrayOfByte);
          paramArrayOfByte = new cdy();
          au.HU();
          localObject2 = com.tencent.mm.model.c.FR().dn(null);
          paramInt = ((cdx)localObject1).rjC;
          for (;;)
          {
            if ((localObject2 == null) || (!((Cursor)localObject2).moveToNext())) {
              break label512;
            }
            if (paramInt <= 0) {
              break;
            }
            paramInt -= 1;
          }
          localObject3 = ((Cursor)localObject2).getString(0);
        }
        catch (IOException paramArrayOfByte)
        {
          x.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
          return null;
        }
        au.HU();
        localObject3 = com.tencent.mm.model.c.FR().Yg((String)localObject3);
        localcdr = new cdr();
        localcdr.hcS = r.c((ab)localObject3);
        localcdr.hbL = ((ai)localObject3).field_username;
        paramArrayOfByte.rHc.add(localcdr);
      } while (paramArrayOfByte.rHc.size() < 5);
      paramArrayOfByte.szb = ((Cursor)localObject2).moveToNext();
      label512:
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
      paramArrayOfByte.rjC = (((cdx)localObject1).rjC + paramArrayOfByte.rHc.size());
      try
      {
        paramArrayOfByte = paramArrayOfByte.toByteArray();
        return paramArrayOfByte;
      }
      catch (IOException paramArrayOfByte)
      {
        x.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
        return null;
      }
    }
    return null;
  }
  
  protected final boolean zD(int paramInt)
  {
    if (paramInt == 11008) {}
    while (paramInt == 11009) {
      return true;
    }
    return super.zD(paramInt);
  }
  
  protected final boolean zE(int paramInt)
  {
    if (paramInt == 11008) {}
    while (paramInt == 11009) {
      return true;
    }
    return super.zE(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */