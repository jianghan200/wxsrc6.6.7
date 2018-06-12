package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aig
  extends bhd
{
  public int jPr;
  public LinkedList<bhz> jRK = new LinkedList();
  public String jRj;
  public int jSa;
  public int jSb;
  public int rLd;
  
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
      paramVarArgs.fT(2, this.jPr);
      paramVarArgs.fT(3, this.jSa);
      paramVarArgs.fT(4, this.jSb);
      if (this.jRj != null) {
        paramVarArgs.g(5, this.jRj);
      }
      paramVarArgs.fT(6, this.rLd);
      paramVarArgs.d(7, 8, this.jRK);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label613;
      }
    }
    label613:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.jPr) + f.a.a.a.fQ(3, this.jSa) + f.a.a.a.fQ(4, this.jSb);
      paramInt = i;
      if (this.jRj != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.jRj);
      }
      return paramInt + f.a.a.a.fQ(6, this.rLd) + f.a.a.a.c(7, 8, this.jRK);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jRK.clear();
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
        aig localaig = (aig)paramVarArgs[1];
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
            localaig.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaig.jPr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localaig.jSa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localaig.jSb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localaig.jRj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaig.rLd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localaig.jRK.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */