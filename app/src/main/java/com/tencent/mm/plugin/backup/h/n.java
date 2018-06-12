package com.tencent.mm.plugin.backup.h;

import f.a.a.b;
import java.util.LinkedList;

public final class n
  extends com.tencent.mm.bk.a
{
  public String ID;
  public long hbV;
  public long hbW;
  public long hbX;
  public m hbY;
  public long hbZ;
  public int hca;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.g(1, this.ID);
      }
      paramVarArgs.T(2, this.hbV);
      paramVarArgs.T(3, this.hbW);
      paramVarArgs.T(4, this.hbX);
      if (this.hbY != null)
      {
        paramVarArgs.fV(5, this.hbY.boi());
        this.hbY.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.hbZ);
      paramVarArgs.fT(7, this.hca);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ID == null) {
        break label551;
      }
    }
    label551:
    for (paramInt = f.a.a.b.b.a.h(1, this.ID) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.hbV) + f.a.a.a.S(3, this.hbW) + f.a.a.a.S(4, this.hbX);
      paramInt = i;
      if (this.hbY != null) {
        paramInt = i + f.a.a.a.fS(5, this.hbY.boi());
      }
      return paramInt + f.a.a.a.S(6, this.hbZ) + f.a.a.a.fQ(7, this.hca);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ID != null) {
          break;
        }
        throw new b("Not all required fields were included: ID");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        n localn = (n)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localn.ID = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localn.hbV = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 3: 
          localn.hbW = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localn.hbX = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new m();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((m)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localn.hbY = ((m)localObject1);
            paramInt += 1;
          }
        case 6: 
          localn.hbZ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localn.hca = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/h/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */