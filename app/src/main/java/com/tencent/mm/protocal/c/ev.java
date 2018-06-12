package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ev
  extends bhd
{
  public long hbZ;
  public int otY;
  public int rfh;
  public LinkedList<pw> rfi = new LinkedList();
  public String rfj;
  public String rfk;
  public String rfl;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rfh);
      paramVarArgs.d(3, 8, this.rfi);
      if (this.rfj != null) {
        paramVarArgs.g(4, this.rfj);
      }
      if (this.rfk != null) {
        paramVarArgs.g(5, this.rfk);
      }
      paramVarArgs.fT(6, this.otY);
      paramVarArgs.T(7, this.hbZ);
      if (this.rfl != null) {
        paramVarArgs.g(8, this.rfl);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label688;
      }
    }
    label688:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rfh) + f.a.a.a.c(3, 8, this.rfi);
      paramInt = i;
      if (this.rfj != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rfj);
      }
      i = paramInt;
      if (this.rfk != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rfk);
      }
      i = i + f.a.a.a.fQ(6, this.otY) + f.a.a.a.S(7, this.hbZ);
      paramInt = i;
      if (this.rfl != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rfl);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rfi.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ev localev = (ev)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localev.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localev.rfh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new pw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((pw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localev.rfi.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localev.rfj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localev.rfk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localev.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localev.hbZ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localev.rfl = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */