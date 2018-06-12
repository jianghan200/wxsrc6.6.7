package com.tencent.mm.plugin.backup.h;

import f.a.a.b;
import java.util.LinkedList;

public final class o
  extends com.tencent.mm.bk.a
{
  public String ID;
  public long hbV;
  public m hbY;
  public int hca;
  public long hcb;
  public long hcc;
  public int hcd;
  public int hce;
  
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
      paramVarArgs.T(2, this.hcb);
      paramVarArgs.T(3, this.hcc);
      paramVarArgs.fT(4, this.hcd);
      paramVarArgs.fT(5, this.hce);
      paramVarArgs.T(6, this.hbV);
      if (this.hbY != null)
      {
        paramVarArgs.fV(7, this.hbY.boi());
        this.hbY.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.hca);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ID == null) {
        break label590;
      }
    }
    label590:
    for (paramInt = f.a.a.b.b.a.h(1, this.ID) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.hcb) + f.a.a.a.S(3, this.hcc) + f.a.a.a.fQ(4, this.hcd) + f.a.a.a.fQ(5, this.hce) + f.a.a.a.S(6, this.hbV);
      paramInt = i;
      if (this.hbY != null) {
        paramInt = i + f.a.a.a.fS(7, this.hbY.boi());
      }
      return paramInt + f.a.a.a.fQ(8, this.hca);
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
        o localo = (o)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localo.ID = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localo.hcb = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 3: 
          localo.hcc = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localo.hcd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localo.hce = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localo.hbV = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new m();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((m)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localo.hbY = ((m)localObject1);
            paramInt += 1;
          }
        }
        localo.hca = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/h/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */