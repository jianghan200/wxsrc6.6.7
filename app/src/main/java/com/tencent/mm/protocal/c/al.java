package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class al
  extends bhd
{
  public int cae;
  public String qZN;
  public String qZO;
  public int qZP;
  public LinkedList<ky> qZS = new LinkedList();
  
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
      paramVarArgs.d(2, 8, this.qZS);
      paramVarArgs.fT(3, this.cae);
      if (this.qZN != null) {
        paramVarArgs.g(4, this.qZN);
      }
      if (this.qZO != null) {
        paramVarArgs.g(5, this.qZO);
      }
      paramVarArgs.fT(6, this.qZP);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label590;
      }
    }
    label590:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.qZS) + f.a.a.a.fQ(3, this.cae);
      paramInt = i;
      if (this.qZN != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.qZN);
      }
      i = paramInt;
      if (this.qZO != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.qZO);
      }
      return i + f.a.a.a.fQ(6, this.qZP);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.qZS.clear();
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
        al localal = (al)paramVarArgs[1];
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
            localal.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ky();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ky)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localal.qZS.add(localObject1);
            paramInt += 1;
          }
        case 3: 
          localal.cae = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localal.qZN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localal.qZO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localal.qZP = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */