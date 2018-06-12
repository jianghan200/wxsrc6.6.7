package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aga
  extends bhd
{
  public String jTB;
  public String rJM;
  public int rJN;
  public LinkedList<bhz> rJO = new LinkedList();
  
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
      if (this.rJM != null) {
        paramVarArgs.g(2, this.rJM);
      }
      paramVarArgs.fT(3, this.rJN);
      paramVarArgs.d(4, 8, this.rJO);
      if (this.jTB != null) {
        paramVarArgs.g(5, this.jTB);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label551;
      }
    }
    label551:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rJM != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rJM);
      }
      i = i + f.a.a.a.fQ(3, this.rJN) + f.a.a.a.c(4, 8, this.rJO);
      paramInt = i;
      if (this.jTB != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.jTB);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rJO.clear();
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
        aga localaga = (aga)paramVarArgs[1];
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
            localaga.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaga.rJM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaga.rJN = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaga.rJO.add(localObject1);
            paramInt += 1;
          }
        }
        localaga.jTB = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */